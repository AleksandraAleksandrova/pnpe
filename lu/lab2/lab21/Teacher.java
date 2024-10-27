package lab21;

public class Teacher extends Person {
    private Course course;

    public Teacher(String name, String egn, String bday){
        super(name, egn, bday);
    }

    public Teacher(String name, String egn, String bday, Course course){
        super(name, egn, bday);
        this.setCourse(course);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void greet(){
        System.out.println("Hello! My name is " + this.getName() + " and I teach " + this.getCourse().getName() + ".");
    }
}
