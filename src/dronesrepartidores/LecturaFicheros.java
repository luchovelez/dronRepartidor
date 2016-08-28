package dronesrepartidores;

/**
 *
 * @author Luis Alberto Velez
 */
//import java.io.File;
import java.util.ArrayList;
//import java.util.Scanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LecturaFicheros {
    
    private String nombreArchivo;
    private List<String> matriz;
    
    
    
    public LecturaFicheros(){

	}
    
    
    public List leerArchivo(String nombreArchivo){
        
        
        String fileName = nombreArchivo;
        List<String> listarutas = null;
        
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                        
                     
                        //stream.map(s -> s.substring(1));
			listarutas=stream.collect(Collectors.toList());
                        
//             matriz.add(stream.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	

	
        matriz=listarutas;
                
                
        return matriz;
        
        
    };

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public List<String> getMatriz() {
        return matriz;
    }

    public void setMatriz(ArrayList<String> matriz) {
        this.matriz = matriz;
    }
    
    
        
        
        
        
    }

	/*public static void main(String[] args) {

		// Fichero del que queremos leer
		File fichero = new File("fichero_leer.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}*/