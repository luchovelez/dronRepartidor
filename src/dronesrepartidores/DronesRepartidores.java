/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dronesrepartidores;
import java.util.ArrayList;
/**
 *
 * @author Luis Alberto Velez Tascon
 */



public class DronesRepartidores {
    
    private ArrayList<String> mapaCiudad = new ArrayList<String>();
      private LecturaFicheros lector = new LecturaFicheros();
      private int posicionX = 0;
      private int posicionY = 0; 
    
    
    

    public ArrayList<String> getMapaCiudad() {
        return mapaCiudad;
    }

    public void setMapaCiudad(ArrayList<String> mapaCiudad) {
        this.mapaCiudad = mapaCiudad;
    }

    public LecturaFicheros getLector() {
        return lector;
    }

    public void setLector(LecturaFicheros lector) {
        this.lector = lector;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
    
    
     
    

    public DronesRepartidores() {
    }
    
    public void moverAdelante(char instruccion){
        
    }
    public void moverIzquierda(char instruccion){
        
    }
    public void moverDerecha(char instruccion){
        
    }
    public void crearMapa(int tamaño){
        
    }
    public void cargarRutas(String archivo){
        
        ArrayList leerArchivo = lector.leerArchivo(archivo);
        //System.out.println(leerArchivo.get(0)); 
        
        
    }
    
    
    public void leerCoordenadas( LecturaFicheros lector){
    
    }
  
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        DronesRepartidores dron = new DronesRepartidores();
        dron.cargarRutas("E:\\Documents\\NetBeansProjects\\dronesRepartidores\\src\\dronesrepartidores\\in.txt");
        
        
        
        
    }
    
}
