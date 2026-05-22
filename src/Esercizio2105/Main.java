package Esercizio2105;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== IL MIO NUOVO PARCO ===");
        ParcoAuto mioParco = new ParcoAuto();

        // Creo gli oggetti applicando il polimorfismo per dati
        Veicolo miaAuto = new Auto("Fiat", "500e", 2023, 3);
        Veicolo miaMoto = new Moto("Ducati", "Monster", 2022, "Termica");
        Veicolo mioCamion = new Camion("VOLVO", "FH Aero", 2024, 4, 64.5);

        // Aggiungo i veicoli al parco
        mioParco.aggiungiVeicolo(miaAuto);
        mioParco.aggiungiVeicolo(miaMoto);
        mioParco.aggiungiVeicolo(mioCamion);

        System.out.println("\n=== TEST POLIMORFISMO DI MANUTENZIONE ===");
        
        // Uso instanceof per castare prima di passare i vari veicoli ai prossimi due metodi
        if (miaAuto instanceof Manutenzione) {
            mioParco.eseguiTagliando((Manutenzione) miaAuto);
        }
        if (miaMoto instanceof Manutenzione) {
            mioParco.eseguiTagliando((Manutenzione) miaMoto);
        }
        if (mioCamion instanceof Manutenzione) {
            mioParco.eseguiTagliando((Manutenzione) mioCamion);
        }

        System.out.println("\n=== TEST POLIMORFISMO DI CARICO MASSIMO ===");
        
        if (miaAuto instanceof Carico) {
            mioParco.verificaCaricoMassimo((Carico) miaAuto); // Non verrà eseguito
        }    
        if (miaMoto instanceof Carico) {
            mioParco.verificaCaricoMassimo((Carico) miaMoto); // Non verrà eseguito
        }        
        if (mioCamion instanceof Carico) {
            mioParco.verificaCaricoMassimo((Carico) mioCamion); // Solo mioCamion passa questo controllo
        }
    }
}