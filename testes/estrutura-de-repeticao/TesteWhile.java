import java.util.concurrent.ThreadLocalRandom;

public class TesteWhile {
  public static void main(String[] args) {
    double mesada = 50.0;
    int quantidadeDeDoces = 0;

    while(mesada > 0){
      Double valorDoce = valorAleatorio();

      if(valorDoce > mesada){
        valorDoce = mesada;
      }

      System.out.println("Valor do Doce: " + valorDoce + " Adicionado no Carrinho");

      mesada -= valorDoce;
      quantidadeDeDoces++;

    }

    System.out.println("Quantidade de Doces: " + quantidadeDeDoces);
    System.out.println("Mesada: " + mesada);
    System.out.println("João gastou toda a sua mesada em doces!");

  }

  private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2,8);
  }

}
