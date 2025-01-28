package clase1;



public class Clase1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String numeroUno = "12.40";
     String numeroDos = "12";
     
     
     float numeroA=Float.parseFloat(numeroUno);
     float numeroB=Integer.parseInt(numeroDos);
     
     float respuesta= numeroA-numeroB;
     
      System.out.println(respuesta);
      
      
      
      String numeroTres = "12.40";
      String numeroCuatro = "0.40";
      
      
      float numeroC=Float.parseFloat(numeroTres);
      float numeroD=Float.parseFloat(numeroCuatro);
      
      float answer= numeroC-numeroD;
      
       System.out.println(answer);
       
      
	}
}
