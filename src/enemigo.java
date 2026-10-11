public class enemigo extends personaje {
     public enemigo(String nombre, int vida, int velocidad,boolean vivo){
        super(nombre, vida, velocidad,vivo);
        ataque Lood = new ataque(60,"lodo","lood");
        ataque zampuas = new ataque(120,"normal","zampuas");
    }

}
