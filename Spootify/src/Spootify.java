import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Spootify {
    public static void main(String[] args) {
        // Playlist
        Playlist myList = new Playlist("Daily mix");
        Musica msc;
        AudioLivro book;
        Podcast pod;
        //valores possiveis para o select
        Object[] possibleValues = { "Musica", "AudioLivro", "Podcast" }; 
        Object selectedValue ="";

        //Leitura do teclado
        Scanner ler = new Scanner(System.in);
        
        //valores selecionados != cancelar
        while (selectedValue !=null){
            selectedValue = JOptionPane.showInputDialog(null,"Escolha o tipo de Conteúdo", "Spootify",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("Spootify/img/Spotiify_ico.png"),possibleValues, possibleValues[0]);

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
                int qtd= ler.nextInt();
                ler.nextLine();//limpa o buffer
                for(int i=0;i<qtd;i++){
                    System.out.println("Informe o compositor"+i);
                    msc.addCompositor(ler.nextLine());
                }
                ler.nextLine();//limpa o buffer
                System.out.println("Informe a quantidade de interpretes:");
                qtd=ler.nextInt();
                ler.nextLine();//limpa o buffer
                for(int i=0;i<qtd;i++){
                    System.out.println("Informe o interprete"+i);
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
                ler.nextLine();
                System.out.println("Quantidade de autores:");
                int qtd= ler.nextInt();
                ler.nextLine();
                book=new AudioLivro(title, editor, caster, sinopse);
                for(int i=0;i<qtd;i++){
                    System.out.println("Nome do autor "+(i+1)+":");
                    book.addAutor(ler.nextLine());
                }
                myList.addPlaylist(book);

            }else if(selectedValue=="Podcast"){

            }
            ler.close();
            
        }



        // inserçao manual de musica
        msc = new Musica("Vento", 135, "Trap Brasileiro");
        msc.addCompositor("Dudu");
        msc.addCompositor("VK Mac");
        msc.addInterprete("VK Mac");
        msc.addInterprete("Dudu");


        myList.addPlaylist(msc);

        /*
         * Exibe Lista de Musicas
         */
        int x=0;
        for(Musica mus:myList.getMusicas()){
            System.out.println("        Musica "+(x+1)+":");
            System.out.println(mus);
            System.out.println("-------------------------------");
            x++;
        }
    }
}
