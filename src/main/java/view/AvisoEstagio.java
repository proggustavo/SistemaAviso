package view;

import java.util.Scanner;

public class AvisoEstagio {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CONSULTAR_AVISO = 1;
	private static final int OPCAO_MENU_CADASTRAR_AVISO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_AVISO = 3;
	private static final int OPCAO_MENU_EXCLUIR_AVISO = 4;
	private static final int OPCAO_MENU_AVISO_SAIR = 9;
	

	public void apresentarMenu() {
		
		int opcao = this.apresentarOpcoesMenu();
		

		while(opcao != OPCAO_MENU_AVISO_SAIR) {
				switch(opcao) {
						case OPCAO_MENU_CONSULTAR_AVISO: {
							this.consultarAviso();
							break;
						}
						case OPCAO_MENU_CADASTRAR_AVISO: {
							this.cadastrarAviso();
							break;
						}
						case OPCAO_MENU_ATUALIZAR_AVISO: {
							this.atualizarAviso();
							break;
						}
						case OPCAO_MENU_EXCLUIR_AVISO: {
							this.excluirAviso();
							break;
						}
						default: {
							System.out.println("Opção inválida!");
						}
				}
			
			opcao = this.apresentarOpcoesMenu();
		
		}
		
	}

	private int apresentarOpcoesMenu() {
		System.out.println("\nSistema de avisos - Menu Avisos Estágio ");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CONSULTAR_AVISO + " - Consultar aviso");
		System.out.println(OPCAO_MENU_CADASTRAR_AVISO + " - Cadastrar aviso");
		System.out.println(OPCAO_MENU_ATUALIZAR_AVISO + " - Atualizar aviso");
		System.out.println(OPCAO_MENU_EXCLUIR_AVISO + " - Excluir aviso");
		System.out.println(OPCAO_MENU_AVISO_SAIR + " - Voltar");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
	
	}
	
	private void excluirAviso() {
		// TODO Auto-generated method stub
		
	}

	private void atualizarAviso() {
		// TODO Auto-generated method stub
		
	}

	private void cadastrarAviso() {
		// TODO Auto-generated method stub
		
	}

	private void consultarAviso() {
		// TODO Auto-generated method stub
		
	}


}
