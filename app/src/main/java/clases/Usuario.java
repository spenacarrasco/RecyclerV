package clases;

public class Usuario {

    private String nombreUsuario;
    private String distancia;
    private int valoracion;
    private int edad;
    private int cantidadCondones;
    private int tipoCondones;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadCondones() {
        return cantidadCondones;
    }

    public void setCantidadCondones(int cantidadCondones) {
        this.cantidadCondones = cantidadCondones;
    }

    public int getTipoCondones() {
        return tipoCondones;
    }

    public void setTipoCondones(int tipoCondones) {
        this.tipoCondones = tipoCondones;
    }

    public Usuario(String nombreUsuario, String distancia,int valoracion, int cantidadCondones,
                   int tipoCondones ){
        this.nombreUsuario  = nombreUsuario;
        this.distancia      = distancia;
        this.valoracion     = valoracion;
        this.cantidadCondones=cantidadCondones;
        this.tipoCondones   = tipoCondones;

    }

}

