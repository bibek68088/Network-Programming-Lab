import java.net.URI;
import java.net.URISyntaxException;

public class UriResolver {

    /**
     * Resolves a relative URI against a base URI.
     *
     * @param baseUri The base URI.
     * @param relativeUri The relative URI.
     * @return The resolved absolute URI.
     * @throws URISyntaxException If the URIs are not valid.
     */
    public static String resolveRelativeUri(String baseUri, String relativeUri) throws URISyntaxException {
        // Create URI objects
        URI base = new URI(baseUri);
        URI relative = new URI(relativeUri);
        
        // Resolve the relative URI against the base URI
        URI resolved = base.resolve(relative);
        
        // Return the resolved URI as a string
        return resolved.toString();
    }

    public static void main(String[] args) {
        try {
            // Example usage
            String baseUri = "http://example.com/path/to/resource/";
            String relativeUri = "../another/resource";
            
            String resolvedUri = resolveRelativeUri(baseUri, relativeUri);
            System.out.println("Resolved URI: " + resolvedUri);

            // Additional test cases
            String[][] testCases = {
                {"http://example.com/path/to/resource/", "another/resource"},
                {"http://example.com/path/to/resource/", "./another/resource"},
                {"http://example.com/path/to/resource/", "/another/resource"},
                {"http://example.com/path/to/resource/", "../../another/resource"},
                {"http://example.com/path/to/resource/", "http://another.com/resource"}
            };

            for (String[] testCase : testCases) {
                String base = testCase[0];
                String rel = testCase[1];
                System.out.println("Base: " + base + ", Relative: " + rel + ", Resolved: " + resolveRelativeUri(base, rel));
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
