package exemploMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager(url_conexao, usuário, senha)
			//url = protocolo:sgbd://servidor:porta/nome_banco
			Connection conexao = DriverManager.getConnection("jdbc:mysql" +
											"://localhost:3306/programacao631a",
											"programacao631a","123456");
			System.out.println("Estou conectado");
			conexao.close();
		}
		catch (ClassNotFoundException e){
			System.out.println("O driver não foi encontrado!");
		}
		catch (SQLException e){
			System.out.println("Erro ao conectar "+e);
		}
	}
}
