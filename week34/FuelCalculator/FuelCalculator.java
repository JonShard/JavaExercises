import java.util.Scanner;

class FuelCalculator
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float fuelLiterPerKm = 0.5f;
        float totalKm = 0;

        while(true)
        {
            System.out.println("\nEnter distance in km driven since last entry('q' to exit):");
            String input = in.nextLine();
            if (input.length() == 0)
                continue;
            if (input.contains("q"))
                break;
            
            float km = 0;
            try
            {
                km = Float.parseFloat(input);
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Invalid input.");
            }
            
            totalKm += km;

            System.out.printf(
                "Last distance: %.1fkm\nLast use: %.2fl\nTotal distance: %.1fkm\nTotal fuel use: %.2fl\n",
                km, 
                km * fuelLiterPerKm,
                totalKm,
                totalKm *fuelLiterPerKm
            );
        }

        System.out.println("Thanks for choosing FuelCalculator™");
        in.close();
    }
}