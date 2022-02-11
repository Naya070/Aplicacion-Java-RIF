package rif_app;

/*
 * Clase para calcular el número de chequeo que va al final del RIF.
 */

/**
 *
 * @author Johance Castillo
 */
import javax.swing.JOptionPane;
public class Nro_de_chequeo extends rif_app_1 {
    public int NroChequeo;
    
    public Nro_de_chequeo (){
       
    }
    
    public int Cálculo_Nro_de_chequeo(String SCedula){
       
       
       
      //Validar que el número de cédula está compuesto de números y no está vacío
      HerramientaExcepciones.CValidar(SCedula);
                    
            
        int length = SCedula.length(); //Cantidad de dígitos de la cédula
        int ilength = length;
        
        String CadInv = "";
         
        //Se utiliza la cantidad de dígitos como contador,
        //Mientras length no sea igual a 0, se le resta 1 a length en cada
        // iteración y se utiliza como index del string SCedula para
        //obtener los caracteres del final al principio, resultando
        //en la misma cadena pero invertida; CadInv.
         while(length != 0) {
                 length = length-1;
                 CadInv = CadInv + SCedula.charAt(length);
                 
                        }
           
                                   
         int[] intArray; 
         intArray = new int[] { 2, 3, 4, 5, 6, 7 };
         //Este es un nuevo arreglo numérico con los números utilizados
         // en el procedimiento "módulo 11" que se multiplican al nro de cédula.
         
         int contador=0;
         int Suma = 0;
         
         
         for (int i = 0; i <= 6; i++ ){
              if(i == 6){i=0; } 
              
             if(i <= ilength){
               int x = intArray[i]; // Tomar valores del array según conteo de i
               
               
               char charInt =CadInv.charAt(contador); //Tomar cada caracter de la cadena invertida.
               
               int intInvert = Character.getNumericValue(charInt); //convertir caracter de cadena invertida en número
             
               int Multip = x * intInvert; //Multiplicar valores del array por cada caracter de la cédula
             
               Suma = Suma + Multip; //Suma de todos los números multiplicados
               
               
               ++contador;
               }
             
                        
             if(contador == ilength){i=100;} //para salir del ciclo for
             
            }
              
            
            int mod = Suma % 11; //resto de la división entre la suma anterior y 11
            
            int Result = 11 - mod; //11 menos el resto
            
            int LResult= (String.valueOf(Result)).length(); 
            
           
            if(LResult == 1) {          
                 NroChequeo = Result;
                
             }
            // si el resultado da un número de dos cifras, dichas cifras se suman
            int sum = 0;
            while (Result > 0) {
            sum = sum + Result % 10;
            Result = Result / 10;
            
            }
            if(LResult > 1){
                 NroChequeo = sum;
                
        
    }
    
    return NroChequeo; //Número de chequeo que va al final del RIF.
    
}
}
