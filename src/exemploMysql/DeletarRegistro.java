package exemploMysql;

import java.sql.*;
import java.util.Scanner;

public class DeletarRegistro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager(url_conexao, usuário, senha)
			//url = protocolo:sgbd://servidor:porta/nome_banco
			Connection conexao = DriverManager.getConnection("jdbc:mysql" +
											"://localhost:3306/programacao631a",
							"programacao631a", "123456");
			//Listando os registros
			String sql = "select contato_id, nome, e_mail, telefone from tb_contato";
			PreparedStatement requisicao = conexao.prepareStatement(sql);
			ResultSet resultado = requisicao.executeQuery();
			int cont = 0;
			while (resultado.next()) {
				cont++;
				int idContato = resultado.getInt("contato_id");
				String nome = resultado.getString("nome");
				String eMail = resultado.getString("e_mail");
				String telefone = resultado.getString("telefone");
				System.out.println("Id: " + idContato);
				System.out.println("Nome: " + nome);
				System.out.println("E-mail: " + eMail);
				System.out.println("Telefone: " + telefone);
				System.out.println("-------");
			}
			if (cont > 0) {
				System.out.print("Qual o id do registro que deseja apagar: ");
				int idContato = ler.nextInt();
				String sqlDelete = "delete from tb_contato where contato_id = ?";
				requisicao = conexao.prepareStatement(sqlDelete);
				requisicao.setInt(1,idContato);
				int contLinhas = requisicao.executeUpdate();
				if(contLinhas>0)
					System.out.println("Registro apagado");
				else
					System.out.println("Erro ao apagar o registro");
			}
			else{
				System.out.println("Não há registros para deletar");
			}
		}
		catch (ClassNotFoundException e){
			System.out.println("Erro ao carregar o driver");
		}
		catch (SQLException e){
			System.out.println("Erro de sql "+e.getMessage());
		}
	}
}
