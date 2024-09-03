package com.exemplo.playground;

import static com.exemplo.playground.IndiceMassaCorporal.*;

public class MainIndiceMassaCorporal {
    public static void main(String[] args) {
        double imc;
        String categoria;

        //criar um paciente
        Paciente pacienteJoao = new Paciente("João", 64.9, 1.87);

        //criar um objeto de IndiceDeMassaCorporal com um paciente
        IndiceMassaCorporal imcJoao = new IndiceMassaCorporal(pacienteJoao);

        //calcular o IMC
        imc = calcularIMC(pacienteJoao);

        //classificar o IMC
        categoria = imcJoao.classificarIMC(imc);

        // Exibindo resultados
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + categoria);

        //Exibir um relatorio ao mostrar na tela
        //Obter valores do usuário(String nome = scanner.nextLine(); -- println...) --> IF (entrar na boate 18 anos e 20 reais)
        //criar enum com ClassificaIMC(PESSOA_MAGRA, PESSOA_NORMAL, PESSOA_SOBREPESO)--> enum e Switch
        //criar projeto lista aluno, professor, nota, etc.. aprovado, reprovado,
        //digite zero para sair --> While
    }

    private static double calcularIMC(Paciente paciente) {
        return paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());
    }
}


