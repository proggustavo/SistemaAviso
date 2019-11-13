package model.bo;

import java.util.ArrayList;

import model.dao.AvisoCoordenacaoDAO;
import model.dao.AvisoEstagioDAO;
import model.vo.AvisoCoordenacaoVO;
import model.vo.EstagioVO;

public class AvisoCoordenacaoBO {

	
	public ArrayList<AvisoCoordenacaoVO> consultarTodosAvisosCoordenacaoBO() {
		AvisoCoordenacaoDAO avisoCoordenacaoDAO = new AvisoCoordenacaoDAO();
		ArrayList<AvisoCoordenacaoVO> listaAvisoCoordenacaoDAO = avisoCoordenacaoDAO.consultarTodosAvisoCoordenacaoDAO();
		if(listaAvisoCoordenacaoDAO.isEmpty()) {
			System.out.println("\nLista de Estágios está vazia. ");
		}
		
		return listaAvisoCoordenacaoDAO;
	}
	
	public AvisoCoordenacaoVO consultarAvisoCoordenacaoBO(AvisoCoordenacaoVO avisoCoordenacaoVO) {
		AvisoCoordenacaoDAO avisoCoordenacaoDAO = new AvisoCoordenacaoDAO();
		AvisoCoordenacaoVO avisoCoordenacao = avisoCoordenacaoDAO.consultarAvisoCoordenacaoDAO(avisoCoordenacaoVO);
		
		if(avisoCoordenacao == null) {
			System.out.println("\nAviso estagio não localizado.");
		}
		return avisoCoordenacao;
	}

	
	public void cadastrarAvisoCoordenacaoBO(AvisoCoordenacaoVO avisoCoordenacaoVO) {
		AvisoCoordenacaoDAO avisoCoordenacaoDAO = new AvisoCoordenacaoDAO();
		int resultado = avisoCoordenacaoDAO.cadastrarAvisoCoordenacaoDAO(avisoCoordenacaoVO);
	}
	
	public void atualizarAvisoCoordenacaoBO(AvisoCoordenacaoVO avisoCoordenacaoVO) {
		// TODO Auto-generated method stub
		
	}


	public void excluirAvisoCoordenacaoBO(AvisoCoordenacaoVO avisoCoordenacaoVO) {
		// TODO Auto-generated method stub
		
	}

}
