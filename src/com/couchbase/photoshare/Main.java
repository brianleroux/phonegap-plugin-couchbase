package com.couchbase.photoshare;

import android.app.Activity;
import android.os.Bundle;

import com.couchbase.libcouch.CouchDB;
import com.couchbase.libcouch.ICouchClient;
import com.phonegap.*;


public class Main extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
    
    private final ICouchClient mCallback = new ICouchClient.Stub() {
    	  @Override
    	  public void couchStarted(String host, int port) {}

    	  @Override
    	  public void installing(int completed, int total) {}

    	  //@Override
    	  // public void downloading(int completed, int total) {}

    	  @Override
    	  public void exit(String error) {}
    };

    //ServiceConnection couchServiceConnection = CouchDB.getService(getBaseContext(), null, release, mCallback);
}

