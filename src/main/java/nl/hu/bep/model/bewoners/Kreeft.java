package nl.hu.bep.model.bewoners;

public class Kreeft extends Bewoner {
    private boolean algEtend;
    private boolean vereistSpeciaalVisVoer;

    public Kreeft(String soortnaam, String kleurnaam, int aantal, boolean groepsDier, boolean algEtend, boolean vereistSpeciaalVisVoer) {
        super(soortnaam, kleurnaam, aantal, groepsDier);
    }
}
