package programas;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main (String[] args){
        //VARIABLES
        double nota1, nota2, nota3, promedio;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingresar primera Nota:");
        nota1 = lectura.nextInt();
        System.out.print("Ingresar segunda Nota:");
        nota2 = lectura.nextInt();
        System.out.print("Ingresar tercera Nota:");
        nota3 = lectura.nextInt();
        //PROCESOS
        promedio = (nota1 + nota2 + nota3) / 3;
        if(promedio > 12){
            mensaje = "APROBADO";
        } else{
            mensaje = "DESAPROBADO";
        }
        //SALIDA DE DATOS
        System.out.println("EL PROMEDIO ES:" + promedio);
        System.out.println(mensaje);
    }
}
