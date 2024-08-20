package com.exemplo.playground;

public class IndiceMassaCorporal {
    private Paciente paciente;
    private String categoria;
    private String grauDeObesidade;
    double imc;

    public IndiceMassaCorporal(Paciente paciente) {
        this.paciente = paciente;
    }

    public double calcularIMC(double peso, double altura) {
        imc = peso / (altura * altura);
        return imc;
    }

    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            categoria = ("Magreza");
            grauDeObesidade = "0";
        } else if (imc > 18.5 && imc < 24.9) {
            categoria = ("Normal");
            grauDeObesidade = "0";
        } else if (imc > 25.0 && imc < 29.9) {
            categoria = ("Sobrepeso");
            grauDeObesidade = "1";
        } else {
            categoria = ("aqui imc");
        }
        return categoria;
    }
}
