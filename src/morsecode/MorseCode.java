/*
  * Jared Craig
 * 12/09/2018
 * Converts sentences or words to morse code
 */

package morsecode;
import javax.swing.*;
/**
 *
 * @author jacra1226
 */
public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word or sentence");
        String word2 = word.toUpperCase();
        for (String s : word2.split("")) { //splits the word into seperate letters
            if(s.equals("A")){
    System.out.println(".-");
    
            }
            else if(s.equals("B")){
    System.out.println("-…");
    
            }
            else if(s.equals("C")){
    System.out.println("-.-.");
    
            }
            else if(s.equals("D")){
    System.out.println("-..");
    
            }
            else if(s.equals("E")){
    System.out.println(".");
    
            }
            else if(s.equals("F")){
    System.out.println("..-.");
    
            }
            
            else if(s.equals("G")){
    System.out.println("--.");
    
            }
            else if(s.equals("H")){
    System.out.println("….");
    
            }
            else if(s.equals("I")){
    System.out.println("..");
    
            }
            else if(s.equals("J")){
    System.out.println(".---");
    
            }
            else if(s.equals("K")){
    System.out.println("-.-");
    
            }
            else if(s.equals("L")){
    System.out.println(".-..");
    
            }
            else if(s.equals("M")){
    System.out.println("--");
    
            }
            else if(s.equals("N")){
    System.out.println("-.");
    
            }
            else if(s.equals("O")){
    System.out.println("---");
    
            }
            else if(s.equals("P")){
    System.out.println(".--.");
    
            }
            else if(s.equals("Q")){
    System.out.println("--.-");
    
            }
            else if(s.equals("R")){
    System.out.println(".-.");
    
            }
            else if(s.equals("S")){
    System.out.println("…");
    
            }
            else if(s.equals("T")){
    System.out.println("-");
    
            }
            else if(s.equals("U")){
    System.out.println("..-");
    
            }
            else if(s.equals("V")){
    System.out.println("…-");
    
            }
            else if(s.equals("W")){
    System.out.println(".--");
    
            }
            else if(s.equals("X")){
    System.out.println("-..-");
    
            }
            else if(s.equals("Y")){
    System.out.println("-.--");
    
            }
            else if(s.equals("Z")){
    System.out.println("--..");
    
            }
            else if(s.equals("1")){
    System.out.println(".----");
    
            }
            else if(s.equals("2")){
    System.out.println("..---");
    
            }
            else if(s.equals("3")){
    System.out.println("…--");
    
            }
            else if(s.equals("4")){
    System.out.println("….-");
    
            }
            else if(s.equals("5")){
    System.out.println("…..");
    
            }
            else if(s.equals("6")){
    System.out.println("-….");
    
            }
            else if(s.equals("7")){
    System.out.println("--…");
    
            }
            else if(s.equals("8")){
    System.out.println("---..");
    
            }
            else if(s.equals("9")){
    System.out.println("----.");
    
            }
            else if(s.equals("0")){
    System.out.println("-----");
    
            }
            
              else if(s.equals(" ")){
    System.out.println("");
    
            }
}

        
        
    }
    
}
