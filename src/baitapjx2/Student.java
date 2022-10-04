package baitapjx2;

public class Student {
    public String name;
    public String email;
    public double point;

    public Student(String name, String email, double point) {
        this.name = name;
        this.email = email;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student: "+name+" - "+email+" - "+point+"\n";
    }
}
