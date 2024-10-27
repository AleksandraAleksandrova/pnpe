package lab32;

public class SickPatient extends Patient{
    String epikriza;
    boolean isHealthy;
    int day;

    public SickPatient(String name, String address, String egn, String epikriza, boolean isHealthy, int day){
        super(name, address, egn);
        this.epikriza = epikriza;
        this.isHealthy = isHealthy;
        validateDay(day);
    }

    private void validateDay(int day){
        if (day>=1 && day <=366){
            this.day = day;
        }else{
            System.out.println("Invalid day, setting a default value of 1");
            this.day = 1;
        }
    }

    public String getEpikriza() {
        return epikriza;
    }

    public void setEpikriza(String epikriza) {
        this.epikriza = epikriza;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void cure(String med, int dose){
        this.epikriza = this.epikriza + " " +  med + " " + dose ;
        System.out.println(this.epikriza);
    }
}
