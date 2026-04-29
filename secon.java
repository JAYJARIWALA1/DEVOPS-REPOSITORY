import java.util.Scanner;
public class secon {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 
int sum =0;
   for (int i = 1; i <= 100; i++) {
         sum +=i;
      System.out.println("sum  " + sum);
   }

   int num = sc.nextInt();
    evenodd(num);

    }
   static void evenodd(int num){
        if(num%2==0){
         System.out.println("evern number" + num);
        }
        else{
            System.out.println("odd number" +num);
        }

    }
}


