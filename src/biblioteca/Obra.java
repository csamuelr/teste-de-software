package biblioteca;

import java.util.ArrayList;

public class Obra {
	
	String nome;
	String categoria;
	
	public Obra() {
		
	}
	
	public Obra(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		
		if (categoria == 1)			
			this.categoria = "Livro";
		else if (categoria == 2)
			this.categoria = "Folheto";
		else if (categoria == 3)
			this.categoria = "Manual";
		else if (categoria == 4)
			this.categoria = "DVD";
		else 
			this.categoria = null;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
