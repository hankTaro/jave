import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    
		ArrayList<Integer> score = new ArrayList<Integer>();
//		while(keyboard.hasNext())
//	    {
//	        score.add(keyboard.nextInt());
//	    }
		int count = 0;
		while(true)
	    {
			int temp = keyboard.nextInt();
			if(temp == 10)
			{
				count += 2;
			}
			else {
				count++;
			}
			
	        score.add(temp);
	        
	        if(count == 18)
	        {
	        	temp = keyboard.nextInt();
	        	score.add(temp);
	        	if(temp == 10)
	        	{
	        		score.add(keyboard.nextInt());
	        		score.add(keyboard.nextInt());
	        		break;
	        	}
	        	else
	        	{
	        		int temp2 = keyboard.nextInt();
	        		score.add(temp2);
	        		if(temp + temp2 == 10)
	        		{
	        			score.add(keyboard.nextInt());
	        		}
	        		break;
	        	}
	        }
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
