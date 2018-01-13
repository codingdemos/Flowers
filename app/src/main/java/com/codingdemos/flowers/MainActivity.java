package com.codingdemos.flowers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<FlowerData> mFlowerList;
    FlowerData mFlowerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mFlowerList = new ArrayList<>();
        mFlowerData = new FlowerData("Rose", getString(R.string.description_flower_rose),
                R.drawable.rose);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Carnation", getString(R.string.description_flower_carnation),
                R.drawable.carnation);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Tulip", getString(R.string.description_flower_tulip),
                R.drawable.tulip);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Daisy", getString(R.string.description_flower_daisy),
                R.drawable.daisy);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Sunflower", getString(R.string.description_flower_sunflower),
                R.drawable.sunflower);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Daffodil", getString(R.string.description_flower_daffodil),
                R.drawable.daffodil);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Gerbera", getString(R.string.description_flower_gerbera),
                R.drawable.gerbera);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Orchid", getString(R.string.description_flower_orchid),
                R.drawable.orchid);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Iris", getString(R.string.description_flower_iris),
                R.drawable.lris);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Lilac", getString(R.string.description_flower_lilac),
                R.drawable.lilac);
        mFlowerList.add(mFlowerData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mFlowerList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
