package ru.itis304.db.repository;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis304.db.model.SpendingData;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SpendingRepos implements SpendingRepository {

    @Override
    public List<SpendingData> findAll() {
        return null;
    }

    @Override
    public void save(SpendingData spendingData) {
        List<SpendingData> dataList = findAll();
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator jGenerator;
        try {
            jGenerator = jsonFactory.createGenerator(new File("spending.json"), JsonEncoding.UTF8);
            jGenerator.setCodec(new ObjectMapper());

            jGenerator.writeStartObject();
            jGenerator.writeFieldName("spending");
            jGenerator.writeStartArray();

            for (SpendingData data : dataList) jGenerator.writeObject(data);
            jGenerator.writeObject(spendingData);

            jGenerator.writeEndArray();
            jGenerator.writeEndObject();
            jGenerator.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SpendingData> findByPeriod(String dateFrom, String dateTo) {
        return null;
    }
}
