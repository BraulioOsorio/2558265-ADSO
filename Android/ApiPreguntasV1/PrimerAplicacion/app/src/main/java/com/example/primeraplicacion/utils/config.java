package com.example.primeraplicacion.utils;

import android.content.Context;
import android.content.res.Resources;

import androidx.annotation.NonNull;

import com.example.primeraplicacion.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class config {
    String apiHost;
    public config(Context context){
        Resources res = context.getResources();
        InputStream inputStream = res.openRawResource(R.raw.config);

        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            apiHost = properties.getProperty("api_host");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String getApiHost(){return apiHost;}
    public String getEndPoint(String endpoint){
        endpoint = endpoint.replaceFirst("/","");

        return apiHost+"/"+endpoint;
    }
}
