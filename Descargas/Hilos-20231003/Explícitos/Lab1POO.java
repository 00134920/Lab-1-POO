import java.util.Scanner;
import java.io.*;

public class Lab1POO{

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------MENU------");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        System.out.println("----------------");
        System.out.println("Ingrese su opción:");
        int opcion = sc.nextInt();

        System.out.println("Ingrese el primer numero:");
        double a = sc.nextDouble();
       
        System.out.println("Ingrese el segundo numero:");
        double b = sc.nextDouble();
        
        double res=0;

        switch(opcion){
            case 1:
            res = Suma(a,b);
            break;
            case 2:
            res = Resta(a,b);
            break;
            case 3:
            res = Multiplicacion(a,b);
            break;
            case 4:
            res = Dividir(a,b);
            break;
        }

        System.out.println("El resultado es: " + res );
    }
    
    
    public static double Suma(double a, double b){
    return a + b;
    }
    public static double Resta(double a, double b){
    return a - b;
    }
    public static double Multiplicacion(double a, double b){
    return a * b;
    }
    public static double Dividir(double a, double b){
    return a / b;
    }
}