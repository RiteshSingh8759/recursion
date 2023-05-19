package org.kloc.recursion;

import java.util.Map;
import java.util.HashMap;
public class TCP {   
     public static String traverseStates(String[] ar) 
     {
      String s = "CLOSED" ;                            
      Map<String,String> map=new HashMap<String,String>();
      map.put("CLOSED: APP_PASSIVE_OPEN","LISTEN");
      map.put("CLOSED: APP_ACTIVE_OPEN","SYN_SENT");
      map.put("LISTEN: RCV_SYN","SYN_RCVD");
      map.put("LISTEN: APP_SEND","SYN_SENT");
      map.put("LISTEN: APP_CLOSE","CLOSED");
      map.put("SYN_RCVD: APP_CLOSE","FIN_WAIT_1");
      map.put("SYN_RCVD: RCV_ACK","ESTABLISHED");
      map.put("SYN_SENT: RCV_SYN","SYN_RCVD");
      map.put("SYN_SENT: RCV_SYN_ACK","ESTABLISHED");
      map.put("SYN_SENT: APP_CLOSE","CLOSED");
      map.put("ESTABLISHED: APP_CLOSE","FIN_WAIT_1");
      map.put("ESTABLISHED: RCV_FIN","CLOSE_WAIT");
      map.put("FIN_WAIT_1: RCV_FIN","CLOSING");
      map.put("FIN_WAIT_1: RCV_FIN_ACK","TIME_WAIT");
      map.put("FIN_WAIT_1: RCV_ACK","FIN_WAIT_2");
      map.put("CLOSING: RCV_ACK","TIME_WAIT");
      map.put("FIN_WAIT_2: RCV_FIN","TIME_WAIT");
      map.put("TIME_WAIT: APP_TIMEOUT","CLOSED");
      map.put("CLOSE_WAIT: APP_CLOSE","LAST_ACK");
      map.put("LAST_ACK: RCV_ACK","CLOSED");
      for(int i=0;i<ar.length;i++)
        {
          if(!map.containsKey(s+": "+ar[i]))
          {
        	  return "ERROR";
          }
          s=map.get(s+": "+ar[i]);
        }
      return s;
    }
     public static void main(String[] args) 
     {
    	 String s=traverseStates(new String[] {"APP_ACTIVE_OPEN","RCV_SYN_ACK","RCV_FIN"});
    	 System.out.println(s);
	}
}
