
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TemperatureReader {

    public static void main(String[] args) {

        String address = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double totalTemperature = 0;
        int measurementCount = 0;

        try {
            URL url = new URL(address);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            url.openStream(), StandardCharsets.UTF_8));

            String line = reader.readLine();

            // Find the UlkoTalo column
            String[] headers = line.split(";", -1);
            int temperatureColumn = -1;

            for (int i = 0; i < headers.length; i++) {
                String header = headers[i].replace("\uFEFF", "").trim();

                if (header.equals("UlkoTalo")) {
                    temperatureColumn = i;
                    break;
                }
            }

            if (temperatureColumn == -1) {
                System.out.println("UlkoTalo column not found.");
                reader.close();
                return;
            }

            // Read the measurement rows
            while ((line = reader.readLine()) != null) {

                String[] columns = line.split(";", -1);

                if (columns.length <= temperatureColumn) {
                    continue;
                }

                String date = columns[0].trim();

                if (date.startsWith("01.01.2023")) {

                    String temperature =
                            columns[temperatureColumn].trim();

                    if (!temperature.isEmpty()) {
                        temperature = temperature.replace(",", ".");

                        try {
                            double value = Double.parseDouble(temperature);

                            totalTemperature += value;
                            measurementCount++;

                        } catch (NumberFormatException e) {
                            // Skip invalid temperature values
                        }
                    }
                }
            }

            reader.close();

            if (measurementCount > 0) {
                double average = totalTemperature / measurementCount;

                System.out.println("Measurements: " + measurementCount);
                System.out.println("Average temperature: "
                        + average + " C");
            } else {
                System.out.println("No measurements found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
