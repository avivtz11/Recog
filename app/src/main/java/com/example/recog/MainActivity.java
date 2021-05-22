package com.example.recog;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    EditText answer;
    TextView text;
    TextView check;
    Button submit;
    ArrayList<Picture> ar = new ArrayList<>();
    Picture curPict;
    Picture previousPict;
    int numSolved = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (EditText)findViewById(R.id.answer);
        logo = (ImageView) findViewById(R.id.logo);
        text = (TextView) findViewById(R.id.text);
        submit = (Button) findViewById(R.id.submit);
        check = (TextView) findViewById(R.id.check);

        ar.add(new Picture("Sponge Bob" , R.drawable.spongebob , "character"));
        ar.add(new Picture("Mario" , R.drawable.mario , "character"));
        ar.add(new Picture("Peter Pen" , R.drawable.peterpan , "character"));
        ar.add(new Picture("Shrek" , R.drawable.shrek , "character"));
        ar.add(new Picture("Homer" , R.drawable.homer , "character"));
        ar.add(new Picture("Ferb" , R.drawable.ferb , "character"));

        ar.add(new Picture("Apple" , R.drawable.apple , "logo"));
        ar.add(new Picture("Beats" , R.drawable.beats , "logo"));
        ar.add(new Picture("McDonalds" , R.drawable.mcdonalds , "logo"));
        ar.add(new Picture("Twitter" , R.drawable.twitter , "logo"));
        ar.add(new Picture("Adidas" , R.drawable.adidas , "logo"));

        ar.add(new Picture("Arthur" , R.drawable.arthur , "character"));
        ar.add(new Picture("Jerry" , R.drawable.jerry , "character"));
        ar.add(new Picture("Sonic" , R.drawable.sonic , "character"));
        ar.add(new Picture("Nemo" , R.drawable.nemo , "character"));
        ar.add(new Picture("Stitch" , R.drawable.stitch , "character"));
        ar.add(new Picture("Timmy Turner" , R.drawable.timmy , "character"));
        ar.add(new Picture("Simba" , R.drawable.simba , "character"));
        ar.add(new Picture("Aang" , R.drawable.aang , "character"));

        ar.add(new Picture("nike" , R.drawable.nike , "logo"));
        ar.add(new Picture("steam" , R.drawable.steam , "logo"));
        ar.add(new Picture("Youtube" , R.drawable.youtube , "logo"));
        ar.add(new Picture("Toyota" , R.drawable.toyota , "logo"));
        ar.add(new Picture("Pepsi" , R.drawable.pepsi , "logo"));
        ar.add(new Picture("Reebok" , R.drawable.reebok , "logo"));
        ar.add(new Picture("Xbox" , R.drawable.xbox , "logo"));
        ar.add(new Picture("Firefox" , R.drawable.firefox , "logo"));
        ar.add(new Picture("Play Station" , R.drawable.ps , "logo"));
        ar.add(new Picture("Spotify" , R.drawable.spotify , "logo"));
        ar.add(new Picture("Jordan" , R.drawable.jordan , "logo"));

        ar.get(0).addName("בובספוג");
        ar.get(0).addName("בוב ספוג");
        ar.get(0).addName("sponge bob");

        ar.get(1).addName("מריו");
        ar.get(1).addName("סופר מריו");
        ar.get(1).addName("mario");
        ar.get(1).addName("super mario");

        ar.get(2).addName("פיטר פן");
        ar.get(2).addName("פיטרפן");
        ar.get(2).addName("peter pen");

        ar.get(3).addName("שרק");
        ar.get(3).addName("shrek");

        ar.get(4).addName("homer simpson");
        ar.get(4).addName("Homer Simpson");
        ar.get(4).addName("הומר");
        ar.get(4).addName("עומר");

        ar.get(5).addName("פרב");
        ar.get(5).addName("ferb");

        ar.get(6).addName("אפל");
        ar.get(6).addName("apple");

        ar.get(7).addName("ביטס");
        ar.get(7).addName("beats");

        ar.get(8).addName("מקדונלדס");
        ar.get(8).addName("mcdonalds");

        ar.get(9).addName("טוויטר");
        ar.get(9).addName("twitter");

        ar.get(10).addName("אדידס");
        ar.get(10).addName("adidas");

        ar.get(11).addName("ארתור");
        ar.get(11).addName("arthur");

        ar.get(12).addName("ג'רי");
        ar.get(12).addName("jerry");

        ar.get(13).addName("סוניק");
        ar.get(13).addName("sonic");

        ar.get(14).addName("נמו");
        ar.get(14).addName("nemo");

        ar.get(15).addName("סטיץ'");
        ar.get(15).addName("stitch");

        ar.get(16).addName("טימי טרנר");
        ar.get(16).addName("timmy turner");

        ar.get(17).addName("סימבה");
        ar.get(17).addName("simba");

        ar.get(18).addName("אנג");
        ar.get(18).addName("Ang");
        ar.get(18).addName("ang");

        ar.get(19).addName("נייק");
        ar.get(19).addName("נייקי");
        ar.get(19).addName("Nike");

        ar.get(20).addName("סטים");
        ar.get(20).addName("Steam");

        ar.get(21).addName("youtube");
        ar.get(21).addName("יוטיוב");

        ar.get(22).addName("toyota");
        ar.get(22).addName("טויוטה");

        ar.get(23).addName("pepsi");
        ar.get(23).addName("פפסי");

        ar.get(24).addName("reebok");
        ar.get(24).addName("ריבוק");

        ar.get(25).addName("xbox");
        ar.get(25).addName("אקסבוקס");

        ar.get(26).addName("פיירפוקס");
        ar.get(26).addName("firefox");

        ar.get(27).addName("פלייסטיישן");
        ar.get(27).addName("playstation");
        ar.get(27).addName("play station");

        ar.get(28).addName("ספוטיפיי");
        ar.get(28).addName("spotify");

        ar.get(29).addName("jordan");
        ar.get(29).addName("ג'ורדן");

        check.setText(numSolved + " / " + ar.size() + getString(R.string.solved));

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(getString(R.string.clickToSkip)+"");
                answer.setText("");
                if(curPict == null)
                    check.setText(numSolved + " / " + ar.size() + getString(R.string.solved));
                changePhoto();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curPict == null){
                    text.setText(getString(R.string.clickToSkip)+"");
                    answer.setText("");
                    check.setText(numSolved + " / " + ar.size() + getString(R.string.solved));
                    changePhoto();
                }
                else {
                    text.setText("");
                    if (curPict.isPossName(answer.getText().toString())) {
                        text.setText(getString(R.string.success));
                        answer.setText("");
                        curPict.setSolved(true);
                        numSolved++;
                        check.setText(numSolved + " / " + ar.size() + getString(R.string.solved));
                        changePhoto();
                    } else {
                        text.setText(getString(R.string.fail));
                        answer.setText("");
                    }
                }
            }
        });


    }



    private void changePhoto(){
        if(numSolved == ar.size()){
            text.setText(getString(R.string.finish));
            for (Picture p: ar) {
                p.setSolved(false);
            }
            numSolved = 0;
            logo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.start_button , null));
            curPict = null;
        }
        else {
            Random r = new Random();
            int Low = 0;
            int High = ar.size();
            int Result;
            do {
                Result = r.nextInt(High - Low) + Low;
                curPict = ar.get(Result);
                int lastPicInd = ar.indexOf(previousPict);
                if(numSolved != ar.size()-1) {
                    while (curPict != null && Result == lastPicInd) {
                        Result = r.nextInt(High - Low) + Low;
                        curPict = ar.get(Result);
                    }
                }
                else
                    text.setText(getString(R.string.last));

                if(!curPict.isSolved())
                    previousPict = curPict;
            } while(curPict != null && curPict.isSolved());

            logo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), curPict.getDrawId(), null));
        }
    }


}
