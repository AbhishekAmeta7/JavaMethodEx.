import java.util.Scanner;
public class Main3{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String: ");
       String name = sc.next();
       Main3 m = new Main3();
       if(name.equals("neon"))
          m.neon();
       else if(name.equals("prime"))
          m.prime();
       else if(name.equals("perfect"))
          m.perfect();
       else if(name.equals("armstrong"))
          m.armstrong();
       else if(name.equals("palindrome"))
          m.palindrome();
       else if(name.equals("factorial"))
          m.factorial();
       else if(name.equals("fibonacci"))
          m.fibonacci();
       else
          System.out.println("Invalid Choice");               
    }
         void neon(){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int ans = 0;
            int sq = num*num;
            while(sq>0) {
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
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int a=2,count=0;
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
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int a = 1,ans=0;
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
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int ans=0;
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
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int ans=0;
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
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int fact=1;
            for(int i=num;i>=1;i--){
                fact = fact*i;
            }
            System.out.println("Factorial Of "+num+" is: "+fact);
        }
        void fibonacci(){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int a=0,b=1;
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

access method 
enter string 

neon :neon method call*/