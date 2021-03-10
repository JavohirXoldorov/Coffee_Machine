//public class Main {
//
//}
class Cat {
    // write static and instance variables

    String name;
    int age;
    public static int count;

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        count++;
        if(count > 5){
            System.out.println("You have too many cats");
        }
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return count;
    }
}
