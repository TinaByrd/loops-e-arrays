/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int [] vetor = {-5, -6, 15, 50, 8, 4}; //declarando o vetor unidimensional de 5 posições e 6 elementos
        
        int count = 0;
        while ((count < (vetor.length))) { //lenght retorna o tamanho. só menor pq o array começa na posição zero
            System.out.println(vetor[count] + " ");
            count++;
        }

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
