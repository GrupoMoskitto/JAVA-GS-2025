package com.moskitto.monitor.service;

import com.moskitto.monitor.model.Funcionario;
import java.util.List;

public class AvaliadorBurnout {


    public static String gerarRecomendacao(int nivelBurnout) {
        if (nivelBurnout >= 9) {
            return "Nível crítico! Procure ajuda médica imediatamente.";
        } else if (nivelBurnout >= 6) {
            return "Cuidado! Pratique atividades físicas e reserve tempo para hobbies.";
        } else if (nivelBurnout >= 3) {
            return "Situação moderada. Continue com hábitos saudáveis e descanso adequado.";
        } else {
            return "Excelente! Mantenha o equilíbrio entre trabalho e vida pessoal.";
        }
    }

    public static void gerarRelatorio(List<Funcionario> funcionarios) {
        System.out.println("=== RELATÓRIO DE BURNOUT ===\n");
        for (Funcionario f : funcionarios) {
            String recomendacao = gerarRecomendacao(f.getNivelBurnout());
            System.out.println(f);
            System.out.println("Recomendação: " + recomendacao);
            System.out.println("---------------------------");
        }
    }
}
