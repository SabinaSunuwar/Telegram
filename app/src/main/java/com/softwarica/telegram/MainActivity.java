package com.softwarica.telegram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<User> userList = new ArrayList<>();
        userList.add(new User("Sumina Maharjan", "Hello, How are you doing?",R.drawable.sumina));
        userList.add(new User("Yangchen Sherpa", "How is your study going on?",R.drawable.yangchen));
        userList.add(new User("Simron Shrestha", "Get Well Soon.", R.drawable.simron));
        userList.add(new User("Lakpa Doma Sherpa","How was your London Trip?", R.drawable.lakpa));
        userList.add(new User("Anju Shrestha","Long time no see!", R.drawable.anju));
        userList.add(new User("Dikki Sherpa","What's up Dikki?", R.drawable.dikki));



        UserAdapter userAdapter = new UserAdapter(this,userList);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));


    }
}
