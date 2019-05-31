package biblioteca;

public class Emprestimo {
	Obra  obra;
	Aluno  aluno;
	Integer diasLivro = 0;
	Integer diasOutros = 0;
	Integer contRenovação = 0;
	boolean verificador;
	
	public Emprestimo(){ 
		
	}

	public Integer getContRenovação() {
		return contRenovação;
	}

	public void setContRenovação(Integer contRenovação) {
		if (contRenovação <= 3) {
			this.contRenovação = contRenovação;
			this.verificador = true;
		}
		else
			this.verificador = false;			
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		if(aluno.status == 1) {
			this.aluno = aluno;
		}
		else {
			this.aluno = null;
		}
	}

	public Integer getDiasLivro() {
		return diasLivro;
	}

	public void setDiasLivro(Integer renovacaoLivro) {
		if (this.obra.categoria == "Livro" && renovacaoLivro == 14 )
			this.diasLivro = renovacaoLivro;
		else
			this.diasLivro = null;
	}

	public Integer getDiasOutros() {
		return diasOutros;
	}

	public void setDiasOutros(Integer renovacaoOutros) {
		if (this.obra.categoria != "Livro" && renovacaoOutros == 5)
			this.diasOutros = renovacaoOutros;
		else
			this.diasOutros = null;
	}	
}
