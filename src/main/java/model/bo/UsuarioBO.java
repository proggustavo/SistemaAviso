package model.bo;

import java.util.ArrayList;

import model.dao.UsuarioDAO;
import model.vo.TipoUsuarioVO;
import model.vo.UsuarioVO;

public class UsuarioBO {

	public void cadastrarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();		
		if(UsuarioDAO.existeRegitroPorCpfDAO(usuarioVO.getCpf())) {
			System.out.println("\nUsuário já cadastrado.");
		}else {
			int resultado = usuarioDAO.cadastrarUsuarioDAO(usuarioVO);
			if(resultado == 1) {
				System.out.println("\nUsuário cadastrado com sucesso!");
			}else {
				System.out.println("\nNão foi possível cadastrar o Usuário.");
			}
		}
	}
	
	public void excluirUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		if(usuarioDAO.existeRegitroPorIdUsuario(usuarioVO.getIdUsuario())) {
			int resultado = usuarioDAO.excluirUsuarioDAO(usuarioVO);
			if(resultado == 1) {
				System.out.println("\nUsuário excluído com Sucesso");
			}else {
				System.out.println("\nNão foi possível excluir o Usuário");
			}
		}
		else{
				System.out.println("\nUsuário não existe na base de dados");
			}
		}

	public void atualizarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		if(usuarioDAO.existeRegitroPorIdUsuario(usuarioVO.getIdUsuario())) {
			int resultado = usuarioDAO.atualizarUsuarioDAO(usuarioVO);
				if(resultado == 1) {
					System.out.println("\nUsuário atualizado com Sucesso");
					}else {
					System.out.println("\nNão foi possível atualizar o Usuário");
					}
		}
		else{
				System.out.println("\nUsuário não existe na base de dados");
			}
		}
		
	

	
	
	public ArrayList<UsuarioVO> consultarTodosUsuariosBO() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		ArrayList<UsuarioVO> listaUsuarioVO = usuarioDAO.consultarTodosUsuariosDAO();
		if(listaUsuarioVO.isEmpty()) {
			System.out.println("\nLista de Usuários está vazia.");
		}
		
		return listaUsuarioVO;
	}
	

	public UsuarioVO consultarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		UsuarioVO usuario = usuarioDAO.consultarUsuarioDAO(usuarioVO);
		
		if(usuario == null) {
			System.out.println("\nUsuário não localizado.");
		}
		
		return usuario;
	}

	public UsuarioVO recuperarUsuarioBO(UsuarioVO usuarioVO) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.recuperarUsuarioDAO(usuarioVO) ;
	}

	public ArrayList<TipoUsuarioVO> consultarTipoUsuarioBO() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.consultarTipoUsuarioDAO();
	}
	
	
	
}
