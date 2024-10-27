package lab22;

public class Device {
    private double u;
    private String processor;

    public Device(double u, String processor){
        this.setU(u);
        this.setProcessor(processor);
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
