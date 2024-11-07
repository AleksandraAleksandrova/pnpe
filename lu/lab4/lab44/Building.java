package lab44;

import java.util.Scanner;

public class Building {
    protected static Scanner sc = new Scanner(System.in);

    protected int height;
    protected double area;
    protected String address;

    public Building(int height, double area, String address) throws ZeroOrNegativeValue, BlankOrEmptyString{
        setHeight(height);
        setArea(area);
        setAddress(address);
    }

    public void setHeight(int height) throws ZeroOrNegativeValue {
        if(height <=0 ){
            throw new ZeroOrNegativeValue();
        }
        this.height = height;
    }

    public void setArea(double area) throws ZeroOrNegativeValue {
        if(area <= 0){
            throw new ZeroOrNegativeValue();
        }
        this.area = area;
    }

    public void setAddress(String address) throws BlankOrEmptyString {
        if(address.isBlank() || address.isEmpty()){
            throw new BlankOrEmptyString();
        }
        this.address = address;
    }

    public void enterHeight() throws ZeroOrNegativeValue {
        System.out.println("Enter new building height:");
        int newHeight = sc.nextInt();
        sc.nextLine();
        setHeight(newHeight);
    }

    public void enterArea() throws ZeroOrNegativeValue {
        System.out.println("Enter new building area:");
        double newArea = sc.nextDouble();
        sc.nextLine();
        setArea(newArea);
    }

    public void enterAddress() throws BlankOrEmptyString {
        System.out.println("Enter new building address:");
        String newAddress = sc.nextLine();
        setAddress(newAddress);
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }
}

