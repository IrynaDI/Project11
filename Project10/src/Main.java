import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  ArrayDeque<String>queue= new ArrayDeque<String>();
		
		queue.addLast("Sheldon");
		queue.addLast("Leonard");
		queue.addLast("Volovitc");
		queue.addLast("Kutrapalli");
		queue.addLast("Penny");

		System.out.println(" " + queue);

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number of glasses:");
		int j = sc.nextInt();
		sc.close();

		for (int i = 0; i < j; i++) {
			String p = queue.pollFirst();
			queue.addLast(p);
			queue.addLast(p);
		}
		System.out.println("New lineup: " + queue);

	}


	
	}


