package com.almaral.mascotas;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String PET_KEY = "pet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_activity_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Bundle extras = getIntent().getExtras();
        Pet pet = extras.getParcelable(PET_KEY);

        if (pet != null) {
            TextView petName = (TextView) findViewById(R.id.activity_detail_pet_name);
            TextView petDescription = (TextView) findViewById(R.id.activity_detail_pet_description);
            TextView ownerName = (TextView) findViewById(R.id.activity_detail_owner_name);
            TextView ownerPhoneNumber = (TextView) findViewById(R.id.activity_detail_owner_phone_number);
            ImageView petImage = (ImageView) findViewById(R.id.activity_detail_pet_image);

            petName.setText(pet.getName());
            petDescription.setText(pet.getDescription());
            ownerName.setText(pet.getOwnerName());
            ownerPhoneNumber.setText(pet.getPhoneNumber());
            petImage.setImageDrawable(ContextCompat.getDrawable(this, pet.getImageId()));
        }
    }
}
