package com.itcelaya.cosmosexplorerdemo.DTO;

import java.util.List;

public class SolarSystemDto {
    // Esta clase representa la respuesta completa de la API
    private List<Body> bodies;

    public List<Body> getBodies() { return bodies; }

    // Esta clase interna representa cada planeta/cuerpo
    public static class Body {
        private String id;
        private String englishName;
        private String bodyType; // Ej: Planet, Moon
        private Float gravity;

        // --- NUEVOS CAMPOS ---
        private Float meanRadius;      // Radio
        private Float density;         // Densidad
        private String discoveredBy;   // Descubridor
        private String discoveryDate;  // Fecha

        // --- GETTERS (Necesarios para que funcionen los otros archivos) ---
        public String getId() { return id; }
        public String getEnglishName() { return englishName; }
        public String getBodyType() { return bodyType; }
        public Float getGravity() { return gravity; }

        // Getters Nuevos
        public Float getMeanRadius() { return meanRadius; }
        public Float getDensity() { return density; }
        public String getDiscoveredBy() { return discoveredBy; }
        public String getDiscoveryDate() { return discoveryDate; }

        @Override
        public String toString() { return englishName; }
    }
}