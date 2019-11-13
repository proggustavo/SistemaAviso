package model.bo;

import java.util.ArrayList;

import model.dao.AvisoCursoLivreDAO;
import model.dao.AvisoEstagioDAO;
import model.vo.CursoLivreVO;
import model.vo.EstagioVO;

public class AvisoCursoLivreBO {

	public ArrayList<CursoLivreVO> consultarTodosAvisosCursoLivreBO() {
		AvisoCursoLivreDAO avisoCursoLivreDAO = new AvisoCursoLivreDAO();
		ArrayList<CursoLivreVO> listaAvisoCursoLivre = avisoCursoLivreDAO.consultarTodosAvisoCursoLivreDAO();
		if(listaAvisoCursoLivre.isEmpty()) {
			System.out.println("\nLista de Cursos Livres está vazia. ");
		}
		return null;
	}

	public CursoLivreVO consultarAvisoCursoLivreBO(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreDAO avisoCursoLivreDAO = new AvisoCursoLivreDAO();
		CursoLivreVO cursoLivre = avisoCursoLivreDAO.consultarCursoLivreDAO(cursoLivreVO);
		
		if(cursoLivre == null) {
			System.out.println("\nAviso estagio não localizado.");
		}
		return cursoLivre;
	}

	public void cadastrarAvisoCursoLivreBO(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreDAO avisoCursoLivreDAO = new AvisoCursoLivreDAO();
		int resultado = avisoCursoLivreDAO.cadastrarAvisoCursoLivre(cursoLivreVO);
		
	}

	public void excluirAvisoCursoLivreBO(CursoLivreVO cursoLivreVO) {
		// TODO Auto-generated method stub
		
	}

	public void atualizarAvisoCursoLivreBO(CursoLivreVO cursoLivreVO) {
		// TODO Auto-generated method stub
		
	}

}
