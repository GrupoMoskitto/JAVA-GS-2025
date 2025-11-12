package com.moskitto.monitor.util;

import com.moskitto.monitor.model.Funcionario;
import java.util.List;
import java.util.ArrayList;


public class Ordenacao {

    public static List<Funcionario> mergeSort(List<Funcionario> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int meio = lista.size() / 2;
        List<Funcionario> esquerda = mergeSort(new ArrayList<>(lista.subList(0, meio)));
        List<Funcionario> direita = mergeSort(new ArrayList<>(lista.subList(meio, lista.size())));

        return merge(esquerda, direita);
    }

    private static List<Funcionario> merge(List<Funcionario> esquerda, List<Funcionario> direita) {
        List<Funcionario> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < esquerda.size() && j < direita.size()) {
            if (esquerda.get(i).getNivelBurnout() <= direita.get(j).getNivelBurnout()) {
                resultado.add(esquerda.get(i++));
            } else {
                resultado.add(direita.get(j++));
            }
        }

        while (i < esquerda.size()) {
            resultado.add(esquerda.get(i++));
        }

        while (j < direita.size()) {
            resultado.add(direita.get(j++));
        }

        return resultado;
    }
}
