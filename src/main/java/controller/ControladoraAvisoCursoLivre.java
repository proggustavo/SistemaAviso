package controller;

import java.util.ArrayList;

import model.bo.AvisoCursoLivreBO;
import model.bo.AvisoEstagioBO;
import model.vo.CursoLivreVO;

public class ControladoraAvisoCursoLivre {
	
	public ArrayList<CursoLivreVO> consultarTodosAvisosCursoLivre() {
		AvisoCursoLivreBO avisoCursoLivreBO = new AvisoCursoLivreBO();
		
		return avisoCursoLivreBO.consultarTodosAvisosCursoLivreBO();
	}
	

	public CursoLivreVO consultarAvisoCursoLivre(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreBO avisoCursoLivreBO = new AvisoCursoLivreBO();
		return avisoCursoLivreBO.consultarAvisoCursoLivreBO(cursoLivreVO);
	}
	
	public void cadastrarAvisoCursoLivreController(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreBO avisoCursoLivreBO = new AvisoCursoLivreBO();
		avisoCursoLivreBO.cadastrarAvisoCursoLivreBO(cursoLivreVO);
		
	}

	public void excluirAvisoCursoLivreController(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreBO avisoCursoLivreBO = new AvisoCursoLivreBO();
		avisoCursoLivreBO.excluirAvisoCursoLivreBO(cursoLivreVO);
		
	}


	public void atualizarAvisoCursoLivreController(CursoLivreVO cursoLivreVO) {
		AvisoCursoLivreBO avisoCursoLivreBO = new AvisoCursoLivreBO();
		avisoCursoLivreBO.atualizarAvisoCursoLivreBO(cursoLivreVO);
		
	}

	


	
	
	

}
