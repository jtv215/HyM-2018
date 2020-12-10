package ual.hmis.sesion05.ejercicio5;


public class ejercicio5 {
	
	public String comprobarCadena(String cadena) {
		
		 int posiPunto;
		 boolean comprobar=false;
		 String resultado="";
		 
		 if(!cadena.contains(".") ){
			 resultado= "Error: cadena sin punto"; 
		 }		 
		 if(cadena.contains(".") ){			 
			 posiPunto=cadena.indexOf(".");			 
			 cadena= cadena.substring(0, posiPunto+1);
			 char c2[]= cadena.toCharArray();
				 for(int i=0;i<cadena.length()-1;i++){
					comprobar= Character.isDigit(c2[i]);					 
				 }
				
				 if(comprobar==true){
					 resultado= "Error: cadena con algun numero";
				 }else{
					 resultado= cadena;
			 }
		 }
		 return resultado;
	}
 
}
	

