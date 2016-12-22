package com.example.ravi.lokeshpractise.loginlogout;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ravi.lokeshpractise.LoginModel;
import com.example.ravi.lokeshpractise.R;
import com.example.ravi.lokeshpractise.Util;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginDemoActivity extends AppCompatActivity {

     private Util mUtil;
    SharedPreferences sharedPreferences;
     SharedPreferences.Editor editor;
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo);
         sharedPreferences=getSharedPreferences("prefName",MODE_APPEND);
        editor=sharedPreferences.edit();

        mSpinner = (Spinner) findViewById(R.id.spinner);


        mUtil=new Util();

        if(sharedPreferences.getString("state",null) == null) {
            Call<LoginModel> loginModelCall = mUtil.getBaseClassService(this, "").loginModelCall("9704897141", "reddy228");
            loginModelCall.enqueue(new Callback<LoginModel>() {
                @Override
                public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                    LoginModel loginModel = response.body();
                    String logingstatus = loginModel.getStatus();
                        editor.putString("state", loginModel.getStatus());

                    editor.apply();
                        Toast.makeText(LoginDemoActivity.this, "Login success!", Toast.LENGTH_SHORT).show();




                }

                @Override
                public void onFailure(Call<LoginModel> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "Retro error!", Toast.LENGTH_SHORT).show();

                }
            });
        }else{
            String email = sharedPreferences.getString("userEmail",null);
            Toast.makeText(this, "Already Login ", Toast.LENGTH_SHORT).show();
        }

    }


    public void logout(View view){
            sharedPreferences.edit().clear().commit();
    }
}
