//import any?
import java.util.*;

public class apint{

    //array to store numbers or vector, check if you can use Vectors
    public char ap_array[] = null;


    //default constructor
    public apint(){
        this.ap_array = null;
        System.out.println("default constructor, apint created");
    }

    //constructor using strings
    public apint(String s){
        ap_array = new char[s.length()];  //initializing array
        for(int i = 0; i < s.length(); i++){
            ap_array[i] = s.charAt(i);
          
        }
       

    }

    //constructor for conversion of ints
    public apint(int convert){

        String num = Integer.toString(convert);
        ap_array = new char[num.length()];

        for(int i = 0; i < num.length(); i++){
            ap_array[i] = num.charAt(i);
        }

    }

    //constructor for conversion of reals that truncates the fractional part
    public apint(double d){
        int value = (int)d;

        String num = Integer.toString(value);
        ap_array = new char[num.length()];

        for(int i = 0; i < num.length(); i++){
            ap_array[i] = num.charAt(i);
        }
        
    }



    //method to print
    public void print(){

        for(int i = 0; i < ap_array.length; i++){
            System.out.print(ap_array[i]);

        }
        System.out.println("\n");
      
    }


    //methods for addition, subtraction, multiplication and division


    //main
    public static void main(String args[]){

        //testing for default constructor
        apint a = new apint();

        apint b = new apint();

        //testing for constructor using strings
        String number = "-11030";
        String n1 = "+3333532974923479234792374294729";

        apint d = new apint(n1);

        apint c = new apint(number);


        //testing for conversion of ints
        int s1 = 899868686;
        int s2 = 69;

        apint e = new apint(s1);

        e.print();

        apint f = new apint(s2);

        f.print();


        //testing for conversion of reals that truncates fractional part

        double d1 = 64.34343;

        double d2 = 233454.3455;
        
        apint g = new apint(d1);

        apint h = new apint(d2);

        g.print();

        h.print();



        
        //testing for print method
        d.print();
        c.print();



        //testing for adding two apints

       

    }
    
}