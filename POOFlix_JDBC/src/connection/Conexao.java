package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conn = null;
    private String user, password, urlBanco;

    private String txt;
    // "postgres://mfdbjbho:tXjGYj5HTRaOSbi-6oGfx20zGKRAeCP6@motty.db.elephantsql.com/mfdbjbho";

    public Conexao(String urlbanco, String user, String passwd, String driver) {
        this.user = user;
        this.password = passwd;
        this.urlBanco = urlbanco;
    }

    public Conexao(String fullURL) {
        this.txt = fullURL;
    }

    public final Connection conectaBanco() {

        try {
            String driver = "jdbc:";
            String banco = getUrlBanco();
            String user = getUser();
            String passwd = getPassword();
            if (banco != null && user != null && passwd != null) {
                conn = DriverManager.getConnection(driver + banco, user, passwd);
            } else if (txt != null) {
                conn = DriverManager.getConnection(txt);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
            ex.printStackTrace();
        }
        return conn;
    }

    @TODO
    public void disconnectDB() {
        try {
            conn.close();
        } catch (SQLException sqle) {
            System.err.println(sqle);
            sqle.printStackTrace();
        }
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getTxt() {
        return txt;
    }

    public String getUrlBanco() {
        return urlBanco;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

}
