/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su codigo de trabajador");
        String codigo = entrada.nextLine();
        
        System.out.println("Ingrese su nombre");
        String nombre=entrada.nextLine();
        
        System.out.println("Ingrese sus apellidos");
        String apellidos = entrada.nextLine();
        
        System.out.println("Ingrese su salario mensual");
        double sal_mensual = entrada.nextDouble();
        System.out.println("El salario mensual del trabajador "+ nombre +" es "+ sal_mensual/30);
        Trabajador x = new Trabajador(codigo, nombre, apellidos, sal_mensual);
        
    }
    
}
