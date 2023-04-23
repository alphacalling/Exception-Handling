import java.util.Scanner;

//Arithmatic Exception

/*public class errors {
    public static void main(String[] args) {
        int a=10, b=0, c;
        c=a/b;
        System.out.println(c);

        System.out.println("main function ended");
    }
    
}*/

/*public class errors {
    public static void main(String[] args) {
        int a=10, b=0, c;
        try{
            c=a/b;
        System.out.println(c);
        }
        catch (Exception e){
            System.out.println("main function ended" + e);
        }
    }
}*/

//Null Pointer Exception

/*class errors {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.toLowerCase());
    }
}*/

/*class errors {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.toLowerCase());
        }
        catch(Exception e){
            System.out.println("null cant be converted");
        }
    }
}
*/


//some specific exception
class errors {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 12;
        marks[1] = 15;
        marks[2] = 20;
        marks[3] = 25;
        marks[4] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Index: ");
        int a = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int num = sc.nextInt();

        try{
            System.out.println("The value at array index entered is: " + marks[a]);
            System.out.println("The value of array-value/number is: " + marks[a]/num);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmaticException occured!" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutOfBoundException occured!" + e);
        }
        catch(Exception e){
            System.out.println("Some exception occured!" + e);
        }
    }
}