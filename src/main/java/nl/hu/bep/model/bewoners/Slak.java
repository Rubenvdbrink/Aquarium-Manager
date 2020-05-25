package nl.hu.bep.model.bewoners;

public class Slak extends Bewoner{
    private boolean slakkenEtend;

    /**
     * Constructors
     */

    public Slak(String soortnaam, String kleurnaam, int aantal, boolean groepsDier, boolean slakkenEtend) {
        super(soortnaam, kleurnaam, aantal, groepsDier);
        this.slakkenEtend = slakkenEtend;
    }

    /**
     * Getters and setters
     */

    public boolean isSlakkenEtend() { return slakkenEtend; }

    public void setSlakkenEtend(boolean slakkenEtend) { this.slakkenEtend = slakkenEtend; }
}
