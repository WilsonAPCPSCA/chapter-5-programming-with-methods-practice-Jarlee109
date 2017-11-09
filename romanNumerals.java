import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int x = num;
		while(num>0){
			num = num/10;
			romanDigit(num, "X", "L");
		}
		romanDigit(x, "I", "V");

	}
	public static String romanDigit(int n, String ones, String fives){
		String digit = "";
		if ((n%10<5) && (n%10>0)){
			for (int i=1; i<=n%10; i++ ){
				System.out.print(ones);
			}
		}else if(n%10>=5){
			System.out.print(fives);
			for(int i=1; i<=((n%10)-5); i++){
				System.out.print(ones);
			}
		}
		return digit;
	}

}
