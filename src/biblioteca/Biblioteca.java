package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
	
	public static ArrayList<Aluno> alunos;
	public static ArrayList<Obra> obras;	
	
	public static void main(String args[]) {
		
		
	}	
	
	
	public static ArrayList<Aluno> listaAlunos() {
//		String nome, String matricula, int status, int empL, int empO
		Aluno a1 = new Aluno("José Alves", "10101010", 1, 0, 5);
		Aluno a2 = new Aluno("José Alves", "10101010", 0, 0, 5);
		
		Aluno a3 = new Aluno("Maria", "2012246", 1, 0, 5);
		
		
		alunos = new ArrayList<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		
//		Iterator i = alunos.iterator();
////		
//		while(i.hasNext()) {
//			Aluno aluno = (Aluno) i.next();
//			System.out.println(aluno.nome);
//		}
//		
		return alunos;
	}
	
	public static ArrayList<Obra> listaObras() {
		
		Obra ob1 = new Obra("Banco de Dados", "Livro");
		Obra ob2 = new Obra("Nárnia", "DVD");
		
		ArrayList<Obra> obras = new ArrayList<Obra>();
		
		obras.add(ob1);
		obras.add(ob2);		
		
		return obras;
	}
}
