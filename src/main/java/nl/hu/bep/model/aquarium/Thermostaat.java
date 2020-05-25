package nl.hu.bep.model.aquarium;

public class Thermostaat extends Toebehoren{
    private int minTemp;
    private int maxTemp;
    private int huidigeTempIngesteld;

    /**
     * Constructors
     */

    public Thermostaat(String model, int serienummer, int minTemp, int maxTemp, int huidigeTempIngesteld) {
        super(model, serienummer);

        //sets the temps temporarily so the setters can do checks on the temp
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.huidigeTempIngesteld = huidigeTempIngesteld;
        //-------------------------------------------------------------------

        this.setMinTemp(minTemp);
        this.setMaxTemp(maxTemp);
        this.setHuidigeTempIngesteld(huidigeTempIngesteld);
    }

    /**
     * Getters and setters
     */

    public int getMinTemp() { return minTemp; }
    public void setMinTemp(int minTemp) {
        if (minTemp > 0 && minTemp <= this.maxTemp) {
            this.minTemp = minTemp;
        } else {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
    }

    public int getMaxTemp() { return maxTemp; }
    public void setMaxTemp(int maxTemp) {
        if (maxTemp >= this.minTemp && maxTemp < 100) {
            this.maxTemp = maxTemp;
        } else {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
    }

    public int getHuidigeTempIngesteld() { return huidigeTempIngesteld; }
    public void setHuidigeTempIngesteld(int huidigeTempIngesteld) {
        if (huidigeTempIngesteld >= minTemp && huidigeTempIngesteld <= maxTemp) {
            this.huidigeTempIngesteld = huidigeTempIngesteld;
        } else {
            throw new IllegalArgumentException("Niet alle velden zijn correct ingevoerd!");
        }
    }
}
