package UI;

import java.io.Console;
import CDU.*;

public class FormPersonagem extends Form{
	
	private int idPs;
	private String nomePs;
	private String idPerformance;
	private CDUcadastrarPers cdups; // caso de uso personagem
	
	public void setPers(CDUcadastrarPers cdups) {
		this.cdups=cdups;
	}
	
	public void exibe() {
        Console c = System.console();
        boolean termina = false;
        String continuar;     
        boolean lePs = true;
        boolean lepersonagem = false;  
        String idperf = null;
        
        System.out.println("CADASTRANDO PERSONAGENS:");
        
        while(!termina) {//Enquanto termina for diferente de false
        	if(lePs) {
        		idPerformance = c.readLine("Qual Performance?(id)");
        		idperf = cdups.getPerf(Integer.parseInt(idPerformance));
        		lepersonagem= idperf!=null; // personagem existe
        		
        		if(idperf==null) {//se nao existir performance pede novamente
        			System.err.println("!!Performance nao existe!!");
        			lePs=true;
        			lepersonagem=false;
        			termina=false;
        		}//fim if(idperf==null)
        		
        	}//fim if(lePs)
        	
        	if(lepersonagem) {
        		idPs = Integer.parseInt(c.readLine("@"+idperf+">ID:"));
        	}
        	
        
        }//fim while
        
        /*LOADING*/
	}
	
	public int getId() {
		return idPs;
	}
	
	public String getNome() {
		return nomePs;
	}
	
}