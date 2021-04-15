package com.example.meningitis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RunActivity extends AppCompatActivity {

    public String url = "http://188.131.227.104:5003/";
    public String result;
    public String str_value = "";
    private Handler mHandler;
    private TextView textview;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);
        Intent intent =this.getIntent();
        Bundle data = intent.getExtras();
        str_value = data.getString("str");
        textview=findViewById(R.id.text2);

        Toast.makeText(getApplicationContext(),"请稍作等待，大脑正在运算",Toast.LENGTH_LONG).show();
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                result = msg.obj.toString();
                if(result.equals("1")){
                    textview.setText("优先考虑结核性脑膜炎");
                } else if(result.equals("2")){
                    textview.setText("优先考虑隐球菌脑膜炎");
                } else if(result.equals("3")){
                    textview.setText("优先考虑病毒性脑膜炎");
                } else if(result.equals("4")){
                    textview.setText("优先考虑化脓性脑膜炎");
                }
            }
        };
        Thread t=new Thread(runnable);
        t.start();


    }

    Runnable runnable = new Runnable() {
        @Override
        public void run()
        {
            android.os.Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
            OkHttpClient client = new OkHttpClient();

            FormBody body = new FormBody.Builder().add("inputdata", str_value).build();
            Request request = new Request.Builder().url("http://188.131.227.104:5003/").post(body).build();
            try {
                Response response = client.newCall(request).execute();
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

                String result1 = response.body().string();

                Message message=new Message();
                message.obj=result1;
                mHandler.sendMessage(message);


            } catch (Exception e1) {
                Log.d("exception", "run: " + e1.toString());
            }

        }
    };


}