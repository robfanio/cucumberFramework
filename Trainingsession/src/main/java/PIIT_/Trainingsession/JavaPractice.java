package PIIT_.Trainingsession;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class JavaPractice {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("I love Java");
		System.out.println(sb1.reverse());

		String sb2 = "I love java";
		char[] r1 = sb2.toCharArray();

		for (int i = 0; i <= r1.length; i++) {
			System.out.println(i);
		}

//		Random nu1 = new Random();
//		
//		for(int i = 0; i<=100; i++) {
//			System.out.print(" "+nu1.nextInt(1000));
//	}

//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Input Name");
//		System.out.println(s1.nextLine());
//		System.out.println(s1);

		for (int i = 0; i < 10; i++) {

			for (int j = 10 - i; j > 1; j--) {
				System.out.print(" ");

			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {

			for (int j = 10 - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		int[] num10 = { 1, 2, 3, 4, 5, 6, 7, 8, };

		for (int i = 0; i >= num10.length; i--) {
			System.out.println(num10);
		}

		for (int i = 0; i <= 10; i++) {

		}

		String num = "robinson";

		for (int i = 1; i <= num.length(); i++) {
			System.out.print(i);
		}

		var num2 = 10;
		var str4 = "hello";

		int[] arry1 = new int[10];

		arry1[0] = 100;
		System.out.println(arry1);

		String[] cars = { "toyota", "honda", "lexus" };
		System.out.println(cars[1]);
		System.out.println(cars.getClass());
		System.out.println(cars.length);
		for (int i = 0; i <= cars.length - 1; i++) {
			System.out.print(" " + cars[i]);
		}

		String str8 = "hello";

		for (int b = 0; b <= str8.toCharArray().length; b++) {

			System.out.println(str8.toCharArray().length);
		}

		for (int i = 0; i <= 10; i++) {

		}

		int numb20[] = new int[10];

		for (int i = 0; i <= 9; i++) {
			numb20[i] = i;
			{
				System.out.println(i);
			}
		}

		int[] numb30 = { 10, 20, 40, 70, 80, 80, 90, 40, 80, 90, 99, 203, 9, 8 };

		int max = numb30[0];
		int min = numb30[0];

		for (int i = 0; i <= 12 - 1; i++) {
			if (numb30[i] > max)
				max = numb30[i];

		}

		System.out.println(max);

		for (int i = 0; i <= 12; i++) {
			if (numb30[i] < min)
				min = numb30[i];
		}

		System.out.println(min);

		String str = "abcdef ";
		System.out.println(str);
		System.out.println(str.trim());
		String extracStr = str.substring(3);
		System.out.println(extracStr);

		int[][] lottery = { { 1, 2, 3, 4, 6, 7, 8, 10 }, { 10, 45, 67, 70, 80, 60 }, { 9, 8, 11, 12, 34, 56, 89 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(" " + lottery[i][j]);
			}

		}

		for (int i = 10; i > 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println(" ");

		}

		for (int i = 0; i <= 10; i++) {
			for (int j = i; j < 10; j++)
				System.out.println("i:" + i + "," + "j:" + j);

		}
		for(int i=0; i <=5;i++) {
			for(int j =1;j<=i;j++)
				System.out.print("*");
			System.out.println(" ");
			
				
		}
		
		
		for(int i=0;i<=5;i++) {
			if(i  == 2)
				System.out.println("hello");
			continue;
		}
		
		StringBuilder str90 = new StringBuilder("I love software");
		System.out.println(str90.reverse());

	int number= 88;
	
	for(int i =0; i<=11;i++) {
		if(i==10)i=number;
		System.out.println(i);
		continue;
		}
;
StringBuilder str0= new StringBuilder("Selenium");
System.out.println(str0.reverse());

String st1= "Selenium";
for(int i=st1.length()-1; i>=0;i--) {
	System.out.print(st1.charAt(i));
}


String st2 = "I Love Jave";

for(int i = st2.length()-1;i>0;i--) {
	System.out.print(st2.charAt(i));
}





String[] car1 = {"mercedez","lambo","mcLaren","ferrari","toyota"};

for(int i=0;i<=car1.length;i++) {
	System.out.println(car1.toString().charAt(i));
	
	
}


int[] num34= new int[101];

for(int i=1;i<100;i++) {
	num34[i]=i;
	System.out.println(i);
}

//
//for(int i=0;i <=5;i++) {
//	for(int j =0; j<i;j++) {
//		System.out.print(i);
//		System.out.print(" ");
//		
//	}
//}


//int[] num23= new int[19];
//
//
//for(int i=1;i<=num23.length-1;i++) {
//	num23[i]=i;
//	{
//		System.out.println(i);
//	}
//}
//
//for(int i=0;i<=10;i++) {
//	for(int j=0;j<=i;j++) {
//		System.out.print("%");
//		
//	}
//	System.out.println(" ");
//	}
//
//System.out.println("Pleases enter a number");
//Scanner scn = new Scanner(System.in);
//int nmbrScn = scn.nextInt();
//
//for(int i=0;i<=nmbrScn;i++) {
//	for(int j =0;j<=i;j++) {
//		System.out.print("*");
//	}
//		System.out.println("");
//}

int[] numbers = new int[10];
String st19 = "Selenium";

for(int i = st19.length();i<0;i--) {
	System.out.println(st19.charAt(i));
}






}







}
