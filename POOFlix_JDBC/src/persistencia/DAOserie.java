package persistencia;

import dominio.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * DAO: DATA ACCESS OBJECT.
 * Concetra os serviços de acesso às tabelas do baco para cada enteidade
 * de domínio do distema que possui uma respectiva tabela no banco de dados.
 * 
 * Cada classe de domínio possui um equivalente DAO para executar as ações 
 * padrões no banco de dados: cadastar (C), alterar (U), consultar (R), deletar (D).
 * Ver método abaixo.
 */

public class DAOSerie extends DAOPOOFlix {
	private Connection conexaobd;
	
	public DAOSerie(Connection cnx) {
		conexaobd = cnx;
	}
	
	public int adiciona(OBJPOOFlix objpooflix) {
		try {
			Serie serie = (Serie) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("insert into serie(id, titulo) values (?, ?)");			
			ps.setInt(1, Integer.parseInt(serie.getid()));
			ps.setString(2, serie.gettitulo());
			ps.execute();
			ps.close();		
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOSerie.adiciona" + e.getMessage());
			return -1;
		}		
	}
	
	public int atualiza(OBJPOOFlix objpooflix) {
		try {
			Serie serie = (Serie) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("update serie set titulo=? where id=?");			
			ps.setInt(1, Integer.parseInt(serie.getid()));
			ps.setString(2, serie.gettitulo());
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOSerie.atualiza" + e.getMessage());
			return -1;			
		}		
	}
	
	public int deleta(OBJPOOFlix objpooflix) {
		try {
			Serie serie = (Serie) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("delete from serie where id=?");			
			ps.setInt(1, Integer.parseInt(serie.getid()));
			ps.executeUpdate();
			ps.close();	
			return 0;
		} 
		catch (SQLException e) {
			System.out.println("Problemas em DAOSerie.deleta" + e.getMessage());
			return -1;			
		}		
	}
	
	public List<OBJPOOFlix> lista() {
		try {
			List<OBJPOOFlix> series = new ArrayList<OBJPOOFlix>();
			
			PreparedStatement ps = conexaobd.prepareStatement("select id, titulo from serie");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = String.valueOf(rs.getInt("id"));
				String titulo = rs.getString("titulo");
				Serie serie = new Serie(id,titulo,0);
				
				series.add(serie);
			}
			
			rs.close();
			ps.close();
			
			return series;			
		} catch (SQLException e) {
			System.out.println("Problemas em DAOSerie.lista" + e.getMessage());
			return null;
		}
	}
} // DAOSerie
