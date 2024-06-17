/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_two;

/**
 *
 * @author bibek
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Question7_ServerSide {
    public static void main(String[] args) {
        String target = "emailcont=bibekbca20%40gmail.com&password=bibekbca&login=submit";

        for(int i = 0; i < args.length; i++){
            target += args[i] + " ";  // Add space between arguments
        }
        target = target.trim();  // Trim any trailing spaces

        try {
            URL u = new URL("http://localhost/GadgetHub/Gadget_hub/login.php?" + target);

            InputStream in = new BufferedInputStream(u.openStream());
            InputStreamReader theHTML = new InputStreamReader(in);
            int c;
            while ((c = theHTML.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
