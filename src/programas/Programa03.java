package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main (String[] args){
        //DECLARA VARIABLES
        int num;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingresar un numero:");
        num = lectura.nextInt();
        //PROCESO DE DATOS
        if(num>0){
            mensaje = "Numero Positivo";
        } else if(num<0){
            mensaje = "NUmero negativo";
        } else {
            mensaje = "Numero Neutro";
        }
        //SALIDA DE DATOS
        System.out.println(mensaje);
    }
}
