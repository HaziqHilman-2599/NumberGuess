package sg.edu.rp.c347.id19023980.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    String message = "";
    TextView text1;
    TextView text2;
    public void randomNumberGenerator(){
        Random rand = new Random();
        n = rand.nextInt(30) + 1;
    }

    public void guess(View view){
        EditText guess = findViewById(R.id.guess);
        int guessInt = Integer.parseInt(guess.getText().toString());

        if (n > guessInt){
            message = "Higher!";
            guess.setText("");
        }else if (n < guessInt){
            message="Lower!";
            guess.setText("");
        }else {
            message = "That is right! Play again!";
            guess.setText("");
            randomNumberGenerator();
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumberGenerator();

        text1 = findViewById(R.id.textViewRand);
        text2 = findViewById(R.id.textViewQuestion);

        text1.setTextColor(Color.BLUE);
        text2.setTextColor(Color.BLUE);

        text1.setTextSize(16);
    }
}
