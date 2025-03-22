public class Mago extends Personaje{
    private int mana;
    public void Mago(String nombre, int nivel, int puntosVida, Inventario inventario,int mana){
        super (nombre, nivel, puntosVida, inventario);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void lanzarHechizo(int costoMana){
        if (costoMana > getMana()){
            System.out.println("Falta Maná");
        }
        else {
            setMana(getMana()-costoMana);
        }
    }

    public void recargarMana(int cantidad){
        setMana(cantidad);
    }

}
