import java.util.Scanner;

/**
 * @author Jramso
 * @version 1.7
 * @since 09-13-2022
 */

public class Spootify {
    public static void main(String[] args) {
        // Playlist
        Playlist myList = new Playlist("Daily mix");
        Musica msc;
        AudioLivro book;
        Podcast pod;
        int cod;

    
        String selectedValue="";
        String possibleValues[] = {"Musica","AudioLivro","Podcast"};

        //Leitura do teclado
        Scanner ler = new Scanner(System.in);
        
        //valores selecionados != cancelar
        System.out.println("----- BEM VINDO AO SPOOTIFY -----\n --- ADICIONE UM CONTEÚDO A SUA PLAYLIST ---");
        System.out.println("DIGITE 1 PARA MUSICA\nDIGITE 2 PARA AUDIOLIVROS\nDIGITE 3 PARA PODCAST\nDIGITE 0 PARA SAIR");
        cod=ler.nextInt();ler.nextLine();
        while (cod !=0){
            selectedValue=(cod>0 && cod<3)?possibleValues[cod-1]:"";
            if(selectedValue=="Musica"){
                System.out.println("Nome da Musica:");
                String title=ler.nextLine();
                System.out.println("Genero Musical:");
                String styles=ler.nextLine();
                ler.nextLine();
                System.out.println("Duração em Segundos da musica");
                int time = ler.nextInt();
                msc = new Musica(title, time, styles);
                System.out.println("Informe a quantidade de compositores:");
                int qtd= ler.nextInt();ler.nextLine();//limpa o buffer
                for(int i=0;i<qtd;i++){
                    System.out.println("Informe o compositor "+(i+1));
                    msc.addCompositor(ler.nextLine());
                }
                System.out.println("Informe a quantidade de interpretes:");
                ler.nextLine();//limpa o buffer
                qtd=ler.nextInt();
                ler.nextLine();//limpa o buffer
                for(int i=0;i<qtd;i++){
                    System.out.println("Informe o interprete "+(i+1));
                    msc.addInterprete(ler.nextLine());
                }
                myList.addPlaylist(msc);

            }else if(selectedValue=="AudioLivro"){
                System.out.println("Nome do Livro:");
                String title=ler.nextLine();
                System.out.println("Nome da Editora:");
                String editor=ler.nextLine();
                System.out.println("Nome do Narrador:");
                String caster=ler.nextLine();
                System.out.println("Sinopse(resumo):");
                String sinopse=ler.nextLine();
                ler.nextLine();//limpa o buffer
                System.out.println("tempo em segundos do AudioLivro:");
                int time= ler.nextInt();
                System.out.println("Quantidade de autores:");
                int qtd= ler.nextInt();
                ler.nextLine();//limpa o buffer
                book=new AudioLivro(title,time, editor, caster, sinopse);
                for(int i=0;i<qtd;i++){
                    System.out.println("Nome do autor "+(i+1)+":");
                    book.addAutor(ler.nextLine());
                }
                myList.addPlaylist(book);

            }else if(selectedValue=="Podcast"){
                System.out.println("Nome do Podcast:");
                String title=ler.nextLine();
                System.out.println("Nome do apresentador:");
                String host=ler.nextLine();
                System.out.println("Tema do Podcast:");
                String tema=ler.nextLine();
                System.out.println("Resenha do Podcast:");
                String desc=ler.nextLine();
                ler.nextLine();//limpa o buffer
                System.out.println("Duracao do episodio em segundos");
                int time = ler.nextInt();
                ler.nextLine();//limpa o buffer
                pod=new Podcast(title, time, host, tema, desc);
                myList.addPlaylist(pod);
            }//FIM_CONDICIONAL
            System.out.println("----- BEM VINDO AO SPOOTIFY -----\n --- ADICIONE UM CONTEÚDO A SUA PLAYLIST ---");
            System.out.println("DIGITE 1 PARA MUSICA\nDIGITE 2 PARA AUDIOLIVROS\nDIGITE 3 PARA PODCAST\nDIGITE 0 PARA SAIR");
            cod=ler.nextInt();ler.nextLine();
        }//FIM_LOOP
        
        /**
         * Exibe Listas geradas da playlist
         */
        

        cod=-1;
        String possibleValues2[]={"Musica","AudioLivro","Podcast","Playlist"};
        System.out.println("+++++ BEM VINDO A PLAYLIST +++++\n --- EXIBA UM CONTEÚDO DA SUA PLAYLIST ---");
        System.out.println("DIGITE 1 PARA MUSICA\nDIGITE 2 PARA AUDIOLIVROS\nDIGITE 3 PARA PODCAST\nDIGITE 4 PARA EXIBIR TODA A PLAYLIST\nDIGITE 0 PARA SAIR");
        cod=ler.nextInt();ler.nextLine();
        while (cod!=0){
            selectedValue=(cod>0 && cod<5)?possibleValues2[cod-1]:"";
            if(selectedValue=="Musica"){
                //Exibe Lista de Musicas
                System.out.println("----------------------\n       LISTA DE "+selectedValue+"\n-------------------");
                int x=0;
                for(Musica mus:myList.getMusicas()){
                    System.out.println("\n-----------"+mus.getClass().getSimpleName()+" "+(x+1)+":-------");
                    System.out.println(mus.toString());
                    System.out.println("-------------------------------");
                    x++;
                }
                
            }else if(selectedValue=="AudioLivro"){
                System.out.println("--------------------\n       LISTA DE "+selectedValue+"\n----------------");
                int x=0;
                for(AudioLivro books:myList.getBook()){
                    System.out.println("\n----------"+books.getClass().getSimpleName()+" "+(x+1)+":----------");
                    System.out.println(books.toString());
                    System.out.println("-------------------------------");
                    x++;
                }
                
            }else if(selectedValue=="Podcast"){
                System.out.println("---------------------\n    LISTA DE"+selectedValue+"\n-----------------");
                int x=0;
                for(Podcast pode:myList.getPod()){
                    System.out.println("\n--------"+pode.getClass().getSimpleName()+" "+(x+1)+":-------------");
                    System.out.println(pode.toString());
                    System.out.println("-------------------------------");
                    x++;
                }
                
            }else if(selectedValue=="Playlist"){
                System.out.println("\n---------- "+myList+" -------------");
                for(Conteudo cont:myList.getPlist()){
                    System.out.println(cont.toString());
                    System.out.println("\n-----------------------------------------");
                }
            }
            System.out.println("+++++ BEM VINDO A PLAYLIST +++++\n --- EXIBA UM CONTEÚDO DA SUA PLAYLIST ---");
            System.out.println("DIGITE 1 PARA MUSICA\nDIGITE 2 PARA AUDIOLIVROS\nDIGITE 3 PARA PODCAST\nDIGITE 4 PARA EXIBIR TODA A PLAYLIST\nDIGITE 0 PARA SAIR");
            cod=ler.nextInt();ler.nextLine();
        }
        ler.close();

    }//FIM_MAIN
}//FIM_CLASSE
