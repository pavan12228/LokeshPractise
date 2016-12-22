package com.example.ravi.lokeshpractise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ravi.lokeshpractise.models.First;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
        private Util mUtil;
    private TextView mTextView;
    private Spinner spinner;

    List<String> strings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+strings.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "select ", Toast.LENGTH_SHORT).show();

            }
        });



        mUtil = new Util();
        if(mUtil.isNetworkAvailable(this)) {
            Call<List<First>> call = mUtil.getBaseClassService(this, "").pavan();
            call.enqueue(new Callback<List<First>>() {
                @Override
                public void onResponse(Call<List<First>> call, Response<List<First>> response) {
                    if(response.isSuccessful()) {
                        List<First> firstList = response.body();
                        for (int i = 0; i < firstList.size(); i++) {
                             strings.add(firstList.get(i).getTitle());
                        }

                    }else {
                        Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                    }

                }
                 @Override
                public void onFailure(Call<List<First>> call, Throwable t) {

                }
            });

        }

        else {
            Toast.makeText(this, "No Network", Toast.LENGTH_SHORT).show();
        }

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,strings);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
    }
}
