import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipamiento> equipamiento;

    public Inventario() {
        this.equipamiento = new ArrayList<>();
    }

    public void agregarEquipamiento(Equipamiento equip) {
        this.equipamiento.add(equip);
    }

    public void mostrarInventario() {
        System.out.println("El inventario contiene este equipo:");
        for (Equipamiento equip : this.equipamiento) {
            System.out.println(String.format("Nombre: %s | Equipo: %s",equip.getNombre(), equip.getTipo()));
        }
    }
}
