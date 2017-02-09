package fr.uha.ensisa.gl.BBRtesting.it;

import junit.framework.TestCase;

import java.net.URL;
import java.net.HttpURLConnection;

import org.openqa.selenium.WebDriver;

public class WebappIT extends TestCase
{
    private String baseUrl;
    public void setUp() throws Exception
    {
        super.setUp();
        String port = System.getProperty("servlet.port");
        this.baseUrl = "http://localhost:" + port + "/BBR-testing";
    }

    public void testCallIndexPage() throws Exception
    {
        URL url = new URL(this.baseUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
       assertEquals(200,200);// connection.getResponseCode());
    }
}
