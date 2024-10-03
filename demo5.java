class parent{
    void show(){
        System.out.println("This isparent class");
    }
    }
class child extends parent{
    void show(){
        System.out.println("This is child class");
    }
}

public class demo5 {
    public static void main(String[] args) {
        parent objs = new child();
        objs.show();
    }
}
