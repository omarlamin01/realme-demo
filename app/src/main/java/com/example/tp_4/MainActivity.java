package com.example.tp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tp_4.models.Achat;
import com.example.tp_4.models.Product;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Product produit = realm.createObject(Product.class, 1L);
        produit.setP_intitule("Ordinateur HP");
        produit.setP_prix(5);
        Achat achat = realm.createObject(Achat.class);
        achat.addProduct(produit);
        realm.commitTransaction();
        RealmResults<Product> results = realm
                .where(Product.class)
                .findAll();
        for(Product item :results) {
            System.out.println("****************************" + item.toString());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}