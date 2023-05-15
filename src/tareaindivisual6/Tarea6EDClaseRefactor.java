/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaindivisual6;

/**
 *
 * @author fp
 */
public class Tarea6EDClaseRefactor{

    private static final double DESCUENTO_MAYOR_3_PRODUCTOS = 5;
    private static final double DESCUENTO_MENOR_3_PRODUCTOS = 0.8;
    private static final double DESCUENTO_CERO_PRODUCTOS = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_MAYOR_3_PRODUCTOS;
        }
        
        if (numProductos != 0) {
            total = calcularDescuento(precioProducto, DESCUENTO_MENOR_3_PRODUCTOS);
        } else {
            total = calcularDescuento(precioProducto, DESCUENTO_CERO_PRODUCTOS);
        }
        
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
    
    private double calcularDescuento(double precioProducto, double descuento) {
        return precioProducto * descuento;
    }
}