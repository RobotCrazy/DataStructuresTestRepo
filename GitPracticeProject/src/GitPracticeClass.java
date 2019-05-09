import java.util.Scanner;

public class GitPracticeClass
{
    // public static void main(String[] args) {
    // average();
    // }
    private static Scanner scan = new Scanner( System.in );

    public static void average()
    {
        System.out.println( "Enter five numbers, add spaces between:" );

        int num1 = Integer.parseInt( scan.next() );
        int num2 = Integer.parseInt( scan.next() );
        int num3 = Integer.parseInt( scan.next() );
        int num4 = Integer.parseInt( scan.next() );
        int num5 = Integer.parseInt( scan.next() );

        System.out.println( "\nAverage:" );
        System.out.println( (num1 + num2 + num3 + num4 + num5) / 5 );
    }

    public static void main( String[] args )
    {
        average();
    }

}
