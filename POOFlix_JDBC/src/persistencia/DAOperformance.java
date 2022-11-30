package persistencia;

import java.sql.PreparedStatement;

import domain.*;

public class DAOperformance extends DAOPOOFlix{
    private Connection conexaobd;

	public DAOperformance(Connection cnx) {
		conexaobd = cnx;
	}

	public int adiciona(OBJPOOFlix objpooflix) {
		try {
			Performance ator_personagem = (Performance) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("insert into performance(idep, idpers, idator ) values (?, ?, ?)");
			ps.setInt(1, (Performance.getidep));
			ps.setInt(2, (Performance.getidperson));
			ps.setString(3, (Performance.getator));
			ps.execute();
			ps.close();
			return 0;
		} catch (SQLException e) {
			System.out.println("Problemas em DAOperformance.adiciona" + e.getMessage());
			return -1;
		}
	}
	// Separar o que o atualiza pode atualizar idep, idpers e idator
	public int atualiza(OBJPOOFlix objpooflix) {
		try {
			Performance perf = (Performance) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("update performance set idep=? where id=?");
			ps.setInt(1, (Performance.getId()));
			ps.setString(2, Performance.getTitulo());
			ps.executeUpdate();
			ps.close();
			return 0;
		} catch (SQLException e) {
			System.out.println("Problemas em DAOperformance.atualiza" + e.getMessage());
			return -1;
		}
	}

	public int deleta(OBJPOOFlix objpooflix) {
		try {
			Performance Perf = (Performance) objpooflix;
			PreparedStatement ps = conexaobd.prepareStatement("delete from Performance where id=?");
			ps.setInt(1, Performance.getId());
			ps.executeUpdate();
			ps.close();
			return 0;
		} catch (SQLException e) {
			System.out.println("Problemas em DAOperformance.deleta" + e.getMessage());
			return -1;
		}
	}

	public List<OBJPOOFlix> lista() {
		try {
			List<OBJPOOFlix> Performances = new ArrayList<OBJPOOFlix>();

			PreparedStatement ps = conexaobd.prepareStatement("select id, titulo from Performance");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = String.valueOf(rs.getInt("id"));
				String titulo = rs.getString("titulo");
				Performance Performance = new Performance(Integer.parseInt(id), titulo, 0);

				Performances.add(Performance);
			}

			rs.close();
			ps.close();

			return Performances;
		} catch (SQLException e) {
			System.out.println("Problemas em DAOperformance.lista" + e.getMessage());
			return null;
		}
	}
}
