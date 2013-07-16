import java.util.Scanner;

class UsingObjectsEx4
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price of a drink: ");
  int price = input.nextInt();
  DrinksMachine machine = new DrinksMachine(price,10,10);
  System.out.print("Enter the sum of money you wish to spend on a Coke: ");
  int amount = input.nextInt();
  machine.insert(amount);
  Can can = machine.pressCoke();
  int change = machine.pressChange();
  System.out.println("I have "+change+"p and "+can);
  System.out.println("I drink the can");
  can.drink();
  System.out.println("I now have "+can);
 }

}
