package model.vo;

public class CursoLivreVO {
	private int idAvisoCursoLivre;
	private int idAviso;
	private String nome;
	private String publicoAlvo;
	private String requisito;
	private String ambiente;
	private String data;
	private double valor;
	
	
	
	
	
	public CursoLivreVO(int idAvisoCursoLivre, int idAviso, String nome, String publicoAlvo, String requisito,
			String ambiente, String data, double valor) {
		super();
		this.idAvisoCursoLivre = idAvisoCursoLivre;
		this.idAviso = idAviso;
		this.nome = nome;
		this.publicoAlvo = publicoAlvo;
		this.requisito = requisito;
		this.ambiente = ambiente;
		this.data = data;
		this.valor = valor;
	}

	public CursoLivreVO() {
		super();
	
	}
	
	public int getIdAvisoCursoLivre() {
		return idAvisoCursoLivre;
	}
	public void setIdAvisoCursoLivre(int idAvisoCursoLivre) {
		this.idAvisoCursoLivre = idAvisoCursoLivre;
	}
	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	public String getRequisito() {
		return requisito;
	}
	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
