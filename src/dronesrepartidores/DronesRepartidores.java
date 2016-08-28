/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dronesrepartidores;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luis Alberto Velez Tascon
 */



public class DronesRepartidores {
    

      private LecturaFicheros lector = new LecturaFicheros();
      private int posicionX = 0;
      private int posicionY = 0;
      private String orientacion ="Norte";
      private String posicionFinal;
      

   
    
    
    public DronesRepartidores(){
        this.posicionX=0;
        this.posicionY=0;
        this.orientacion="Norte";
    };

    public void moverDron(String instruccion){
        switch (instruccion) {
            case "A":
                this.moverAdelante();
                break;
                              
            case "I":
                this.moverIzquierda();
                break;
            
            case "D":
                this.moverDerecha();
                break;
        } 
                
        
        
        
    };

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
    
     public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
           
    
   
    public void moverAdelante(){
        
        switch (this.getOrientacion()){
            
            case "Norte":
                this.setPosicionY(this.getPosicionY()+1);
                break;
               
            case "Sur":
                this.setPosicionY(posicionY-1);
                break;
               
            case "Occidente":
                this.setPosicionX(this.getPosicionX()-1);
                break;
                
            case "Oriente":
                this.setPosicionX(posicionX+1);
                break;
                           
        }
        
        
        
        
    }
    public void moverIzquierda(){
        
        switch (this.getOrientacion()){
            
            case "Norte":
                
                this.setOrientacion("Occidente");
                break;
            case "Sur":
               
                this.setOrientacion("Oriente");
                break;
            case "Occidente":
             
                this.setOrientacion("Sur");
                break;
            case "Oriente":
                
                this.setOrientacion("Norte");
                break;
                
            
        }
                
        
       
        
    }
    public void moverDerecha(){
         switch (this.getOrientacion()){
            
            case "Norte":
                
                this.setOrientacion("Oriente");
                break;
            case "Sur":
              
                this.setOrientacion("Occidente");
                break;
            case "Occidente":
                
                this.setOrientacion("Norte");
                break;
            case "Oriente":
             
                this.setOrientacion("Sur");
                break;
                
            
        }
        
        
        
    }
    
    public List cargarRutas(String archivo){
        
        List leerArchivo = lector.leerArchivo(archivo);
        
        
        return leerArchivo;
    }
    
    
    public String  repartirDomicilio(String ruta){
        
        for(int i=0;i<=ruta.length()-1;i++){
            
         String indicacion = String.valueOf(ruta.charAt(i)); 
         
         this.moverDron(indicacion);
         String posicion="("+this.getPosicionX()+", "+this.getPosicionY()+") direccón "+ this.getOrientacion(); 
        
         
         this.setPosicionFinal(posicion);
        // System.out.println(posicion);
         
            
        }
           
    return posicionFinal;
    }
   
    public void ejecutarDomicilios(List listaDomicilios){
       // String domicilio = null;
         List<String> listaPedidos =new ArrayList<String>();
        
         String text="== Reporte de entregas==\n";
         listaPedidos.add(text);
         for (int i=0;i<=listaDomicilios.size()-1;i++){
             
            String orden=(String) listaDomicilios.get(i);
            
            this.repartirDomicilio(orden);
            
           
            
            listaPedidos.add(this.getPosicionFinal());
            System.out.println(this.getPosicionFinal());
            this.setPosicionX(0);
            this.setPosicionY(0);
            this.setOrientacion("Norte");
            
           
         }
         String[] lineas = listaPedidos.toArray(new String[0]);
         
        EscrituraFicheros salida = new EscrituraFicheros();
        
        salida.crearArchivo(lineas, "E:\\Documents\\NetBeansProjects\\dronesRepartidores\\src\\dronesrepartidores\\out.txt");
      // return domicilio;
         
     }
    public String getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(String posicionFinal) {
        this.posicionFinal = posicionFinal;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DronesRepartidores dron = new DronesRepartidores();
         
         dron.ejecutarDomicilios(dron.cargarRutas("E:\\Documents\\NetBeansProjects\\dronesRepartidores\\src\\dronesrepartidores\\in.txt"));
         
        System.out.println(dron.getPosicionFinal());
        
       
        
        
        
        
        
    }
    
    
    
    
    
}
