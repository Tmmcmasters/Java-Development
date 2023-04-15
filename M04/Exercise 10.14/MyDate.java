import java.util.GregorianCalendar; //Importing GregorianCalendar

public class MyDate { //Creating a MyDate Class
    private int year; //creating a private year variable
    private int month; //creating a private month variable
    private int day; //creating a private day variable

    public MyDate() { //Creating a default constructor
        GregorianCalendar cal = new GregorianCalendar(); //Creating a GregorianCalendar object
        year = cal.get(GregorianCalendar.YEAR); //Setting the year
        month = cal.get(GregorianCalendar.MONTH); //Setting the month
        day = cal.get(GregorianCalendar.DAY_OF_MONTH); //Setting the day
    }

    public MyDate(long elapsedTime) { //Creating a constructor
        GregorianCalendar cal = new GregorianCalendar(); //Creating a GregorianCalendar object
        cal.setTimeInMillis(elapsedTime); //Setting the year
        year = cal.get(GregorianCalendar.YEAR); //Setting the year
        month = cal.get(GregorianCalendar.MONTH); //Setting the month
        day = cal.get(GregorianCalendar.DAY_OF_MONTH); //Setting the day
    }
 
    public MyDate(int year, int month, int day) {  
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() { //Creating a getYear method
        return year;
    }

    public int getMonth() { //Creating a getMonth method
        return month;
    }

    public int getDay() { //Creating a getDay method
        return day;
    }

    public void setDate(long elapsedTime) { //Creating a setDate method
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) { //Creating a main method
        MyDate date1 = new MyDate(); //Creating a new MyDate object
        MyDate date2 = new MyDate(34355555133101L); //Creating a new MyDate object

        System.out.println("Date 1: " + date1.getYear() + "-" + date1.getMonth() + "-" + date1.getDay()); //Printing the date
        System.out.println("Date 2: " + date2.getYear() + "-" + date2.getMonth() + "-" + date2.getDay()); //Printing the date
    }
}
