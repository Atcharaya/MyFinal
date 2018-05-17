package com.example.asus.myfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.asus.myfinal.adapter.RvAdapter;
import com.example.asus.myfinal.model.PhotoDao;
import com.example.asus.myfinal.model.UserdataDao;
import com.example.asus.myfinal.service.HttpManager;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        serviceData();//ฟังก์ชัน

    }

    private void serviceData() {
        Call<List<UserdataDao>> call = HttpManager.getInstance().getService().getuserdata();
        call.enqueue(new Callback<List<UserdataDao>>() {
            @Override
            public void onResponse(Call<List<UserdataDao>> call, Response<List<UserdataDao>> response) {
                if (response.isSuccessful()){
                    List<UserdataDao> user = response.body();
                    Log.d("serviceData", "if :: " + user.size());
//                    RvAdapter adapter = new RvAdapter(user);
//                    recyclerView.setAdapter(adapter);
                    photoData(user);
                }else{
                    try {
                        Log.d("serviceData", "else :: " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<UserdataDao>> call, Throwable t) {
                Log.d("serviceData", "onFailure :: " + t);
            }
        });
    }

    private void photoData(final List<UserdataDao> user){
        Call<List<PhotoDao>> call = HttpManager.getInstance().getService().getphotodata();
        call.enqueue(new Callback<List<PhotoDao>>() {
            @Override
            public void onResponse(Call<List<PhotoDao>> call, Response<List<PhotoDao>> response) {
                if (response.isSuccessful()){
                    List<PhotoDao> photo = response.body();
                    Log.d("serviceData", "if :: " + photo.size());
                    RvAdapter adapter = new RvAdapter(user,photo);
                    recyclerView.setAdapter(adapter);
                }else{
                    try {
                        Log.d("serviceData", "else :: " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<PhotoDao>> call, Throwable t) {
                Log.d("serviceData", "onFailure :: " + t);
            }
        });
    }

}
