package testes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteLinguagemFavorita {

  public static void main(String[] args) {
    
    LinguagemFavorita python = new LinguagemFavorita("Python", "1995", "PyCharm");

    LinguagemFavorita java = new LinguagemFavorita("Java", "1990", "IntelliJ");

    LinguagemFavorita lua = new LinguagemFavorita("Lua", "1997", "Null");

    Set<LinguagemFavorita> linguagens = new HashSet<>();
    linguagens.add(lua);
    linguagens.add(python);
    linguagens.add(java);

    System.out.println(linguagens);

    Set<LinguagemFavorita> ordemNatural = new TreeSet<>(linguagens);

    System.out.println(ordemNatural);

    Set<LinguagemFavorita> ordermInsercao = new LinkedHashSet<>(linguagens);

    System.out.println(ordermInsercao);


  }
  
}
