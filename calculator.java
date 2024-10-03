class calculator{
    static void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("c = a+b is "+c);
    }
    static void add(double a,double b)
    {
        double c;
        c=a+b;
        System.out.println("C = a+b is "+c);
    }
    public static void main(String args[]){
        //calculator cal1 = new calculator();
        add(5,8);
        add(11.2,8.9);
    }
}