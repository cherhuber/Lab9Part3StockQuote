package com.cheryl.lab9_part3;
import java.net.*;
import java.io.*;
/**
 *
 * @author cheryl
 */
public class URLreader {
    public URLreader(){
        
    }
    public static Double getQuotes (String stock) {
        try
        {
//            String[] stocks =
//            {
//                "IBM", "INTC"
//            }; //
            
            //URL yahoofinance = new url.("http://finance.yahoo.com/d/quotes.csv?s=" + stocks[0] + "+" + stocks[1] + "&f=hg");
           // URL yahoofinance = new URL("http://www.oracle.com/");
            URL yahoofinance = new URL("http://finance.yahoo.com/d/quotes.csv?s=" + stock + "&f=hg");
            URLConnection yc = yahoofinance.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine = in.readLine();
            
//            while ((inputLine = in.readLine()) != null)
//            {
//                System.out.println(inputLine);
//            }
            in.close();
            return Double.parseDouble(inputLine);
        } catch (IOException ex)
        {
            System.out.println("oops");
            return -1.0;
        }
    }
    
public static void main(String [] args) throws Exception {
    Stock_Quotes s = new Stock_Quotes();
    Stock_Quotes.showQuotes();
    
}
}

