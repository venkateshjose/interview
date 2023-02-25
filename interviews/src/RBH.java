import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RBH {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of employees: ");
	        int n = sc.nextInt();

	        List<Integer> distances = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter the distance for employee " + (i + 1) + ": ");
	            distances.add(sc.nextInt());
	        }

	        System.out.print("Enter the lower bound of the range: ");
	        int lower = sc.nextInt();

	        System.out.print("Enter the upper bound of the range: ");
	        int upper = sc.nextInt();

	        sc.close();

	        distances.stream().forEach(distance -> {
	            if (distance >= lower && distance <= upper) {
	                System.out.print(distance + " ");
	            } else {
	                System.out.print(-1 + " ");
	            }
	        });
	    }

}
