package ru.itis304.db.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class SpendingRepos implements SpendingRepository {

    package ru.itis304.db.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.model.SpendingType;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

    public class SpendingRepos implements SpendingRepository{

//       Первый код написал не я, второй пытался написать я
        /*@Override
        public List<SpendingData> findAll() {
            // !!! Change path to JSON file for yourself
            return parseJsonFromFile(new File("/home/none/Downloads/inf304db/src/main/java/ru/itis304/db/repository/spending.json"));
        }

        private static List<SpendingData> parseJsonFromFile(File jsonFile) {
            // Create a list to store the parsed SpendingData objects
            List<SpendingData> spendingDataList = new ArrayList<>();

            try {
                // Create an ObjectMapper to read and parse JSON
                ObjectMapper objectMapper = new ObjectMapper();

                // Read the JSON data from the file and get the "spending" array node
                JsonNode jsonNode = objectMapper.readTree(jsonFile).get("spending");

                // Check if the node is an array
                if (jsonNode.isArray()) {
                    // Iterate over each element in the "spending" array
                    for (JsonNode node : jsonNode) {
                        // Parse individual fields from the JSON node
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        Date date = dateFormat.parse(node.get("date").asText());
                        Float sum = node.get("sum").floatValue();
                        SpendingType category = SpendingType.valueOf(node.get("category").asText());
                        String description = node.get("description").asText();

                        // Create a SpendingData object with parsed values
                        SpendingData spendingData = new SpendingData(date, sum, category, description);

                        // Add the SpendingData object to the list
                        spendingDataList.add(spendingData);
                    }
                }
            } catch (IOException | ParseException e) {
                // Handle potential exceptions during JSON parsing or date formatting
                e.printStackTrace();
            }

            // Return the list of parsed SpendingData objects
            return spendingDataList;
        }
    }*/

    /*@Override
    public Spending getAll() {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Map<?, ?> map = mapper.readValue(Paths.get("spending.json").toFile(), Map.class);

            List<SpendingData> list = new ArrayList<>();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                list.add((SpendingData) entry.getValue());
            }

            Spending spending = new Spending();
            spending.setSpending(list);
            return spending;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }*/

    @Override
    public void save(Spending income) {

    }
}
