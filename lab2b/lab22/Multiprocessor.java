package lab22;

public class Multiprocessor {
    private int numOfProcessors;
    private int numOfCores;
    private float frequency;
    private boolean isOn;

    public Multiprocessor(int numOfProcessors, int numOfCores, float frequency){
        this.setNumOfProcessors(numOfProcessors);
        this.setNumOfCores(numOfCores);
        this.setFrequency(frequency);
        this.isOn = false;
    }

    public int getNumOfProcessors() {
        return numOfProcessors;
    }

    public void setNumOfProcessors(int numOfProcessors) {
        if(numOfProcessors < 1 ) {
            System.out.println("Number of processors must be at least 1. Setting to 1.");
            numOfProcessors = 1;
        }
        this.numOfProcessors = numOfProcessors;

    }

    public int getNumOfCores(){
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        if(numOfCores < 1 ) {
            System.out.println("Number of cores must be at least 1. Setting to 1.");
            numOfCores = 1;
        }
        this.numOfCores = numOfCores;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

}
