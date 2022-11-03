package Interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Interview {

	public static void main(String[] args) throws InterruptedException {
		details();
		
        
	}
private static void details() throws InterruptedException
{
	Queue<String> candidateDetails=new LinkedList<>();
	candidateDetails.add("chad");
	candidateDetails.add("jeni");
	candidateDetails.add("jenifer");
	candidateDetails.add("john");
	candidateDetails.add("mahi");
	candidateDetails.add("wade");
	candidateDetails.add("kick");
	candidateDetails.add("ferb");
	candidateDetails.add("kichu");
	candidateDetails.add("msd");
	System.out.println("Candidates enrolled for interview");
	System.out.println("--------------------------------");
	int length=candidateDetails.size();
	Iterator iterator=candidateDetails.iterator();
	while(iterator.hasNext())
	{
		//Thread.sleep(3000);
		System.out.println(iterator.next());
	}
	System.out.println("--------------------------------");
	waitingRoom(candidateDetails,length);
}
private static void waitingRoom(Queue<String> candidateDetails,int length) throws InterruptedException
{
	Queue<String> waitingRoom=new LinkedList<>();
	for(int i=0;i<5;i++)
	{
		waitingRoom.add(candidateDetails.poll());
	}
	System.out.println("people in wating room");
	System.out.println("--------------------------------");
	Iterator iterator=waitingRoom.iterator();
	//System.out.println(candidateDetails);
	while(iterator.hasNext())
	{
		//Thread.sleep(3000);
		System.out.println(iterator.next());
	}
	callForInterview(candidateDetails,waitingRoom,length);
}
private static void callForInterview(Queue<String> candidateDetails,Queue<String> waitingRoom,int length) throws InterruptedException
{
	System.out.println("--------------------------------");
	while(length!=0)
	{
		         int index=1;
				System.out.println("person called for interview:"+" "+waitingRoom.poll());
				System.out.println("--------------------------------");
				if(!candidateDetails.isEmpty())
				waitingRoom.add(candidateDetails.poll());
				Iterator iterator=waitingRoom.iterator();
				//System.out.println(candidateDetails);
				if(!waitingRoom.isEmpty()) {
				System.out.println("People in waiting room");
				System.out.println("--------------------------------");
				}
				else
				{
					System.out.println("Interview finished");
				}
				while(iterator.hasNext())
				{
					
					//Thread.sleep(2000);
					System.out.println(index+++"."+iterator.next());
				}
				length--;
	}
	
	
}
}


