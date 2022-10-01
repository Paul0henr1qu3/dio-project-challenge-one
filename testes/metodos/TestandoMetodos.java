package testes.metodos;

public class TestandoMetodos {

  public static void main(String[] args) {

    String nome = "Paulo Henrique";
    String outroNome = "Bruna Nunes";
    int numero = 42;
    int outroNumero = 40;

    System.out.println(getName(nome));
    System.out.println(compareNames(nome, outroNome));
    System.out.println(somaNumeros(numero,outroNumero));

    SobrecargaTeste.area(12);
    SobrecargaTeste.area(5,5);
    SobrecargaTeste.area(7,8,9);

    saudacaoMessage(11);
    
  }

  public static String getName(String name){
    return name.toUpperCase();
  }

  public static boolean compareNames(String primeiroNome, String segundoNome){
    return primeiroNome.equalsIgnoreCase(segundoNome);
  }

  public static void saudacaoMessage(int time){
    if(time < 12){
      System.out.println("Bom dia!");
    }else if(time < 18){
      System.out.println("Boa tarde!");
    } else {
      System.out.println("Boa noite!");
    }
  }

  public static int somaNumeros(int numeroUm, int numeroDois){
    return numeroUm + numeroDois;
  }

}


