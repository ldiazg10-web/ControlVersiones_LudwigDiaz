/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversiones_ludwigdiaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlVersiones_LudwigDiaz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n Uso de Git y GitHub con NetBeans");
            System.out.println("1. Calcular promedio de tres numeros");
            System.out.println("2. Informacion del autor");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        calcularPromedioDesdeMenu(sc);
                        break;
                    case 2:
                        mostrarInformacion();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("️ Opción no valida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("️ Error: debe ingresar un número entero.");
                sc.next(); // limpiar buffer
            }

        } while (opcion != 3);

        sc.close();
    }

    // ======= CAMBIO 1: Función separada para cálculo =======
    public static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // ======= CAMBIO 2: Mejora del menú con validaciones =======
    public static void calcularPromedioDesdeMenu(Scanner sc) {
        try {
            System.out.print("Ingrese el primer numero: ");
            double n1 = sc.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double n2 = sc.nextDouble();
            System.out.print("Ingrese el tercer numero: ");
            double n3 = sc.nextDouble();

            if (n1 < 0 || n2 < 0 || n3 < 0) {
                System.out.println("️ No se permiten numeros negativos.");
                return;
            }

            double promedio = calcularPromedio(n1, n2, n3);
            System.out.println(" El promedio es: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("️ Error: debe ingresar valores numericos válidos.");
            sc.next(); // limpiar buffer
        }
    }

    // ======= CAMBIO 3: Nueva función con información del autor =======
    public static void mostrarInformacion() {
        System.out.println("\n--- Informacion del programa ---");
        System.out.println("Autor: Ludwig Diaz");
        System.out.println("Proyecto: Control de Versiones");
        System.out.println("Version: 1.2");
        System.out.println("Descripcion: Programa ejemplo para practica con Git y GitHub.");
    }
}

