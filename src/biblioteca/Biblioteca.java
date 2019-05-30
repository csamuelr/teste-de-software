package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
	
	public static void main(String args[]) {
		
		Aluno aluno = new Aluno("Maria Costa", "101022", 0, -1, -1);	
		Obra obra 		      = new Obra();
		Emprestimo emprestimo = new Emprestimo();
			
		setObras();
		
	}
	
	
	public static void setObras() {
		
		Obra ob1 = new Obra("Baião de Dois", 1);
		Obra ob2 = new Obra("O Caçador de Pipas", 1);
		Obra ob3 = new Obra("O Código da Vince", 1);
		Obra ob4 = new Obra("Micro", 1);
		Obra ob5 = new Obra("H2O51", 2);
		Obra ob6 = new Obra("Alguma Coisa Aleatória", 2);		
		
		ArrayList<Obra> obras = new ArrayList<Obra>();
		
		obras.add(ob1);
		obras.add(ob2);
		obras.add(ob3);
		obras.add(ob4);
		obras.add(ob5);
		obras.add(ob6);	
		
		Iterator i = obras.iterator();
		
		while(i.hasNext()) {
			Obra obra = (Obra) i.next();
			System.out.println("Obra: " + obra.nome + "\nCategoria: " + obra.categoria + "\n\n");
		}
			
	}
}
