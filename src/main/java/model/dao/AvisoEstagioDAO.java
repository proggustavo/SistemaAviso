package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import model.vo.EstagioVO;

public class AvisoEstagioDAO {

	public ArrayList<EstagioVO> consultarTodosAvisoEstagioDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	public EstagioVO consultarAvisoEstagioDAO(EstagioVO estagioVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public int cadastrarAvisoEstagioDAO(EstagioVO estagioVO) {
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		int resultado = 0;
		
		try {
			
		stmt = conn.prepareStatement("INSERT INTO AVISOESTAGIO (EMPRESA, TELEFONE, EMAIL, CARGO, JORNADA, REMUNERACAO) "
				+ "VALUES (?, ?, ?, ?, ?, ?)");
		stmt.setString(1, estagioVO.getEmpresa().toUpperCase());
		stmt.setString(2, estagioVO.getTelefone());
		stmt.setString(3, estagioVO.getEmail());
		stmt.setString(4, estagioVO.getCargo());
		stmt.setInt(5, estagioVO.getJornada());
		stmt.setDouble(6, estagioVO.getRemuneracao());
		
		resultado = stmt.executeUpdate();
		
			System.out.println("Salvo com sucesso");
			
		}catch(SQLException e) {
			System.out.println("Erro ao executar a inserção de aviso" + e);
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return resultado;
		
	}

	public boolean existeAvisoEstagioPorId(int idAviso) {
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs  = null;
		
		try {
			
			stmt = conn.prepareStatement("SELECT IDAVISOESTAGIO FROM AVISOESTAGIO WHERE IDAVISOESTAGIO = ?");
			stmt.setInt(1, idAviso);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				return true;
				
			}
		}catch(SQLException e) {
			System.out.println("Erro ao pesquisar " + e);
			e.printStackTrace();
			return false;
		}finally {
			Banco.closeResultSet(rs);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return false;
		
		
	}

	public int excluirAvisoEstagioDAO(EstagioVO estagioVO) {
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		int resultado = 0;
		
		try {
			
			stmt = conn.prepareStatement("DELETE FROM AVISOESTAGIO WHERE IDAVISOESTAGIO = ?");
			stmt.setInt(1, estagioVO.getIdAvisoEstagio());
			
			resultado = stmt.executeUpdate();
			
			
			
		}catch(SQLException e){
			System.out.println("Erro ao executar a exclusão");
			System.out.println("Erro: " + e.getMessage());
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return resultado;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
