package programas;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main (String[] args){
        // VARIABLES
            int altura;
            Scanner lectura = new Scanner(System.in);
        // ENTRADA DE DATOS
            System.out.print("INGRESA TU ESTATURA:");
            altura = lectura.nextInt();
        // PROCESOS
        if (altura <= 150){
            System.out.print("Persona de altura baja");
        }else if(altura > 170){
            System.out.print("Persona de altura media");
        }else {
            System.out.print("Persona Alta");
        }
    }
}
