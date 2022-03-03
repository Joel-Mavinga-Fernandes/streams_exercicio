package entidade;

import java.util.Objects;

public class Produto {
	
	private String nome;
	private String email;
	private double preco;
	
	public Produto(){
		
	}

	public Produto(String nome, String email, double preco) {
		this.nome = nome;
		this.email = email;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
