package exemploMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserindoRegistros {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql" +
											"://localhost:3306/programacao631a",
							"programacao631a","123456");
			System.out.println("Estou conectado");
			//Inserindo dados
			String sql = "insert into tb_contato(nome,e_mail,telefone) values(?,?,?)";
			PreparedStatement requisicao =
							conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//Lendo as informações
			System.out.print("Qual o nome do novo contato: ");
			String nome = ler.nextLine();
			System.out.print("Qual o e-mail do "+nome+": ");
			String eMail = ler.nextLine();
			System.out.print("Qual o telefone do "+nome+": ");
			String telefone = ler.nextLine();
			//Substituindo os valores
			requisicao.setString(1,nome);
			requisicao.setString(2,eMail);
			requisicao.setString(3,telefone);
			//Executando a requisição
			requisicao.execute();
			//Obtendo o id gerado pelo mysql
			ResultSet resultado = requisicao.getGeneratedKeys();
			if(resultado.next()){
				//O 1 está relacionado ao índice da coluna que retorna com o id
				int idContato = resultado.getInt(1);
				System.out.println("Contato "+nome+" gravado, obteve o id "+idContato);
			}
			conexao.close();
		}
		catch (ClassNotFoundException e){
			System.out.println("O driver não foi encontrado!");
		}
		catch (SQLException e){
			System.out.println("Erro ao conectar "+e.getMessage());
		}
	}
}
