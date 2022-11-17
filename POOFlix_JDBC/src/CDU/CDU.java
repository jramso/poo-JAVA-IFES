package CDU;

import connection.Conecta;

public abstract class CDU {
    public abstract void exec();

    private Conecta conexao = new Conecta("motty.db.elephantsql.com/mfdbjbho", "mfdbjbho", "tXjGYj5HTRaOSbi-6oGfx20zGKRAeCP6");

    public Conecta getConexao() {
        return conexao;
    }

    
}
