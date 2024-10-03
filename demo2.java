class Icecream{
    Icecream(){
        System.out.println("Welcome");
    }
    Icecream (int a){
        System.out.println("This is chocolate flavour");
        System.out.println("no. of icecream :"+a);
    }
}

public class demo2 {
    public static void main(String[] args) {
        Icecream h1 = new Icecream(2);
        //Icecream.h1(2);
    }
}
