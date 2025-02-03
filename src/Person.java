import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private Booking booking;

    public Person() {

    }
    public String getName(){
        sc = new Scanner(System.in);
        name = sc.nextLine();
        return name;
    }
    public void addBooking(){

    }

}
