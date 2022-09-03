public class JavaHead {
    public static void main(String[] args) {


        String[] islands = new String[4];

        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int[] index = new int[4];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref = 0;
        while (y < 4) {
            ref = index[y];
            System.out.print("islands = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }


        Dog d = new Dog();
        d.size = 23;
        d.name = "Fido";
        d.bark();
        System.out.println(d.name + " is gorgeous! ");
        Dog c = d;
        c.name = " Max";
        c.size = 22;
        c.eat();
        System.out.println(c.name + " is very funny.");

        Dog [] myDogs = new Dog[3];
        myDogs[0]= new Dog();
        myDogs[1]= new Dog();
        myDogs[2]= new Dog();

        myDogs[0].name = "Fido";
        myDogs[1].name = "Max";
        myDogs[2].name = "Zeus";

        myDogs[0].age = 10;
        myDogs[1].age = 3;
        myDogs[2].age = 6;
       // int x =0;

        for (Dog myDog : myDogs) {
            myDog.bark();
        }

         for(int i =0 ;i< myDogs.length;i++){
             if(myDogs[i].name.equals("Fido")){
                 System.out.println("Is here "+myDogs[i].name);
             }
             if(myDogs[i].age >7){
                 System.out.println("The oldest   dog is "+myDogs[i].name+" is "+myDogs[i].age+ " years old!");
             }
             }




    }
}

