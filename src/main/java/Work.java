import java.util.Optional;

public class Work {
    public static void main(String[] args) {

     /*   int[] nums;  // declar an int array variable;

        // Creat a  new array - with length  of 7 . and assign it to previously

        nums = new int[7]; // am assignat 7 elemente array ului declart.

        //Give each element in  the array an int value

        nums[0] = 6;         // 7 variabilie de tip int
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;


        Dog[] pets;  // am declarat un array variabil
        pets = new Dog[7]; // am creat un array nou de marimea a 7 elemente
        pets[0] = new Dog(); // am creat un obiect  nou Dog si l am asignat la array
        pets[1] = new Dog();
        pets[2] = new Dog();  // elementul 3  . value null
        pets[3] = new Dog();  //
        pets[4] = new Dog();
        pets[5] = new Dog();
        pets[6] = new Dog();    // acum sunt 7  obiecte Dog
        //  pets [3] = pets[1];

        Dog fido = new Dog();
        fido.name = "Fido";

        System.out.println(fido.name);
        fido.bark();
        fido.eat();


        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Fido";
        myDogs[0].bark(); */
/*
        Test[] humans = new Test[3];
        humans[0] = new Test();
        humans[1] = new Test();
        humans[2] = new Test();


        humans[0].name = "Aurel";
        humans[1].name = "Mircea";
        humans[2].name = "Sorin";


        humans[0].age = 16;
        humans[1].age = 35;
        humans[2].age = 36;

        humans[0].location = "Iasi";
        humans[1].location = "Brasov";
        humans[2].location = "Bucuresti";

        String capital = "Bucuresti";
/*

         boolean isFromCapital = true;
        //int x = 0;
        for (Test human : humans) {
            human.walk();
            // System.out.println(humans[x]);
       }
        System.out.println(humans.length);
        if (humans[0].equals(humans[1])) {
            System.out.println("is true");
        } else {
            System.out.println("FALSE!");
        }
        for (int i = 0; i < humans.length; i++) {// care este mai mare de varsta si care este minor
            System.out.println(humans[i].age);
            if (humans[i].age > 30) {
                System.out.println(humans[i].name + " is " + humans[i].age + " years old");
            } else if (humans[i].age < 18) {
                System.out.println(humans[i].name + " is  underage and is not allowed in ");
            }
        }
//sa aflam care sta in Bucuresti
        for (int i = 0; i < humans.length; i++) {
            //  humans[i].setTheLocation();
            if (capital.equals(humans[i].location)) {
                System.out.println(humans[i].name + " is from Bucuresti!");
            }

        }
*/
        Playground d = new Playground();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare) {
            d.playSnare();
        }
    }
}


