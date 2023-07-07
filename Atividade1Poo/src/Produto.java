
public class Produto {

	private String descricao;
	private double valor;
	private int garantia;
	
	public Produto() {	
	}
	
	public Produto(Produto p) {
		this.descricao = p.descricao;
		this.valor = p.valor;
		this.garantia = p.garantia;
	}
	
	public Produto(String descricao, double valor, int garantia) {
		this.descricao = descricao;
		this.valor = valor;
		this.garantia = garantia;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", valor=" + valor + ", garantia=" + garantia + "]";
	}
	
	
	
}
