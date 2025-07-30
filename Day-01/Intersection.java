import java.io.*;
import java.util.*;

public class Intersection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read first array size
        System.out.print("Enter size of first array: ");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of first array (space-separated): ");
        String[] arr1Str = br.readLine().split(" ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(arr1Str[i]);
        }

        // Read second array size
        System.out.print("Enter size of second array: ");
        int n2 = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of second array (space-separated): ");
        String[] arr2Str = br.readLine().split(" ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(arr2Str[i]);
        }

        // Use HashSet to find intersection
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Print intersection
        System.out.println("Intersection Elements: " + intersection);
    }
}
