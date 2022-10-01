public class CastingTeste {

  public static void main(String[] args) {
    
    int numero = 10;
    long numeroLongo = numero;

    int i = 3;
    int n = 10 -5 * 2 + --i;

    System.out.println(n);

    Double outroNumero = (double) numero;
    
    System.out.println(numero);
    System.out.println(outroNumero);
    System.out.println(numeroLongo);

  }
  
}
