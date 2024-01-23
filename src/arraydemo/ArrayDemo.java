/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author gills
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a word");
        String word = input.nextLine();

        char[] myLetters = new char[word.length()]; 

       
        for (int i = 0; i < word.length(); i++) {
            myLetters[i] = word.charAt(i); 
        }
        
     
            System.out.print("Printingin reverse");
            
            for (int i = myLetters.length - 1; i >= 0; i--) {
            System.out.println(myLetters[i]);
        }

            
            
        }  
    }
    

