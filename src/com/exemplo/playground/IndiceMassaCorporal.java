package com.exemplo.playground;

public class IndiceMassaCorporal {
    private Paciente paciente;
    private String categoria;
    private String grauDeObesidade;
    private double imc;

    public IndiceMassaCorporal() {}

    public IndiceMassaCorporal(Paciente paciente) {
        this.paciente = paciente;
    }

    public IndiceMassaCorporal(Paciente paciente, String categoria, String grauDeObesidade) {
        this.paciente = paciente;
        this.categoria = categoria;
        this.grauDeObesidade = grauDeObesidade;
    }

    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc > 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc > 25.0 && imc < 29.9) {
            return "Sobrepeso";
        } else if(imc <= 34.99) {
            return "Obesidade";
        } else if (imc <= 39.99) {
            return "Obesidade grave";
        }
        return "Obesidade Mórbida";
    }
}
