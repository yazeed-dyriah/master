package asssignment_2;

import java.util.ArrayList;

public class connection {
	 
	private static  String TELNET = null;

	public static connection getinstance(String TELNET) {
		connection.getinstance(connection.TELNET);
		connection telnetconnection2 = connection.getinstance(connection.TELNET);
		return telnetconnection2;
	  } 
	
static  String SSH = null;

public static connection getInstance(String SSH) {
	
	if(SSH==null) {
	connection.getInstance(connection.SSH);
	connection sshconnection = connection.getInstance(connection.SSH);
	sshconnection = new connection();
	
	return sshconnection;
	}
	return null;
  }

static  String HTTP = null;

public static connection getInstance1(String HTTP) {
	if(HTTP==null) {
	
	connection.getInstance(connection.HTTP);
	connection httpconnection2 = connection.getInstance(connection.HTTP);
	httpconnection2=new connection();
	return httpconnection2;
	}
	return null;
  }

static  String SCP = null;

public static connection getInstance11(String SCP) {
	if(SCP==null) {
		
	connection.getInstance(connection.SCP);
	connection scpconnection2 = connection.getInstance(connection.HTTP);
	scpconnection2=new connection();
	return scpconnection2;
	}
	return null;
  }

public static ArrayList<String> getCurrentConnections () {

ArrayList<String> currentconnection = connection.getCurrentConnections();
return currentconnection;

}

public static connection send(String message, connection sshconnection) {
	connection.send("the current protocol is ssh", sshconnection);
	return null;
	
}
public int id = 0;

public static boolean release(String tELNET2) {
	// TODO Auto-generated method stub
	return false;
}

}