package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControladoraUsuario;
import model.vo.UsuarioVO;

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
		
		ControladoraUsuario controladoraUsuario = new ControladoraUsuario();
		
		int opcao = this.apresentarOpcoesConsulta();
			while(opcao != OPCAO_MENU_CONSULTAR_USUARIO_SAIR) {
					switch(opcao) {
						case OPCAO_MENU_CONSULTAR_TODOS_USUARIO: {
							opcao = OPCAO_MENU_CONSULTAR_USUARIO_SAIR;
							ArrayList<UsuarioVO> listaUsuariosVO = controladoraUsuario.consultarTodosUsuariosController();
							break;
						}
						case OPCAO_MENU_CONSULTAR_UM_USUARIO:{
							opcao = OPCAO_MENU_CONSULTAR_USUARIO_SAIR;
							UsuarioVO usuarioVO = new UsuarioVO();
							System.out.print("\nInforme o código do usuário: ");
							usuarioVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
							
							UsuarioVO usuario = controladoraUsuario.consultarUsuarioController(usuarioVO);
							
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
		
		System.out.println("\nSitema Avisos - Menu de consulta Estagio");
		System.out.println("\nInforme o tipo de consulta a ser realizada: ");
		System.out.println(OPCAO_MENU_CONSULTAR_TODOS_USUARIO + " - Consultar todos os usuários");
		System.out.println(OPCAO_MENU_CONSULTAR_UM_USUARIO + "- Consultar um usuário específico");
		System.out.println(OPCAO_MENU_CONSULTAR_USUARIO_SAIR + "- Voltar ");
		System.out.println("\n Digite a opção: ");
		return Integer.parseInt(teclado.nextLine());
		
		
	}





	private void cadastrarUsuario() {
		
		UsuarioVO usuarioVO = new UsuarioVO();
		System.out.print("\nDigite o nome do Usuário: ");
		usuarioVO.setNome(teclado.nextLine());
		System.out.print("\nDigite o CPF do Usuário: ");
		usuarioVO.setCpf(teclado.nextLine());
		System.out.print("\nDigite o Email do Usuário: ");
		usuarioVO.setEmail(teclado.nextLine());
		usuarioVO.setIdTipoUsuario(1);
		System.out.print("\nDigite o Login do Usuário: ");
		usuarioVO.setLogin(teclado.nextLine());
		System.out.print("\nDigite o Senha do Usuário: ");
		usuarioVO.setSenha(teclado.nextLine());
		
		ControladoraUsuario controladoraUsuario = new ControladoraUsuario();
		controladoraUsuario.cadastrarUsuarioController(usuarioVO);
		
		
	}
	

	private void atualizarUsuario() {
		UsuarioVO usuarioVO = new UsuarioVO();
		
		System.out.print("\nDigite o código do Usuário: ");
		usuarioVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		System.out.print("\nDigite o nome do Usuário: ");
		usuarioVO.setNome(teclado.nextLine());
		System.out.print("\nDigite o CPF do Usuário: ");
		usuarioVO.setCpf(teclado.nextLine());
		System.out.print("\nDigite o email do Usuário: ");
		usuarioVO.setEmail(teclado.nextLine());
		usuarioVO.setIdTipoUsuario(1);
		System.out.print("\nDigite o Senha do Usuário: ");
		usuarioVO.setSenha(teclado.nextLine());
		
		ControladoraUsuario controladoraUsuario = new ControladoraUsuario();
		controladoraUsuario.atualizarUsuarioController(usuarioVO);
		
		
	}
	

	private void excluirUsuario() {
		UsuarioVO usuarioVO = new UsuarioVO();
		
		System.out.print("\nInforme o código do usuário: ");
		usuarioVO.setIdUsuario(Integer.parseInt(teclado.nextLine()));
		
		ControladoraUsuario controladoraUsuario = new ControladoraUsuario();
		controladoraUsuario.excluirUsuarioController(usuarioVO);
		
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
