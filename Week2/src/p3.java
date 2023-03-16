import java.util.Scanner;

public class p3 {

	public static void ModifyArray(int array[], int len) {
		for(int i=0;i<len;i++) {
			if(array[i]>=10) {
				array[i]=0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int intArray[] = new int[length];
		for(int i=0;i<length;i++) {
			intArray[i] = input.nextInt();
		}
		
		ModifyArray(intArray, length);
		
		for(int i=0;i<length;i++) {
			System.out.println(intArray[i]);
		}
		
		input.close();
	}

}
