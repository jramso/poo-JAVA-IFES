package UI;

import domain.Ator;
import connection.*;

public class Main {

	private static String queryDB;

	public static void salvarObj(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// postgres://mfdbjbho:tXjGYj5HTRaOSbi-6oGfx20zGKRAeCP6@motty.db.elephantsql.com/mfdbjbho
		Conecta conexao = new Conecta("mfdbjbho", "tXjGYj5HTRaOSbi-6oGfx20zGKRAeCP6",
				"mfdbjbho");
		conexao.connectDB();
		// Ator ator = new Ator(66, "Benedict Cumberbatch");
		String retorno = conexao.queryDB("Select nome from Ator where id=1");
		System.out.println(retorno);

		// System.out.println("nome do Ator:" + ator.getNome());

		Ator me = new Ator(1, "pedro");
		salvarObj(me);

		System.out.println("Funcionando");
	}

}
