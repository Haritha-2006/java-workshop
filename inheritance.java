//class inheritance{
    interface A{
        public void display1();
    }
    interface B{
       public void display2();
    }
    class C implements A,B{
        public void display1(){
            System.out.println("This is A");
        }
        public void display2(){
            System.out.println("This is B");
        }
    }
class inheritance{
    public static void main(String args[]){
        C obj1 = new C();
        obj1.display1();
        obj1.display2();
    }

}