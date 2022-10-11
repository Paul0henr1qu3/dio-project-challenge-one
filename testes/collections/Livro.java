package testes.collections;

import java.util.Comparator;

public class Livro {
  
  private String nome;
  private Integer paginas;

  public Livro(String nome,Integer paginas){
    this.nome = nome;
    this.paginas = paginas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getPaginas() {
    return paginas;
  }

  public void setPaginas(Integer paginas) {
    this.paginas = paginas;
  }

  @Override
  public boolean equals(Object arg0) {
    // TODO Auto-generated method stub
    return super.equals(arg0);
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Nome do Livro: " + this.nome + " - " + "Quantidade de Páginas: " + this.paginas;
  }

}
