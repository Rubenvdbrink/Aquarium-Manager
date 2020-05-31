package nl.hu.bep.model.bewoners;

public class Kreeft extends Bewoner {
    private boolean algEtend;
    private boolean vereistSpeciaalVisVoer;

    public Kreeft(String soortnaam, String kleurnaam, int aantal, boolean groepsDier) {
        super(soortnaam, kleurnaam, aantal, groepsDier);
    }
}
