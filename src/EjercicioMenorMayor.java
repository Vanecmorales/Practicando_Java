
//Ejercicio menor y mayor que con inputs en consola

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioMenorMayor {
    public static void main (String [] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese el primer número: ");
        String strNumero1 = buffer.readLine();
        int numero1 = Integer.parseInt(strNumero1);

        System.out.println("Ingrese el segundo número: ");
        String strNumero2 = buffer.readLine();
        int numero2 = Integer.parseInt(strNumero2);

        System.out.println("Ingrese el tercer número: ");
        String strNumero3 = buffer.readLine();
        int numero3 = Integer.parseInt(strNumero3);

        int numeroMayor = numero1;

        if (numero2 > numeroMayor){
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor){
            numeroMayor = numero3;
        }

        System.out.println("El número mayor es: "+ numeroMayor);

        int numeroMenor = numero1;

        if (numero2 < numeroMenor){
            numeroMayor = numero2;
        }
        if (numero3 < numeroMenor){
            numeroMenor = numero3;
        }

        System.out.println("El número menor es: "+ numeroMenor);
    }
}
