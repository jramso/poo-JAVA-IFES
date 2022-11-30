package persistencia;

import domain.*;

public class DAOator {
    public class DAOator extends DAOPOOFlix {
        private Connection conexaobd;
    
        public DAOator(Connection cnx) {
            conexaobd = cnx;
        }
    
        public int adiciona(OBJPOOFlix objpooflix) {
            try {
                Ator ator = (Ator) objpooflix;
                PreparedStatement ps = conexaobd.prepareStatement("insert into Ator(id, titulo) values (?, ?)");
                ps.setInt(1, (Ator.getId()));
                ps.setString(2, Ator.getTitulo());
                ps.execute();
                ps.close();
                return 0;
            } catch (SQLException e) {
                System.out.println("Problemas em DAOator.adiciona" + e.getMessage());
                return -1;
            }
        }
    
        public int atualiza(OBJPOOFlix objpooflix) {
            try {
                Ator ator = (Ator) objpooflix;
                PreparedStatement ps = conexaobd.prepareStatement("update Ator set titulo=? where id=?");
                ps.setInt(1, (ator.getId()));
                ps.setString(2, ator.getTitulo());
                ps.executeUpdate();
                ps.close();
                return 0;
            } catch (SQLException e) {
                System.out.println("Problemas em DAOator.atualiza" + e.getMessage());
                return -1;
            }
        }
    
        public int deleta(OBJPOOFlix objpooflix) {
            try {
                Ator ator = (Ator) objpooflix;
                PreparedStatement ps = conexaobd.prepareStatement("delete from Ator where id=?");
                ps.setInt(1, ator.getId());
                ps.executeUpdate();
                ps.close();
                return 0;
            } catch (SQLException e) {
                System.out.println("Problemas em DAOator.deleta" + e.getMessage());
                return -1;
            }
        }
    
        public List<OBJPOOFlix> lista() {
            try {
                List<OBJPOOFlix> Ators = new ArrayList<OBJPOOFlix>();
    
                PreparedStatement ps = conexaobd.prepareStatement("select id, titulo from Ator");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String id = String.valueOf(rs.getInt("id"));
                    String titulo = rs.getString("titulo");
                    Ator ator = new Ator(Integer.parseInt(id), titulo, 0);
    
                    Ators.add(ator);
                }
    
                rs.close();
                ps.close();
    
                return Ators;
            } catch (SQLException e) {
                System.out.println("Problemas em DAOator.lista" + e.getMessage());
                return null;
            }
        }
    } // DAOator
    
}
