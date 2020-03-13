package testePratica;

public class ItemVendas {
	private int Quant;
	private Produto Produto;

	public ItemVendas(int Quant, Produto Produto) {
		this.Quant = Quant;
		this.Produto = Produto;
	}
	
	public int getQuant() {
		return Quant;
	}
	
	public void setQuant(int Quant) {
		this.Quant = Quant;
	}
	
	public Produto getProduto() {
		return Produto;
	}
	
	public void setProduto(Produto Produto) {
		this.Produto = Produto;
	}
	
}