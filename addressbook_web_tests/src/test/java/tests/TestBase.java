package tests;

import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Random;

public class TestBase {

    protected static ApplicationManager app;

    @BeforeEach
    public void setUp() throws IOException {
        if (app == null) {
            var properties = new Properties();
            properties.load(new FileReader(System.getProperty("target", "local.properties")));
            app = new ApplicationManager();
            app.init(System.getProperty("browser", "chrome"), properties);
        }
    }

    public static String randomString(int n) {
        var rnd = new Random();
        var result = "";
        for (int i = 0; i < n; i++) {
            result = result + (char)('a'+ rnd.nextInt(26));
        }
        return result;
    }

    public static String randomFile(String dir) {
        var fileName = new File(dir).list();
        var rnd = new Random();
        var index = rnd.nextInt(fileName.length);
        return Paths.get(dir, fileName[index]).toString();
    }
}