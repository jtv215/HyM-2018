package ual.hmis.sesion05.ejercicio4;

public class ejercicio4 {
	
public String cadena(String p1,String p2) {

	String resultado = "";	
	for(int i = 0; i <p1.length(); i++){
		if(p2.indexOf(p1.charAt(i)) == -1)
			if(resultado.indexOf(p1.charAt(i)) == -1)
				resultado += p1.charAt(i);
	}
	
	return resultado;
}
}
	

    
