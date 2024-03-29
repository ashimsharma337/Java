
public class Conditional {

    public static void main(String[] args) {

                     //...if else

        // int x = 28;
                            // if there is there is one statement inside if we don't need curly bracket.
        // if(x>10) 
        //  System.out.println("Hello");
        // if(true) // works
        // if(false) // does not execute
        // System.out.println("It is true..");

        // if(x>10 && x<=20) // Accepted value is 11-20(including 20)
        //   System.out.println("Hello");
        
        // System.out.println("Bye");

        // using if and else together (if can be alone else can not be)
        
        // if(x>10 && x<=20) 
        //   System.out.println("Hello");
        // else 
        //   System.out.println("Bye");

        // another example

        // int x = 5;
        // int y = 7;

        //To print the greatest number 

        // if(x>y)
        //    System.out.println(x);
        // else
        //    System.out.println(y);

        // if(x<y) {
        //    System.out.println(x);     // If there are multiple statement we need curly bracket  
        //    System.out.println("Thank you!");  // Prints 5 and thank you.

        // }
        // else
        //    System.out.println(y);

                 // if else with three value

        // int x = 8;
        // int y = 7;
        // int z = 9;

                 // to print the greatest of three value

        // if(x>y && x>z) {
        //    System.out.println(x);       
        //    System.out.println("Thank you!");  
        // }
        // else if(y>z) {
        //    System.out.println(y);
        // }
        // else {
        //     System.out.println(z);
        // }

        //Print 10 if the n is even and print 20 if n is odd
        //int n = 6;
        // int n = 5;
        // int result = 0;

        // if(n%2==0)
        //     result = 10;
        // else
        //     result = 20;

        //using ternary operator

        // ?:
        // result = n%2==0 ? 10 : 20;
        
        // System.out.println(result);

        //switch statement

        // int n = 1;
        // based on the value of n print days
        //using if else
        // if(n==1)
        // System.out.println("Monday");
        // else if(n==2)
        // System.out.println("Tuesday");
        // else if(n==3)
        // System.out.println("Wednesday");
        // else if(n==4)
        // System.out.println("Thursday");
        // else if(n==5)
        // System.out.println("Friday");
        // else if(n==6)
        // System.out.println("Saturday");
        // else
        // System.out.println("Sunday");

        //using switch case
        
        int n =8;
        
        switch(n){
            case 1:
                System.out.println("Monday"); // without break everything will print after match
                break;                        // recently in advanced java version we can skip break  
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:      //if non of the case matches use default
                System.out.println("Enter a valid number!");
        }

    }
}