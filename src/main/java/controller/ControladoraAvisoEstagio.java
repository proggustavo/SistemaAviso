package controller;

import java.util.ArrayList;

import model.bo.AvisoEstagioBO;
import model.vo.EstagioVO;


public class ControladoraAvisoEstagio {
	
	public ArrayList<EstagioVO> consultarTodosAvisosEstagio() {
		AvisoEstagioBO avisoEstagioBO = new AvisoEstagioBO();
		
		return avisoEstagioBO.consultarTodosAvisosEstagioBO();
	}
	
	public EstagioVO consultarAvisoEstagio(EstagioVO estagioVO) {
		AvisoEstagioBO avisoEstagioBO = new AvisoEstagioBO();
		return avisoEstagioBO.consultarAvisoEstagioBO(estagioVO);
	}
	
	public void cadastrarAvisoEstagioController(EstagioVO estagioVO) {
		AvisoEstagioBO avisoEstagioBO = new AvisoEstagioBO();
		avisoEstagioBO.cadastrarAvisoEstagioBO(estagioVO);
		
	}
	
	public void atualizarAvisoEstagioController(EstagioVO estagioVO) {
		AvisoEstagioBO avisoEstagioBO = new AvisoEstagioBO();
		avisoEstagioBO.atualizarAvisoEstagioBO(estagioVO);
		
	}

	public void excluirAvisoEstagioController(EstagioVO estagioVO) {
		AvisoEstagioBO avisoEstagioBO = new AvisoEstagioBO();
		avisoEstagioBO.excluirAvisoEstagioBO(estagioVO);
		
		
	}

	
	

	

}
