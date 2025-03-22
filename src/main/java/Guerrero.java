public class Guerrero extends Personaje {
    private boolean protegiendo;
    private Personaje compañeroProtegido;

    public Guerrero(String nombre, int nivel, int puntosVida, Inventario inventario, boolean protegiendo, Personaje compañeroProtegido){
        super(nombre, nivel, puntosVida, inventario);
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
        if (!isProtegiendo()){
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

    @Override
    public void bajarVida(int vida){ // todo: Em vui pegar un tiro.
        if (isProtegiendo()) {  // Ni pta idea de moment seguint l'estructura del projecte com implementar el que demana.
            if (getCompañeroProtegido().getPuntosVida() - (vida * 0.5) < 0) {
                setPuntosVida(0);
            }
            else {
                getCompañeroProtegido().setPuntosVida(getCompañeroProtegido().getPuntosVida() - vida);
            }
        }
        else {
            super.bajarVida(vida);
        }
        //this.puntosVida -= vida;
    }

    public Personaje estaProtegiendo(){
        if (isProtegiendo()){
            return getCompañeroProtegido();
        }
        else {
            return null;
        }
    }
}
