package POOflix.src.UI;

import java.io.Console;

public class FormMain {
    

    public void exibe(){
        Console c = System.console();
        boolean finish = false;
        String continuar;

        System.out.println("POOFlix");

        while(!finish){
            //id=c.readLine();
            System.out.println("1. Cadastrar Serie");
            System.out.println("1. Cadastrar Episodio");
            System.out.println("1. Sair");

            continuar=c.readLine();

            finish = continuar.equals("3");

        }
        


    }
}
