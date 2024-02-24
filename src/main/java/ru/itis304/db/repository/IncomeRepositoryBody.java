package ru.itis304.db.repository;

import ru.itis304.db.model.Income;

public class IncomeRepositoryBody implements IncomeRepository {
    @Override
    public Income getAll() {
        return null;
    }

    @Override
    public void save(Income income) {

        JSONObject resultJson = new JSONObject();

        resultJson.put("name","foo");
        resultJson.put("num",new Integer(100));
        resultJson.put("is_vip",new Boolean(true));
        resultJson.put("nickname",null);
        System.out.print(obj.toString());
        // {"name": "foo", "num": 100, "is_vip": true, "nickname: null}


        JSONArray ar = new JSONArray();
        JSONObject obj = new JSONObject();
        JSONObject resultJson = new JSONObject();

        ar.add("first");
        ar.add(new Integer(100));

        obj.put("one", "two");
        obj.put("three", "four");

        resultJson.put("paramsArray", ar);
        resultJson.put("paramsObj", obj);
        resultJson.put("paramsStr", "some string");
        System.out.print(obj.toString());
        // {"paramsArray": ["first", 100],
        //  "paramsObj": {"one": "two", "three": "four"},
        //  "paramsStr": "some string"}
    }
}
