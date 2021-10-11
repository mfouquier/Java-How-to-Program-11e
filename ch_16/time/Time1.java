package com.ch16;
// Fig. 8.1: Time1.java
// Time1 class declaration maintains the time in 24-hour format.
import java.util.*;

public class Time1 {
   private int hour; // 0 - 23  
   private int minute; // 0 - 59
   private int second; // 0 - 59

    public Time1(int hour, int minute, int second) {
    	if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || 
    	         second < 0 || second >= 60) {
    	         throw new IllegalArgumentException(               
    	            "hour, minute and/or second was out of range");
    	      }

    	      this.hour = hour;
    	      this.minute = minute;
    	      this.second = second;
    }

    // set a new time value using universal time; throw an
   // exception if the hour, minute or second is invalid
   public void setTime(int hour, int minute, int second) {
      // validate hour, minute and second
      if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || 
         second < 0 || second >= 60) {
         throw new IllegalArgumentException(               
            "hour, minute and/or second was out of range");
      }

      this.hour = hour;
      this.minute = minute;
      this.second = second;
   } 
//GET methods for hour, minute, second   
   public int getHour() {return hour;}
   public int getMinute() {return minute;}
   public int getSecond() {return second;}
 
   // convert to String in universal-time format (HH:MM:SS)
   
    public String toUniversalString() {
      return String.format("%02d:%02d:%02d", hour, minute, second);
   } 
   // convert to String in standard-time format (H:MM:SS AM or PM)
    @Override
    public String toString() {
      return String.format("%d:%02d:%02d %s",         
         ((hour == 0 || hour == 12) ? 12 : hour % 12),
         minute, second, (hour < 12 ? "AM" : "PM"));  
   }
 
 //inner class to create a priority queue object and use a Comparator as argument
   public static class Time1PriorityQueue {

       PriorityQueue<Time1> queue;

       public Time1PriorityQueue(Comparator<Time1> comparator) {
          queue = new PriorityQueue<>(comparator);
       }
//method to add Time1 object to the priority queue object
       void addTimeObj(Time1 obj) {
          queue.add(obj);
       }
//method to remove an object from the priority queue
       Time1 removeTimeObj() {
           return queue.remove();
       }
   }
}

  


