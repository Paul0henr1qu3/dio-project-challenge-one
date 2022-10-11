package testes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrderSetTestes {
  public static void main(String[] args) {
    
    Set<Serie> minhasSeries = new HashSet(){{
      add(new Serie("GOT", "Fantasia",60));
      add(new Serie("Dark", "Drama",40));
      add(new Serie("BT", "Comedia",20));
    }};

    System.out.println(minhasSeries);

    Set<Serie> ordemInsercao = new LinkedHashSet<>(minhasSeries);

    System.out.println(ordemInsercao);

    Set<Serie> ordemNatural = new TreeSet<>(ordemInsercao);

    System.out.println(ordemNatural);



  }
}
