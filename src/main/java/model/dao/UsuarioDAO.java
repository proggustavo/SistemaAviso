package model.dao;

import java.util.ArrayList;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.UsuarioVO;

public class UsuarioDAO {
	
	public ArrayList<UsuarioVO> consultarTodosUsuariosDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	public UsuarioVO consultarUsuarioDAO(UsuarioVO usuarioVO) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
