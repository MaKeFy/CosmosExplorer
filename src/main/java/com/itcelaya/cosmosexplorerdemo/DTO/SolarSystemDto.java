package com.itcelaya.cosmosexplorerdemo.DTO;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SolarSystemDto {

    private List<Body> bodies;

    public List<Body> getBodies() { return bodies; }


    public static class Body {
        private String id;
        private String englishName;
        private String bodyType;
        private Float gravity;


        public String getId() { return id; }
        public String getEnglishName() { return englishName; }
        public String getBodyType() { return bodyType; }
        public Float getGravity() { return gravity; }

        @Override
        public String toString() { return englishName; }
    }
}