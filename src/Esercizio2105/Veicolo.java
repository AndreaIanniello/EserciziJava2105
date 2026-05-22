package Esercizio2105;

public abstract class Veicolo {
    private String marca;
    private String modello;
    private int annoProduzione;

    public Veicolo(String marca, String modello, int annoProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
    }

    // Getter e Setter
    public String getMarca() { 
    	return marca; }
    
    public void setMarca(String marca) { 
    	this.marca = marca; }

    public String getModello() { 
    	return modello; }
    
    public void setModello(String modello) { 
    	this.modello = modello; }

    public int getAnnoProduzione() { 
    	return annoProduzione; }
    
    public void setAnnoProduzione(int annoProduzione) { 
    	this.annoProduzione = annoProduzione; }
}