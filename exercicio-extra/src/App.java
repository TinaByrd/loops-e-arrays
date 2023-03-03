import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não aceite 
a senha igual ao nome do usuário, mostrando uma mensagem de erro e 
voltando a pedir as informações.*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        String senha;

        System.out.println("Usuário: ");
        nome = scan.next();

        System.out.println("Senha: ");
        senha = scan.next();

        do{
         
        System.out.println("Erro! Digite senha diferente do usuário");

        System.out.println("Usuário: ");
        nome = scan.next();

        System.out.println("Senha: ");
        senha = scan.next();

        } while (nome == senha);

        System.out.println("Bem vinde!");
    }
    
}
