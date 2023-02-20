import java.util.*;
public class evennumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
		//print all even numbers <=n 
		for (int i=1; i<=n; i++) 
        {
			if(i%2==0)  
            {
				System.out.print(i+"  ");
            }
        }
    }
}
