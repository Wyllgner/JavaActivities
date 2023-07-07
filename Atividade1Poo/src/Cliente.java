import java.time.LocalDate;

public class Cliente extends Endereco {

	private String nome;
	private LocalDate dataNascimento;
	private int documento;
	private int telefone;
	private String email;
	
	public Cliente(){
	}
	
	public Cliente(String nome, LocalDate dataNascimento, int documento, int telefone, String email, Endereco e) {
		super(e);
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.documento = documento;
		this.telefone = telefone;
		this.email = email;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\n" + "Cliente [nome=" + nome + ", dataNascimento=" + dataNascimento + ", documento=" + documento
				+ ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}
