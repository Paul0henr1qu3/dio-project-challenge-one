package testes.excessoes;

public class TesteTryCatch {
  public static void main(String[] args) {
    int numero = 10;
    int dividir = 0;

    try{
      dividir = numero / 0;
    } catch(ArithmeticException ex){
      System.out.println(ex.getStackTrace());
    }

    System.out.print(dividir);
    System.out.println("divindo...");
  }
}
