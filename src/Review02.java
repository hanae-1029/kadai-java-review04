
public class Review02 {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
         // 3の倍数且つ、5の倍数の場合   
        if(i % 3 == 0 && i % 5 == 0) {
             System.out.println("FizzBuzz");
             // 3の倍数の場合
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
              // 5の倍数の場合  
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
              // どれでもない場合
            } else {
                System.out.println(i);
            }
            }

        }

    }
  
        
        
       
    

    


