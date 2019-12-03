package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControladoraAvisoCoordenacao;

import model.vo.AvisoCoordenacaoVO;

import model.vo.UsuarioVO;

public class AvisoCoordenacao {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CONSULTAR_AVISO = 1;
	private static final int OPCAO_MENU_CADASTRAR_AVISO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_AVISO = 3;
	private static final int OPCAO_MENU_EXCLUIR_AVISO = 4;
	private static final int OPCAO_MENU_AVISO_SAIR = 9;
	
	private static final int OPCAO_MENU_CONSULTAR_TODOS_AVISO_COORDENACAO = 1;
	private static final int OPCAO_MENU_CONSULTAR_UM_AVISO_COORDENACAO = 2;
	private static final int OPCAO_MENU_CONSULTAR_COORDENACAO_SAIR = 9;

	private static final int ADMINISTRADOR = 1;
	private static final int COORDENADOR = 2;

	public void apresentarMenu(UsuarioVO usuarioVO) {

		int opcao = this.apresentarOpcoesMenu(usuarioVO.getIdTipoUsuario());

		while (opcao != OPCAO_MENU_AVISO_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_AVISO: {
				this.consultarAviso();
				break;
			}
			case OPCAO_MENU_CADASTRAR_AVISO: {
				this.cadastrarAviso(usuarioVO);
				break;
			}
			case OPCAO_MENU_ATUALIZAR_AVISO: {
				this.atualizarAviso(usuarioVO);
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

			opcao = this.apresentarOpcoesMenu(usuarioVO.getIdTipoUsuario());
		}

	}

	private int apresentarOpcoesMenu(int tipoUsuario) {

		System.out.println("\nSistema de Avisos - Menu Avisos Coordenação ");
		System.out.println("\n Opções: ");
		System.out.println(OPCAO_MENU_CONSULTAR_AVISO + " - Consultar aviso");
		if(tipoUsuario == ADMINISTRADOR || tipoUsuario == COORDENADOR){
			System.out.println(OPCAO_MENU_CADASTRAR_AVISO + " - Cadastrar aviso");
			System.out.println(OPCAO_MENU_ATUALIZAR_AVISO + " - Atualizar aviso");
			System.out.println(OPCAO_MENU_EXCLUIR_AVISO + " - Excluir aviso");
		}
		System.out.println(OPCAO_MENU_AVISO_SAIR + " - Voltar");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());

	}

	private void excluirAviso() {

		AvisoCoordenacaoVO avisoCoordenacaoVO = new AvisoCoordenacaoVO();

		System.out.println("\nInforme o código do aviso: ");
		avisoCoordenacaoVO.setIdAvisoCoordenacao(Integer.parseInt(teclado.nextLine()));

		ControladoraAvisoCoordenacao controladoraAvisoCoordenacao = new ControladoraAvisoCoordenacao();
		controladoraAvisoCoordenacao.excluirAvisoCoordenacaoController(avisoCoordenacaoVO);

	}

	private void atualizarAviso(UsuarioVO usuarioVO) {
		AvisoCoordenacaoVO avisoCoordenacaoVO = new AvisoCoordenacaoVO();

		System.out.println("\nDigite o código do aviso: ");
		avisoCoordenacaoVO.setIdAvisoCoordenacao(Integer.parseInt(teclado.nextLine()));
		System.out.println("\nDigite a descrição: ");
		avisoCoordenacaoVO.setDescricao(teclado.nextLine());
		

		ControladoraAvisoCoordenacao controladoraAvisoCoordenacao = new ControladoraAvisoCoordenacao();
		controladoraAvisoCoordenacao.atualizarAvisoCoordenacaoController(avisoCoordenacaoVO);
	}

	private void cadastrarAviso(UsuarioVO usuarioVO) {
		AvisoCoordenacaoVO avisoCoordenacaoVO = new AvisoCoordenacaoVO();

		System.out.println("\nDigite o código do aviso: ");
		avisoCoordenacaoVO.setIdAvisoCoordenacao(Integer.parseInt(teclado.nextLine()));
		System.out.println("\nDigite a descrição: ");
		avisoCoordenacaoVO.setDescricao(teclado.nextLine());
		

		ControladoraAvisoCoordenacao controladoraAvisoCoordenacao = new ControladoraAvisoCoordenacao();
		controladoraAvisoCoordenacao.cadastrarAvisoCoordenacaoController(avisoCoordenacaoVO);


	}

	private void consultarAviso() {
		ControladoraAvisoCoordenacao controladoraAvisoCoordenacao = new ControladoraAvisoCoordenacao();

		int opcao = this.apresentarOpcoesConsulta();
		while (opcao != OPCAO_MENU_CONSULTAR_COORDENACAO_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODOS_AVISO_COORDENACAO: {
				opcao = OPCAO_MENU_CONSULTAR_COORDENACAO_SAIR;
				AvisoCoordenacaoVO avisoCoordenacaoVO = new AvisoCoordenacaoVO();
				ArrayList<AvisoCoordenacaoVO> listaAvisoCoordenacaoVO = controladoraAvisoCoordenacao.consultarTodosAvisoCoordenacaoController();
				
				break;
			}
			case OPCAO_MENU_CONSULTAR_UM_AVISO_COORDENACAO: {
				opcao = OPCAO_MENU_CONSULTAR_COORDENACAO_SAIR;
				
				AvisoCoordenacaoVO avisoCoordenacaoVO = new AvisoCoordenacaoVO();
				System.out.println("Informe o código do aviso Estágio: ");
				avisoCoordenacaoVO.setIdAvisoCoordenacao(Integer.parseInt(teclado.nextLine()));
				
				AvisoCoordenacaoVO avisoCoordenacao = controladoraAvisoCoordenacao.consultarAvisoCoordenacao(avisoCoordenacaoVO);
				
				break;
			}
			default: {
				System.out.println("Opção inválida!");
				opcao = this.apresentarOpcoesConsulta();
			}
			}

	}

}

	private int apresentarOpcoesConsulta() {
		System.out.println("\nSistema Avisos - Menu consulta Aviso");
		System.out.println("\nInforme o tipo de consulta a ser realizada: ");
		System.out.println(OPCAO_MENU_CONSULTAR_TODOS_AVISO_COORDENACAO + " - Consultar todos os avisos Estagio");
		System.out.println(OPCAO_MENU_CONSULTAR_UM_AVISO_COORDENACAO + " - Consultar um Estagio específico");
		System.out.println(OPCAO_MENU_CONSULTAR_COORDENACAO_SAIR + "- Voltar");
		System.out.println("\nDigite a opção: ");
		return Integer.parseInt(teclado.nextLine());
	}
	
}
