package Esercizio2105;
import java.util.ArrayList;
import java.util.List;

public class ParcoAuto {
    // Collezione eterogenea dinamica
    private List<Veicolo> flotta;
    public ParcoAuto() {
        this.flotta = new ArrayList<>();
    }

    // Metodo per l'aggiunta di veicoli alla collezione
    public void aggiungiVeicolo(Veicolo v) {
        flotta.add(v);
        System.out.println("Inserito nel parco auto: " + v.getMarca() + " " + v.getModello());
    }

    // Metodo che accetta un parametro polimorfo di tipo Carico
    public void verificaCaricoMassimo(Carico veicoloMerci) {
        veicoloMerci.caricoMassimo();
    }

    // Metodo che accetta un parametro polimorfo di tipo Manutenzione
    public void eseguiTagliando(Manutenzione veicoloDaRiparare) {
        veicoloDaRiparare.manutenzioneOrdinaria();
    }
}

// Tuttobellotuttofresho modificado
