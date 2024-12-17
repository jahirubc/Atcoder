import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    String S = sc.next();
	    int count = 0;
	    int result = 0;
	    for(int i = 0; i < S.length(); i++){
	        if( S.charAt(i) == 'O'){
	            count++;
	         if(count == K) {
	         result++;
	         count=0;
	         }
	        }
	        else count = 0;
	    }
	    System.out.println(result);
	}
}
