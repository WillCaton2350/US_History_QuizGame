// First we have to import the Scanner from Java's utilities package
// Then we have to create the class object and name it Main{}
// Inside the Main class we have the main method and the Scanner constructor method
// a double is a float
// Next we call the States and set values to variables
// Now we print the question and answers to the screen using sysout
// Now we call the data type that the Scanner with be receiving, set a variable to the data type amd set that = to (the name of the scanner) 
// using dot notation we can connect the (name of the scanner) the nextLine() java String Method 
// Under that we write an if statement stating that if the nextLine() variable name is equal to (using .equals(d)) the pass the correct answer in the .equals() parameters
// Write an else statement that prints incorrect
// Do this for 5 questions
// Now we have an equation that prints the score in a percentage value 
// This equation will print as a double/float so first call the double data type and give it a variable name
// set this variable name = to (100% * numCorrect) / totalQuestions
/*
    This takes the score object and sets it equal to the maximum percentage you can get on the test and
    multiplys it by the number of question you got correct in parenthases.
    Now take the number of questions * the max percentage and divide that by the total number of questions in the quiz
*/
// Finally print the score


// SOURCE CODE
import java.util.Scanner; 
public
class Main{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int numCorrect = 0;
            int totalQuestions = 5;

            System.out.println();
            System.out.println("Welcome to the Civil War quiz game");
            System.out.println("This is a multiple choice quiz and your answers should be given in (a, b, c, d) format.");
            // Question 1
            System.out.println();
            System.out.println();
            System.out.println("QUESTION 1");
            System.out.println();
            System.out.println("choose the correct percentage of the U.S. population were killed in the Civil War");
            System.out.println();
            System.out.println("[a] 5%");
            System.out.println("[b] 10%");
            System.out.println("[c] 0.7%");
            System.out.println("[d] 2%");
            System.out.println();

            // Behaviors

            String answer = input.nextLine();
            if(answer.equals("d")){
                System.out.println();
                System.out.println("Correct"); 
                numCorrect += 1;
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Incorrect");
                System.out.println();
            }

            // Question 2
            System.out.println();
            System.out.println("QUESTION 2");
            System.out.println();
            System.out.println("How how long did slavery last after the civil war?");
            System.out.println();
            System.out.println("[a] 10 years");
            System.out.println("[b] 8 years");
            System.out.println("[c] 2 years");
            System.out.println("[d] 15 years");
            System.out.println();

            answer = input.nextLine();
            if(answer.equals("b")){
                System.out.println();
                System.out.println("Correct"); 
                numCorrect += 1;
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Incorrect");
                System.out.println();
            }
            // Question 3
            System.out.println();
            System.out.println("QUESTION 3");
            System.out.println();
            System.out.println("When was slavery officially abolished? (Officially Ratified by Congress)");
            System.out.println();
            System.out.println("[a] Jan 31st 1865");
            System.out.println("[b] Jan 1st 1860");
            System.out.println("[c] Dec 6th 1865");
            System.out.println("[d] Nov 8th 1865");
            System.out.println();

            answer = input.nextLine();
            if(answer.equals("c")){
                System.out.println();
                System.out.println("Correct"); 
                numCorrect += 1;
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Incorrect");
                System.out.println();
            }
            // Question 4
            System.out.println();
            System.out.println("QUESTION 4");
            System.out.println();
            System.out.println("Which general was not apart of the civil war");
            System.out.println();
            System.out.println("[a] Ulysses S. Grant");
            System.out.println("[b] Douglas MacArthur");
            System.out.println("[c] Winfield Scott");
            System.out.println("[d] Robert E. Lee");
            System.out.println();

            answer = input.nextLine();
            if(answer.equals("b")){
                System.out.println();
                System.out.println("Correct"); 
                numCorrect += 1;
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Incorrect");
                System.out.println();
            }
            // Question 5
            System.out.println();
            System.out.println("QUESTION 5");
            System.out.println();
            System.out.println("How long did the civil war last?");
            System.out.println();
            System.out.println("[a] 4 years");
            System.out.println("[b] 5 years");
            System.out.println("[c] 8 years");
            System.out.println("[d] 3 years");
            System.out.println();

            answer = input.nextLine();
            if(answer.equals("a")){
                System.out.println();
                System.out.println("Correct"); 
                numCorrect += 1;
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Incorrect");
                System.out.println();
            }
            

            double score = (100 * numCorrect) / totalQuestions;
            System.out.println("You Scored " + score + "%");
        }

        System.out.println();




    }












}