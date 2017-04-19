package com.almaral.mascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView petRecycler = (RecyclerView) findViewById(R.id.activity_main_pet_recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        petRecycler.setLayoutManager(linearLayoutManager);

        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Pet("Sia", getString(R.string.pet_description), "Sandra", "555-55-55", R.drawable.sia));
        petList.add(new Pet("Pun", getString(R.string.pet_description), "Jesus", "555-55-55", R.drawable.pun));
        petList.add(new Pet("Catrina", getString(R.string.pet_description), "Myriam", "555-55-55", R.drawable.catrina));
        petList.add(new Pet("Husk", getString(R.string.pet_description), "Ulises", "555-55-55", R.drawable.husk));
        petList.add(new Pet("Capitano", getString(R.string.pet_description), "Omar", "555-55-55", R.drawable.capitano));
        petList.add(new Pet("Noodles", getString(R.string.pet_description), "Claudia", "555-55-55", R.drawable.noodles));
        petList.add(new Pet("Tut", getString(R.string.pet_description), "Gabriela", "555-55-55", R.drawable.tut));
        petList.add(new Pet("Pal", getString(R.string.pet_description), "Arturo", "555-55-55", R.drawable.pal));

        PetAdapter petAdapter = new PetAdapter(this, petList);
        petRecycler.setAdapter(petAdapter);

        petAdapter.setOnPetClickListener(new PetAdapter.OnPetClickListener() {
            @Override
            public void onPetClick(Pet pet) {
                Toast.makeText(MainActivity.this, pet.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}