package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista playlist = new Lista();
		PlayerController p = new PlayerController();
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção \n1- Adicionar música \n2- Remover música \n3 - Executar Playlist\n 9- Sair"));
			switch (opc) {
				case 1:
					StringBuffer msc = new StringBuffer();
					msc.append(JOptionPane.showInputDialog("Digite o nome da música: ") + ";");
					msc.append(JOptionPane.showInputDialog("Digite o artista da música: ") + ";");
					msc.append(JOptionPane.showInputDialog("Digite a duração da música: (em segundos)") + ";");
					String musica = msc.toString();
					p.adicionaMusica(playlist, musica);
					break;
				case 2:
					int opc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música (iniciando a partir do 1): "));
					p.removeMusica(playlist, opc2);
					break;
				case 3:
					p.executaPlaylist(playlist);
					break;
				case 9:
					System.out.println("Fim do programa");
					break;
				default:
					System.out.println("Opção inválida digitada, tente novamente");
					break;
			}
		} while (opc != 9);
	}
}
