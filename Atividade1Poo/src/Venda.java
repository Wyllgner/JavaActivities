import java.time.LocalDateTime;

public class Venda extends Produto{

    private LocalDateTime dataVenda;
    private String tipoPagamento;
    private Cliente cliente;

    public Venda(LocalDateTime dataVenda, String tipoPagamento, Cliente cliente, Produto p) {
		super(p);
        this.dataVenda = dataVenda;
        this.tipoPagamento = tipoPagamento;
        this.cliente = cliente;
	}

	public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    @Override
    public String toString() {
    	return super.toString()+ "\n" + cliente.toString()+ "\n" +"Venda [dataVenda="  + dataVenda + ", tipoPagamento=" + tipoPagamento + "]";
    }
}
