package cl.duoc.musica.proyectomusica.Modelos;

import java.time.Duration;

public class Cancion {
    
    /*
     La canción tiene un título, un artista, tiempo de duración, si es favorita
     o no y si se encuentra descargada o no en el dispositivo.
    */
    
    private String Titulo;
    private String Artista;
    private float TiempoDuracion;
    private boolean Favorita;
    private boolean DescargadaDispositivo;
    
    
    public Cancion(){
    
    this.Titulo = "";
    this.Artista = "";
    this.TiempoDuracion = 0;
    this.Favorita = true;
    this.DescargadaDispositivo = true;
    }

    public Cancion(String Titulo, String Artista, float TiempoDuracion, boolean Favorita, boolean DescargadaDispositivo) {
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.TiempoDuracion = TiempoDuracion;
        this.Favorita = Favorita;
        this.DescargadaDispositivo = DescargadaDispositivo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public float getTiempoDuracion() {
        return TiempoDuracion;
    }

    public void setTiempoDuracion(float TiempoDuracion) {
        this.TiempoDuracion = TiempoDuracion;
        long noOfMinutes = 0;
        
        Duration duration
            = Duration.ofMinutes(noOfMinutes);
        System.out.println(duration.getSeconds());
    }

    public boolean isFavorita() {
        return Favorita;
    }

    public void setFavorita(boolean Favorita) {
        this.Favorita = Favorita;
    }

    public boolean isDescargadaDispositivo() {
        return DescargadaDispositivo;
    }

    public void setDescargadaDispositivo(boolean DescargadaDispositivo) {
        this.DescargadaDispositivo = DescargadaDispositivo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Titulo=" + Titulo + 
                ", Artista=" + Artista + 
                ", TiempoDuracion=" + TiempoDuracion + 
                ", Favorita=" + Favorita + 
                ", DescargadaDispositivo=" + DescargadaDispositivo + 
                '}';
    }
}
