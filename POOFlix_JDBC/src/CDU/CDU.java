package CDU;

import java.sql.*;

import persistencia.Conecta;

public abstract class CDU {
    protected Connection conexaobd;

    public abstract void exec();

}
