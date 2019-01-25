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


    //methods for addition
    public static apint addAPint(apint a , apint b){
        int carry = 0;
        int val = 0;
        int entry = 0;
        
       // boolean neg = false;

        int len1 = a.ap_array.length;
        int len2 = b.ap_array.length;
        int len = Math.max(len1, len2);
        
        System.out.println(len1);
        System.out.println(len2);


        int i = len1 - 1;
        int j = len2 - 1;
        int k = len - 1;

        //new apint where the sum will be stored
        apint c = new apint();
        c.ap_array = new char[len]; //double check this
       

        //while loop
        while( i >= 0 || j >= 0){
                val = 0;
            
            if(i >=0) {
                
                val+= Character.getNumericValue(a.ap_array[i]);
                i--;
            }

            if(j >=0){
                val+= Character.getNumericValue(b.ap_array[j]);
                j--;
            }

            val+= carry;

            carry = val/10; //exception? if val = 0

            entry = val%10;

          //  System.out.println(entry);

            char num = (char)entry;

            System.out.println(num);            

            c.ap_array[k] = num;   
            System.out.println("K = " + k + " val = "  + c.ap_array[k]);
            k--;

        }
        



        

      //  c.print();



        return c;
    }
    
    
    
    
    
    
    
    
    //subtraction
    
    
    
    
    
    
    
    //multiplication 
    
    
    
    
    
    //division


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

        // +233 + -34

        // -285 + +2333

        // 64 + 85

        int a1 = 874;
        int a2 = 69;

        apint m = new apint(a1);

        apint n = new apint(a2);

        

        addAPint(m, n);

       // mn = 

        

        //mn.print();

       

    }
    
}