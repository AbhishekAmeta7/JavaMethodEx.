public class Main2{
    public static void main(String[] args) {
        Main2 m = new Main2();
        m.neon();
        m.prime();
        m.perfect();
        m.armstrong();
        m.palindrome();
        m.factorial();
        m.fibonacci();
    }
    void neon(){
        int num = 9,ans = 0;
        int sq = num*num;
        while (sq>0) {
            int a = sq%10;
            ans = ans+a;
            sq/=10;
        }
        if(ans == num){
            System.out.println(num+" is neon number");
        }else{
            System.out.println(num+" is not neon number");
        }
    }
    void prime(){
        int num = 7,a=2,count=0;
        while(num>a){
            if(num%a==0){
                count++;
                break;
            }
            a++;
        }
        if(count==0){
            System.out.println(num+" is Prime Number");
        }else{
            System.out.println(num+" is Not Prime Number");
        }
    }
    void perfect(){
        int num = 6,a = 1,ans=0;
        while(num>a){
            if(num%a==0){
                ans = ans+a;
            }
            a++;
        }
        if(ans==num){
            System.out.println(num+" is perfect number");
        }else{
            System.out.println(num+" is not perfect number");
        }
    }
    void armstrong()
    {
        int num = 370,ans=0;
        int temp = num;
        while(num>0){
            int a = num%10;
            ans = ans+a*a*a;
            num/=10;
        }
        if(ans == temp){
            System.out.println(temp+" is armstrong number");
        }else{
            System.out.println(temp+" is not armstrong number");
        }
    }
    void palindrome(){
        int num = 370,ans=0;
        int temp = num;
        while(num>0){
            int a = num%10;
            ans = ans*10+a;
            num/=10;
        }
        if(temp==ans){
            System.out.println(temp+" is palindrome number");
        }else{
            System.out.println(temp+" is not palindrome number");
        }
    }
    void factorial(){
        int num = 5,fact=1;
        for(int i=num;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("Factorial Of "+num+" is: "+fact);
    }
    void fibonacci(){
        int num=5,a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i = 1;i<=num;i++){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
/*class Main 
neon()
prime()
perfect()
Armstrong()
palindrome()
factorial()
Fibonacci()
access method */
