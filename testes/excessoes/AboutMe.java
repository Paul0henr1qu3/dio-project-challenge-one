package testes.excessoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int idade = 0;
    double altura = 0.0; 

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite seu Sobrenome: ");
    String sobreNome = scanner.next();

    try{
      System.out.println("Digite sua idade: ");
      idade = scanner.nextInt();
  
      System.out.println("Digite sua altura: ");
      altura = scanner.nextDouble();
    } catch(InputMismatchException ex){
      System.err.println("Valor informado não é numérico!");
    }
    
    System.out.println("Sobre mim: ");
    System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + "cm");
    scanner.close();

  }

  
}
