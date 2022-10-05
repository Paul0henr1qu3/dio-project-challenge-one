package testes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestesListas {
  public static void main(String[] args) {
    
    //Mais utilizado quando se quer guardar dados para consulta futura
    List<String> alunos = new ArrayList<>();
    alunos.add("Paulo");
    alunos.add("Bruna");
    alunos.add("Raul");

    //Mais utilizada quando se quer inserir ou excluir dados
    List<String> nomes = new LinkedList<>();
    nomes.add("Paulo Henrique Oliveira da Silva");

    List<Double> notas = new ArrayList<>();
    double somaDasNotas = 0.0;
    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6);

    System.out.println(notas.toString());
    System.out.println(notas.indexOf(5d));

    notas.add(4,8d);
    System.out.println(notas);

    notas.set(notas.indexOf(5d), 6.0);

    System.out.println(notas);

    System.out.println("Tem 5 na lista? " + notas.contains(5d));


    for(Double nota: notas){
      System.out.println(nota);
      somaDasNotas += nota;
    }

    System.out.println("Terceira nota adicionada: " + notas.get(2));

    System.out.println("Imprimindo a menor nota: " + Collections.min(notas));

    System.out.println("Imprimindo a maior nota: " + Collections.max(notas));

    System.out.println("Soma das notas: " + somaDasNotas);

    System.out.println("Media: " + somaDasNotas / notas.size());

    notas.remove(0d);
    notas.remove(0);

    System.out.println(notas);

    notas.clear();

    System.out.println("EStá vazia? " + notas.isEmpty());
    
    




    

    

  }
}
