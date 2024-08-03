class A{
    void add(){
        int a = 40,b=30;
        int c = a+b;
        System.out.println("Add: "+c);
    }
}
class B{
    void sub(){
        int a = 100,b=30;
        int c = a-b;
        System.out.println("sub: "+c);
    }
}
class C{
    void multi(){
        int a = 4,b=30;
        int c = a*b;
        System.out.println("Multi: "+c);
    }
}
class D{
    void div(){
        int a = 40,b=10;
        int c = a/b;
        System.out.println("Div: "+c);
    }
}
public class Main1{
    public static void main(String[] args) {
        A a1 = new A();
        a1.add();
        B b1 = new B();
        b1.sub();
        C c1 = new C();
        c1.multi();
        D d1 = new D();
        d1.div();
        Main1 m = new Main1();
        m.mod();
    }
    void mod(){
        int a = 40,b=30;
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
access method*/