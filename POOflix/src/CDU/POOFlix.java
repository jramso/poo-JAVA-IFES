package POOflix.src.CDU;

import lab3tier.versao2.ui.*;

public class POOFlix {
    public static void main(String[] args){
        FormMain telaMain = new FormMain();
        CDUMain casoUsoMain = new CDUMain(telaMain);

        casoUsoMain.exec();
    }
}