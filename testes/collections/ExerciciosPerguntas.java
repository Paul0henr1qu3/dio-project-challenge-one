package testes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma 
 * pessoa sobre um crime. As perguntas são:
 * 1. "Telefonou para a vitima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vitima?"
 * 4. "Devia para a vitima?"
 * 5. "Já trabalhou com a vítima?"
 * 
 * Se a pessoa respopnder positivamente a 2 questões ela será classificada como "Suspeita", entre 3 ou 4 como "Cumplice" e 5 como "Assassina". Caso contrário, "Inocente".
 */

public class ExerciciosPerguntas {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<String> perguntas = Arrays.asList(
      "Telefonou para a vitima?",
      "Esteve no local do crime?",
      "Mora perto da vitima?",
      "Devia para a vitima?",
      "Já trabalhou com a vítima?"
    );
    
    List<String> respostas = new ArrayList<>();

    for(String pergunta: perguntas){
      System.out.println(pergunta);
      String resposta = scanner.next();
      respostas.add(resposta.toUpperCase());
    }

    int resultado = Collections.frequency(respostas, "SIM");

    switch(resultado){
      case 2:{
        System.out.println("SUSPEITO!");
        break;
      }
      case 3:{
        System.out.println("CUMPLICE!");
        break;
      }
      case 4:{
        System.out.println("CUMPLICE!");
        break;
      }
      case 5:{
        System.out.println("ASSASINO!");
        break;
      }
      default:{
        System.out.println("INOCENTE!");
      }
    }

  }
}
