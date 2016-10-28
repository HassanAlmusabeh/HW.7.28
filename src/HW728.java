import java.util.Scanner;
public class HW728 {

	public HW728() {
	}
		public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  // ask the user to Enter 10 numbers
		  System.out.print("Enter ten numbers:");
		   //we use for loop to find the combination
		  int[] list1 = new int[10];
		  for (int i = 0; i < list1.length; i++) {
		   list1[i] = input.nextInt();
		  }
		   
		   
		  for (int i = 0; i < list1.length-1; i++) {
		   for (int j = i+1; j < list1.length; j++) {
		    System.out.print( list1[i] + "," + list1[j] + " ");
		   }
		   System.out.println();
	System.out.println("Hello my team");
	
		  }
}

}