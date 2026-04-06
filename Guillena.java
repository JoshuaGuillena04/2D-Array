package Guillena;
import java.util.Scanner;
public class Guillena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int [][] arr = new int[3][3];
//		for(int x = 0;x<arr.length;x++) {
//			for(int e = 0; e<arr[x].length;e++) {
//				System.out.println("Enter number: ");
//					arr[x][e] = sc.nextInt();
//			}	
//		}
//		
//	for(int x = 0; x<arr.length;x++) {
//			for(int e = 0;e<arr[x].length;e++) {
//				System.out.print(arr [x][e] + " ");
//			}
//			System.out.println(" ");
//		}
//	
//	for(int x = 0; x<arr.length;x++) {
//		for(int e = 0;e<arr[x].length;e++) {
//			if(arr[x][e]== 7) {
//				System.out.println("number 7 is found at" + x + "" + e);
//			}
//		}
//	}
	
	int numbers [][] = {{120,250,789,7},{58,79,31,87},{8,1,2,3},{99,98,97,96}};
		for(int j = 0; j<numbers.length;j++) {
			for(int e = 0; e<numbers[j].length;e++) {
				System.out.print(numbers[j][e] + " ");
			}
			System.out.println();
		}
		
		for(int j = 0; j<numbers.length;j++) {
			for(int e = 0; e<numbers[j].length;e++) {
				if(numbers[j][e] == 1) {
					System.out.println("number 1 is found at indices " + j + " and " + e);
					numbers[j][e] = 50;
				}
			}
			System.out.println();
		}
		
		for(int j = 0; j<numbers.length;j++) {
			for(int e = 0; e<numbers[j].length;e++) {
				System.out.print(numbers[j][e] + " ");
			}
			System.out.println();
		}
		
		for(int j = 0; j<numbers.length;j++) {
			for(int e = 0; e<numbers[j].length;e++) {
				numbers[1][e] = 0;
			}
			System.out.println();
		}
		for(int j = 0; j<numbers.length;j++) {
			for(int e = 0; e<numbers[j].length;e++) {
				System.out.print(numbers[j][e] + " ");
			}
			System.out.println();
		}
	}

}
