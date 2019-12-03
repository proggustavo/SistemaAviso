package view;

import java.util.Scanner;

import model.vo.UsuarioVO;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_AVISO = 1;
	private static final int OPCAO_MENU_RELATORIO = 2;
	private static final int OPCAO_MENU_USUARIO = 3;
	private static final int OPCAO_MENU_SAIR = 4;
	
	private static final int ADMINISTRADOR = 1;
	private static final int COORDENADOR = 2;
	private static final int SECRETARIA = 3;
	private static final int ALUNO = 4;

	
	public void apresentarMenu(UsuarioVO usuarioVO) {
		int opcao = this.apresentarOpcoesMenu(usuarioVO.getIdTipoUsuario());
			while(opcao != OPCAO_MENU_SAIR ) {
				switch(opcao) {
				case OPCAO_MENU_AVISO:{
					MenuAviso menuAviso = new MenuAviso();
					menuAviso.apresentarMenuAviso(usuarioVO);
					break;
				}
				case OPCAO_MENU_RELATORIO:{
					MenuRelatorio menuRelatorio = new MenuRelatorio();
					menuRelatorio.apresentarMenuRelatorio();
					break;
				}
				
				case OPCAO_MENU_USUARIO:{
					MenuUsuario menuUsuario = new MenuUsuario();
					menuUsuario.apresentarMenuUsuario();
					break;
				}
				default : {
					System.out.println("Opção inválida!");
					break;
				}
								
				}
				
			opcao = this.apresentarOpcoesMenu(usuarioVO.getIdTipoUsuario());
			
		}
	}
	
	private int apresentarOpcoesMenu(int tipoUsuario) {
		System.out.println("\nSistema de Avisos - Menu Principal");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_AVISO + " - Menu de Avisos");
		if(tipoUsuario != ALUNO ) {
			System.out.println(OPCAO_MENU_RELATORIO + " - Menu de Relatórios");
			
		}
		if(tipoUsuario != ADMINISTRADOR || tipoUsuario != COORDENADOR ) {
			System.out.println(OPCAO_MENU_USUARIO + " - Menu de Usuários");
		}		
		System.out.println(OPCAO_MENU_SAIR + " - Sair");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
	}
	
	
	
	

}
