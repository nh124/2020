import java.util.Scanner;
public class Birthday {
    public static int numberOfDay;
    public static int age;
    public static int YearBorn;
    public static int CurrentYear;
    public static int monthBorn;
    public static int CurrentMonth;
    public static int dateBorn;
    public static int currentDate;
    public static void main(String[] args){

    }
    public void askQuestions(){
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the year were born followed by the current year: ");
        YearBorn = read.nextInt();
        CurrentYear = read.nextInt();
        age = CurrentYear - YearBorn;
        System.out.println("Please enter the month you were born in followed by the current month:");
        monthBorn = read.nextInt();
        CurrentMonth = read.nextInt();
        System.out.println("Please enter the date you were born in followed the current date: ");
        dateBorn = read.nextInt();
        currentDate = read.nextInt();
    }
    public void conditions(){
        int numberOfDays = 59;
        if(monthBorn % 2 == 0 && monthBorn < 7 || monthBorn == 7 && monthBorn != 2 && monthBorn < 12){
            if(monthBorn < 3){
                int x = numberOfDay; //31 + 28;
            }else if(monthBorn > 2 && monthBorn < 12){

            }


            }
        }
    }
}
