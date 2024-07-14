import java.util.Locale;
import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao seu sistema de notas e calculador de medias");
        System.out.println("Para começar, preencha algumas informações a seguir:");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua turma:");
        String turma = scanner.next();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Você tem: " + idade + " anos ");
        System.out.println("Sua turma é: " + turma);

        System.out.println("Insira suas notas para verificação de média");
        System.out.println("Nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota 3:");
        double nota3 = scanner.nextDouble();

        double medias = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é : " + medias);

        if (medias > 7){
            System.out.println("APROVADO");
        } else {   
            System.out.println("REPROVADO");
        }
        
    }
}
