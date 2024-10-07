package exemploMysql;

import java.sql.*;
import java.util.Scanner;

public class AlterarRegistro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager(url_conexao, usuário, senha)
			//url = protocolo:sgbd://servidor:porta/nome_banco
			Connection conexao = DriverManager.getConnection("jdbc:mysql" +
											"://localhost:3306/programacao631a",
							"programacao631a","123456");
			//Listando os registros
			String sql = "select contato_id, nome, e_mail, telefone from tb_contato";
			PreparedStatement requisicao = conexao.prepareStatement(sql);
			ResultSet resultado = requisicao.executeQuery();
			int cont = 0;
			while(resultado.next()){
				cont++;
				int idContato = resultado.getInt("contato_id");
				String nome = resultado.getString("nome");
				String eMail = resultado.getString("e_mail");
				String telefone = resultado.getString("telefone");
				System.out.println("Id: "+idContato);
				System.out.println("Nome: "+nome);
				System.out.println("E-mail: "+eMail);
				System.out.println("Telefone: "+telefone);
				System.out.println("-------");
			}
			if(cont>0){
				System.out.print("Qual id deseja alterar: ");
				int idContato = ler.nextInt();
				System.out.print("Qual o novo nome: ");
				String nome = ler.next();
				System.out.print("Qual o novo E-mail: ");
				String eMail = ler.next();
				System.out.print("Qual o novo telefone: ");
				String telefone = ler.next();
				String sqlAtualiza = "update tb_contato set nome = ?, e_mail = ?, " +
								"telefone = ? where contato_id = ?";
				requisicao = conexao.prepareStatement(sqlAtualiza);
				requisicao.setString(1, nome);
				requisicao.setString(2,eMail);
				requisicao.setString(3,telefone);
				requisicao.setInt(4,idContato);
				int nResultado = requisicao.executeUpdate();
				if(nResultado>0){
					System.out.println("Registro atualizado com sucesso!");
				}
				else{
					System.out.println("Erro ao alterar o registro");
				}
			}
			else{
				System.out.println("Não há registros para alterar");
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
