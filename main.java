import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter any 2 numbers:");
        float a=sc.nextInt();
        float b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        
        switch(choice){
            case 1:
            System.out.println("Addition:"+(a+b));
            break;
            case 2:
            System.out.println("Substraction:"+(a-b));
            break;
            case 3:
            System.out.println("Multiplication:"+(a*b));
            break;
            case 4:
            System.out.println("Division:"+(a/b));
            break;
        }
        System.out.println("Thanking You");



    }

}






















