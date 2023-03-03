import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número 
inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que você quer saber o fatorial");
        int fatorial = scan.nextInt();

        int multiplicacao = 1; //começa com 1 porque é multiplicação

        System.out.print(fatorial + "!= ");

        for(int i = fatorial; i >= 1; i--){  //o i inicia igual ao fatorial; depois é utilizado enquanto for maior que 1. O decremento é porque vai diminuindo em 1 número
            multiplicacao = multiplicacao * i; 

        }
        System.out.println(multiplicacao);
    }
}
