package testePratica;

public class ClientePJ extends Cliente  {
	
	private String razao;
	private String cnpj;
	
	public ClientePJ(String razao, String cnpj) {
		super();
		this.razao = razao;
		this.cnpj = cnpj;
	}
	
	
	public String getRazaoSocial() {
		return razao;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razao = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
		




}
