//import any?
import java.util.*;

public class apint{

    //array to store numbers or vector, check if you can use Vectors
    public char ap_array[] = new char[100000000];

    //default constructor
    public apint(){
        this.ap_array = null;
        System.out.println("default constructor, apint created");
    }

    //constructor using strings
    public apint(String s){
        
        for(int i = 0; i < s.length(); i++){
            ap_array[i] = s.charAt(i);
            char c = s.charAt(i);
          //  System.out.println(c);
        }
       

    }

    //constructor for conversion of ints
    public apint(int convert){

    }

    //constructor for conversion of reals that truncates the fractional part



    //method to print
    public void print(){
        for(int i = 0; i < ap_array.length; i++){
            System.out.print(ap_array[i]);

        }
    }


    //methods for addition, subtraction, multiplication and division


    //main
    public static void main(String args[]){

        //testing for default constructor
        apint a = new apint();

        apint b = new apint();

        //testing for constructor using strings
        String number = "-11030";
        String n1 = "+33335";

        apint d = new apint(n1);

        apint c = new apint(number);

        
        d.print();

       

    }
    
}