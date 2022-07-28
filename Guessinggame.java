import java.util.Scanner;
public class Guessinggame
{
    public static void main(String[] args) {
        
        System.out.println("Enter to the Guess a number game!");
        System.out.println("Enter your name");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();


        System.out.println("Hello"+name);
        System.out.println("Shall we beginn....");
        System.out.println("\t 1.Start the quiz");
        System.out.println("\t 2. Quit the quiz");

        int choice =sc.nextInt();

        int TryTimes=0;
        boolean finish=false;
        boolean won=false;

        while(choice!=1)
        {
            System.out.println("Shall we beginn!!!");
            System.out.println("\t 1.begin game");
            System.out.println("\t 2.drop game");
            choice=sc.nextInt();
        }
        int number=(int)(Math.random()*100+1);
    
        System.out.println("Guess a Number.... only 10 chances");
        int usrinput = sc.nextInt();
        while(!finish){
            TryTimes ++;
             if (TryTimes<10){
                if(usrinput==number){
                    won=true;
                    finish=true;
                }
                else if(usrinput>number){
                    System.out.println("Guess the lower number");
                    usrinput=sc.nextInt();
                }
                else{
                    System.out.println("Guess the higher number");
                    usrinput=sc.nextInt();
                }
            }
            else{
                finish=true;
            }    
        }
        if(won){
            System.out.println("Congratulations !!!!!!!!!!");
        }
        else{
            System.out.println("GAME OVER");
            System.out.println("The number is"+number);
        }

    }
}