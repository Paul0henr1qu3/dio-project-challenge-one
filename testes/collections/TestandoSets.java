package testes.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestandoSets {
  public static void main(String[] args) {
    
    System.out.println("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d,
                                                    8.5,
                                                    9.3,
                                                    5d,
                                                    7d,
                                                    0d,
                                                    3.6));

    System.out.println(notas);

    System.out.println("Confira se a nota 5.0 está no conjunto: ");
    System.out.println(notas.contains(5.0));

    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    System.out.println("Soma das notas: ");

    Double soma = 0d;
    for(Double nota: notas){
      soma += nota;
    }

    System.out.println(soma);
    System.out.println(soma / notas.size());

    System.out.println("Remove a nota 0: ");
    notas.remove(0d);

    System.out.println(notas);

    Set<Double> outrasNotas = new LinkedHashSet<>();
    outrasNotas.add(7d);
    outrasNotas.add(8.5);
    outrasNotas.add(9.3);
    outrasNotas.add(5d);
    outrasNotas.add(7d);
    outrasNotas.add(0d);
    outrasNotas.add(3.6);

    System.out.println(outrasNotas);

    Set<Double> maisNotas = new TreeSet<>(outrasNotas);
    System.out.println(maisNotas);

    notas.clear();

    System.out.println(notas.isEmpty());
  }
}
