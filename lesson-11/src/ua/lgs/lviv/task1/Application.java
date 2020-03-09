package ua.lgs.lviv.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int size ;
		int first;
		int last;
		while(true) {
			System.out.println("Enter a size of an array: ");
			try {
				size=scan.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Wrong input...");
				e.printStackTrace();
				break;
			}
			System.out.println("Enter two numbers which will determine the range of the array: ");
			try {
				first=scan.nextInt();
				last=scan.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Wrong input...Exit");
				e.printStackTrace();
				break;
			}
			Integer[]arr=new Integer[size];
			for(int i=0; i<size; i++) {
				arr[i]=(int)(Math.random()*(last-first)+first);
			}
			System.out.println("The random array: ");
			System.out.println(Arrays.toString(arr));
			System.out.println();
			Arrays.sort(arr);
			System.out.println("The random array in ascending order: ");
			System.out.println(Arrays.toString(arr));
			System.out.println();
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("The random array in descending order: ");
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		

	}

}
