package connection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import javax.management.Query;

import connection.annotation.Coluna;
import connection.annotation.Tabela;

public class Conecta {

    private Connection conn = null;
    private String user, senha, banco, url;
    private String txt;

    // "postgres://mfdbjbho:tXjGYj5HTRaOSbi-6oGfx20zGKRAeCP6@motty.db.elephantsql.com/mfdbjbho";

    /*
     * public Conecta(String urlbanco, String user, String passwd) {
     * this.user = user;
     * this.senha = passwd;
     * this.banco = urlbanco;
     * }
     */

    public Conecta(String fullURL) {
        this.txt = fullURL;
    }

    public Conecta(String user, String senha, String banco) {
        try {
            setBanco(banco);
            setUser(user);
            setSenha(senha);
            setUrl("jdbc:postgresql://motty.db.elephantsql.com/" + banco);
        } catch (Exception e) {
            System.out.println("Erro de tipo de dados no constructor");
        }
    }

    public void connectDB() {
        Properties props = new Properties();
        props.setProperty("user", getUser());
        props.setProperty("password", getSenha());
        try {
            Connection conn = DriverManager.getConnection(getUrl(),
                    props);
            setConn(conn);
            System.out.println("Conexao sucedida");
        } catch (SQLException sqle) {
            System.err.println(sqle);
            sqle.printStackTrace();
        }
    }

    public void disconnectDB() {
        try {
            conn.close();
        } catch (SQLException sqle) {
            System.err.println(sqle);
            sqle.printStackTrace();
        }
    }

    public void insert(Object obj) throws IllegalArgumentException, IllegalAccessException {
        String tabela = "";
        String colunas = "";
        Tabela persist = obj.getClass().getAnnotation(Tabela.class);

        if (persist != null) {
            tabela = persist.tabela();
        }

        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Coluna col = field.getAnnotation(Coluna.class);
            if (col != null) {
                Object valorColuna = field.get(obj);
                String sqlValue = (String) valorColuna;
                colunas = colunas + "," + sqlValue;
            }
        }
        if (tabela != "" && colunas != "") {
            String sql = "INSERT INTO " + tabela + " values(" + colunas + ")";
            queryDB(sql);
        }

    }

    public String queryDB(String query) {
        String res;
        try {
            Statement st = getConn().createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            res = rs.getString(1);
            st.close();
            return res;
        } catch (SQLException sqle) {
            System.err.println(sqle);
            sqle.printStackTrace();
            return "SQLException";
        }
    }

    public static void salvarObj(Object obj) {
        String tabela = (obj.getClass().getSimpleName());

    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    public String getTxt() {
        return txt;
    }

    public String getBanco() {
        return banco;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

}
