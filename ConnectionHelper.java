package com.safeinvest.safetrax;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    String username,password,ip,port,database;

    @SuppressLint("NewApi")
    public Connection connectionclass(){
        ip="172.27.16.1";
        username="root";
        password="root";
        port="3306";
        database="samplelivelms";
        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection=null;
        String ConnectionURL=null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL= "jdbc:jtds:sqlserver://"+ ip + ":"+ port+";"+ "databasename="+ database+";user="+username+";password="+password+";";
            connection=DriverManager.getConnection(ConnectionURL);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            Log.e("ERROR",e.getMessage());

        }
        System.out.println(connection==null);
        return connection;

    }

}
