package com.vishal.db;

public enum Connectors{
	
	JdbcConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/sonoo"), 
	DerbyConnector("org.apache.derby.jdbc.ClientDriver","jdbc:derby://localhost:1527/myDB;create=true;user=me;password=mine"),
	OdbcConnector("com.jdbc.odbc.Driver","jdbc:odbc://localhost:3306/db"),
	MongoDBConnector("com.jdbc.mongodb.Driver","jdbc:mongo://localhost:3306/db");
	
	//driver source
	String driver;
	
	//connection query
	String connQuery;
	
	Connectors(String driver, String connQuery){
		this.driver = driver;
		this.connQuery = connQuery;
	}

	public String getDriver() {
		return driver;
	}

	public String getConnQuery() {
		return connQuery;
	}
	
	
}
	
