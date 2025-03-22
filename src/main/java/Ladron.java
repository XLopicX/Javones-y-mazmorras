public class Ladron extends Personaje{
    private boolean invisible;
    public void Guerrero(String nombre, int nivel, int puntosVida, Inventario inventario,boolean invisible){
        super (nombre, nivel, puntosVida, inventario);
        this.invisible = invisible;
    }

    public boolean isInvisible() { // estaInvisible es lo mismo que este getter
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    public void robar(){
        if (isInvisible() == true){
            System.out.println("El ladron roba mientras es invisible");
        }
        else {
            System.out.println("El ladron roba a plena luz del dia");
        }
    }

    public void hacerseInvisible(){
        if (isInvisible() == true){
            setInvisible(false);
        }
        else {
            setInvisible(true);
        }
    }
    /* Redundant
    public boolean estaInvisible(){
        return isInvisible();
    }*/
}
