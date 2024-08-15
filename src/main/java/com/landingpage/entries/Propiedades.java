package com.landingpage.entries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Propiedades {


    private String titulo;
    private List<String> secciones = new ArrayList<String>();
    private Map<String,Integer> articulos = new HashMap<String,Integer>();

    public Propiedades()
    {
        titulo = "Page new";
        
        secciones.add("HOME");
        secciones.add("SERVICE");
        secciones.add("ARTICULOS");
        secciones.add("CONTACTO");

        articulos.put("PRESS", 9500);
        articulos.put("SOFT", 9500);
        articulos.put("SEMI", 8500);
        articulos.put("CAPPING", 7500);

    }

}
