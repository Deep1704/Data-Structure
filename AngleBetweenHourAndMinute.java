import java.util.*;
public class AngleBetweenHourAndMinute{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour :");

        int hour = sc.nextInt();
        System.out.println("Enter Minute :");
        int minute = sc.nextInt();

        System.out.println(angle(hour, minute));
        sc.close();
    }

    public static double angle(int h, int m) {
        double angle1 = ((h * 60 + m) * (0.5));
        double angle2 = m * 6;
        double a = angle1 - angle2;
        return Math.abs(Math.min(a, 360 - a));
    }
}