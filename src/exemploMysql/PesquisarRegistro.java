package exemploMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class PesquisarRegistro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager(url_conexao, usuário, senha)
			//url = protocolo:sgbd://servidor:porta/nome_banco
			Connection conexao = DriverManager.getConnection("jdbc:mysql" +
											"://localhost:3306/programacao631a",
							"programacao631a","123456");
			System.out.println("Estou conectado");
			String sql = "select contato_id, nome, e_mail, telefone from tb_contato" +
							" where nome like ? or e_mail like ? or telefone like ?";
			PreparedStatement requisicao = conexao.prepareStatement(sql);
			System.out.print("Qual o termo de busca: ");
			String termo = ler.next();
			requisicao.setString(1,"%"+termo+"%");
			requisicao.setString(2,"%"+termo+"%");
			requisicao.setString(3,"%"+termo+"%");
			ResultSet resultado = requisicao.executeQuery();
			boolean achei = false;
			while(resultado.next()){
				int idContato = resultado.getInt("contato_id");
				String nome = resultado.getString("nome");
				String eMail = resultado.getString("e_mail");
				String telefone = resultado.getString("telefone");
				System.out.println("ID: "+idContato);
				System.out.println("Nome: "+nome);
				System.out.println("E-mail: "+eMail);
				System.out.println("Telefone: "+telefone);
				achei = true;
			}
			if(!achei){
				System.out.println("O termo "+termo+" não retornou resultado");
			}
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
