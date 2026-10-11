public class ataque {
    private int danio;
    private String tipo;
    private String nombre;

    public ataque (int danio, String tipo, String nombre){
        setDanio(danio);
        setNombre(nombre);
        setTipo(tipo);
    }

    public int getDanio() {
        return danio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
