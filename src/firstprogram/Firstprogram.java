
package firstprogram;

import java.util.Scanner;

public class Firstprogram {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        
        String word = input.next();
        
        char[] list = new char[word.length()];
        
        
        for (int i=0; i < word.length(); i++){
            list[i] = word.charAt(i);
        }
        
        for (int i= list.length -1 ; i >= 0; i--){
            System.out.println("Letter is: " + list[i]);
        }
    }
    
}
