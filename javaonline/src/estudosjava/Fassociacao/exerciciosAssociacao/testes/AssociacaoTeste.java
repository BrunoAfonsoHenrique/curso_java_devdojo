package estudosjava.Fassociacao.exerciciosAssociacao.testes;

import estudosjava.Fassociacao.exerciciosAssociacao.classes.Aluno;
import estudosjava.Fassociacao.exerciciosAssociacao.classes.Local;
import estudosjava.Fassociacao.exerciciosAssociacao.classes.Professor;
import estudosjava.Fassociacao.exerciciosAssociacao.classes.Seminario;

public class AssociacaoTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Bruno Afonso", 27);
		Aluno aluno2 = new Aluno("Hermione", 19);
		
		Seminario sem = new Seminario("Como ficar rico?");
		Professor prof = new Professor("José da Silva", "Usar magia");
		Local local = new Local("Rua de Hogwarts", "Beco diagonal");
		
		aluno.setSeminario(sem);
		aluno2.setSeminario(sem);
		
		//aluno.imprimirDados();
		
		sem.setProfessores(prof);
		sem.setLocal(local);
		sem.setAlunos(new Aluno[] {aluno, aluno2});
		
		Seminario[] semArray = new Seminario[1];
		semArray[0] = sem;
		prof.setSeminarios(semArray);
		
		aluno.imprimirDados();
		prof.imprimirDados();
		local.imprimirDados();
		sem.imprimirDados();

	}

}
