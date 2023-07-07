import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
	
		LocalDate dataNascimento = LocalDate.of(2004, 7, 8);
		LocalDateTime dataVenda = LocalDateTime.now();
		
		Endereco e = new Endereco(76801184, "Brasil", "RO","PVH", "Jose", 234, "goiabeira");
		Cliente c = new Cliente("wyllgner",dataNascimento ,234567,99987654,"teste@hotmail",e);
		Produto p = new Produto("rapido", 120.0, 2004);
		Venda v = new Venda(dataVenda, "PIX",c,p);
		
		System.out.println(v.toString());
	}

}
