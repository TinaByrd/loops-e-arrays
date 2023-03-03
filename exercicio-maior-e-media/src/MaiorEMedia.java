import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0; //inicia zerada
        int soma = 0;

        int count = 0; //contador
        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero; //para verificar o maior número

            count = count + 1;
        } while(count < 5); //enquanto o contador for menor do que 5, terá loop
        
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5)); //divide a soma pela quantidade de números

    }
}
