import java.util.*;

public class Anagram{

    public char anagrams[] = null;

    //a datatype for computed code of the word


    //constructor which uses a string as an input argument
    Anagram(String input){

        //converts string to char[] array
        char[] chars = input.toCharArray() ;

        //copy char array into ADT char array
        anagrams = Arrays.copyOf(chars, chars.length);

    }


    //constructor which uses char array as an input argument
    Anagram(char[] arr){

        anagrams = Arrays.copyOf(arr, arr.length);

    }


    //print method
    void print(){
        for (char ch : anagrams) {
            System.out.print(ch);
        }
        System.out.println("\n");
    }

    //method to compare 2 Anagrams that returns true or false
   // boolean compareAnagram(Anagram a, Anagram b){


    //}


    //method that returns the word part of an Anagram variable
    char[] returnWord(Anagram a){
        return a.anagrams;
    }
    
}