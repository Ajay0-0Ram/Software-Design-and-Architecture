package SmartDeviceFactory;

/*
 ** This is simply a utility to read the usage from a file.
 */

import java.io.*;
import java.util.Scanner;

public class UsageReader {
    public static double readValue(File input, String key) {
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith(key)) {
                    String[] parts = line.split("=");
                    return Double.parseDouble(parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

