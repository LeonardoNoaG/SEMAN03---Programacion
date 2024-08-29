package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //DECLARA VARIABLES
        int edad;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
         System.out.print("INGRESE SU EDAD:");
         edad = lectura.nextInt();
        //PROCESO DE DATOS
        if (edad >= 18){
            mensaje = "ES MAYOR DE EDAD";
        } else {
            mensaje = "NO ES MAYOR DE EDAD";
        }
        //SALIDA DE DATOS
        System.out.println(mensaje);
    }
}
