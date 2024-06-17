/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_two;

import java.net.URL;
import java.net.MalformedURLException;

/**
 *
 * @author bibek
 */
public class split_url {
    public static void main(String []args) throws MalformedURLException{
        URL u = new URL("https://www.google.com/search?q=image&tbm=isch&ved=2ahUKEwj827nasvb3AhV-");
        
        System.out.println("The URL is "+u);
        System.out.println("The scheme is "+ u.getProtocol());
        System.out.println("The user info is "+u.getUserInfo());
        System.out.println("The host is "+u.getHost());
        System.out.println("The port is "+u.getPort());
        System.out.println("The ref is "+u.getRef());
        System.out.println("The query string is "+u.getQuery());
        System.out.println("The file path is "+u.getPath());
        System.out.println("Authority " +u.getAuthority());
    }
}
