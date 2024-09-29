class parent{
    public void display(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    public void display(){
        System.out.println("Child class");
    }
}
public class runtime{
    public static void main(String args[])
    {
        parent obj1 = new child();
        obj1.display();
    }
}
