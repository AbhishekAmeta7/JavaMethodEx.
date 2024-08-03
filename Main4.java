class A{
    void add(int a,int b){
        int c = a+b;
        System.out.println("Add: "+c);
    }
    void sub(int a,int b){
        int c = a-b;
        System.out.println("Sub: "+c);
    }
    void multi(int a,int b){
        int c = a*b;
        System.out.println("Multi: "+c);
    }
    void div(int a,int b){
        int c = a/b;
        System.out.println("Div: "+c);
    }
    void mod(int a,int b){
        int c=a%b;
        System.out.println("Mod: "+c);
    }
}
public class Main4{
    public static void main(String[] args) {
        A p = new A();
        p.add(50,60);
        p.sub(100,40);
        p.multi(20,10);
        p.div(100,5);
        p.mod(10,9);
    }
}
/*single class class A
add()
sub()
multi()
div()
mod()
classMain :
access method */