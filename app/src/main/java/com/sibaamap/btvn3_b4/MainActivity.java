package com.sibaamap.btvn3_b4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter userAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();

        rcvUser = findViewById(R.id.rvc_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);

    }
    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.foderimg,"Vedeo"));
        list.add(new User(R.drawable.foderimg,"Android"));
        list.add(new User(R.drawable.foderimg,"Applock"));
        list.add(new User(R.drawable.foderimg,"Books"));
        list.add(new User(R.drawable.foderimg,"map"));
        list.add(new User(R.drawable.foderimg,"Autheticate Using Google..."));
        list.add(new User(R.drawable.foderimg,"New folder"));
        list.add(new User(R.drawable.foderimg,"New folder"));

        return list;
    }
    private void initToolbar(){
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

}