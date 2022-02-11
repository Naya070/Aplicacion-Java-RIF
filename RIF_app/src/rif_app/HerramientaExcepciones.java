/*
 * Clase para crear métodos de verificación y validación de datos.
 */
package rif_app;

/**
 *
 * @author Usuario
 */
import javax.swing.JOptionPane;
public class HerramientaExcepciones extends rif_app_1 {
    
    //Validar que el campo Cedula no esté vacío.
    
    public static boolean CValidar(String SCedula){
                
        try{ 
            
            int num = Integer.parseInt(SCedula);
        
        String strNum = String.valueOf(num);
        int length = strNum.length();
        int ilength = length;
        }
        
        catch (NumberFormatException NFExc) {
           JOptionPane.showMessageDialog(null, "Por favor, introduzca su número de cédula sin símbolos ni espacios");
           return false;
        }
         return true;               
        }
    
      //Validar que el campo Cédula sólo esté compuesto por números.
    
    public static boolean NCValidar(String SCedula){
        for(int i = 0; i == (SCedula.length()+1); i++){
            char CCedula= SCedula.charAt(i);
            int ascii = (int) CCedula;
            if (!(ascii>=48 && ascii<=57)){
                JOptionPane.showMessageDialog(null, "El código no es válido, sólo puede contener números");
                return false;
            }
            
        }
        return true;
    }
    
     
      
 
}
