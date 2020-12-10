package ual.hmis.sesion05.ejercicio3;

public class ejercicio3 {

	
	public String cadena(int x) {		
		String resultado="";
		if(x<0){
			return "numero erroneo";
		}else{
			for(int i=0;i<x;i++){
				resultado+="*";
			}
		}		
	
		return resultado;
		}

}
