package testePratica;

import static org.junit.jupiter.api.Assertions.*;


@SuppressWarnings("unused")
class Test {

	@org.junit.jupiter.api.Test
	void test1() {Venda venda= new Venda();
	Cliente clientePF = new ClientePF("Valter", "141.414.141.14");
	venda.setCliente(clientePF);
	Produto Cerveja =   new Produto("Cerveja", 8.00 );
	Produto Amendoim =   new Produto("Amendoim", 4.00 );
	ItemVendas item1 = new ItemVendas(1, Cerveja);
	ItemVendas item2 = new ItemVendas(4, Amendoim);
	venda.addItem(item1);
	venda.addItem(item2);
	Funcionario funcionario= new Funcionario("Oliveira");
	venda.setData("16/04/2020");
	Frete frete = new Frete(20.00);
	venda.setFrete(frete);
	venda.setFuncionario(funcionario);
	
	}
	
	@org.junit.jupiter.api.Test
	void teste2() {
		Produto leite= new Produto("Leite", 5.00);
		Produto café = new Produto("café", 4.00);
		Venda venda= new VendaBuilder()
				.data("13/02/2020")
				.ClientePF("Paulino", "023.533.563.77")
				.item(3, leite)
				.item(2, café)
				.Frete(10.00)
				.Funcionario ("Paulino")
				.Build();
	
	}

}
