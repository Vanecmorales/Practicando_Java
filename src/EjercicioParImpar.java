//Armar un programa que permita ingresar un número y mostrar si es par o impar

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioParImpar {
    public static int cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        int numero = Integer.parseInt(strNumero);
        return numero;
    }

    public static String identificarNumero () throws IOException {
        System.out.println("Ingrese el número: ");
        int numero = cargarNumero();
        if(numero %2 == 0 ){
            return "El número es par";
        }else{
            return "El número es impar";
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(identificarNumero());
    }

}
