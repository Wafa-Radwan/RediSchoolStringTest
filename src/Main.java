import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //jklfjlkfjlk

        Scanner scan = new Scanner(System.in);
       System.out.println("enter a name");
        String text= scan.nextLine();
      /*  System.out.println(text);

        System.out.println("enter your age");
        int age =scan.nextInt();

        System.out.println( String.format("the give text has %s characters %s." ,text.length(),text));

        System.out.println(String.format("The user's age is %s",age));
        */

//        Student Alice = new Student("Alice",25);
//        System.out.println(Alice);

        Human person= new Human("alice","manager");
        System.out.println(person);
    }
}
