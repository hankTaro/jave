import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    
		ArrayList<Integer> score = new ArrayList<Integer>();
		while(keyboard.hasNextInt())
        {
            score.add(keyboard.nextInt());
        }
        
		int sum = 0;
		int ptr = 0;
		
		for(int i = 0; i < 10 ; i++)
		{
		    if(score.get(ptr) == 10){
		        sum += score.get(ptr) + score.get(ptr + 1) + score.get(ptr + 2);
		        ptr++;
		    }
		    else if(score.get(ptr) + score.get(ptr + 1) == 10){
		        sum += score.get(ptr) + score.get(ptr + 1) + score.get(ptr + 2);
		        ptr += 2;
		    }
		    else{
		        sum += score.get(ptr) + score.get(ptr + 1);
		        ptr += 2;
		    }
		}
		
		System.out.println(sum);
	}
}
