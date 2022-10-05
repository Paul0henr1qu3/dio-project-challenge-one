package testes.excessoes;

public class TesteTryCatch {
  public static void main(String[] args) {
    int numero = 10;
    int dividir;

    try{
      dividir = numero / 0;
    } catch(ArithmeticException ex){
      System.out.println(ex.getStackTrace());
    }

    System.out.println("divindo...");
  }
}
