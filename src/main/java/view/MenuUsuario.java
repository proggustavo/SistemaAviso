package view;

import java.util.Scanner;

public class MenuUsuario {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CONSULTAR_USUARIO = 1;
	private static final int OPCAO_MENU_CADASTRAR_USUARIO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_USUARIO = 3;
	private static final int OPCAO_MENU_EXCLUIR_USUARIO = 4;
	private static final int OPCAO_MENU_USUARIO_SAIR = 9;
	
	private static final int OPCAO_MENU_CONSULTAR_TODOS_USUARIO = 1;
	private static final int OPCAO_MENU_CONSULTAR_UM_USUARIO = 2;
	private static final int OPCAO_MENU_CONSULTAR_USUARIO_SAIR = 9;
	
	
	
	public void apresentarMenuUsuario() {
		
		int opcao = this.apresentarOpcoesMenu();
		
				while(opcao != OPCAO_MENU_USUARIO_SAIR ) {
					switch(opcao) {
						case OPCAO_MENU_CONSULTAR_USUARIO: {
							this.consultarUsuario();
							break;
						}
						case OPCAO_MENU_CADASTRAR_USUARIO: {
							this.cadastrarUsuario();
							break;
						}
						case OPCAO_MENU_ATUALIZAR_USUARIO: {
							this.atualizarUsuario();
							break;
						}
						case OPCAO_MENU_EXCLUIR_USUARIO: {
							this.excluirUsuario();
							break;
							
						}
						default: {
							System.out.println("Opção inválida!");
							break;
						}
					
					}
					
					opcao = this.apresentarOpcoesMenu();
					
				}
		
		
		
	}





	private void consultarUsuario() {
		
		int opcao = this.apresentarOpcoesConsulta();
			while(opcao != OPCAO_MENU_CONSULTAR_USUARIO_SAIR) {
					switch(opcao) {
						case OPCAO_MENU_CONSULTAR_TODOS_USUARIO: {
							opcao = OPCAO_MENU_CONSULTAR_USUARIO_SAIR;
							System.out.println("Consulta Todos");
							break;
						}
						case OPCAO_MENU_CONSULTAR_UM_USUARIO:{
							opcao = OPCAO_MENU_CONSULTAR_USUARIO_SAIR;
							System.out.println("Consulta Específico");
							break;
						}
						default:{
							System.out.println("Opção inválida!");
							opcao = this.apresentarOpcoesConsulta();
						}
					}
					
			}
		
	}
	
	private int apresentarOpcoesConsulta() {
		
		System.out.println("\nSitema Avisos - Menu de consulta");
		System.out.println("\nInforme o tipo de consulta a ser realizada: ");
		System.out.println(OPCAO_MENU_CONSULTAR_TODOS_USUARIO + " - Consultar todos os usuários");
		System.out.println(OPCAO_MENU_CONSULTAR_UM_USUARIO + "- Consultar um usuário específico");
		System.out.println(OPCAO_MENU_CONSULTAR_USUARIO_SAIR + "- Voltar ");
		System.out.println("\n Digite a opção: ");
		return Integer.parseInt(teclado.nextLine());
		
		
	}





	private void cadastrarUsuario() {
		// TODO Auto-generated method stub
		
	}
	

	private void atualizarUsuario() {
		// TODO Auto-generated method stub
		
	}
	

	private void excluirUsuario() {
		// TODO Auto-generated method stub
		
	}





	private int apresentarOpcoesMenu() {
		
		System.out.println("\nSistema de Avisos - Menu Usuário");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CONSULTAR_USUARIO + " - Menu consultar usuário");
		System.out.println(OPCAO_MENU_CADASTRAR_USUARIO + " - Menu de cadastrar usuário");
		System.out.println(OPCAO_MENU_ATUALIZAR_USUARIO + " - Menu atualizar usuário");
		System.out.println(OPCAO_MENU_EXCLUIR_USUARIO + " - Menu excluir usuário");
		System.out.println(OPCAO_MENU_USUARIO_SAIR + " - Voltar");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
		
		
		
		
	}

}
