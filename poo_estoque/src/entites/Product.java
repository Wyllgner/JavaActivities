package entites;

public class Product {
	//private é para encapsular 
	private String name;
	private double price;
	private int quantity;
	
	//gerar automatico construtor  botão direito-> source-> generate constructor using Fields
	//construtor serve pra não iniciar vaizio
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//gerar automatico get e set botão direito-> source-> generate getters and setters
	 //encapsulamento exibir nome
	public String getName() {
		return name;
	}
	//encapsulamento mudar nome
	public void setName(String name) {
		this.name = name;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}