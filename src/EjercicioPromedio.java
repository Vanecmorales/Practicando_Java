
//Armar un programa que permita cargar 3 números y mostrar cual es el promedio

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioPromedio {
    public static void main (String[] args) throws IOException {

        System.out.println("Ingrese el primer número: ");
        int numero1 = cargarNumero();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = cargarNumero();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = cargarNumero();

        int sumatoria = numero1 + numero2 + numero3;

        double numeroPromedio = Double.valueOf(sumatoria) / 3; //el valueOf nos permite cargar los decimales de los integers (al ser tipos de datos diferentes no solo basta con usar el double)

        System.out.println("El promedio de los números ingresados es: " +numeroPromedio);
    }

    public static int cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        int numero = Integer.parseInt(strNumero);
        return numero;
    }
}
