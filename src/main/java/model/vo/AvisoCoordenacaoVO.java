package model.vo;

public class AvisoCoordenacaoVO {
	
	private int idAvisoCoordenacao;
	private int idAviso;
	private String Descricao;
	
	
	public AvisoCoordenacaoVO(int idAvisoCoordenacao, int idAviso, String descricao) {
		super();
		this.idAvisoCoordenacao = idAvisoCoordenacao;
		this.idAviso = idAviso;
		Descricao = descricao;
	}
	public AvisoCoordenacaoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAvisoCoordenacao() {
		return idAvisoCoordenacao;
	}
	public void setIdAvisoCoordenacao(int idAvisoCoordenacao) {
		this.idAvisoCoordenacao = idAvisoCoordenacao;
	}
	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
		

}
