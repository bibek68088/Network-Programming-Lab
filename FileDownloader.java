import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileDownloader {

    /**
     * Downloads a file from the given URL and saves it to the specified destination.
     *
     * @param urlString The URL of the file to download.
     * @param destinationFile The path where the downloaded file should be saved.
     * @throws IOException If an I/O error occurs.
     */
    public static void downloadFile(String urlString, String destinationFile) throws IOException {
        // Create URL object
        URL url = new URL(urlString);
        
        // Open connection and get input stream
        try (InputStream in = new BufferedInputStream(url.openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            // Read the input stream and write to the output stream
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String fileURL = "https://www.oic.edu.np/wp-content/uploads/2020/05/logo.png";
        String destinationFile = "downloaded_logo.png";

        try {
            downloadFile(fileURL, destinationFile);
            System.out.println("File downloaded successfully to " + destinationFile);
        } catch (IOException e) {
            System.err.println("Failed to download the file: " + e.getMessage());
        }
    }
}
