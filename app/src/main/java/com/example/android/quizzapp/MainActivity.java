package com.example.android.quizzapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

/**
 * This app displays a quiz about webmarketing.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */

    @SuppressLint("WrongConstant")
    public void submit(View view) {
        //We pick the name then we store it in a variable
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //We pick the answer which is written by the user in question 1 then we store it in a variable
        EditText answer1Field = (EditText) findViewById(R.id.answer_1_field);
        String goodAnswer1 = answer1Field.getText().toString();

        //We check if the radio button retargeting is checked and we store it in a variable
        RadioButton retargetingRadioButton = findViewById(R.id.good_answer_2);
        boolean goodAnswer2 = retargetingRadioButton.isChecked();

        //We check if the checkbox CPA is checked and we store it in a variable
        CheckBox cpaCheckbox = (CheckBox) findViewById(R.id.good_answer_3_1);
        boolean goodAnswer31 = cpaCheckbox.isChecked();

        //We check if the checkbox CPN is checked and we store it in a variable
        CheckBox cpnCheckbox = (CheckBox) findViewById(R.id.bad_answer_3_2);
        boolean badAnswer32 = cpnCheckbox.isChecked();

        //We check if the checkbox CPL is checked and we store it in a variable
        CheckBox cplCheckbox = (CheckBox) findViewById(R.id.good_answer_3_3);
        boolean goodAnswer33 = cplCheckbox.isChecked();

        //We check if the checkbox ppt is checked and we store it in a variable
        CheckBox pptCheckbox = (CheckBox) findViewById(R.id.bad_answer_3_4);
        boolean badAnswer34 = pptCheckbox.isChecked();

        //We check if the checkbox PPS is checked and we store it in a variable
        CheckBox ppsCheckbox = (CheckBox) findViewById(R.id.good_answer_3_5);
        boolean goodAnswer35 = ppsCheckbox.isChecked();

        //We check if the radio button cookie is checked and we store it in a variable
        RadioButton cookieRadioButton = findViewById(R.id.good_answer_4);
        boolean goodAnswer4 = cookieRadioButton.isChecked();

        //We check if the checkbox Zanox is checked and we store it in a variable
        CheckBox zanoxCheckbox = (CheckBox) findViewById(R.id.good_answer_5_1);
        boolean goodAnswer51 = zanoxCheckbox.isChecked();

        //We check if the checkbox Criteo is checked and we store it in a variable
        CheckBox criteoCheckbox = (CheckBox) findViewById(R.id.bad_answer_5_2);
        boolean badAnswer52 = criteoCheckbox.isChecked();

        //We check if the checkbox Netaffiliation is checked and we store it in a variable
        CheckBox netaffiliationCheckbox = (CheckBox) findViewById(R.id.good_answer_5_3);
        boolean goodAnswer53 = netaffiliationCheckbox.isChecked();

        //We check if the checkbox Bing is checked and we store it in a variable
        CheckBox bingCheckbox = (CheckBox) findViewById(R.id.bad_answer_5_4);
        boolean badAnswer54 = bingCheckbox.isChecked();

        //We pick the answer which is written by the user in question 6 then we store it in a variable
        EditText answer6Field = (EditText) findViewById(R.id.answer_6_field);
        String goodAnswer6 = answer6Field.getText().toString();

        //We check if the radio button customer acquisition cost is checked and we store it in a variable
        RadioButton customerAcquisitionCostRadioButton = findViewById(R.id.good_answer_7);
        boolean goodAnswer7 = customerAcquisitionCostRadioButton.isChecked();

        //We check if the radio button Google Analytics is checked and we store it in a variable
        RadioButton googleAnalyticsRadioButton = findViewById(R.id.good_answer_8);
        boolean goodAnswer8 = googleAnalyticsRadioButton.isChecked();

        //We check if the radio button Responsive is checked and we store it in a variable
        RadioButton responsiveRadioButton = findViewById(R.id.good_answer_9);
        boolean goodAnswer9 = responsiveRadioButton.isChecked();

        //We check if the checkbox keywording is checked and we store it in a variable
        CheckBox keywordingCheckbox = (CheckBox) findViewById(R.id.good_answer_10_1);
        boolean goodAnswer101 = keywordingCheckbox.isChecked();

        //We check if the checkbox retargeting is checked and we store it in a variable
        CheckBox retargetingCheckbox = (CheckBox) findViewById(R.id.good_answer_10_2);
        boolean goodAnswer102 = retargetingCheckbox.isChecked();

        //We check if the checkbox text links is checked and we store it in a variable
        CheckBox textLinksCheckbox = (CheckBox) findViewById(R.id.good_answer_10_3);
        boolean goodAnswer103 = textLinksCheckbox.isChecked();

        //We check if the checkbox cashback is checked and we store it in a variable
        CheckBox cashbackCheckbox = (CheckBox) findViewById(R.id.good_answer_10_4);
        boolean goodAnswer104 = cashbackCheckbox.isChecked();

        //We check if the checkbox influencers is checked and we store it in a variable
        CheckBox influencersCheckbox = (CheckBox) findViewById(R.id.good_answer_10_5);
        boolean goodAnswer105 = influencersCheckbox.isChecked();

        //We check if the checkbox voucher websites is checked and we store it in a variable
        CheckBox voucherWebsitesCheckbox = (CheckBox) findViewById(R.id.good_answer_10_6);
        boolean goodAnswer106 = voucherWebsitesCheckbox.isChecked();


        int score = calculateScore(goodAnswer1, goodAnswer2, goodAnswer31, badAnswer32, goodAnswer33, badAnswer34, goodAnswer35, goodAnswer4, goodAnswer51,
                badAnswer52, goodAnswer53, badAnswer54, goodAnswer6, goodAnswer7, goodAnswer8, goodAnswer9, goodAnswer101, goodAnswer102, goodAnswer103,
                goodAnswer104, goodAnswer105, goodAnswer106);

        if (score == 10) {
            //Show an error message as a toast
            Toast.makeText(this, getString(R.string.best_score, name), Toast.LENGTH_LONG).show();
        } else if (score > 6) {
            //Show an error message as a toast
            Toast.makeText(this, getString(R.string.quite_good_score, name, score), Toast.LENGTH_LONG).show();
        } else if (score > 3) {
            //Show an error message as a toast
            Toast.makeText(this, getString(R.string.medium_score, name, score), Toast.LENGTH_LONG).show();
        } else if (score > 0) {
            //Show an error message as a toast
            Toast.makeText(this, getString(R.string.quite_bad_score, name, score), Toast.LENGTH_LONG).show();
        } else if (score == 0) {
            //Show an error message as a toast
            Toast.makeText(this, getString(R.string.worst_score, name), Toast.LENGTH_LONG).show();
        }

    }


    /**
     * Calculates the score of the user.
     *
     * @param hasGoodAnswer1   is whether or not the user has the good answer to question 1
     * @param hasGoodAnswer2   is whether or not the user has the good answer to question 2
     * @param hasGoodAnswer31  is is whether or not the user has one part of the three answers needed to question 3
     * @param hasBadAnswer32   is is whether or not the user has checked one part of the two wrong answers to question 3
     * @param hasGoodAnswer33  is is whether or not the user has one part of the three answers needed to question 3
     * @param hasBadAnswer34   is is whether or not the user has checked one part of the two wrong answers to question 3
     * @param hasGoodAnswer35  is is whether or not the user has one part of the three answers needed to question 3
     * @param hasGoodAnswer4   is whether or not the user has the good answer to question 4
     * @param hasGoodAnswer51  is whether or not the user has one part of the two answers needed to question 5
     * @param hasBadAnswer52   is whether or not the user has one part of the two wrong answers to question 5
     * @param hasGoodAnswer53  is whether or not the user has one part of the two answers needed to question 5
     * @param hasBadAnswer54   is whether or not the user has one part of the two wrong answers to question 5
     * @param hasGoodAnswer6   is whether or not the user has the good answer to question 6
     * @param hasGoodAnswer7   is whether or not the user has the good answer to question 7
     * @param hasGoodAnswer8   is whether or not the user has the good answer to question 8
     * @param hasGoodAnswer9   is whether or not the user has the good answer to question 9
     * @param hasGoodAnswer101 is whether or not the user has one part of the six answers needed to question 10
     * @param hasGoodAnswer102 is whether or not the user has one part of the six answers needed to question 10
     * @param hasGoodAnswer103 is whether or not the user has one part of the six answers needed to question 10
     * @param hasGoodAnswer104 is whether or not the user has one part of the six answers needed to question 10
     * @param hasGoodAnswer105 is whether or not the user has one part of the six answers needed to question 10
     * @param hasGoodAnswer106 is whether or not the user has one part of the six answers needed to question 10
     * @return a message
     */
    private int calculateScore(String hasGoodAnswer1, boolean hasGoodAnswer2, boolean hasGoodAnswer31, boolean hasBadAnswer32, boolean hasGoodAnswer33,
                               boolean hasBadAnswer34, boolean hasGoodAnswer35, boolean hasGoodAnswer4, boolean hasGoodAnswer51, boolean hasBadAnswer52,
                               boolean hasGoodAnswer53, boolean hasBadAnswer54, String hasGoodAnswer6, boolean hasGoodAnswer7, boolean hasGoodAnswer8,
                               boolean hasGoodAnswer9, boolean hasGoodAnswer101, boolean hasGoodAnswer102, boolean hasGoodAnswer103,
                               boolean hasGoodAnswer104, boolean hasGoodAnswer105, boolean hasGoodAnswer106) {
        //Score at start
        int baseScore = 0;

        //Add 1 point if the user has the good answer to question 1
        if (hasGoodAnswer1.equals("search engine optimisation")) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 2
        if (hasGoodAnswer2) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 3
        if ((hasBadAnswer32) || (hasBadAnswer34)) {
            baseScore = baseScore;

        } else if ((hasGoodAnswer31) && (hasGoodAnswer33) && (hasGoodAnswer35)) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 4
        if (hasGoodAnswer4) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 5
        if ((hasBadAnswer52) || (hasBadAnswer54)) {
            baseScore = baseScore;
        } else if ((hasGoodAnswer51) && (hasGoodAnswer53)) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 6
        if (hasGoodAnswer6.equals("return on investment")) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 7
        if (hasGoodAnswer7) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 8
        if (hasGoodAnswer8) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 9
        if (hasGoodAnswer9) {
            baseScore = baseScore + 1;
        }

        //Add 1 point if the user has the good answer to question 10
        if ((hasGoodAnswer101) && (hasGoodAnswer102) && (hasGoodAnswer103) && (hasGoodAnswer104) && (hasGoodAnswer105) && (hasGoodAnswer106)) {
            baseScore = baseScore + 1;
        }

        return baseScore;
    }

}
