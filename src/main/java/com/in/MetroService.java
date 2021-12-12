package com.in;
import com.in.model.States;

import java.util.ArrayList;
import java.util.List;

public class MetroService {
    public List getCities(States type) {

        List cities = new ArrayList();

        if (type.equals(States.Maharashtra)) {
            cities.add("Mumbai");
            cities.add("Pune");
            cities.add("Nagpur");

        } else if (type.equals(States.Tamilnadu)) {
            cities.add("Chennai");
            cities.add("Madurai");
            cities.add("Coimbatore");
            cities.add("Salem");

        } else if (type.equals(States.Gujarat)) {
            cities.add("Ahmedabad");
            cities.add("Surat");

        } else {
            cities.add("No city found. ");
        }
        return cities;
    }
}
