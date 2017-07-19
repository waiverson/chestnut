package com.abear.chestnut.models.IndustryModel;

import java.util.*;

/**
 * Created by xyc on 2017/6/16.
 */
public class HighEducation extends AbstractDeskIndustry {

    private String name = "High Education";
    private int id = 1;
    private int year;
    private int type;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public static final Map<String, Integer> createYear = Collections.unmodifiableMap(new HashMap<String, Integer>() {
        {
            put("min", 1000);
            put("max", Calendar.YEAR);
        }
    });

    public static final Map<String, Integer> collegeType = Collections.unmodifiableMap(new HashMap<String, Integer>() {
        {
            put("Engineering", 1);
            put("Medicine", 3);
            put("Other", 14);
            put("None", 0);
        }
    });

    @Override
    public String toString() {
        return this.name + "#"
                + this.id + "#"
                + this.type + "#"
                + this.year;
    }
}
