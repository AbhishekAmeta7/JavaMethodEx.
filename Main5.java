class A{
    void add(int a,int b){
        int c = a+b;
        System.out.println("Add: "+c);
    }
}
class B{
    void sub(int a,int b){
        int c = a-b;
        System.out.println("sub: "+c);
    }
}
class C{
    void multi(int a,int b){
        int c = a*b;
        System.out.println("Multi: "+c);
    }
}
class D{
    void div(int a,int b){
        int c = a/b;
        System.out.println("Div: "+c);
    }
}
public class Main5{
    public static void main(String[] args) {
        A a1 = new A();
        a1.add(33,22);
        B b1 = new B();
        b1.sub(55,44);
        C c1 = new C();
        c1.multi(60,4);
        D d1 = new D();
        d1.div(300,30);
        Main5 m = new Main5();
        m.mod(50,6);
    }
    void mod(int a,int b){
        int c = a%b;
        System.out.println("mod: "+c);
    }
}
/*class A
add()

class B 
sub()

class C
multi()

class D
div()

class Main 
mod()
access method */