package command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

	List<Comando> comandos;
	
	public FilaDeTrabalho(){
		comandos = new ArrayList<Comando>();
	}
	public void adiciona(Comando comando){
		this.comandos.add(comando);
	}
	public void processa(){
		for(Comando comando : comandos){
			comando.executa();
		}
	}
}
