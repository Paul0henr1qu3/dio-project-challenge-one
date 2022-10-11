package testes.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestesMap {

  public static void main(String[] args) {
    
    Map<String,Double> carrosPopulares = new HashMap(){{
      put("gol", 14.4);
      put("uno", 15.8);
      put("mobi", 13.3);
      put("hb20", 14.5);
      put("kwid", 14.9);
    }};

    System.out.println(carrosPopulares.toString());
    carrosPopulares.put("gol",15.5);

    System.out.println(carrosPopulares.toString());

    System.out.println("Temos Tucson? " + carrosPopulares.containsKey("tucson"));

    System.out.println("Temos Uno? " + carrosPopulares.containsKey("uno"));

    System.out.println("Consumo do Uno: " + carrosPopulares.get("uno"));

    System.out.println("Exiba os modelos: ");

    Set<String> modelos = carrosPopulares.keySet();

    Collection<Double> consumos = carrosPopulares.values();
    System.out.println(consumos);

    System.out.println("Carro mais economico: ");

    Double melhorConsumo = Collections.max(consumos);
    Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();

    for(Map.Entry<String,Double> entry: entries){
      if(entry.getValue().equals(melhorConsumo)){
        System.out.println("Melhor modelo: " +  entry.getKey());
        System.out.println("Consumo: " + melhorConsumo);
      }
    }


    Map<String,Livro> livrosFavoritos = new HashMap(){{
      put("Stephen Hawking", new Livro("Uma breve história do tempo", 255));
      put("Charles Duhigg", new Livro("O poder do hábito", 408));
      put("Harari", new Livro("21 lições para o século 21", 509));
    }};


    for(Map.Entry<String, Livro> livro: livrosFavoritos.entrySet()){
      System.out.println(livro.getKey());
      System.out.println(livro.getValue());
    }



    Map<String,Livro> ordemDeInserção = new LinkedHashMap(){{
      put("Stephen Hawking", new Livro("Uma breve história do tempo", 255));
      put("Charles Duhigg", new Livro("O poder do hábito", 408));
      put("Harari", new Livro("21 lições para o século 21", 509));
    }};

    System.out.println(ordemDeInserção);

    Map<String,Livro> ordemNatural = new TreeMap(){{
      put("Stephen Hawking", new Livro("Uma breve história do tempo", 255));
      put("Charles Duhigg", new Livro("O poder do hábito", 408));
      put("Harari", new Livro("21 lições para o século 21", 509));
    }};

    System.out.println(ordemNatural);

    Set<Map.Entry<String, Livro>> ordemPorNomeLivros = new TreeSet<>(new ComparadorDeNome());
    ordemPorNomeLivros.addAll(ordemDeInserção.entrySet());

    System.out.println(ordemPorNomeLivros);

    Set<Map.Entry<String,Livro>> ordemPorPaginas = new TreeSet<>(new ComparadorPorPaginas());

    ordemPorPaginas.addAll(livrosFavoritos.entrySet());

    System.out.println(ordemPorPaginas);

    


  }
  
}
