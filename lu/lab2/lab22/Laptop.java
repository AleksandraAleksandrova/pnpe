package lab22;

public class Laptop extends Device {
    private int RAM;
    private int SSD;

    public Laptop(double u, String processor, int RAM, int SSD){
        super(u, processor);
        this.setRAM(RAM);
        this.setSSD(SSD);
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public boolean isBetter(Laptop l){
        return (this.getSSD() > l.getSSD()) && (this.getRAM() > l.getRAM());
    }

    @Override
    public String toString() {
        return "This laptop has " + this.getProcessor() + " processor and U = " + this.getU() + " Volts. The RAM is " + this.getRAM() + "GB and the SSD is " + this.getSSD() + " GB.";
    }
}
