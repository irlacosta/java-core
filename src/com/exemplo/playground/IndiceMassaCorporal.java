package com.exemplo.playground;

public class IndiceMassaCorporal {
    private Paciente paciente;
    private String categoria;
    private String grauDeObesidade;
    double imc;

    public IndiceMassaCorporal(Paciente paciente) {
        this.paciente = paciente;
    }

    public double calcularIMC(Paciente paciente) {
        imc = paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());
        return imc;
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
