package com.moskitto.monitor;

import com.moskitto.monitor.model.Funcionario;
import com.moskitto.monitor.service.MonitorBurnout;

public class Main {
    public static void main(String[] args) {

        // Cria o monitor
        MonitorBurnout monitor = new MonitorBurnout();

        // Adiciona funcionários
        monitor.adicionarFuncionario(new Funcionario("João", 40, "Professor", 8));
        monitor.adicionarFuncionario(new Funcionario("Ana", 30, "Designer", 4));
        monitor.adicionarFuncionario(new Funcionario("Lucas", 25, "Engenheiro", 9));
        monitor.adicionarFuncionario(new Funcionario("Paula", 35, "Psicóloga", 6));

        // Gera relatório completo
        monitor.gerarRelatorioFinal();
    }
}
