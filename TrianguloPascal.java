/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta01;

/**
 *
 * @author migue
 */
public class TrianguloPascal {
    public static void main(String[] args) {
        int n = 5; 
        MostrarTriangulo(n);
    }

    public static void MostrarTriangulo(int n) {
        
    }

    public static void MostrarFila(int f) {
        System.out.println(CalcularValorPascal(f, 1));
    }

    public static int CalcularValorPascal(int f, int c) {
        c++;
        return CalcularValorPascal(f-1, c-1) + CalcularValorPascal(f-1, c) ;
    }
}
