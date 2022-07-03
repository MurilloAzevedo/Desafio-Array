package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio_Nota {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas nota serão adicionadas?");
        int qtdeNotas = input.nextInt();

        double[] notas = new double [qtdeNotas];
        
        for (int i = 0; i <notas.length; i++){
            System.out.print("Informa a nota" + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        System.out.println(Arrays.toString(notas));

        double total = 0;
        for(double nota: notas){ //Foreach
            total += nota;
        }

        System.out.printf("A média desse aluno é: %.2f", total / notas.length);

        input.close();
    }
}
