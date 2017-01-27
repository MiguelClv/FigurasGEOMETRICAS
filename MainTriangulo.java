package com.company;

/**
 * Created by 54167208T on 20/12/2016.
 */
public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo stucom = new Triangulo(4.5,5);
        Triangulo hola = new Triangulo(5,6);
        Triangulo adios = new Triangulo(3,2);

        System.out.println("Perimetro: "+ stucom.calcularPerimetro()+" Altura: "+ stucom.calcularAltura() +" Area: "+ stucom.calcularArea());
        System.out.println("Perimetro: "+ hola.calcularPerimetro()+" Altura: "+ hola.calcularAltura() +" Area: "+ hola.calcularArea());
        System.out.println("Perimetro: "+ adios.calcularPerimetro()+" Altura: "+ adios.calcularAltura() +" Area: "+ adios.calcularArea());
    }
}
