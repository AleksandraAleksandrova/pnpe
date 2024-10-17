package lab21;

public class Student extends Person {
    private String fNum;
    private double pik;
    private double te;
    private double ppe;

    public Student(String name, String egn, String bday, String fNum, double pik, double te, double ppe){
        super(name, egn, bday);
        this.setfNum(fNum);
        this.setPik(pik);
        this.setTe(te);
        this.setPpe(ppe);
    }

    private boolean validGrade(double grade){
        if (grade < 2 || grade > 6 ) {
            System.out.println("New Grade is invalid, no changes will be made.");
            return false;
        }
        return true;
    }

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }

    public double getPik() {
        return pik;
    }

    public void setPik(double pik) {
        if (validGrade(pik)) {
            this.pik = pik;
        }
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        if (validGrade(te)) {
            this.te = te;
        }
    }

    public double getPpe() {
        return ppe;
    }

    public void setPpe(double ppe) {
        if (validGrade(ppe)) {
            this.ppe = ppe;
        }
    }

    public void printInfo(){
        System.out.println("Hello, my name is " + this.getName() + " and here are my grades:");
        System.out.println("PIK: " + this.getPik());
        System.out.println("TE: " + this.getTe());
        System.out.println("PPE: " + this.getPpe());
    }
}
