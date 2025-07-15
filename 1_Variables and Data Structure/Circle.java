import java.util.*;
public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad ;
        System.out.println(area);
    }  
}
