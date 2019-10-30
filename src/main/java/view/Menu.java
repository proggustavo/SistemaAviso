package view;

import java.util.Scanner;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	
	public void apresentarMenu() {
		int opcao = this.apresentarOpcoesMenu();
		
	}
	
	private int apresentarOpcoesMenu() {
		System.out.println("\nSistema de avisos - Menu Principal");
		System.out.println("\n Opções: ");
		System.out.println("1 - Menu de Avisos");
		System.out.println("2 - Menu de Relatórios");
		System.out.println("3 - Menu de Usuários");
		System.out.println("9 - Sair");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
	}
	

}
