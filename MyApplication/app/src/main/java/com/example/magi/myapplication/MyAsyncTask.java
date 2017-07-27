package com.example.magi.myapplication;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by magi on 2017/5/20.
 */

public class MyAsyncTask extends AsyncTask<Void,Void,Void>{
    @Override
    protected Void doInBackground(Void... params) {
        Log.d("magi","doInBackground");
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("magi","onPreExecute");
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d("magi","onPostExecute");
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
        Log.d("magi","onProgressUpdate");
    }

}
