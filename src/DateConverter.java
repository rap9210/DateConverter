import java.util.Scanner;
public class DateConverter {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the date mm/dd/yy");
        System.out.println("Month? e.g. 01,02...12");
        String month_num = scn.nextLine();
        System.out.println("Day?");
        int day = scn.nextInt();
        System.out.println("Year?");
        int year = scn.nextInt();
        if (month_num.equals("01")){
            String month_word = "January";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("02")){
            String month_word = "February";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("03")){
            String month_word = "March";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("04")){
            String month_word = "April";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("05")){
            String month_word = "May";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("06")){
            String month_word = "June";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("07")){
            String month_word = "July";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("08")){
            String month_word = "August";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("09")){
            String month_word = "September";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("10")){
            String month_word = "October";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("11")){
            String month_word = "November";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }
        if (month_num.equals("12")){
            String month_word = "December";
            System.out.println("Today is "+month_word+" "+day+", 20"+year);
        }




    }
}
