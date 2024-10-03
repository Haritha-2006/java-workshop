class Sum{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}

public class demo4 {
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        Sum obj2 = new Sum();
        System.out.println(obj1.add(5,9));
        System.out.println(obj2.add(2.5,6.2));
    }
}
