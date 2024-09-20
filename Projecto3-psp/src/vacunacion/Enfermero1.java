/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class Enfermero1 {
    private String nombre;
    private ListaPaciente lista;
    private long inicio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaPaciente getLista() {
        return lista;
    }

    public void setLista(ListaPaciente lista) {
        this.lista = lista;
    }

    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }


    
    private void tiempoVacunacion(int segundos){
        try{
            Thread.sleep(segundos*1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
        @override
        public void run(){
        
        System.out.println("El enfermero "+this.nombre+" comienza a vacunar la compra del cliente "
        +lista.getNombre()+ " en el tiempo: "+(System.currentTimeMillis()-inicio/1000+ " seg"));
        
        for (int i = 0; i<lista.getTiempoPaciente().length; i++){
            this.tiempoVacunacion(lista.getTiempoPaciente()[i]);
            
            System.out.println("Vacunando al paciente "+(i+1));
        }
        
        System.out.println("El enfermero "+this.nombre+ " ha terminado de vacunar "+ lista.getNombre()
        + " en el tiempo: "+(System.currentTimeMillis()-inicio)/1000+ " seg");
    }
     
    
}
