import java.util.Scanner;

public class JavaIf11{
	public static void main (String []args)
	{
        int quantity;

        Scanner keyboard = new Scanner(System.in)

        System.out.print("Enter ***** being purchased: ");
		quantity = keyboard.nextint();

		if(quantity < 10)
		{
			System.out.println("Cost is " + (quantity * 99));
			System.out.println("There is no discount on this order");

		}

		if(quantity >= 10)
		{
			System.out.println("Cost is " + (quantity * 99)*.9);
			System.out.println("You received a discount of " + (quantity * 99)*.1);
			System.out.println("Cost without discount would normall be " + (quantity * 99));


		}

	}
}


