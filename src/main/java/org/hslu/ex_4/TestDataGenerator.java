package org.hslu.ex_4;


import java.util.ArrayList;
import java.util.List;

public class TestDataGenerator {
    public static List<Dummy> generateDummy(int numberOfElements) {
        List<Dummy> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(new Dummy());
        }
        return list;
    }
}
