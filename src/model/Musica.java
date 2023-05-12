package model;

public class Musica {
	public String nome;
	public String nomeArtista;
	public int duracao;
	
	public String toString() {
		return(nome + " | Artista: " + nomeArtista + " | Duração: " +  duracao + " segundos");
	}
}
