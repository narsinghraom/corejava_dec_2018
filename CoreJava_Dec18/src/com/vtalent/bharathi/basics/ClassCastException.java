package tasks;



class Parent {
    public Parent() {
        System.out.println("An instance of the Parent class was created!");
    }
}
 
final class Child extends Parent {
    public Child() {
        super();
        System.out.println("An instance of the Child class was created!");
    }
}
 
public class ClassCastException {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child ch = new Child();
        //ch = p; //This statement is not allowed.
    }
}




