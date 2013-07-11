import java.util.Scanner;

class UsingObjectsEx3
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price of a drink: ");
  int price = input.nextInt();
  DrinksMachine machine = new DrinksMachine(price,10,10);
  System.out.print("Enter the sum of money you wish to spend on a Coke ");
  System.out.print("and a Fanta: ");
  int amount = input.nextInt();
  machine.insert(amount);
  Can can1 = machine.pressCoke();
  Can can2 = machine.pressFanta();
  int change = machine.pressChange();
  System.out.println("I have "+change+"p and "+can1+" and "+can2);
 }
}
