package com.ch16;
import java.util.*;


public class TimePriorityTest {

    public static void main(String[] args) {
//Create a Comparator object
	Comparator<Time1> compare = new Comparator<Time1>() {
//Set rules for comparison of two Time1 objects
            @Override
            public int compare(Time1 t1, Time1 t2) {
	//convert to seconds
            int time1 = t1.getHour() * 3600 + t1.getMinute() * 60 + t1.getSecond();
            int time2 = t2.getHour() * 3600 + t2.getMinute() * 60 + t2.getSecond();
            if(time1 > time2)
                return 1;//time1 comes first
            else if(time1 < time2)
                return -1;//time2 comes first
            else
                return 0;//equal time
	}
};

//Create a Time1 Priority Queue object and using the compare argument created above to compare
//the 5 Time1 objects that are created
		Time1.Time1PriorityQueue queue = new Time1.Time1PriorityQueue(compare);
        queue.addTimeObj(new Time1(0, 0, 0));
        queue.addTimeObj(new Time1(20, 10, 10));
        queue.addTimeObj(new Time1(12, 30, 00));
        queue.addTimeObj(new Time1(13, 10, 10));
        queue.addTimeObj(new Time1(00, 00, 10));
        
        for(int i=0; i<5; i++) {
            System.out.println(queue.removeTimeObj().toUniversalString());
        }
    }	
}

