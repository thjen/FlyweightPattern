package flyweightpattern;

public class StudentThreaded {
    String name;
    int id;
    int score;
    double averageScore;
    private static StudentThreaded singleObject = new StudentThreaded();
    
    private StudentThreaded() {
    }
    
    public void setAverageScore(double a) {
        this.averageScore = a;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public int getScore() {
        return score;
    }
    
    public double getStanding() {
        return (((double) score/averageScore - 1.0) * 100.0); 
    }
    
    public static StudentThreaded getInstance() {
        return singleObject;
    }
}
