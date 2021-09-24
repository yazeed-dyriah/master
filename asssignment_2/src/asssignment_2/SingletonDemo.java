package asssignment_2;


public class SingletonDemo {

	public static void main(String[] args) {
		 
		//SingleObject insatnce1 =new SingleObject(); // This is not allowed because the SingleObject constructor is private
		singleobject instance1 = singleobject.getInstance();
		singleobject instance2 = singleobject.getInstance();
		instance1.id = 5;
		//the id is not state but because insatnce2 == insatnce1 and both represent same object 
		// Anyone updates id, the other will be affected. BOTH are point to same and one object
		System.out.println("id = " + instance2.id); //5 
		System.out.println("id = " + instance1.id); //5 
		System.out.println("check is equal : " + (instance1 == instance2)); //true
		
		
		// will create a new object and return a TELNET connection
		connection telnetConnection = connection.getInstance(connection.TELNET); 
		// will return the current TELNET connection 
		connection telnetConnection2 = connection.getInstance(connection.TELNET); 
	
		//Factory , Composite 
		
		telnetConnection.id = 5;
		if(telnetConnection == telnetConnection2) {  // 70%
			//true
		}; // true
		System.out.println(telnetConnection2.id);//5
		
		// will create a new object
		connection sshConnection = connection.getInstance(connection.SSH); 
		sshConnection.id = 6;
		System.out.println(telnetConnection2.id);//5
		System.out.println(sshConnection.id);//6
		connection.getInstance(connection.HTTP); 
		
		// will throw an expectation telling the user he can’t create more than 3 connections! //80%
		@SuppressWarnings("unused")
		connection scpconnection2 = connection.getInstance(connection.SCP); 
		
		connection.getInstance(connection.HTTP); 

		connection.release(connection.TELNET);
		// will create a new FTP connection and return it.
		connection telnetconnection2 = connection.getInstance(connection.TELNET);  //100%

		connection.getCurrentConnections(); 
		
		//Will print a message says: Sending [My message] vi FTP protocol. 
		connection.send("My message", telnetconnection2);
		//Will print a message says: Sending [My message] vi SSH protocol. 
		connection.send("My message", telnetconnection2);
		

	}

}
