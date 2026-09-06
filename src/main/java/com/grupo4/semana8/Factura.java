package com.grupo4.semana8;

public class Factura {
    private int numero;
    private int correlativo;
    private String fecha;
    
    public Factura (int numero) {
        this.numero = numero;
    }

    private void generarNumero() {
        this.numero = (int) (Math.random() * 10000);
    }
}