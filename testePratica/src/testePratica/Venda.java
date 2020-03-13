package testePratica;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String data;
	private Frete valor;
	private Funcionario funcionario;
	private List <ItemVendas> listaItens;
	private Cliente cliente;

	
	public Venda () {
		this.data = "";
		this.valor = new Frete(0);
		this.listaItens = new ArrayList<ItemVendas>(); 
		this.funcionario = new Funcionario(); 
		this.cliente = new Cliente();
		
	}
	
	public Venda(String data, Frete frete, Funcionario funcionario, List<ItemVendas> listaItens) {
		super();
		this.data = data;
		this.valor = frete;
		this.funcionario = funcionario;
		this.listaItens = listaItens;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Venda(String data) {
		super();
		this.data = data;
	}

	public Frete getFrete() {
		return valor;
	}

	public void setFrete(Frete frete) {
		this.valor = frete;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ItemVendas> getListaItens() {
		return listaItens;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setListaItens(List<ItemVendas> listaItens) {
		this.listaItens = listaItens;
	}

	public void addItem(ItemVendas item) {
		this.listaItens.add(item);
		
	}

	
	
	

}
