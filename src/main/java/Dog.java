public   class Dog {

    String name;
    String breed;
    int size;
    int age;
        public Dog(){

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void bark() {
        System.out.println(name + " says Ruff , Ruff !!");
    }

    void eat() {
        System.out.println("My dog " + name + " love meat.");
    }

    void chaseCat() {
        System.out.println("My dog love to chase cats, but for fun just!");
    }

    public   int getBack (byte x  , byte y){

        return x +y ;
    }

}

