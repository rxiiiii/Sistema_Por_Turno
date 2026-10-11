public class kiora extends personaje{

    public kiora(String nombre, int vida, int velocidad,boolean vivo){
        super(nombre, vida, velocidad,vivo);
        ataque LanzaRoca = new ataque(60,"roca","lanza roca");
        ataque Relapcosas = new ataque(80,"normal","relapcosas");

    }

    

    

}
