package exemploMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarRegistros {
	public static void main(String[] args) {

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql" +
											"://localhost:3306/programacao631a",
							"programacao631a","123456");
			System.out.println("Estou conectado");
			String sql = "select contato_id, nome, e_mail, telefone from tb_contato";
			PreparedStatement requisicao = conexao.prepareStatement(sql);
			ResultSet resultado = requisicao.executeQuery();
			//.next() -> próximo registro
			//.previous() -> registro anterior
			//.first() -> primeiro registro
			//.last() -> último registro
			while(resultado.next()){
				//.getInt(nome_coluna_tabela) ou .getInt(índice_coluna)
				int idContato = resultado.getInt("contato_id");
				String nome = resultado.getString("nome");
				String eMail = resultado.getString("e_mail");
				String telefone = resultado.getString("telefone");
				System.out.println("ID: "+idContato);
				System.out.println("Nome: "+nome);
				System.out.println("E-mail: "+eMail);
				System.out.println("Telefone: "+telefone);
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
