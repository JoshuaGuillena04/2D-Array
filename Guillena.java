package Guillena;
import java.util.*;
public class Guillena {
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
			int hotel [][] = new int[7][5];
			
			int choice = 0;
			while(choice != 4) {
				System.out.println("----------------------");
				System.out.println("Hotel Reservation System"
						+ "\n1.View all rooms"
						+ "\n2.Check-in (reserve a room)"
						+ "\n3.Check-out (free a room)"
						+ "\n4.Exit program");
				System.out.print("Enter Choice: ");
					choice = sc.nextInt();
				System.out.println("----------------------");
				switch(choice) {
					case 1:
						for(int  i = 0; i<hotel.length;i++) {
							System.out.print("Floor " + (i + 1) + ": ");
							for(int x = 0; x<hotel[i].length;x++) {
								System.out.print("[" + hotel[i][x] + "]");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 2:
						System.out.println("----------------------");
						System.out.print("Enter Floor 1-7: ");
							int floor = -1 + sc.nextInt();
						System.out.print("Enter Room number 1-5: ");
							int room = -1 + sc.nextInt();
						System.out.println("Check-in successful!!");
								if(hotel[floor][room] == 0) {
									hotel[floor][room] = 1;		
							}else {
								System.err.println("The room is occupied");
							}
								break;
					case 3:
						System.out.println("----------------------");
						System.out.print("Enter Floor 1-7: ");
							int floor2 = -1 + sc.nextInt();
						System.out.print("Enter Room number 1-5: ");
							int room2 = -1 + sc.nextInt();	
						System.out.println("Check-out successful, The room is Empty!!");
							if(hotel[floor2][room2] == 1) {
								hotel[floor2][room2] = 0;
							}else {
								System.out.println("The room is already Empty");
							}
							break;
					case 4:
						System.out.println("Thank you for staying!!");
						break;
					default:
						System.err.println("Invalid");
					}
						
				}
			}
	}


