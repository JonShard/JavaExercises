public class Divisible
{
    public static void main(String[] args)
    {
        String divByTwo = "Tall som kan deles på 2 :";
        String divByThree = "Tall som kan deles på 3 :"; 
        String divByFour = "Tall som kan deles på 4 :";

        // Loop and find all divisable numbers:
        int max = 10;
        for (int i = 0; i < max; i++)
        {
            if (i % 2 == 0)
                divByTwo += i + ", ";
            if (i % 3 == 0)
                divByThree += i + ", ";
            if (i % 4 == 0)
                divByFour += i + ", ";
        }
        // Cut off last ', ' from resulting strings:
        if (divByTwo.length() > 0)
            divByTwo = divByTwo.substring(0, divByTwo.length()-2);

        if (divByThree.length() > 0)
            divByThree = divByThree.substring(0, divByThree.length()-2);

        if (divByFour.length() > 0)
            divByFour = divByFour.substring(0, divByFour.length()-2);

        // Print result:
        System.out.println(divByTwo);
        System.out.println(divByThree);
        System.out.println(divByFour);
    }
}