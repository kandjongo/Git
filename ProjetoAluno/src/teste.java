
public class teste {

	public static void main(String[] args) {
		professor professor = new professor();
		pessoa pessoa = new pessoa();
		aluno aluno = new aluno();
		
		pessoa.setNome("Nome Aluno: Guilherme \n");
		pessoa.setCpf("CPF: 91822772 \n");
		professor.setSalario(1200.000);
		aluno.setCurso("\nCurso: Analise de Sistemas");
		
		
		System.out.print(pessoa.getNome());
		System.out.print(pessoa.getCpf());
		System.out.print(professor.getSalario());
		System.out.print(aluno.getCurso());
			
	}

}
