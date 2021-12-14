import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random random = new Random();
        int [] numAleatorios = new int[20];

        for(int i=0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
            
        }
        System.out.print("Número Aleatórios: ");
        for (int numero: numAleatorios) {
            System.out.print(numero + " ");
            
        }

        System.out.print("\nSucessores Número Aleatórios: ");
        for (int numero: numAleatorios) {
            System.out.print(numero+1 + " ");

        }

        System.out.print("\nAntecessores Número Aleatórios: ");
        for (int numero: numAleatorios) {
            System.out.print(numero-1 + " ");

        }
    }

}
