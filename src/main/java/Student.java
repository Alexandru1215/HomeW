public class Student {
    private String fname;
    private String lname;
    private int minimAge;

    public Student() {

    }

   public String getFname() {
        return fname;
    }

    void setFname(String fname) {
        this.fname = fname;
    }

    public  String getLname() {
        return lname;
    }

    void setLname(String lname) {
        this.lname = lname;
    }

    public  int getMinimAge() {
        return minimAge;
    }

    void setAge(int age) {
        if (age > 18) {
            minimAge = age;
        } else {
            System.out.println("Underage is not allowed!");
        }
    }

    void welcomeStudent() {
        System.out.println("Welcome in new year " + fname + " " + lname);
    }

}
