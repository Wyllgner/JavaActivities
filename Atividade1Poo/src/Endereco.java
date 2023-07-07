
public class Endereco {

	private int cep;
	private String pais;
	private String estado;
	private String cidade;
	private String logadouro;
	private int numero;
	private String complemento;
	
	public Endereco() {
	}
	
	public Endereco(Endereco e) {
		this.cep = e.cep;
		this.pais = e.pais;
		this.estado = e.estado;
		this.cidade = e.cidade;
		this.logadouro = e.logadouro;
		this.numero = e.numero;
		this.complemento = e.complemento;
	}
	
	public Endereco(int cep, String pais, String estado, String cidade, String logadouro, int numero, String complemento) {
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", pais=" + pais + ", estado=" + estado + ", cidade=" + cidade + ", numero="
				+ numero + ", complemento=" + complemento + "]";
	}
	
	
	
}
