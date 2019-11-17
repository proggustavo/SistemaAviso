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
		if(resultado == 1) {
			System.out.println("\nAviso Curso Livre Cadastrado!");
		}else {
			System.out.println("\n Aviso Curso Livre Não cadastrado");
		}
		
	}

	public void excluirAvisoCursoLivreBO(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreDAO avisoCursoLivreDAO = new AvisoCursoLivreDAO();
		if(avisoCursoLivreDAO.existeAvisoCursoLivrePorId(cursoLivreVO.getIdAvisoCursoLivre())) {
			int resultado = avisoCursoLivreDAO.excluirAvisoCursoLivreDAO(cursoLivreVO);
				if(resultado == 1) {
					System.out.println("\n Aviso Excluído com Sucesso!");
				}else {
					System.out.println("\n Não foi possível excluir Aviso Curso Livre");
				}
		}else {
			
		}
		
	}

	public void atualizarAvisoCursoLivreBO(CursoLivreVO cursoLivreVO) {
		// TODO Auto-generated method stub
		
	}

}
