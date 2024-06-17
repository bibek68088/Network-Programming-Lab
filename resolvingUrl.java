/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_two;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
/**
 *
 * @author bibek
 * 
 */
//Write a prgram to download a web page of a givenweb adddress
//www.oic.edu.np

public class resolvingUrl {
    public static void main(String[] args) {
        try {
            // Specify the URL of the web page you want to download
            String urlString = "http://www.oic.edu.np";
            
            // Create a URL object
            URL url = new URL(urlString);
            
            // Open a connection to the URL
            URLConnection conn = url.openConnection();
            
            // Create a BufferedReader to read the content of the web page
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            // Read each line of the web page and print it
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the BufferedReader
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
