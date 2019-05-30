package biblioteca;

public class Emprestimo {
	String obra;
	String aluno;
	Integer diasLivro = 0;
	Integer diasOutros = 0;
	Integer contRenovação = 0;
	boolean status;
	
	public Emprestimo(){
		
	}

	public Integer getContRenovação() {
		return contRenovação;
	}

	public void setContRenovação(Integer contRenovação) {
		if (contRenovação <= 3) {
			this.contRenovação = contRenovação;
			this.status = true;
		}
		else
			this.status = false;			
	}

	public String getObra() {
		return obra;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}
	
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public Integer getDiasLivro() {
		return diasLivro;
	}

	public void setDiasLivro(Integer renovacaoLivro) {
		if (renovacaoLivro == 14)
			this.diasLivro = renovacaoLivro;
		else
			this.diasLivro = null;
	}

	public Integer getDiasOutros() {
		return diasOutros;
	}

	public void setDiasOutros(Integer renovacaoOutros) {
		if (renovacaoOutros == 5)
			this.diasOutros = renovacaoOutros;
		else
			this.diasOutros = null;
	}	
}
