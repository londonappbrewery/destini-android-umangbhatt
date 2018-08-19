package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button Response1;
    Button Response2;
    int StoryProgress = 1;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
         storyText = (TextView) findViewById(R.id.storyTextView);
         Response1 = (Button) findViewById(R.id.buttonTop);
         Response2 = (Button) findViewById(R.id.buttonBottom);

         storyText.setText(R.string.T1_Story);
         Response1.setText(R.string.T1_Ans1);
         Response2.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
         Response1.setOnClickListener (new View.OnClickListener(){
             @Override
             public void onClick(View v) {

                if(StoryProgress == 1){
                 storyText.setText(R.string.T3_Story);
                 Response1.setText(R.string.T3_Ans1);
                 Response2.setText(R.string.T3_Ans2);
                 StoryProgress = 3;}
                 else
                     if(StoryProgress == 3){
                         storyText.setText(R.string.T6_End);
                         Response1.setVisibility(View.INVISIBLE);
                         Response2.setVisibility(View.INVISIBLE);
                         StoryProgress = 6;
                     }
                     else
                         if(StoryProgress == 2 )
                         {
                             storyText.setText(R.string.T3_Story);
                             Response1.setText(R.string.T3_Ans1);
                             Response2.setText(R.string.T3_Ans2);
                             StoryProgress = 3;
                         }

             }});




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
         Response2.setOnClickListener (new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                if(StoryProgress == 1){
                 storyText.setText(R.string.T2_Story);
                 Response1.setText(R.string.T2_Ans1);
                 Response2.setText(R.string.T2_Ans2);
                 StoryProgress = 2;}
                 else
                     if(StoryProgress == 3){
                         storyText.setText(R.string.T5_End);
                         Response1.setVisibility(View.INVISIBLE);
                         Response2.setVisibility(View.INVISIBLE);
                         StoryProgress = 5;
                     }
                     else
                         if(StoryProgress == 2)
                         {
                             storyText.setText(R.string.T4_End);
                             Response1.setVisibility(View.INVISIBLE);
                             Response2.setVisibility(View.INVISIBLE);
                             StoryProgress = 4;
                         }


             }});


    }
}
