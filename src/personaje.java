public abstract  class personaje {
    private String nombre;
    private int vida;
    private int velocidad;

    public personaje(String nombre, int vida, int velocidad){
        setNombre(nombre);
        setVelocidad(velocidad);
        setVida(vida);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

}
