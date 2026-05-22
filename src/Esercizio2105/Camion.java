package Esercizio2105;

public class Camion extends Veicolo implements Manutenzione, Carico {
    private int numeroAssi;
    private double portataTonnellate;

    // costruttore
    public Camion(String marca, String modello, int annoProduzione, int numeroAssi, double portataTonnellate) {
        super(marca, modello, annoProduzione);
        this.numeroAssi = numeroAssi;
        this.portataTonnellate = portataTonnellate;
    }
    
    // getter e setter
    public int getAssi() { 
        return numeroAssi; }
    
    public void setAssi(int numeroAssi) { 
        this.numeroAssi = numeroAssi; }
    
    public double getportataTonnellate() { 
        return portataTonnellate; 
    }
    
    public void setportataTonnellate(double portataTonnellate) { 
        this.portataTonnellate = portataTonnellate;
    }


    // override dei metodi delle interfacce
    @Override
    public void manutenzioneOrdinaria() {
        System.out.println("Manutenzione Camion (" + getMarca() + "): Controllo impianto frenante ad aria completato.");
    }

    @Override
    public void caricoMassimo() {
        System.out.println("Il camion " + getMarca() + " " + getModello() + " ha un carico massimo di: " + portataTonnellate + " Tonnellate.");
    }
}