package com.exemplo.playground;

public class MainIndiceMassaCorporal {
    public static void main(String[] args) {
        //criar um paciente
        Paciente pacienteJoao = new Paciente(64.9, 1.87);

        //criar um objeto de IndiceDeMassaCorporal com um paciente
        IndiceMassaCorporal imcJoao = new IndiceMassaCorporal(pacienteJoao);

        //calcular o IMC
        double imc = imcJoao.calcularIMC(63.9, 1.63);

        //classificar o IMC
        String categoria = imcJoao.classificarIMC(imc);

        // Exibindo resultados
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + categoria);
    }
}

