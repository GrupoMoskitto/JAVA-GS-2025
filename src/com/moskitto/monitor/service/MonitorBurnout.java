package com.moskitto.monitor.service;

import com.moskitto.monitor.model.Funcionario;
import com.moskitto.monitor.util.Ordenacao;
import java.util.List;
import java.util.ArrayList;


public class MonitorBurnout {

    private List<Funcionario> funcionarios;

    // Construtor
    public MonitorBurnout() {
        this.funcionarios = new ArrayList<>();
    }


    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // relatório final
    public void gerarRelatorioFinal() {
        // Ordena
        List<Funcionario> ordenados = Ordenacao.mergeSort(funcionarios);

        // Gera relatório
        AvaliadorBurnout.gerarRelatorio(ordenados);
    }
}
