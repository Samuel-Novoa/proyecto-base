package JAVA;

import java.util.*;

public class proyecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] codigoProductos = new int[50];
        String[] nombreProductos = new String[50];
        double[] precioProductos = new double[50];
        int codigoProducto;
        String nombreProducto;
        double precioProducto, total = 0;
        int descuento = 10;
        int cantidadProductos;
        System.out.println("Digite la cantidad de productos: ");
        cantidadProductos = sc.nextInt();
        for(int i = 0; i < cantidadProductos; i++){
            System.out.println("Codigo del producto [" + i +"]: ");
            codigoProducto = sc.nextInt();
            System.out.println("Digite el nombre del producto [" + i +"]: ");
            nombreProducto = sc.next();
            System.out.println("Digite el precio del producto [" + i +"]: ");
            precioProducto = sc.nextDouble();

            codigoProductos[i] = codigoProducto;
            nombreProductos[i] = nombreProducto;
            precioProductos[i] += precioProducto;
        }

        for(int i = 0; i < cantidadProductos; i++) {
            total = (precioProductos[i] * descuento)/100;
        }

        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}
