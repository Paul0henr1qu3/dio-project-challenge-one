package testes.metodos;

public class SobrecargaTeste {

  public static void area(double lado){
    System.out.println("Area do quagrado: " + lado * lado);
  }

  public static void area(double lado, double lado2){
    System.out.println("Area do retangulo: " + (lado + lado));
  }

  public static void area(double baseMaior, double baseMenor, double altura){
    System.out.println("Area do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
  }

}
