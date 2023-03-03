import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int num;
        int quantNumeros;
        int quantPar = 0; 
        int quantImpar = 0;

        System.out.println("Informe a quantidade de números: ");
        quantNumeros= scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");  
            num = scan.nextInt();
            count++; //se não incrementar aqui, o código fica em loop infinito
            
            if (num % 2 == 0) quantPar++; //incrementando nos pares
            else quantImpar++; //incrementando em ímpares

        } while (count < quantNumeros);
        System.out.println("Quantidade Par: " + quantPar);
        System.out.println("Quantidade Ímpar: " + quantImpar);
    }
}
