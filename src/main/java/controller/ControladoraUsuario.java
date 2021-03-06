package controller;

import java.util.ArrayList;
import model.bo.UsuarioBO;
import model.vo.TipoUsuarioVO;
import model.vo.UsuarioVO;

public class ControladoraUsuario {
	
	public ArrayList<UsuarioVO> consultarTodosUsuariosController() {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.consultarTodosUsuariosBO();
	}
	
	public UsuarioVO consultarUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.consultarUsuarioBO(usuarioVO);
	}

	public void cadastrarUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.cadastrarUsuarioBO(usuarioVO);
		
		
	}

	public void atualizarUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.atualizarUsuarioBO(usuarioVO);
		
		
	}

	public void excluirUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.excluirUsuarioBO(usuarioVO);
		
	}

	public UsuarioVO recuperarUsuarioController(UsuarioVO usuarioVO) {
		UsuarioBO usuarioBO = new UsuarioBO();
		return usuarioBO.recuperarUsuarioBO(usuarioVO);
		
	}

	public ArrayList<TipoUsuarioVO> consultarTipoUsuario() {
		UsuarioBO usuarioBO = new UsuarioBO();
		return  usuarioBO.consultarTipoUsuarioBO();
	}

	
	
	

}
