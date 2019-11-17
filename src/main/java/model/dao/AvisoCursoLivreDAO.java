package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.vo.CursoLivreVO;

public class AvisoCursoLivreDAO {

	public ArrayList<CursoLivreVO> consultarTodosAvisoCursoLivreDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	public CursoLivreVO consultarCursoLivreDAO(CursoLivreVO cursoLivreVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public int cadastrarAvisoCursoLivre(CursoLivreVO cursoLivreVO) {
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		int resultado = 0;
		try {
			stmt = conn.prepareStatement("INSERT INTO AVISOCURSOLIVRE (NOME, PUBLICOALVO, REQUISITO, AMBIENTE, DATACURSO, VALOR) "
					+ " VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, cursoLivreVO.getNome().toUpperCase());
			stmt.setString(2, cursoLivreVO.getPublicoAlvo().toUpperCase());
			stmt.setString(3, cursoLivreVO.getRequisito().toUpperCase());
			stmt.setString(4, cursoLivreVO.getAmbiente().toUpperCase());
			stmt.setString(5, cursoLivreVO.getData());
			stmt.setDouble(6, cursoLivreVO.getValor());
			
			resultado = stmt.executeUpdate();
			
			
		}catch(SQLException e) {
			System.out.println("Erro ao executar o cadastro de Curso Livre");
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
	}

	public boolean existeAvisoCursoLivrePorId(int idAvisoCursoLivre) {
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		
		try {
		
		stmt = conn.prepareStatement("SELECT IDAVISOCURSOLIVRE FROM AVISOCURSOLIVRE	WHERE IDAVISOCURSOLIVRE = ?");
		stmt.setInt(1, idAvisoCursoLivre);
		
		rs = stmt.executeQuery();
		if(rs.next()) {
			return true;
		}else {
			return false;
		}
		
		}catch(SQLException e){
			System.out.println("Erro ao pesquisar se existe por ID" + e);
			e.printStackTrace();
			return false;
		}finally {
			Banco.closeResultSet(rs);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		
	}

	public int excluirAvisoCursoLivreDAO(CursoLivreVO cursoLivreVO) {
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		int resultado = 0;
		
		try {
			stmt = conn.prepareStatement("DELETE FROM AVISOCURSOLIVRE WHERE IDAVISOCURSOLIVRE = ?");
			stmt.setInt(1, cursoLivreVO.getIdAvisoCursoLivre());
			
			resultado = stmt.executeUpdate();
		}catch(SQLException e){
			System.out.println("Erro ao executar " + e);
			e.printStackTrace();
		}finally {
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
		
		
	}

}
