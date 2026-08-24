import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Linear search
        int found = -1;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == key)
            {
                found = i;
                break;
            }
        }

        // Display result
        if (found != -1)
        {
            System.out.println("Element found at index: " + found);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}