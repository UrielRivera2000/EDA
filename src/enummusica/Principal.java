
package enummusica;

/*enum pistas{
    CANCION1("Titulo: Shape of You, de Ed Sheeran en formato: wav, mp3,dvd con duracion 3:50"),
    CANCION2("Titulo: Perfect, de Ed Sheeran en formato wav, mp3,dvd con duracion 3:56"),
      CANCION3("Titulo: Havana, de Camila Cabello en formato wav, mp3,dvd con duracion 2:35"),
       CANCION4("Titulo: All We Know, de The Chainsmokers en formato wav, mp3,dvd con duracion 2:40"),
        CANCION5("Titulo: Closer, de The Chainsmokers en formato wav, mp3,dvd 4:22");
    
private String cancion;

   private pistas(String cancion) {
        this.cancion = cancion;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    
}*/

enum formatos {

WAV("Shape of You", "Ed Sheeran","3:50",true),MP3("Perfect", "Ed Sheeran","3:56",true),MIDI("Havana", "Camila cabello","2:35",true),
AVI("All We Know","The Chainsmokers","2:40",true),MOV("Closer", "The Chainsmokers","4:22",true),
MPG("", "","",false),DVD("", "","",false);
String titulo;
String cantante;
String duracion;
boolean formato;

    private formatos(String titulo, String cantante, String duracion, boolean formato) {
        this.titulo = titulo;
        this.cantante = cantante;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isFormato() {
        return formato;
    }

    public void setFormato(boolean formato) {
        this.formato = formato;
    }




}
public class Principal {

    public static void main(String[] args) {
    /*  for (pistas cancion : pistas.values()) {
            System.out.println(cancion.getCancion());
        }*/
    
        for (formatos can : formatos.values()) {
            if (can.isFormato() == false){
                System.out.println("No existe cancion");
            }else{
                System.out.println(can.getTitulo()+" "+can.getCantante()+" "+can.isFormato()+ " "+can.getDuracion());
            }
            System.out.println("");
        }
    
    }

 
    
}
