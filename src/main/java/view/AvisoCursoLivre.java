package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControladoraAvisoCursoLivre;
import model.vo.CursoLivreVO;
import model.vo.EstagioVO;

public class AvisoCursoLivre {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CONSULTAR_AVISO = 1;
	private static final int OPCAO_MENU_CADASTRAR_AVISO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_AVISO = 3;
	private static final int OPCAO_MENU_EXCLUIR_AVISO = 4;
	private static final int OPCAO_MENU_AVISO_SAIR = 9;
	
	
	private static final int OPCAO_MENU_CONSULTAR_TODOS_AVISO_CURSO_LIVRE = 1;
	private static final int OPCAO_MENU_CONSULTAR_UM_AVISO_CURSO_LIVRE = 2;
	private static final int OPCAO_MENU_CONSULTAR_CURSO_LIVRE_SAIR = 9;

	public void apresentarMenu() {
		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_AVISO_SAIR) {
			switch (opcao) {
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

		System.out.println("\nSistema de Avisos - Menu Avisos Cursos Livres ");
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
		CursoLivreVO cursoLivreVO = new CursoLivreVO();

		System.out.println("\nInforme o código do Curso");
		cursoLivreVO.setIdAvisoCursoLivre(Integer.parseInt(teclado.nextLine()));

		ControladoraAvisoCursoLivre controladoraAvisoCursoLivre = new ControladoraAvisoCursoLivre();
		controladoraAvisoCursoLivre.excluirAvisoCursoLivreController(cursoLivreVO);
	}

	private void atualizarAviso() {
		
		CursoLivreVO cursoLivreVO = new CursoLivreVO();
		
		System.out.println("\nDigite o nome do Aviso do Curso Livre: ");
		cursoLivreVO.setNome(teclado.nextLine());
		System.out.println("\nDigite o público alvo: ");
		cursoLivreVO.setPublicoAlvo(teclado.nextLine());
		System.out.println("Digite o requisito: ");
		cursoLivreVO.setRequisito(teclado.nextLine());
		System.out.println("Digite o ambiente: ");
		cursoLivreVO.setData(teclado.nextLine());
		System.out.println("Digite o valor: ");
		cursoLivreVO.setValor(Double.parseDouble(teclado.nextLine()));
		
		ControladoraAvisoCursoLivre controladoraAvisoCursoLivre = new ControladoraAvisoCursoLivre();
		controladoraAvisoCursoLivre.atualizarAvisoCursoLivreController(cursoLivreVO);


	}

	private void cadastrarAviso() {
		CursoLivreVO cursoLivreVO = new CursoLivreVO();
		
		System.out.println("\nDigite o nome do Aviso do Curso Livre: ");
		cursoLivreVO.setNome(teclado.nextLine());
		System.out.println("\nDigite o público alvo: ");
		cursoLivreVO.setPublicoAlvo(teclado.nextLine());
		System.out.println("Digite o requisito: ");
		cursoLivreVO.setRequisito(teclado.nextLine());
		System.out.println("Digite o ambiente: ");
		cursoLivreVO.setAmbiente(teclado.nextLine());
		System.out.println("Digite a data");
		cursoLivreVO.setData(teclado.nextLine());
		System.out.println("Digite o valor: ");
		cursoLivreVO.setValor(Double.parseDouble(teclado.nextLine()));
		
		ControladoraAvisoCursoLivre controladoraAvisoCursoLivre = new ControladoraAvisoCursoLivre();
		controladoraAvisoCursoLivre.cadastrarAvisoCursoLivreController(cursoLivreVO);

	}

	private void consultarAviso() {
		ControladoraAvisoCursoLivre controladoraAvisoCursoLivre = new ControladoraAvisoCursoLivre();
		
		int opcao = this.apresentarOpcoesConsulta();
		while (opcao != OPCAO_MENU_CONSULTAR_CURSO_LIVRE_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODOS_AVISO_CURSO_LIVRE: {
				opcao = OPCAO_MENU_CONSULTAR_CURSO_LIVRE_SAIR;
				
				ArrayList<CursoLivreVO> listaCursoLivreVO = controladoraAvisoCursoLivre.consultarTodosAvisosCursoLivre();
				
				break;
			}
			case OPCAO_MENU_CONSULTAR_UM_AVISO_CURSO_LIVRE: {
				opcao = OPCAO_MENU_CONSULTAR_CURSO_LIVRE_SAIR;
				CursoLivreVO cursoLivreVO = new CursoLivreVO();
				System.out.println("Informe o código do aviso Estágio: ");
				cursoLivreVO.setIdAviso(Integer.parseInt(teclado.nextLine()));
				
				CursoLivreVO cursoLivre = controladoraAvisoCursoLivre.consultarAvisoCursoLivre(cursoLivreVO);
				
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
		System.out.println(OPCAO_MENU_CONSULTAR_TODOS_AVISO_CURSO_LIVRE + " - Consultar todos os Cursos Livres");
		System.out.println(OPCAO_MENU_CONSULTAR_UM_AVISO_CURSO_LIVRE + " - Consultar um Curso Livre específico");
		System.out.println(OPCAO_MENU_CONSULTAR_CURSO_LIVRE_SAIR + "- Voltar");
		System.out.println("\nDigite a opção: ");
		return Integer.parseInt(teclado.nextLine());
		
	}

	}
