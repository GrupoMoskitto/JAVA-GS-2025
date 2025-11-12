package com.moskitto.monitor.view;

import com.moskitto.monitor.model.Funcionario;
import com.moskitto.monitor.service.MonitorBurnout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonitorGUI extends JFrame {

    private JTextArea areaTexto;
    private JButton botaoGerar;
    private MonitorBurnout monitor;

    public MonitorGUI() {
        super("Monitor de Burnout - Grupo Moskitto FIAP");
        monitor = new MonitorBurnout();

        // Dados simulados
        monitor.adicionarFuncionario(new Funcionario("João", 40, "Professor", 8));
        monitor.adicionarFuncionario(new Funcionario("Ana", 30, "Designer", 4));
        monitor.adicionarFuncionario(new Funcionario("Lucas", 25, "Engenheiro", 9));
        monitor.adicionarFuncionario(new Funcionario("Paula", 35, "Psicóloga", 6));
        monitor.adicionarFuncionario(new Funcionario("Gabriel", 28, "Analista", 2));

        // Layout base
        setLayout(new BorderLayout());
        setSize(650, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // === Tema escuro ===
        Color fundoJanela = new Color(18, 18, 18);
        Color fundoTexto = new Color(30, 30, 30);
        Color corTexto = new Color(224, 224, 224);
        Color azulCiano = new Color(0, 191, 255);

        getContentPane().setBackground(fundoJanela);


        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Consolas", Font.PLAIN, 14));
        areaTexto.setBackground(fundoTexto);
        areaTexto.setForeground(corTexto);
        areaTexto.setCaretColor(corTexto);
        areaTexto.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60)));

        // Botão
        botaoGerar = new JButton("Gerar Relatório");
        botaoGerar.setFont(new Font("Segoe UI", Font.BOLD, 15));
        botaoGerar.setBackground(azulCiano);
        botaoGerar.setForeground(Color.BLACK);
        botaoGerar.setFocusPainted(false);
        botaoGerar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botaoGerar.setCursor(new Cursor(Cursor.HAND_CURSOR));


        botaoGerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerarRelatorio();
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(botaoGerar, BorderLayout.SOUTH);
    }

    private void gerarRelatorio() {

        areaTexto.setText(""); // limpa

        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO DE BURNOUT ===\n\n");

        // Gera relatório diretamente no componente
        monitor.getFuncionarios().stream()
                .sorted((f1, f2) -> Integer.compare(f1.getNivelBurnout(), f2.getNivelBurnout()))
                .forEach(f -> {
                    String recomendacao;
                    int nivel = f.getNivelBurnout();
                    if (nivel >= 9)
                        recomendacao = "Nível crítico! Procure ajuda médica imediatamente.";
                    else if (nivel >= 6)
                        recomendacao = "Cuidado! Pratique atividades físicas e reserve tempo para hobbies.";
                    else if (nivel >= 3)
                        recomendacao = "Situação moderada. Continue com hábitos saudáveis e descanso adequado.";
                    else
                        recomendacao = "Excelente! Mantenha o equilíbrio entre trabalho e vida pessoal.";

                    sb.append(f).append("\n");
                    sb.append("Recomendação: ").append(recomendacao).append("\n");
                    sb.append("---------------------------\n");
                });

        areaTexto.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MonitorGUI gui = new MonitorGUI();
            gui.setVisible(true);
        });
    }
}
