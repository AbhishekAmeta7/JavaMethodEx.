class A{
    void add(){
        int a = 10,b=20;
        int c = a+b;
        System.out.println("Add: "+c);
    }
    void sub(){
        int a = 29,b=22;
        int c = a-b;
        System.out.println("Sub: "+c);
    }
    void multi(){
        int a = 10,b=20;
        int c = a*b;
        System.out.println("Multi: "+c);
    }
    void div(){
        int a = 20,b=10;
        int c = a/b;
        System.out.println("Div: "+c);
    }
    void mod(){
        int a = 20,b=3;
        int c=a%b;
        System.out.println("Mod: "+c);
    }
}
public class Main{
    public static void main(String[] args) {
        A p = new A();
        p.add();
        p.sub();
        p.multi();
        p.div();
        p.mod();
    }
}
/*single class class A

add()
sub()
multi()
div()
mod()

classMain :
access method*/