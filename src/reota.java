public class reota extends personaje {
     
    public reota(String nombre, int vida, int velocidad,boolean vivo){
        super(nombre, vida, velocidad,vivo);

        ataque relampagos = new ataque(75,"rayo","relampagos");
        ataque riader = new ataque(100,"rayo","riader");

    }

}
