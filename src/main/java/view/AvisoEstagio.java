package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControladoraAvisoEstagio;
import model.vo.EstagioVO;

public class AvisoEstagio {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CONSULTAR_AVISO_ESTAGIO = 1;
	private static final int OPCAO_MENU_CADASTRAR_AVISO_ESTAGIO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_AVISO_ESTAGIO = 3;
	private static final int OPCAO_MENU_EXCLUIR_AVISO_ESTAGIO = 4;
	private static final int OPCAO_MENU_AVISO_ESTAGIO_SAIR = 9;

	private static final int OPCAO_MENU_CONSULTAR_TODOS_AVISO_ESTAGIO = 1;
	private static final int OPCAO_MENU_CONSULTAR_UM_AVISO_ESTAGIO = 2;
	private static final int OPCAO_MENU_CONSULTAR_ESTAGIO_SAIR = 9;

	public void apresentarMenu() {

		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_AVISO_ESTAGIO_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_AVISO_ESTAGIO: {
				this.consultarAviso();
				break;
			}
			case OPCAO_MENU_CADASTRAR_AVISO_ESTAGIO: {
				this.cadastrarAviso();
				break;
			}
			case OPCAO_MENU_ATUALIZAR_AVISO_ESTAGIO: {
				this.atualizarAviso();
				break;
			}
			case OPCAO_MENU_EXCLUIR_AVISO_ESTAGIO: {
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
		System.out.println(OPCAO_MENU_CONSULTAR_AVISO_ESTAGIO + " - Consultar aviso");
		System.out.println(OPCAO_MENU_CADASTRAR_AVISO_ESTAGIO + " - Cadastrar aviso");
		System.out.println(OPCAO_MENU_ATUALIZAR_AVISO_ESTAGIO + " - Atualizar aviso");
		System.out.println(OPCAO_MENU_EXCLUIR_AVISO_ESTAGIO + " - Excluir aviso");
		System.out.println(OPCAO_MENU_AVISO_ESTAGIO_SAIR + " - Voltar");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());

	}

	private void excluirAviso() {
		EstagioVO estagioVO = new EstagioVO();
		
		System.out.println("\nInforme o código do aviso: ");
		estagioVO.setIdAvisoEstagio(Integer.parseInt(teclado.nextLine()));
		
		ControladoraAvisoEstagio controladoraAvisoEstagio = new ControladoraAvisoEstagio();
		controladoraAvisoEstagio.excluirAvisoEstagioController(estagioVO);

	}

	private void atualizarAviso() {
		
		EstagioVO estagioVO = new EstagioVO();

		System.out.println("\nDigite o nome da Empresa: ");
		estagioVO.setEmpresa(teclado.nextLine());
		System.out.println("\nDigite o telefone da empresa: ");
		estagioVO.setTelefone(teclado.nextLine());
		System.out.println("\nDigite o email da empresa: ");
		estagioVO.setEmail(teclado.nextLine());
		System.out.println("\nDigite o cargo da vaga oferecida: ");
		estagioVO.setCargo(teclado.nextLine());
		System.out.println("\nDigite a jornada de trabalho: ");
		estagioVO.setJornada(teclado.nextInt());
		System.out.println("\nDigite a remuneração: ");
		estagioVO.setRemuneracao(teclado.nextDouble());

		ControladoraAvisoEstagio controladoraAvisoEstagio = new ControladoraAvisoEstagio();
		controladoraAvisoEstagio.atualizarAvisoEstagioController(estagioVO);

	}

	private void cadastrarAviso() {

		EstagioVO estagioVO = new EstagioVO();

		System.out.println("\nDigite o nome da Empresa: ");
		estagioVO.setEmpresa(teclado.nextLine());
		System.out.println("\nDigite o telefone da empresa: ");
		estagioVO.setTelefone(teclado.nextLine());
		System.out.println("\nDigite o email da empresa: ");
		estagioVO.setEmail(teclado.nextLine());
		System.out.println("\nDigite o cargo da vaga oferecida: ");
		estagioVO.setCargo(teclado.nextLine());
		System.out.println("\nDigite a jornada de trabalho: ");
		estagioVO.setJornada(teclado.nextInt());
		System.out.println("\nDigite a remuneração: ");
		estagioVO.setRemuneracao(teclado.nextDouble());

		ControladoraAvisoEstagio controladoraAvisoEstagio = new ControladoraAvisoEstagio();
		controladoraAvisoEstagio.cadastrarAvisoEstagioController(estagioVO);

	}

	private void consultarAviso() {
		ControladoraAvisoEstagio controladoraAvisoEstagio = new ControladoraAvisoEstagio();

		int opcao = this.apresentarOpcoesConsulta();
		while (opcao != OPCAO_MENU_CONSULTAR_ESTAGIO_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODOS_AVISO_ESTAGIO: {
				opcao = OPCAO_MENU_CONSULTAR_ESTAGIO_SAIR;
				
				ArrayList<EstagioVO> listaEstagiosVO = controladoraAvisoEstagio.consultarTodosAvisosEstagio();
				
				break;
			}
			case OPCAO_MENU_CONSULTAR_UM_AVISO_ESTAGIO: {
				opcao = OPCAO_MENU_CONSULTAR_ESTAGIO_SAIR;
				EstagioVO estagioVO = new EstagioVO();
				System.out.println("Informe o código do aviso Estágio: ");
				estagioVO.setIdAvisoEstagio(Integer.parseInt(teclado.nextLine()));
				
				EstagioVO estagio = controladoraAvisoEstagio.consultarAvisoEstagio(estagioVO);
				
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
		System.out.println(OPCAO_MENU_CONSULTAR_TODOS_AVISO_ESTAGIO + " - Consultar todos os avisos Estagio");
		System.out.println(OPCAO_MENU_CONSULTAR_UM_AVISO_ESTAGIO + " - Consultar um Estagio específico");
		System.out.println(OPCAO_MENU_CONSULTAR_ESTAGIO_SAIR + "- Voltar");
		System.out.println("\nDigite a opção: ");
		return Integer.parseInt(teclado.nextLine());

	}

}
