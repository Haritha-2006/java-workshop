import java.util.Scanner;
class employee{
    Scanner S = new Scanner(System.in);
    String name;
    int age;
    public String getname(){
        System.out.println("Enter your name :");
        name= S.nextLine();
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        System.out.println("Enter your age :");
        age = S.nextInt();
        return age;
    }
    public void setage(int age){
        if(age<18){
            System.out.println("You are not eligible");
        }
        else{
                this.age=age;
        }
    }
}
public class demo{
    public static void main(String[] args){
    employee emp1 = new employee();
    employee emp2 = new employee();
    emp1.setname("haritha");
    emp1.setage(18);
    System.out.println("Name :"+emp1.name);
    System.out.println("Age :"+emp1.age);
    emp2.getname();
    emp2.getage();
    System.out.println("Name2 :"+emp2.name);
    System.out.println("Age2 :"+emp2.age);
    }
}