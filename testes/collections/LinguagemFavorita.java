package testes.collections;

/* Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriação e ide. Em seguida, crie um conjunto com 3 linguagens
e faça um programa que ordene esse conjunto por:
 *  Ordem de inserção
 * Ordem natural
 * IDE
 * Ano de criação e nome
 * Nome, ano de criação e IDE
 * Ao final, exiba as linguagens no console, um abaixo da outra.
 */

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
  
  private String nome;
  private String anoDeCriacao;
  private String IDE;
  
  public LinguagemFavorita(String nome, String anoDeCriacao, String IDE){
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.IDE = IDE;
  }

  public String getAnoDeCriacao() {
    return anoDeCriacao;
  }

  public void setAnoDeCriacao(String anoDeCriacao) {
    this.anoDeCriacao = anoDeCriacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIDE() {
    return IDE;
  }

  public void setIDE(String iDE) {
    IDE = iDE;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + 
           " - " + 
           "Ano de Criação: " + this.anoDeCriacao +
           " - " +
           "IDE: " + this.IDE;
  }

  @Override
  public int compareTo(LinguagemFavorita l) {

    int ordemNaturalNome = this.nome.compareTo(l.getNome());

    if(ordemNaturalNome != 0){
      return ordemNaturalNome;
    }
    return 0;
  }

}
