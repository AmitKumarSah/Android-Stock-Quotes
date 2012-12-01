package com.mat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class StockSQLiteDatabaseActivity extends Activity {
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // create database
        StockDatabaseHelper db = new StockDatabaseHelper(this);      
        
        
        
        /*
         * INSERT STOCKS INTO DBASE
         * 
         * get List
         * 
         * for (int i = 0; i < list.length; i++)
         * 		db.addStock(new Stock(YahooFinanceDatabaseHelper.parseResponse);
         * 
         * 
         * db.addStock(new Stock(YahooFinanceDatabse.parseResonse)
         */
        
        Log.d("Insert", "Inserting...");

        //db.addStock(yfd);
        
        //db.deleteAllStocks();
        
        Log.d("Reading: ", "Reading all stocks");
        List<Stock> stocks = db.getAllStocks();
        
        for (Stock s : stocks) {
            String log = "ID: " + s.getID() + ", Ticker: " + s.getTicker() + ", Name: " + s.getName() +")";
            Log.d("Name: ", log);
        }
        
    }
}