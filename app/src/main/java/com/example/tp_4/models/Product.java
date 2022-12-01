package com.example.tp_4.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Product extends RealmObject {
    @PrimaryKey
    private long id;
    @Required
    public String p_intitule;
    private float p_prix;
    private int id_image;

    public long getId() {
        return id;
    }
}
