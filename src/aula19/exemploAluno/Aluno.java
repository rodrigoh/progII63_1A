package aula19.exemploAluno;

public class Aluno {
	String nome;
	String sobrenome;
	String eMail;
	int codigo;
	float notaUm;
	float notaDois;

	float obterMedia(){
		return (notaUm+notaDois)/2;
	}

	String verificaStatus(){
		float media = obterMedia();
		if(media>=8)
			return "aprovado";
		else if(media>=6)
			return "recuperação";
		else
			return "reprovado";
	}

//	String verificaStatus(){
//		String status = "reprovado";
//		float media = obterMedia();
//		if(media>=8)
//			status = "aprovado";
//		else if(media>=6)
//			status =  "recuperação";
//		return status;
//	}

}
