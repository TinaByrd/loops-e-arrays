import java.util.Scanner;

/* Faça um programa que peça uma nota, entre zero e dez. 
Mostre uma mensagem caso o valor seja inválido e continue pedindo 
até que o usuário informe um valor válido. */

public class ExNota {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota do aluno");
            double nota = scanner.nextDouble();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Insira um valor válido");
                nota = scanner.nextDouble();
        }
        if (nota <= 10) {
            System.out.println("Ok");
        }
    }
}
