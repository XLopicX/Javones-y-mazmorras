public class Main {
    public static void main(String[] args) {
        Equipamiento botesChules = new Equipamiento("Botes Chules", "Armadura");
        Equipamiento espasaFusta = new Equipamiento("Espasa de fusta", "Arma");

        Equipamiento iphone16 = new Equipamiento("Iphone 16, sembla estar bloquejat per Icloud", "Accessori");
        Equipamiento navalla = new Equipamiento("Navalla d'aliexpress", "Arma");
        Equipamiento carteraRobada = new Equipamiento("Cartera de un tal Eloi", "Accessori");
        Equipamiento Burqa = new Equipamiento("Burqa", "Armadura");

        Equipamiento pal = new Equipamiento("Pal...", "Arma");

        Inventario inventariProtagonista = new Inventario();
        inventariProtagonista.agregarEquipamiento(botesChules);

        Guerrero protagonista = new Guerrero("Ferran", 1000, 100, inventariProtagonista, false, null);
        protagonista.agregarEquipamiento(espasaFusta);

        Inventario inventariAliat = new Inventario();
        Ladron aliat = new Ladron("Mohamed", 666, 100, inventariAliat, false);
        aliat.agregarEquipamiento(iphone16);
        aliat.agregarEquipamiento(navalla);
        aliat.agregarEquipamiento(carteraRobada);
        aliat.agregarEquipamiento(Burqa);

        Inventario inventariNPC = new Inventario();
        Mago npc = new Mago("Eloi", 69, 100, inventariNPC, 100);
        npc.agregarEquipamiento(pal);

        System.out.println("-----------------------");
        System.out.println("Vida Mohamet:");
        System.out.println(aliat.getPuntosVida());
        System.out.println("Mohamet es 'danyat'");
        aliat.bajarVida(50);
        System.out.println("Vida Mohamet:");
        System.out.println(aliat.getPuntosVida());
        System.out.println("Un cop mes aixi i el Mohamet la palma");
        System.out.println("El ferran actualment esta protegint algu? " + protagonista.isProtegiendo());
        System.out.println("El protagonista Ferran decideix protegir a Mohamet");
        protagonista.proteger(aliat);
        System.out.println("El ferran actualment esta protegint algu? " + protagonista.isProtegiendo());
        System.out.println("A qui? " + protagonista.estaProtegiendo().getNombre());
        System.out.println("Eloi es disposa a atacar a Mohamet");
        System.out.println("Eloi te la seguent quantitat de mana: " + npc.getMana());
        npc.lanzarHechizo(100);
        System.out.println("Consumeix tot el seu mana. Mana restant: " + npc.getMana());
        System.out.println("Falla el atac perque el pal s'ha partit al apuntar");
        System.out.println("Eloi procedeix a recarregar mana");
        npc.recargarMana(100);
        System.out.println("Mana restant: " + npc.getMana());
        npc.setMana(0);
        System.out.println("Consumeix tot el seu mana. Mana restant: " + npc.getMana());
        aliat.bajarVida(50);
        System.out.println("Mohamet mor degut a que el guerrer Ferran es autista i es protegeix a si mateix. Vida mohamet: " + aliat.getPuntosVida());
        protagonista.dejarDeProteger();
        System.out.println("Ferran esta protegint?: " + protagonista.isProtegiendo());
        System.out.println("Llastimosament les habilitats del lladre Mohamet no han pogut ser mostrades en aquest epic combat, pero si podem veure el que era el seu inventari per veure el seu historial de robatoris:");
        aliat.getInventario();
        System.out.println("El Ferran es diposa a atacar");
        System.out.println("La diferencia de estadistique entre els dos es molt gran, pertant sera una baralla facil.");
        System.out.println("Estadistiques Ferran:");
        protagonista.mostrarInfo();
        System.out.println("Estadistiques Eloi:");
        npc.mostrarInfo();
        System.out.println("Ferran ataca amb totes les seves forces");
        npc.bajarVida(100);
        System.out.println("Eloi desapareix de l'existencia inmediatament");
        System.out.println("Fi.");
    }
}