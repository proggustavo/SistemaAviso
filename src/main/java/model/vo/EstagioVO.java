package model.vo;

public class EstagioVO {
	
	private int idAvisoEstagio;
	private int idAviso;
	private String empresa;
	private String telefone;
	private String email;
	private String cargo;
	private int jornada;
	private double remuneracao;
	

	public EstagioVO(int idAvisoEstagio, int idAviso, String empresa, String telefone, String email, String cargo,
			int jornada, double remuneracao) {
		super();
		this.idAvisoEstagio = idAvisoEstagio;
		this.idAviso = idAviso;
		this.empresa = empresa;
		this.telefone = telefone;
		this.email = email;
		this.cargo = cargo;
		this.jornada = jornada;
		this.remuneracao = remuneracao;
	}
	public EstagioVO() {
		super();
		
	}
	public int getIdAvisoEstagio() {
		return idAvisoEstagio;
	}
	public void setIdAvisoEstagio(int idAvisoEstagio) {
		this.idAvisoEstagio = idAvisoEstagio;
	}
	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getJornada() {
		return jornada;
	}
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	public double getRemuneracao() {
		return remuneracao;
	}
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
	
	
	
	
	

}
