package view;

import java.util.Scanner;

public class MenuAviso {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_AVISO_COORDENACAO = 1;
	private static final int OPCAO_MENU_AVISO_ESTAGIO = 2;
	private static final int OPCAO_MENU_AVISO_CURSOLIVRE = 3;
	private static final int OPCAO_MENU_AVISO_SAIR = 9;
	
	
	public void apresentarMenuAviso() {
		
		int opcao = this.apresentarOpcoesMenuAviso();
		
		while(opcao != OPCAO_MENU_AVISO_SAIR) {
				switch(opcao) {
						case OPCAO_MENU_AVISO_COORDENACAO: {
							AvisoCoordenacao avisoCoordencao = new AvisoCoordenacao();
							avisoCoordencao.apresentarMenu();
							break;
						}
						case OPCAO_MENU_AVISO_ESTAGIO: {
							AvisoEstagio avisoEstagio = new AvisoEstagio();
							avisoEstagio.apresentarMenu();
							break;
						}
						case OPCAO_MENU_AVISO_CURSOLIVRE: {
							AvisoCursoLivre avisoCursoLivre = new AvisoCursoLivre();
							avisoCursoLivre.apresentarMenu();
							break;
						}
						default: {
							System.out.println("Opção inválida!");
							
						}
				
				}
			
			opcao = this.apresentarOpcoesMenuAviso();
		}
		
	}


	private int apresentarOpcoesMenuAviso() {
		

		System.out.println("\nSistema de avisos - Menu avisos");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_AVISO_COORDENACAO + " - Menu Avisos Coordenacao");
		System.out.println(OPCAO_MENU_AVISO_ESTAGIO + " - Menu Avisos Estágio");
		System.out.println(OPCAO_MENU_AVISO_CURSOLIVRE + " - Menu Avisos Cursos livres");
		System.out.println(OPCAO_MENU_AVISO_SAIR + " - Voltar");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
	}

}
