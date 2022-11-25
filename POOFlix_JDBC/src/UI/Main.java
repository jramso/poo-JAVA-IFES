package UI;

import CDU.CDUMain;

public class Main {
	// CLASSE DE TESTE

	public static void main(String[] args) {

		FormMain inicio = new FormMain();
		CDUMain cdu = new CDUMain(inicio);
		inicio.setcdu(cdu);
		inicio.exibe();
	}

}
