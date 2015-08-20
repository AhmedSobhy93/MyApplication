package com.example.ahmed.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Home_Page extends ActionBarActivity implements View.OnClickListener{

    TextView empNameTV,empPositionTV;
    ImageView empPicIV;
    Button submitNewsBtn,submitProbBtn,showNewsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);

        empNameTV = (TextView)findViewById(R.id.Home_EmpName_TV);
        empPositionTV = (TextView)findViewById(R.id.Home_Position_TV);

        empPicIV = (ImageView)findViewById(R.id.Home_EmpPic_IV);

        submitNewsBtn = (Button)findViewById(R.id.Home_SubmitNews_Btn);
        submitProbBtn = (Button)findViewById(R.id.Home_Problems_Btn);
        showNewsBtn = (Button)findViewById(R.id.Home_ShowNews_Btn);

        submitNewsBtn.setOnClickListener(this);
        submitProbBtn.setOnClickListener(this);
        showNewsBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==submitNewsBtn){

        }else if(v==submitProbBtn){

        }else if(v==showNewsBtn){

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home__page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
