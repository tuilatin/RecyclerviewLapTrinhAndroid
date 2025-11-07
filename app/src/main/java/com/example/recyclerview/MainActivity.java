package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView_144;
    List<Phone> phoneList_144;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_144 = findViewById(R.id.recyclerView_144);
        phoneList_144 = new ArrayList<>();

        phoneList_144.add(new Phone("Xiaomi Mi 10", "₫13,000,000"));
        phoneList_144.add(new Phone("iPhone X", "₫17,000,000"));
        phoneList_144.add(new Phone("iPhone 11", "₫17,000,000"));
        phoneList_144.add(new Phone("Samsung Galaxy S10", "₫14,000,000"));
        phoneList_144.add(new Phone("Oppo Reno 3", "₫14,000,000"));
        phoneList_144.add(new Phone("Samsung Note 10", "₫16,000,000"));

        PhoneAdapter adapter_144 = new PhoneAdapter(this, phoneList_144);
        recyclerView_144.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_144.setAdapter(adapter_144);
    }
}

