package controller;

import model.Lista;
import model.Musica;

public class PlayerController {

	public void adicionaMusica (Lista lista, String musica) throws Exception {
		String[] vetLinha = musica.split(";");
		Musica m = new Musica();
		m.nome = vetLinha[0];
		m.nomeArtista = vetLinha[1];
		m.duracao = Integer.parseInt(vetLinha[2]);
		if (lista.isEmpty()) {
			lista.addFirst(m);
		} else {
			lista.addLast(m);
		}
	}
	
	public void removeMusica(Lista lista, int pos) throws Exception {
		if (lista.isEmpty()) {
			throw new Exception("Playlist vazia");
		}
		if (pos < 0 || pos > lista.size()) {
			throw new Exception("Posição inválida");
		}
		
		lista.remove(pos - 1);
	}
	
	public void executaPlaylist(Lista lista) throws Exception {
		if(lista.isEmpty()) {
			throw new Exception("Playlist vazai");
		}
		for (int i = 0; i < lista.size(); i++) {
			Musica musica = (Musica) lista.get(i);
			System.out.println("Tocando agora: " + musica);
			Thread.sleep(musica.duracao * 1000);
		}
		
		System.out.println("Fim da playlist!");
	}
}
