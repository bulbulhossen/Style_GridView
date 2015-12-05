package com.example.bulbulhossen.stylegridview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */

    private GridviewAdapter mAdapter;
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;

    private GridView gridView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listCountry, listFlag);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(MainActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void prepareList()
    {
        listCountry = new ArrayList<String>();

        listCountry.add("ইন্ডিয়া");
        listCountry.add("ব্রাজিল");
        listCountry.add("কানাডা");
        listCountry.add("চীন");
        listCountry.add("ফ্রান্স");
        listCountry.add("জার্মানি");
        listCountry.add("ইরান");
        listCountry.add("ইতালি");
        listCountry.add("জাপান");
        listCountry.add("কোরিয়া");
        listCountry.add("Mexico");
        listCountry.add("Netherlands");
        listCountry.add("Portugal");
        listCountry.add("Russia");
        listCountry.add("Saudi Arabia");
        listCountry.add("Spain");
        listCountry.add("Turkey");
        listCountry.add("United Kingdom");
        listCountry.add("United States");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.india);
        listFlag.add(R.drawable.brazil);
        listFlag.add(R.drawable.canada);
        listFlag.add(R.drawable.china);
        listFlag.add(R.drawable.france);
        listFlag.add(R.drawable.germany);
        listFlag.add(R.drawable.iran);
        listFlag.add(R.drawable.italy);
        listFlag.add(R.drawable.japan);
        listFlag.add(R.drawable.korea);
        listFlag.add(R.drawable.mexico);
        listFlag.add(R.drawable.netherlands);
        listFlag.add(R.drawable.portugal);
        listFlag.add(R.drawable.russia);
        listFlag.add(R.drawable.saudi_arabia);
        listFlag.add(R.drawable.spain);
        listFlag.add(R.drawable.turkey);
        listFlag.add(R.drawable.united_kingdom);
        listFlag.add(R.drawable.united_states);
    }

}