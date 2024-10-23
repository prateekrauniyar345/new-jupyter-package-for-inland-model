import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.prediction.RegressionModelPrediction;
import hex.genmodel.MojoModel;
import com.google.gson.Gson;

public class main1 {
    public static void main(String[] args) throws Exception {
        
        // Check if CSV file path is provided as argument
        if (args.length == 0) {
            System.out.println("Usage: java -jar model_predictions.jar <csvFilePath>");
            return;
        }


        // Load the MOJO model
        EasyPredictModelWrapper model = new EasyPredictModelWrapper(MojoModel.load("GBM_model_python_1728155641626_6.zip"));

         // Path to the CSV file (passed as an argument)
        String csvFilePath = args[0];

        // List to store all TPA predictions
        List<Double> predictions = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(csvFilePath));
            if (lines.isEmpty()) {
                throw new IOException("The CSV file is empty.");
            }

            // Read the header row
            String[] headers = lines.get(0).split(",");

            // Process each line of the CSV file
            for (int i = 1; i < lines.size(); i++) {
                String[] line = lines.get(i).split(",");
                RowData row = new RowData();

                // Populate the RowData with feature values from the CSV
                for (int j = 0; j < headers.length; j++) {
                    row.put(headers[j], line[j]);
                }

                // Make prediction
                RegressionModelPrediction p = model.predictRegression(row);
                double predictedValue = p.value;

                // Add the prediction to the list
                predictions.add(predictedValue);
            }

            // Calculate statistics
            double mean = calculateMean(predictions);
            double median = calculateMedian(predictions);
            double highestValue = Collections.max(predictions);
            double lowestValue = Collections.min(predictions);
            double mode = calculateMode(predictions);

            // Construct response object
            Map<String, Object> response = new HashMap<>();
            // response.put("predictions", predictions);
            response.put("mean", mean);
            response.put("median", median);
            response.put("highestValue", highestValue);
            response.put("lowestValue", lowestValue);
            response.put("mode", mode);

            // Convert response object to JSON
            Gson gson = new Gson();
            String jsonResponse = gson.toJson(response);

            // Print JSON response
            System.out.println(jsonResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateMean(List<Double> values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    private static double calculateMedian(List<Double> values) {
        Collections.sort(values);
        int size = values.size();
        if (size % 2 == 0) {
            return (values.get(size / 2 - 1) + values.get(size / 2)) / 2.0;
        } else {
            return values.get(size / 2);
        }
    }

    private static double calculateMode(List<Double> values) {
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double value : values) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        double mode = values.get(0);
        int maxCount = 0;

        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
