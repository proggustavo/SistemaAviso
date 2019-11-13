package model.bo;

import java.util.ArrayList;

import model.dao.AvisoEstagioDAO;
import model.vo.EstagioVO;

public class AvisoEstagioBO {

	public ArrayList<EstagioVO> consultarTodosAvisosEstagioBO() {
		AvisoEstagioDAO avisoEstagioDAO = new AvisoEstagioDAO();
		ArrayList<EstagioVO> listaAvisoEstagio = avisoEstagioDAO.consultarTodosAvisoEstagioDAO();
		if(listaAvisoEstagio.isEmpty()) {
			System.out.println("\nLista de Estágios está vazia. ");
		}
		
		return listaAvisoEstagio;
	}

	public EstagioVO consultarAvisoEstagioBO(EstagioVO estagioVO) {
		AvisoEstagioDAO avisoEstagioDAO = new AvisoEstagioDAO();
		EstagioVO estagio = avisoEstagioDAO.consultarAvisoEstagioDAO(estagioVO);
		
		if(estagio == null) {
			System.out.println("\nAviso estagio não localizado.");
		}
		return estagio;
	}
	
	public void cadastrarAvisoEstagioBO(EstagioVO estagioVO) {
		AvisoEstagioDAO avisoEstagioDAO = new AvisoEstagioDAO();
		int resultado = avisoEstagioDAO.cadastrarAvisoEstagioDAO(estagioVO);
		
	}

	public void atualizarAvisoEstagioBO(EstagioVO estagioVO) {
		// TODO Auto-generated method stub
		
	}

	public void excluirAvisoEstagioBO(EstagioVO estagioVO) {
		// TODO Auto-generated method stub
		
	}

	

	


}
