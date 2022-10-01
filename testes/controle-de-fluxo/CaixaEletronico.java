
public class CaixaEletronico {
  public static void main(String[] args) {
    
    double saldo = 200.0;
    double valorDoSaque = 199.0;

    if(valorDoSaque < saldo){
      saldo -= valorDoSaque;
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Saldo atual: " + saldo);
    }else{
      System.out.println("Saque recusado, sem saldo!");
      System.out.println("Saldo atual: " + saldo);
    }

    

  }
}
