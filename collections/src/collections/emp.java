package collections;

import java.util.Arrays;
import java.util.List;

public class emp {
	public static void main(String []args)
	{
	List<Task04>emp=Arrays.asList(
		new Task04(1,"subbu","developer",50000),
		new Task04(2,"sai","devops",60000),
		new Task04(3,"charan","IPS",100000),
		new Task04(4,"rama","Ai/ML",70000),
		new Task04(5,"krishna","tester",80000)
	);
	System.out.println();
	for(Task04 Task04:emp)
	{
		System.out.println(Task04);
	}
		}

}
