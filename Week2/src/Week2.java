import java.util.Scanner; //Scanner 오류 해결책

public class Week2 {

	public static void sample(int values [] ) {
		int intCopy[] = new int [values.length];
		for(int i=0;i<values.length;i++)
			intCopy[i]=values[i];
		values[0] = 100;
	}
	public static void main(String[] args) {
//		//String s = new String("Hello World");
//		String s = "Hello World";
//		String s2 = s + "23"; //s.concat("23");
//		System.out.println(s);
//		System.out.println(s2 + " " + .12);
//		
//		Scanner input = new Scanner(System.in);
//		String token1 = input.next();
//		String token2 = input.next();
//		int token3 = input.nextInt();
//		double token4 = input.nextDouble();
//		System.out.println(token3 + "," + token4);
		
		int intArray[] = new int[5];
		intArray[2] = 7;
		intArray[3] = 5;
		sample(intArray);
		int sum = 0;
//		for(int i=0;i<intArray.length;i++) {
//			sum += intArray[i];
//		}
		for(int k : intArray) {
			sum += k;
		}
		System.out.println(sum);
	}

}
