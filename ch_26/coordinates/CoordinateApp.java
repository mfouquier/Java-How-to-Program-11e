import java.util.PriorityQueue;

public class CoordinateApp {
	public static void main(String[] args) {
		PriorityQueue<Coordinate> pq = new PriorityQueue<>();
		
		pq.add(new Coordinate(11,11,11));
		pq.add(new Coordinate(2,2,2));
		pq.add(new Coordinate(3,3,3));
		
		while(true) 
		{
		    Coordinate c = pq.poll();
		    System.out.println(c);
		     
		    if(c == null) break;
		}
		}
	
}