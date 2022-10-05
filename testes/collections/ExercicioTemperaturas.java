package testes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura media dos 6
 * primeiros meses do ano e armaze-as em uma lista.
 * Apos isto, calcule a media semestral das temperaturas e mostre
 * todas as temperaturas acima desta media, e em que mês elas ocorram(mostrar o mes por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */

public class ExercicioTemperaturas {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<String> mesesDoAno = Arrays.asList(
      "Janeiro",
      "Fevereiro",
      "Março",
      "Abril",
      "Maio",
      "Junho"
    );

    List<Double> temperaturas = new ArrayList<>();
    Double somaDasTemperaturas = 0d;

    for(String mes: mesesDoAno){
      System.out.println("Digite a temperatura média de " + mes + ": ");
      Double temperatura = scanner.nextDouble();
      somaDasTemperaturas += temperatura;
      temperaturas.add(temperatura);
    }

    scanner.close();

    Double mediaSemestral = somaDasTemperaturas / 6;
    System.out.println("Media Semestral das Temperaturas: " + Math.round(mediaSemestral));

    int i = 0;
    for(Double temperatura: temperaturas){
      if(temperatura >= mediaSemestral){
        System.out.println("Temperaturas acima da média semestral:");
        System.out.println("Mês: " + mesesDoAno.get(i));
        System.out.println("Temperatura: " + temperatura);
      }

    }  
  }
}
