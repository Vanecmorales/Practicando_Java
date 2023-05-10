//Armar un programa que muestre lor primero 100 números primos
public class EjercicioNumerosPrimos {
    public static void main (String[] args){
       int number = 1;
       int primeNumberCounter = 0;
       String result = "";

       while (primeNumberCounter < 100){
           if(calculatePrimeNumber(number)){
               result += number + "\n" ;
               primeNumberCounter++;
           }
           number++;
       }
        System.out.println("Los primeros 100 número primos son:" + "\n" + result);
    }

    private static boolean calculatePrimeNumber(int number){
        boolean isAPrimeNumber = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0) {
                isAPrimeNumber = false;
            }
        }
        return isAPrimeNumber;
    }
}
