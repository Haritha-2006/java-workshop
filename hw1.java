public class hw1 {
        static class A{
            public void A_display(){
                System.out.println("This is class A");
            }
        }
        static class B extends A{
            public void B_display(){
                System.out.println("This is class B");
            }
        }
        static class C extends A{
            public void C_display(){
                System.out.println("This is class C");
            }
        }
        static class D extends A{
            public void D_display(){
                System.out.println("This is class D");
            }
        }
        public static void main(String[] args) {
            A obj1 = new A();
            obj1.A_display();
            System.out.println();
    
            B obj2 = new B();
            obj2.A_display();
            obj2.B_display();
            System.out.println();
    
            C obj3 = new C();
            obj3.A_display();
            obj3.C_display();
            System.out.println();
    
            D obj4 = new D();
            obj4.A_display();
            obj4.D_display();
    
        }
}
