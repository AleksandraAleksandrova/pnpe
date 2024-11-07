package lab41;

import java.util.ArrayList;

public class CStudent {
    private String name;
    private ArrayList<Integer> scores;
    private String fn;

    public CStudent(String name, ArrayList<Integer> scores, String fn) throws BlankOrEmptyString {
        setName(name);
        this.scores = scores;
        this.fn = fn;
    }

    public void setName(String name) throws BlankOrEmptyString {
        if(name.isBlank() || name.isEmpty()){
            throw new BlankOrEmptyString();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public double getGrade(){
        if(scores.isEmpty()){
            System.out.println("No scores in array.");
            return 0;
        }
        int sum = 0;
        for(Integer i : scores){
            sum += i;
        }
        return (double) sum /scores.size();
    }
}
