package POOflix.src.CDU;

import POOflix.src.UI.*;

public class POOFlix {
    public static void main(String[] args){
        FormMain telaMain = new FormMain();
        CDUMain casoUsoMain = new CDUMain(telaMain);

        casoUsoMain.exec();
    }
}