import java.util.Scanner;
public class Multiple_Choice
{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String ques = "This is a sample question??";
        String Choiceone = "1. Choice 1";
        String choicetwo = "2. Choice 2";
        String choicethree = "3. Choice 3";
        String correct = choicetwo;
        String option = "None";
        boolean repeat = true;
         while(repeat){
        System.out.println("Choose any of the option below out of (1/2/3)");
        System.out.println(ques);
        System.out.println(Choiceone);
        System.out.println(choicetwo);
        System.out.println(choicethree);
        
        int choice = input.nextInt();
        
       
            
        
        if(choice == 1){
            option = Choiceone;
            
        
    }
        else if(choice==2){
            option = choicetwo;
}
        else if(choice==3){
            option = choicethree;
        }
        else{
            System.out.println("Invalid choice");
        }
        if(option==correct){
            System.out.println("Congrats, You answer is correct");
            repeat = false;
        }
        else if(option == "None"){
            System.out.println("Choose (1/2/3) from the given options");
            System.out.println("Do you want to try again? (Press 1 for Yes or press 2 for No)");
            int try_again = input.nextInt();
            if(try_again == 1){
                repeat = true;
            }
            else{
                repeat = false;
            }
        }
        else{
            System.out.println("Your answer is incorrect");
            System.out.println("You chose" + " " + option);
            System.out.println("Do you want to try again? (Press 1 for Yes or press 2 for No)");
            int try_again = input.nextInt();
                        if(try_again == 1){
                repeat = true;
            }
            else{
                repeat = false;
                System.out.println("Correct answer is" + " " + correct);
        }
            
    }}}}
        
            
            
