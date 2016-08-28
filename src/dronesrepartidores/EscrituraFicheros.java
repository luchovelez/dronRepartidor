/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dronesrepartidores;

/**
 *
 * @author lucho
 */
import java.io.FileWriter;
public class EscrituraFicheros {
    
    public EscrituraFicheros(){
        
    }
    
    
    public void crearArchivo(String[] texto,String nombre){
        
        
        
        FileWriter fichero = null;
		try {
                        String[] lineas = texto;
			fichero = new FileWriter(nombre);

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
        
    }

	//public static void main(String[] args) {

		//String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

		/** FORMA 1 DE ESCRITURA **/
		
	//}
}
