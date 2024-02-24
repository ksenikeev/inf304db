package ru.itis304.db.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {

        String dataFromStr = "2024-01-30 12:09";
        String dataToStr = "2024-02-03 10:09";

        Date dateFrom = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                .parse(dataFromStr);

        Date dateTo = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                .parse(dataToStr);

        System.out.println(new Date());

        System.out.println(dateFrom.before(dateTo));
        System.out.println(dateFrom.after(dateTo));
    }
}
