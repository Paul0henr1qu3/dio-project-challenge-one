package testes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacaoLista {
  public static void main(String[] args) {
    
    Gato primeiroGato = new Gato("Biju", 15, "Branca");

    Gato segundoGato = new Gato("Harry", 3, "Branco");

    Gato terceiroGato = new Gato("Gatinha", 2, "Branco");

    List<Gato> gatos = new ArrayList<>();
    gatos.add(primeiroGato);
    gatos.add(segundoGato);
    gatos.add(terceiroGato);

    System.out.println(gatos);

    Collections.shuffle(gatos);

    System.out.println(gatos);

    Collections.sort(gatos);

    System.out.println(gatos);

    Collections.sort(gatos, new ComparatorIdade());
    //gatos.sort(new ComparatorIdade());

    System.out.println(gatos);

    gatos.sort(new ComparatorCor());

    System.out.println(gatos);

    gatos.sort(new ComparatorNomeCorIdade());

    System.out.println(gatos);

  }
}
