package com.grupo4.semana8;

public class Pedido {
    private int numero;
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public Pedido(int numero, String producto, int cantidad, double precioUnitario) {
        this.numero = numero;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarDetalles() {
        System.out.println("Numero: " + numero);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total: " + calcularTotal());
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, "Teclado", 3, 25.5);
        pedido.mostrarDetalles();
    }
}
