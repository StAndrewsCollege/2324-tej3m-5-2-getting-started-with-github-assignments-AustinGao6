import java.util.Scanner;

public class AgeInSeconds {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int year, month, day;
        int multiplier = (24*60*60);

        year = scan.nextInt();
        month = scan.nextInt();
        day = scan.nextInt();

        if (month == 0) {
            System.out.println("Age in seconds: " + (year*365*multiplier + day*multiplier));
        }
        else if (month == 1) 
            System.out.println("Age in seconds: " + ((year*365 + 31)*multiplier + day*multiplier));

        else if (month == 2)
            System.out.println("Age in seconds: " + ((year*365 + 31+28)*multiplier + day*multiplier));

        else if (month == 3)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31)*multiplier + day*multiplier));

        else if (month == 4)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30)*multiplier + day*multiplier));

        else if (month == 5)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31)*multiplier + day*multiplier));

        else if (month == 6)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31+30)*multiplier + day*multiplier));

        else if (month == 7)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31+30+31)*multiplier + day*multiplier));

        else if (month == 8)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31+30+31+31)*multiplier + day*multiplier));

        else if (month == 9)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31+30+31+31+30)*multiplier + day*multiplier));

        else if (month == 10)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31+30+31+31+30+31)*multiplier + day*multiplier));

        else if (month == 11)
            System.out.println("Age in seconds: " + ((year*365 + 31+28+31+30+31+30+31+31+30+31+30)*multiplier + day*multiplier));

        scan.close();
    }

}
