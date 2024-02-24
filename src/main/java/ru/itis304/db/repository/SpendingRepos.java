package ru.itis304.db.repository;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import ru.itis304.db.model.Spending;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class SpendingRepos implements SpendingRepository {

    @Override
    public Spending getAll() {
        return null;
    }

    @Override
    public void save(Spending income) {
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator jGenerator = null;
        try {
            jGenerator = jsonFactory.createGenerator(new File("spending.json"), JsonEncoding.UTF8);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            jGenerator.writeStartObject();

            jGenerator.writeFieldName("spending");
            jGenerator.writeStartArray();

            for (int i = 0; i < income.getSpending().size(); i++) {
                jGenerator.writeStartObject();
                jGenerator.writeStringField("date", simpleDateFormat.format(income.getSpending().get(i).getDate()));
                jGenerator.writeNumberField("sum", income.getSpending().get(i).getSum());
                jGenerator.writeStringField("category", income.getSpending().get(i).getCategory().toString());
                jGenerator.writeStringField("description", income.getSpending().get(i).getDescription());
                jGenerator.writeEndObject();
                //jGenerator.writeObject(income.getSpending().get(i));
            }
            jGenerator.writeEndArray();

            jGenerator.writeEndObject();
            jGenerator.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
