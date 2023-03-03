import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios 
(entre 0 e 100) e armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random (); //classe que vem instalada no java e gera numeros aleatórios

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {//0 pq é a primeira posição do array; menor pq tem que ser o tamanho e ++ porque precisa incrementar
        int numero = random.nextInt(100); // esse int vai guardar o numero aleatório que a classe random passar. O 100 ali é o limite
        numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatorios:  ");
        for (int numero : numerosAleatorios) { // uso do foreach
            System.out.print(numero + " ");
        }

        System.out.print("Sucessores dos números Aleatorios: ");
        for (int numero : numerosAleatorios) { // uso do foreach
            System.out.print((numero + 1) + " ");
        }
    }
}
