public class Ladron extends Personaje{
    private boolean invisible;

    public Ladron(String nombre, int nivel, int puntosVida, Inventario inventario, boolean invisible) {
        super(nombre, nivel, puntosVida, inventario);
        this.invisible = invisible;
    }

    public boolean estaInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    public void robar(){
        if (estaInvisible()){
            System.out.println("El ladron roba mientras es invisible");
        }
        else {
            System.out.println("El ladron roba a plena luz del dia");
        }
    }

    public void hacerseInvisible(){
        if (estaInvisible()){
            setInvisible(false);
        }
        else {
            setInvisible(true);
        }
    }
}
