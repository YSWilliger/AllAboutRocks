package com.maza.allaboutrocks;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button goQuizButton, sedButton, iggyButton, metaButton, cycleButton, exitButton;
    TextView rockTextView;
    RelativeLayout textRelativeLayout;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up buttons

        goQuizButton = (Button) findViewById(R.id.goQuizButton);
        sedButton = (Button) findViewById(R.id.sedButton);
        iggyButton = (Button) findViewById(R.id.iggyButton);
        metaButton = (Button) findViewById(R.id.metaButton);
        cycleButton = (Button) findViewById(R.id.cycleButton);
        exitButton = (Button) findViewById(R.id.exitButton);

        // set up click listeners enabled

        goQuizButton.setOnClickListener(this);
        sedButton.setOnClickListener(this);
        iggyButton.setOnClickListener(this);
        metaButton.setOnClickListener(this);
        cycleButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);

        //declate relative layout & textviews

        textRelativeLayout = (RelativeLayout) findViewById(R.id.textRelativeLayout);
        textRelativeLayout.setVisibility(View.INVISIBLE);
        rockTextView = (TextView) findViewById(R.id.rockTextView);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.sedButton:
                textRelativeLayout.setVisibility(View.VISIBLE);
                rockTextView.setText("Rocks break down through weathering. " +
                        "The broken rocks turn into sediment. " +
                        "Sediment is cemented into sedimentary rocks. " +
                        "Sedimentary rocks are made at the surface of the Earth," +
                        "not deep underground like metamorphic rock." +
                        " Because sedimentary rock is made from layers of sediment, " +
                        "this is the kind of rock in which you find dinosaur fossils.");
                goQuizButton.setVisibility(View.INVISIBLE);
                sedButton.setVisibility(View.INVISIBLE);
                iggyButton.setVisibility(View.INVISIBLE);
                metaButton.setVisibility(View.INVISIBLE);
                cycleButton.setVisibility(View.INVISIBLE);
                break;
            case R.id.iggyButton:
                textRelativeLayout.setVisibility(View.VISIBLE);
                rockTextView.setText("Deep inside the Earth the temperature is very hot.  " +
                        "It is so hot that it melts rock.  The melted rock is called magma.  " +
                        "When a volcano erupts the magma pours out.  " +
                        "When magma comes out of the volcano it is called lava.  " +
                        "Once it cools it becomes igneous rock.");
                goQuizButton.setVisibility(View.INVISIBLE);
                sedButton.setVisibility(View.INVISIBLE);
                iggyButton.setVisibility(View.INVISIBLE);
                metaButton.setVisibility(View.INVISIBLE);
                cycleButton.setVisibility(View.INVISIBLE);
                break;
            case R.id.metaButton:
                textRelativeLayout.setVisibility(View.VISIBLE);
                rockTextView.setText("The weight of the ground presses down on rocks that are deep " +
                        "under the surface. Metamorphic rocks are made when underground rocks " +
                        "are pressed and heated. They are not hot enough to melt and turn into " +
                        "magma, but they are heated enough to change them from sedimentary " +
                        "to metamorphic. Lines of are bent and wavy.");
                goQuizButton.setVisibility(View.INVISIBLE);
                sedButton.setVisibility(View.INVISIBLE);
                iggyButton.setVisibility(View.INVISIBLE);
                metaButton.setVisibility(View.INVISIBLE);
                cycleButton.setVisibility(View.INVISIBLE);
                break;
            case R.id.cycleButton:
                textRelativeLayout.setVisibility(View.VISIBLE);
                rockTextView.setText("What is the rock cycle?\n" +
                        "\n" +
                        "Rocks are slowly changing. A rock can start as a piece of " +
                        "sediment, become a sedimentary rock, " +
                        "s it is pushed deeper into the Earth it can change " +
                        "into a metamorphic rock.  Then it can melt, become " +
                        "magma that is shot to the surface through a volcano " +
                        "and cool to become an igneous rock.  " +
                        "It can go through this change over and over and over, " +
                        "that is why it's called a cycle.");
                goQuizButton.setVisibility(View.INVISIBLE);
                sedButton.setVisibility(View.INVISIBLE);
                iggyButton.setVisibility(View.INVISIBLE);
                metaButton.setVisibility(View.INVISIBLE);
                cycleButton.setVisibility(View.INVISIBLE);
                break;
            case R.id.exitButton:
                textRelativeLayout.setVisibility(View.INVISIBLE);
                goQuizButton.setVisibility(View.VISIBLE);
                sedButton.setVisibility(View.VISIBLE);
                iggyButton.setVisibility(View.VISIBLE);
                metaButton.setVisibility(View.VISIBLE);
                cycleButton.setVisibility(View.VISIBLE);
                break;
            case R.id.goQuizButton:
                Intent i = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(i);
                break;

        }

    }


}
