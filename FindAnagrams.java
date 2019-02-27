import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FindAnagrams{

  
    public static void main(String[] args) throws FileNotFoundException{

        HashMap<Character, Integer> lettercode = new HashMap<Character, Integer>();

        lettercode.put('a', 1);
        lettercode.put('b', 3);
        lettercode.put('c', 7);
        lettercode.put('d', 13);
        lettercode.put('e', 19);
        lettercode.put('f', 29);
        lettercode.put('g', 37);
        lettercode.put('h', 43);
        lettercode.put('i', 53);
        lettercode.put('j', 61);
        lettercode.put('k', 71);
        lettercode.put('l', 79);
        lettercode.put('m', 89);
        lettercode.put('n', 97);
        lettercode.put('o', 103);
        lettercode.put('p', 113);
        lettercode.put('q', 127);
        lettercode.put('r', 137);
        lettercode.put('s', 143);
        lettercode.put('t', 151);
        lettercode.put('u', 161);
        lettercode.put('v', 167);
        lettercode.put('w', 173);
        lettercode.put('x', 181);
        lettercode.put('y', 191);
        lettercode.put('z', 203);

        //HASHMAP TO STORE ALL WORDS FROM FILE

        HashMap<Integer, ArrayList<String>> anagramcode = new HashMap<Integer, ArrayList<String>>();

        //read input file wordList.txt word by word
        File wordList = new File("wordList.txt");
        Scanner input = new Scanner(wordList);

        boolean isKeyPresent = false;
        int counter = 0;
        while(input.hasNext()){
           
            //take the word, compute code for it, and store in hash table
            String file_word = input.next();

            //if code already exists as key, add that word to that key
            int code = codewordGenerator(file_word, lettercode);
            if(anagramcode.containsKey(code)){
                anagramcode.get(code).add(file_word);
                
                
            }
            else{
                ArrayList<String> anagram_words = new ArrayList<>();
                anagram_words.add(file_word);
                anagramcode.put(code, anagram_words);
            }  
            
        }

        //**********MAIN PROGRAM************************** */
            
            
            Scanner sc = new Scanner(System.in);
            System.out.println("\nType a string of letters: ");
            String input_word = sc.nextLine();

            int code_word = codewordGenerator(input_word, lettercode);

            if(anagramcode.containsKey(code_word)){
                ArrayList<String> results = anagramcode.get(code_word);  
                int winner_list = results.size(); 
                for(int index = 0; index < winner_list ; index++){
                    if(results.get(index).equals(input_word)){
                        ;
                    }
                    else{
                       System.out.println(results.get(index));
                    }
                }
                //System.out.println(anagramcode.get(code_word));
            }
            else{
                System.out.println("There are no anagrams for this word");
            }

            boolean isItToBeRunAgain = true;


            while(isItToBeRunAgain = true){
                Scanner yn = new Scanner(System.in);
                System.out.println("\nDo another (y/n) ?");
                String decision = yn.nextLine();

                //check if another prompt or not
                if(decision.equals("y")){
                Scanner another_one = new Scanner(System.in);
                System.out.println("\nType a string of letters: ");
                String query = another_one.nextLine();

                int codelist = codewordGenerator(query, lettercode);

                if(anagramcode.containsKey(codelist)){
                    ArrayList<String> results2 = anagramcode.get(codelist);  
                     int winner_list2 = results2.size(); 
                    for(int i = 0; i < winner_list2 ; i++){
                        if(results2.get(i).equals(query)){
                            ;
                        }
                        else{
                        System.out.println(results2.get(i));
                        }
                    }
                }
                else{
                    System.out.println("There are no anagrams for this word");
                }
                }
                else if(decision.equals("n")){
                    System.exit(100);
                    System.out.print("\n");
                }
            }




    //tests for string input constructor
    String s1 = "Excellence";
    String s2 = "AesTHetic";
    Anagram a1 = new Anagram(s1);
    Anagram a2 = new Anagram(s2);

    //  a1.print();
    //  a2.print();


    //tests for char array input constructor
    char [] c1 = {'c', 'h', 'e', 'e', 'r', 's'};
    char [] c2 = {'w', 'i', 't', 'h', 'v', 'e', 'e', 'r', 's'};

    Anagram a3 = new Anagram(c1);
    Anagram a4 = new Anagram(c2);

      //  a3.print();
      //  a4.print();
    }


    static int codewordGenerator(String word, HashMap<Character, Integer> a){
        int codename = 0;
        for(int i = 0; i < word.length(); i++){
            codename += a.get(word.charAt(i));
            int ascii = word.charAt(i);
            codename+= (ascii * ascii) * word.length();
        }
        codename = codename * word.length();
        return codename;
    }
}