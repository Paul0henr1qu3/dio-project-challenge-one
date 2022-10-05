package testes.collections;

public class Gato implements Comparable<Gato> {

  private String nome;
  private int idade;
  private String cor;

  public Gato(String nome, int idade, String cor){
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + " - Idade: " + this.idade + " - Cor: " + this.cor;
  }

  @Override
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }

}
