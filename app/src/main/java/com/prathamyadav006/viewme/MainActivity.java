package com.prathamyadav006.viewme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showPop(View v){
        PopupMenu popupMenu = new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.pop_menu);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.name:
                Toast.makeText(this, "Name: Lion", Toast.LENGTH_SHORT).show();
                break;
            case R.id.LifeSpan:
                Toast.makeText(this, "Life Span: 20 years", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dangerLevel:
                Toast.makeText(this, "Danger LeveL: 9", Toast.LENGTH_SHORT).show();
                break;
            case R.id.foodClass:
                Toast.makeText(this, "Food Class: Carnivore", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}