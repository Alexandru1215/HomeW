
public class Test {
    public static void main(String[] args) {

/*
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        myDogs[0].name = "Max";
        myDogs[1].name = "Fido";
        myDogs[2].name = "Killer";

        myDogs[0].age = 40;
        myDogs[1].age = 22;
        myDogs[2].age = 12;


        System.out.println();

        int ageMax = 25;
        for (Dog myDog : myDogs) {
            myDog.bark();
        }
        for (Dog myDog : myDogs) {

            if (myDog.age > ageMax) {
                System.out.println(myDog.name + " is the oldest and is " + myDog.age + " years old.");
            } else if (myDog.age < ageMax) {
                System.out.println(myDog.name + " is " + myDog.age + " years old.");
            }
        }
*/


        Student[] newS1 = new Student[3];
        newS1[0] = new Student();
        newS1[1] = new Student();
        newS1[2] = new Student();
        newS1[0].setFname("Alex");
        newS1[0].setFname("Bebe");
        newS1[1].setFname("Mariuks");
        newS1[1].setFname("Sorinsky");
        newS1[2].setFname("Bebikis");
        newS1[2].setFname("Voleksvlad");
        System.out.println(newS1[0].getMinimAge());
        System.out.println(newS1[1].getMinimAge());
        System.out.println(newS1[2].getMinimAge());


        int x = 0;
        while (x < 3) {
            newS1[x].welcomeStudent();
            x += 1;
        }


        System.out.println(newS1[0].getMinimAge());
        System.out.println(newS1[1].getLname());
        System.out.println(newS1[2].getMinimAge());

        Student s1 = new Student();
        s1.setFname("Ion");
        s1.setAge(13);
        s1.setLname("Carbune");
        System.out.println(s1.getMinimAge());
        System.out.println(s1.getFname());
        System.out.println(s1.getLname());
        System.out.println(s1.getFname() + " " + s1.getLname() + " " + s1.getMinimAge());


        //System.out.println(s1.getMinimAge());


    }
}
