import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    while(sc.hasNextInt())
	    {
	        numbers.add(sc.nextInt());
	    }
	    int numberSize = numbers.size();
	    int j = 0;
	    for(int i=0;i<numberSize;i++)
	    {
	        for(j=i+1;j<numberSize;j++)
	        {
	            if(numbers.get(i)<=numbers.get(j))
	            {
	                break;
	            }
	        }
	        if(j==numberSize)
	            System.out.print(numbers.get(i)+" ");
	    }
	}
}
