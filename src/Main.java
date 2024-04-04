import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio =0;
        int numero =0;

        aleatorio = (int)(Math.random()*100);
        System.out.println(aleatorio);

        System.out.println("Adivina el número (de 0 a 100):");
       int i =1;

        while (aleatorio==numero); {
            i++;
            System.out.println("por favor ingrese su numero");
            numero = scanner.nextInt();

            if (numero > aleatorio) {
                System.out.println("¡Es menor! Intenta de nuevo.");
            } else if (numero < aleatorio) {
                System.out.println("¡Es mayor! Intenta de nuevo.");
            } else {
                System.out.printf("¡grandioso! Adivinaste el número en %d intentos.", i + 1);

            }
        }

        if (aleatorio == i +1) {
            System.out.printf("Lo siento, no has adivinado ewl número. El número era %d.", aleatorio);
        }
    }
}