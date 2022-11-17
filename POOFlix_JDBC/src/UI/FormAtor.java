package UI;

public class FormAtor extends Form {

	private String id;
	private String nome;
	private String nacionalidade;
    private String performance;

	public void exibe() {

		Console c = System.console();
        boolean termina = false;
        String continuar;     
        boolean leserie = true;
        boolean leepisodio = false;  
        String nomeAtor = null;

        System.out.println("CADASTRANDO UM ATOR\n");

        while(!termina){
            if(leserie){
                id = c.readLine("Qual Ator?(id): ");
                nome = c.readLine("Qual o nome do Ator?");
				nacionalidade  = c.readLine("Qual a Nacionalidade?");
                leepisodio= nome!=null&&id!=null&&nacionalidade!=null;
                nomeAtor=nome;
                
				
                leepisodio = nomeserie != null;

                if(nomeAtor == null) {
                    System.err.println("!!Ator inválido !!");
                    leserie = true;
                    leepisodio = false;
                    termina = false; 
                }
            }

            if(leepisodio){

                performance = c.readLine("@" + nomeAtor + ">Performance desse Ator: ");
                

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
