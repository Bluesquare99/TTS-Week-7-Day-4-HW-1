public class Pet {

    // Declared four instance variables
    private String name;
    private int age;
    private String location;
    private String type;

    // An empty constructors
//    public empty(){
//
//    }

    // A constructor with all attributes above
    // I can go back and put in "this." before each variable name
    public Pet(String petName, int petAge, String petLocation, String petType) {
        name = petName;
        age = petAge;
        location = petLocation;
        type = petType;
    }

    // Three get methods for name, age, location
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getType(){
        return type;
    }

    // Three set methods for  name, age, location
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setLocation(String newLocation){
        location = newLocation;
    }

}
