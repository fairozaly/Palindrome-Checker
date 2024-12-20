import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word or a phrase: ");
        String inputText = input.nextLine().trim();
        input.close();

   
        if (inputText.isEmpty()){
            System.out.println("Invalid input.");
            return; // Exit the program if input is invalid
        }

        // Remove non-alphanumeric characters and convert to lowercase
        inputText = inputText.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
        // Initialize pointers for the start and end of the string
        int lPointer = 0; 
        int rPointer = inputText.length()-1;

        // Compare characters from both ends of the string
        while(lPointer <= rPointer){
        // If a mismatch is found, the string is not a palindrome, the program ends
        if(inputText.charAt(rPointer) != inputText.charAt(lPointer)){
            System.out.println(inputText + " is not a palindrome.");
            return;
        }
        lPointer++; // Move the left pointer to the right
        rPointer--; // Move the right pointer to the left
        }

        // If all characters match, the string is a palindrome
        System.out.println(inputText + " is a palindrome.");
    }
}