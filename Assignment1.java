//Student ID Card
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Blood Group");
        String blood = sc.nextLine();
        System.out.println("Enter your Age");   
        int age = sc.nextInt();
        sc.close();
        String group;
        if(age>=20){
            group="Your group is Red";
        }else if(age>=15 && age<20){
            group="Your group is Blue";
        }else{
            group="Your group is yellow";
        }
        
        System.out.println("-------------------"+"\n"+"Name: "+name+"\n"+"Age: "+age+"\n"+"Blood Group: "+blood+"\n"+"-------------------"+"\n"+group+"\n"+"-------------------");

    }
}
