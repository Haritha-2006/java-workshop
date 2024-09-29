import java.util.Scanner;
//import javax.sound.sampled.SourceDataLine;
    interface human
    {
        void display();
    }
    class parent1 implements human{
        void display1(){
            System.out.println("This is parent class");
        }
        void display(){
            System.out.println("this is human");
        }
    }
    class child1 implements human{
        void display2(){
            System.out.println("This is child class");
        }
    }
class overriding{
    public static void main(String args[]){
        child obj = new child();
        obj.display1();
        obj.display2();
    }
}
