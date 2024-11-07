package lab44;

import static lab44.Building.sc;

public class House extends Building{
    private int floors;
    private String person;

    public House(int height, double area, String address, int floors, String person) throws ZeroOrNegativeValue, BlankOrEmptyString{
        super(height, area, address);
        setFloors(floors);
        setPerson(person);
    }

    public void setFloors(int floors) throws ZeroOrNegativeValue {
        if(floors <= 0){
            throw new ZeroOrNegativeValue();
        }
        this.floors = floors;
    }

    public void setPerson(String person) throws BlankOrEmptyString {
        if(person.isEmpty() || person.isBlank()){
            throw new BlankOrEmptyString();
        }
        this.person = person;
    }

    public int getFloors() {
        return floors;
    }

    public String getPerson() {
        return person;
    }

    public void enterFloors() throws ZeroOrNegativeValue {
        System.out.println("Enter new floors number:");
        int newFloors = sc.nextInt();
        sc.nextLine();
        setFloors(newFloors);
    }

    public void enterPerson() throws BlankOrEmptyString {
        System.out.println("Enter new person's name:");
        String newName = sc.nextLine();
        setPerson(newName);
    }
}
