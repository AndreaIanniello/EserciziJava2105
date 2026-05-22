package Esercizio2105;

public class Auto extends Veicolo implements Manutenzione {
    private int numeroPorte;

    // costruttore
    public Auto(String marca, String modello, int annoProduzione, int numeroPorte) {
        super(marca, modello, annoProduzione);
        this.numeroPorte = numeroPorte;
    }
    
    // getter e setter
    public int getPorte() { 
        return numeroPorte; }
    
    public void setPorte(int numeroPorte) { 
        this.numeroPorte = numeroPorte; }


    @Override
    public void manutenzioneOrdinaria() {
        System.out.println("Manutenzione Auto (" + getMarca() + "): Cambio olio e filtri effettuato.");
    }
}