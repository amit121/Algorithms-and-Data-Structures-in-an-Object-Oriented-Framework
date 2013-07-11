import java.util.Scanner;
public class UsingObjectsEx5
{

    public static void main(String[] args)
    {
        Can can1 = new Can("Coke");
        Can can2 = new Can("Fanta");
        System.out.println(twoCans(can1, can2));
    }

    public static boolean twoCans(Can can1, Can can2)
    {
        can1.drink();
        can2.drink();
        if(!can1.isFull() && can2.isFull()){
            can2.drink();
            System.out.println("you drank from can 2");
            return true;
        }
        else if(can1.isFull() && !can2.isFull()){
            can1.drink();
            System.out.println("you drank from can1");
            return true;
        }
        else{
             System.out.println("both cans are empty");
             return false;
        }
    }
}
