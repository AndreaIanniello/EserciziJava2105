package Esercizio2105;

public class Moto extends Veicolo implements Manutenzione {
    private String tipoPropulsione;

    // costruttore
    public Moto(String marca, String modello, int annoProduzione, String tipoPropulsione) {
        super(marca, modello, annoProduzione);
        this.tipoPropulsione = tipoPropulsione;
    }

    // getter e setter
    public String getTipoPropulsione() { 
    	return tipoPropulsione; 
    }
    
    public void setTipoPropulsione(String tipoPropulsione) { 
    	this.tipoPropulsione = tipoPropulsione; 
    }
    

    @Override
    public void manutenzioneOrdinaria() {
        System.out.println("Manutenzione Moto (" + getMarca() + " - " + tipoPropulsione + "): Diagnostica e calibrazione dei sistemi di sicurezza completata.");
    }
}