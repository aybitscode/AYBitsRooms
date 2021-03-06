package com.aybits.hms.arch.dbman;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.aybits.hms.arch.util.HmsConfig;
import com.aybits.hms.func.customer.dao.CustomerDAO;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.log4j.Logger;


public class DBConnection {
    static Logger Log = Logger.getLogger(DBConnection.class);

    private static volatile Connection connection = null;
    private static final String driverName = "com.mysql.jdbc.Driver";
    private static Integer connectionCount = 0;
    private static int JDBC_QUERY_TIMEOUT = 300;
    
    
    public static final Connection getDBConnection(){
		try{

	    		if(null == connection){
                    synchronized (DBConnection.class) {
                        /*String fileName = "hms_config.properties";
	    			Properties props = new Properties();
			        props.load(DBConnection.class.getClassLoader().getResourceAsStream(fileName));*/
                        HmsConfig hmsConfig = new HmsConfig();

                        //connectSSH(props);
                        connectToDataBase(hmsConfig.getHmsConfigProps());

                    }
	    		}
		
		} catch (SQLException e) {
				e.printStackTrace();
		} catch (Exception e){
				e.printStackTrace();
		}
    	
    	return connection;
    }


    public static Integer getJDBCQueryTimeOut()
    {
		return JDBC_QUERY_TIMEOUT;
    	
    }

   

    private static void connectToDataBase(Properties props) throws SQLException {
       
	
        try {

        	String databaseName 	= props.getProperty("db.sid");
        	String dbUserName 	= props.getProperty("db.user");
        	String dbPassword 	= props.getProperty("db.password");
        	int dbPort 		= Integer.parseInt(props.getProperty("db.port"));
            String dbServerName  	= props.getProperty("db.servername");
          
            if(connection == null){
            Class.forName(driverName).newInstance();

            //mysql database connectivity
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName(dbServerName);
            dataSource.setPortNumber(dbPort);
            dataSource.setUser(dbUserName);
            dataSource.setAllowMultiQueries(true);

            dataSource.setPassword(dbPassword);
            dataSource.setDatabaseName(databaseName);

            connection = dataSource.getConnection();
            }
            Log.info("Connection to server successful!:" + connection + "\n\n");
            Log.info("Connection["+connectionCount+"] established successfully");
            connectionCount++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeDBConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                Log.info("Closing Database Connection");
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    


    
    

	
	



}
