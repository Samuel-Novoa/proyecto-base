// package JAVA;

import java.util.*;

public class proyecto {

     public static LinkedHashMap<String, Integer> Audifono() {
          LinkedHashMap<String, Integer> stk = new LinkedHashMap<>();

          // Stock
          String[] producto = { "Audifono 1", "Audifono 2", "Audifono 3", "Audifono 4" };
          int[] stock = { 1, 2, 3, 4 };

          // Agregar el stock y productos al mapa
          for (int i = 0; i < producto.length; i++) {
               stk.put(producto[i], stock[i]);
          }

          return stk;
     }

     public static void limpiarConsola() {
          System.out.print("\033[H\033[2J");
          System.out.flush();
     }

     public static void main(String[] args) {
          LinkedHashMap<String, Integer> audifono = Audifono();
          Scanner sc = new Scanner(System.in);

          System.out.println("==============\n= Bienvenido =\n==============");
          boolean ejecutando = true;
          boolean stop = true;
          while (ejecutando) {
               System.out.print("1. Productos\n2. Stock\n3. Comprar\n4. Salir\nOPC: ");
               int opc = sc.nextInt();
               switch (opc) {
                    case 1:
                         while (stop) {
                              limpiarConsola();
                              System.out.println("=============\n= Productos =\n=============");
                              for (String refAudi : audifono.keySet()) {
                                   System.out.println("\t[ Articulo: " + refAudi + "]");
                              }
                              System.out.print("Salir [ 1 ]: ");
                              String space = sc.next();
                              if (space.equals("1")) {
                                   stop = false;
                              }
                         }
                         limpiarConsola();
                         break;
                    case 2:
                         while (stop) {
                              limpiarConsola();
                              System.out.println("\t=========\n\t= Stock =\n\t=========");
                              System.out.println("\t[ Articulo | Stock ]\n");
                              for (String refAudi : audifono.keySet()) {
                                   System.out.println("\t[ " + refAudi + " | " + audifono.get(refAudi) + " ]");
                              }
                              System.out.print("Salir [ s ]: ");
                              String space = sc.next();
                              if (space.equals("s")) {
                                   stop = false;
                              }
                         }
                         limpiarConsola();
                         break;
                    case 3:
                    case 4:
                         ejecutando = false;
                         break;
                    default:
                         System.out.println("Opcion invalida");
               }
          }
          sc.close();
     }
}
