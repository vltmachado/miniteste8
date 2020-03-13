package testePratica;

public class ClientePF extends Cliente {
	
	private String nome;
	private String cpf;
	
	public ClientePF(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
