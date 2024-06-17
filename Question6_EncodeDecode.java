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

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Question6_EncodeDecode {
    public static void main(String[] args) {
        try {
            // Base URL
            String baseurl = "https://www.deerwalk.edu.np/?q=";

            // String to be encoded
            String query = "info@gmail for bca";
            System.out.println("URL without encoding:");
            System.out.println(baseurl + query);

            // Encode the query string
            String encodedQuery = URLEncoder.encode(query, "UTF-8");
            System.out.println("URL after encoding:");
            System.out.println(baseurl + encodedQuery);

            // Full URL to be decoded
            String fullUrl = "https://www.deerwalk.edu.np/?q=info%40gmail+for+bca";
            System.out.println("URL before decoding:");
            System.out.println(fullUrl);

            // String to be decoded
            String toDecode = "info%40gmail+for+bca";
            String decodedQuery = URLDecoder.decode(toDecode, "UTF-8");

            // Reconstruct the full URL with decoded query
            URL decodedUrl = new URL(baseurl + decodedQuery);
            System.out.println("URL after decoding:");
            System.out.println(decodedUrl);

        } catch (UnsupportedEncodingException | MalformedURLException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}