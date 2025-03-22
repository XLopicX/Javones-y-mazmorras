public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida, Inventario inventario) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre() + "\nNivel: " + getNivel() + "\nPuntos de vida: " + getPuntosVida());
    }

    public void bajarVida(int vida){
        if (getPuntosVida() - vida < 0) {
            setPuntosVida(0);
        }
        else {
            setPuntosVida(getPuntosVida() - vida);
        }
    }

    public void agregarEquipamiento(Equipamiento equip) {
        this.inventario.agregarEquipamiento(equip);
    }

    public void getInventario() {
        this.inventario.mostrarInventario();
    }
}
