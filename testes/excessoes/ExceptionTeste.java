package testes.excessoes;

import java.text.NumberFormat;

public class ExceptionTeste {
  
  public static void main(String[] args) {
    
    try {
      System.out.println(formatarCep("25625698"));
    } catch (CepInvalidException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static String formatarCep(String cep) throws CepInvalidException {
    if(cep.length() != 8){
      throw new CepInvalidException();
    }
    return cep;
  }

}
