package biblioteca;

public class Aluno {

	String nome;
	String matricula;
	int status;
	int emprestimoLivro;
	int emprestimoOutro;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String matricula, int status, int empL, int empO ) {
		this.nome = nome;
		this.matricula = matricula;
		this.status = status;
		this.emprestimoLivro = empL;
		this.emprestimoOutro = empO;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		// 0 irregular
		// 1 regular
		if (status == 0)
			this.status = 0;
		else if (status == 1)
			this.status = 1;
		else
			this.status = (Integer) null;
		
			
	}
	public int getEmprestimoLivro() {
		return emprestimoLivro;
	}
	public void setEmprestimoLivro(int emprestimoLivro) {
		if (emprestimoLivro >= 0 && emprestimoLivro <= 7)
			this.emprestimoLivro = emprestimoLivro;
		else
			this.emprestimoLivro = (Integer) null;
	}
	public int getEmprestimoOutro() {
		return emprestimoOutro;
	}
	public void setEmprestimoOutro(int emprestimoOutro) {
		if (emprestimoOutro >= 0 && emprestimoOutro <= 5)
			this.emprestimoOutro = emprestimoOutro;
		else
			this.emprestimoOutro = (Integer) null;
	}
	
}
