package nl.hu.bep.model.bewoners;

public class Vis extends Bewoner {
    private boolean algEtend;
    private boolean vereistSpeciaalVisVoer;

    /**
     * Constructors
     */

    public Vis(String soortnaam, String kleurnaam, int aantal, boolean groepsDier, boolean algEtend, boolean vereistSpeciaalVisVoer) {
        super(soortnaam, kleurnaam, aantal, groepsDier);
        this.algEtend = algEtend;
        this.vereistSpeciaalVisVoer = vereistSpeciaalVisVoer;
    }

    /**
     * Getters and setters
     */

    public boolean isAlgEtend() { return algEtend; }
    public void setAlgEtend(boolean algEtend) { this.algEtend = algEtend; }

    public boolean isVereistSpeciaalVisVoer() { return vereistSpeciaalVisVoer; }
    public void setVereistSpeciaalVisVoer(boolean vereistSpeciaalVisVoer) { this.vereistSpeciaalVisVoer = vereistSpeciaalVisVoer; }
}
