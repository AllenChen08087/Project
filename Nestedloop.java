import java.util.Scanner;
public class Nestedloop{

	public static void main(String[] args) {
		int i, j, n;

		// outer loop to handle number of rows
		// n in this case
		for(i=1; i<=10; i++){
			for(j=1; j<=10; j++){
				n = i * j;
				
				if (i<10 & j<10 & n< 10){
					System.out.print(i + "*" + j + "=" + n + "      ");
				}
				else if (i<10 & j<10 & n>=10){
					System.out.print(i + "*" + j + "=" + n + "     ");
				}
				else if ((i>=10 & j<10) || (i<10 & j>=10)){
					System.out.print(i + "*" + j + "=" + n + "    ");
				}
				else{
					System.out.print(i + "*" + j + "=" + n +"   ");
				}
				
				
			}
			System.out.println();
		}

	}
}
