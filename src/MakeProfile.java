import java.util.Scanner;
import java.io.*;
public class MakeProfile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyProfile p1 = new MyProfile();
        System.out.println("Please enter the profile : ");
        p1.id = s.nextInt();
        System.out.println("Please enter the name : ");
        p1.name = s.next();
        System.out.println("Please enter phone number : ");
        p1.number = s.nextInt();
        System.out.println("Please enter nickname");
    }


}
class MyProfile{
    int id;
    String name;
    int number;
    String nickname;
    int age;

}

class MyMarkSheet{

    double maths;
    double science;
    double economics;
    double english;
}

