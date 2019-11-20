package model.dao;

import java.util.ArrayList;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.UsuarioVO;

public class UsuarioDAO {
	
	public ArrayList<UsuarioVO> consultarTodosUsuariosDAO() {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		ArrayList<UsuarioVO> listaUsuariosVO = new ArrayList<UsuarioVO>();
		String query = "SELECT IDUSUARIO,  NOME, CPF, EMAIL FROM USUARIO";
				
		try {
			
			resultado = stmt.executeQuery(query);
			while(resultado.next()) {
				
				UsuarioVO usuario = new UsuarioVO();
				
				usuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				usuario.setNome(resultado.getString(2));
				usuario.setCpf(resultado.getString(3));
				usuario.setEmail(resultado.getString(4));
				
				listaUsuariosVO.add(usuario);
			}
			
		}catch(SQLException e) {
			
			System.out.println("Erro ao consultar todos os Usuários " + e);
			
		}finally{
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return listaUsuariosVO;
	}

	public UsuarioVO consultarUsuarioDAO(UsuarioVO usuarioVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		
		UsuarioVO usuario = new UsuarioVO();
		
		String query = "SELECT IDUSUARIO,  NOME, CPF, EMAIL FROM USUARIO WHERE IDUSUARIO = " + usuarioVO.getIdUsuario();
				
		try {
			
			resultado = stmt.executeQuery(query);
			
			if(resultado.next()) {
					
				usuario.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				usuario.setNome(resultado.getString(2));
				usuario.setCpf(resultado.getString(3));
				usuario.setEmail(resultado.getString(4));
				
				
			}
			
		}catch(SQLException e) {
			
			System.out.println("Erro ao consultar Usuários Específico" + e);
			
		}finally{
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return usuario;
		
		
		
	}
	

	public static boolean existeRegitroPorCpfDAO(String cpf) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		String query = "SELECT CPF FROM USUARIO WHERE CPF = '" + cpf + "'";
		
		
		try {
			// o execute query é utilizado para select somente
			resultado = stmt.executeQuery(query);
			if(resultado.next()) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println("Erro ao executar a query que verifica usuário por CPF");
			System.out.println("Erro: " + e.getMessage());
			
			return false;
			
		} finally {
			// a ordem odo fechamento é importante pois é o contrário do que foi aberto no inicio da classe
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
			
		}
		
		return false;
	}

	public int cadastrarUsuarioDAO(UsuarioVO usuarioVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		// colocamos o int no lugar do result set
		String query = "INSERT INTO USUARIO (IDTIPOUSUARIO, NOME, CPF, EMAIL, LOGIN, SENHA) "
				+ "VALUES("
				+usuarioVO.getIdTipoUsuario() + ", '" 
				+ usuarioVO.getNome() + "', '" 
				+ usuarioVO.getCpf() + "', '"
				+ usuarioVO.getEmail() + "', '"
				+ usuarioVO.getLogin() + "', '"
				+ usuarioVO.getSenha() + "') ";
		
		
		try {
			
			// apesar de fazer um insert utilizamos o update pois ele funciona para delete, insert e update
			resultado = stmt.executeUpdate(query);
			
		}catch(SQLException e) {
			System.out.println("Erro ao executar a query de cadastro de Usuário");
			System.out.println("Erro: " + e.getMessage());
			
			
			
		} finally {			
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
			
		}
		
		return resultado;
	}

	public int excluirUsuarioDAO(UsuarioVO usuarioVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		// colocamos o int no lugar do result set
		String query = "DELETE FROM USUARIO WHERE IDUSUARIO = " + usuarioVO.getIdUsuario();
		
		
		try {
			
			// apesar de fazer um insert utilizamos o update pois ele funciona para delete, insert e update
			resultado = stmt.executeUpdate(query);
			
		}catch(SQLException e) {
			System.out.println("Erro ao executar a query de exclusão de Usuário");
			System.out.println("Erro: " + e.getMessage());
			
			
			
		} finally {			
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
			
		}
		
		return resultado;
	}

	public boolean existeRegitroPorIdUsuario(int idUsuario) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		String query = "SELECT IDUSUARIO FROM USUARIO WHERE IDUSUARIO = " + idUsuario;
		
		
		try {
			// o execute query é utilizado para select somente
			resultado = stmt.executeQuery(query);
			// se encontrar usuario retorna
			if(resultado.next()) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println("Erro ao executar a query que verifica usuário por ID");
			System.out.println("Erro: " + e.getMessage());
			
			return false;
			
		} finally {
			// a ordem odo fechamento é importante pois é o contrário do que foi aberto no inicio da classe
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
			
		}
		
		return false;
	}

	public int atualizarUsuarioDAO(UsuarioVO usuarioVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		String query = "UPDATE USUARIO SET NOME '" + usuarioVO.getNome() + "', "
				+ " cpf = '" + usuarioVO.getCpf() + "', "
				+ " email = '" + usuarioVO.getEmail() + "', "
				+ " idTipoUsuario = " + usuarioVO.getIdTipoUsuario() + ", "
				+ " senha = " + usuarioVO.getSenha() + "', "
				+ " WHERE idUsuario = " + usuarioVO.getIdUsuario(); 
				;
		
		
		try {
			
			// apesar de fazer um insert utilizamos o update pois ele funciona para delete, insert e update
			resultado = stmt.executeUpdate(query);
			
		}catch(SQLException e) {
			System.out.println("Erro ao executar a query de atualização de Usuário");
			System.out.println("Erro: " + e.getMessage());
			
			
			
		} finally {			
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
			
		}
		
		return resultado;
	}

	public UsuarioVO recuperarUsuarioDAO(UsuarioVO usuarioVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		
		
		
		String query = "SELECT IDUSUARIO, IDTIPOUSUARIO, NOME, CPF, EMAIL FROM USUARIO WHERE LOGIN = '" + usuarioVO.getLogin() + "' " + " AND SENHA = '" + usuarioVO.getSenha() + " '";
				
		try {
			
			resultado = stmt.executeQuery(query);
			
			if(resultado.next()) {
				
				usuarioVO.setIdUsuario(Integer.parseInt(resultado.getString(1)));
				usuarioVO.setIdTipoUsuario(Integer.parseInt(resultado.getString(2)));
				usuarioVO.setNome(resultado.getString(3));
				usuarioVO.setCpf(resultado.getString(4));
				usuarioVO.setEmail(resultado.getString(5));
				
				
			}
			
		}catch(SQLException e) {
			
			System.out.println("Erro ao executar a query que recupera usuário" + e);
			
		}finally{
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return usuarioVO;
		
		
		
	}
	
	

}
