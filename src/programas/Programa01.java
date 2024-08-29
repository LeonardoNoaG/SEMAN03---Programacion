package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main (String[] args){
        //DECALARAR VARIABLES
        int n1, n2, n3, n4, mayor;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("INGRESAR PRIMER NUMERO:");
        n1 = lectura.nextInt();
        System.out.print("INGRESAR SEGUNDO NUMERO:");
        n2 = lectura.nextInt();
        System.out.print("INGRESAR TERCER NUMERO:");
        n3 = lectura.nextInt();
        System.out.print("INGRESAR CUARTO NUMERO:");
        n4 = lectura.nextInt();
        //PROCESO DE DATOS
        mayor = n1;
        if(n2>mayor){
            mayor = n2;
        }
        if(n3>mayor){
            mayor = n3;
        }
        if(n4>mayor){
            mayor = n4;
        }
        //SALIDA DE DATOS
        System.out.println("El numero mayor es: " + mayor);
    }
}
