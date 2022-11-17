package UI;

public class FormAtor extends Form {

	private String id;
	private String nome;
	private String nacionalidade;

	public void exibe() {

		Console c = System.console();
        boolean termina = false;
        String continuar;     
        boolean leserie = true;
        boolean leepisodio = false;  
        String nomeserie = null;

        System.out.println("CADASTRANDO UM ATOR\n");

        while(!termina){
            if(leserie){
                id = c.readLine("Qual Ator?(id): ");
                nome = c.readLine("Qual o nome do Ator?");
				nacionalidade  = c.readLine("Qual a Nacionalidade?");
				
                leepisodio = nomeserie != null;

                if(nomeserie == null) {
                    System.err.println("!!série não existe !!");
                    leserie = true;
                    leepisodio = false;
                    termina = false; 
                }
            }

            if(leepisodio){
                id = c.readLine("@" + nomeserie + ">ID: ");
                numEP = c.readLine("@"+nomeserie+">Nº do Episodio:");
                temporada = c.readLine("@" + nomeserie + ">Temporada: ");
                titulo = c.readLine("@" + nomeserie + ">Titulo: ");
                resumo = c.readLine("@" + nomeserie + ">Resumo: ");

                continuar = c.readLine("(S)erie (E)pisodio (T)erminar): ");

                if(continuar.toLowerCase().equals("s")){
                    leserie = true;
                    leepisodio = false;
                    termina = false;                    
                }
                else
                    if(continuar.toLowerCase().equals("e")){
                        // salvar episodio no banco de dados.
                        cduce.salvarEpisodio(); // EM OBRAS.
                        leserie = false;
                        leepisodio = true;
                        termina = false;                    
                    }
                    else
                       termina = true;
            } // if(episodio)
        } // while ..

	}// Fim EXIBE()

}
