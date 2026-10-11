import java.util.ArrayList;

public abstract class personaje {

    private String nombre;
    private int vida;
    private int velocidad;
    private ArrayList<ataque> ataques;

    public personaje(String nombre, int vida, int velocidad) {
        setNombre(nombre);
        setVida(vida);
        setVelocidad(velocidad);
        this.ataques = new ArrayList<>();
    }

    public void agregarAtaque(ataque ataque) {
        ataques.add(ataque);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int danio) {
        vida -= danio;

        if (vida < 0) {
            vida = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public ArrayList<ataque> getAtaques() {
        return ataques;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}