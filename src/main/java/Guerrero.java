public class Guerrero extends Personaje{
    private boolean protegiendo;
    private Personaje compañeroProtegido;
    public void Guerrero(String nombre, int nivel, int puntosVida, Inventario inventario,boolean protegiendo, Personaje compañeroProtegido){
        super (nombre, nivel, puntosVida, inventario);
        this.protegiendo = protegiendo;
        this.compañeroProtegido = compañeroProtegido;
    }

    public boolean isProtegiendo() {
        return protegiendo;
    }

    public void setProtegiendo(boolean protegiendo) {
        this.protegiendo = protegiendo;
    }

    public Personaje getCompañeroProtegido() {
        return compañeroProtegido;
    }

    public void setCompañeroProtegido(Personaje compañeroProtegido) {
        this.compañeroProtegido = compañeroProtegido;
    }

    public void proteger(Personaje compañeroProtegido) {
        if (isProtegiendo() == false){
            setCompañeroProtegido(compañeroProtegido);
            setProtegiendo(true);
        }
        else {
            System.out.println("Ya estas protegiendo a un compañero.");
        }
    }

    public void dejarDeProteger(){
        setProtegiendo(false);
        setCompañeroProtegido(null);
    }

    public void bajarVida(int vida){
        puntosVida -= vida;
    }
    public Personaje estaProtegiendo(){
        if (isProtegiendo() == true){
            return getCompañeroProtegido();
        }
        else {
            return null;
        }
    }
}
