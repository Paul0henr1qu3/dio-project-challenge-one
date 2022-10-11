package testes.collections;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
  
  private String nome;
  private String genero;
  private Integer tempoEpisodio;

  public Serie(String nome, String genero, Integer tempoEpisodio){
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getGenero() {
    return genero;
  }

  public String getNome() {
    return nome;
  }

  public Integer getTempoEpisodio() {
    return tempoEpisodio;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Nome: " + this.nome + " - " + "Genero: " + this.genero + " - " + "Tempo do Episodio: " + this.tempoEpisodio;
  }

  @Override
  public boolean equals(Object obj) {
    
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    Serie serie = (Serie) obj;

    return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);

  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return Objects.hash(nome, genero, tempoEpisodio);
  }

  @Override
  public int compareTo(Serie serie) {
    
    int genero = this.getGenero().compareTo(serie.getGenero());

    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

    if(tempoEpisodio != 0){
      return tempoEpisodio;
    }

    return genero;
  }

}
