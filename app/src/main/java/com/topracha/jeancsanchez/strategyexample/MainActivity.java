package com.topracha.jeancsanchez.strategyexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.topracha.jeancsanchez.strategyexample.Models.BlackDuck;
import com.topracha.jeancsanchez.strategyexample.Models.Duck;
import com.topracha.jeancsanchez.strategyexample.Models.PlasticDuck;
import com.topracha.jeancsanchez.strategyexample.Models.WhiteDuck;

public class MainActivity extends AppCompatActivity {

    private Button btnQuack;
    private Button btnFly;
    private RadioButton rdBtnBlackDuck;
    private RadioButton rdBtnWhiteDuck;
    private Duck duck;
    private RadioButton rdBtnPlasticDuck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQuack = (Button) findViewById(R.id.btnQuack);
        btnFly = (Button) findViewById(R.id.btnFly);
        rdBtnBlackDuck = (RadioButton) findViewById(R.id.rdBtnBlackDuck);
        rdBtnWhiteDuck = (RadioButton) findViewById(R.id.rdBtnWhiteDuck);
        rdBtnPlasticDuck = (RadioButton) findViewById(R.id.rdBtnPlasticDuck);
    }


    public void onQuack(View view){
        Toast.makeText(this, duck.quack(), Toast.LENGTH_SHORT).show();
    }

    public void onFly(View vIew){
        Toast.makeText(this, duck.fly(), Toast.LENGTH_SHORT).show();
    }

    public void onBlackDuckSelected(View view){
        rdBtnWhiteDuck.setChecked(false);
        rdBtnPlasticDuck.setChecked(false);

        duck = new BlackDuck();
    }

    public void onWhiteDuckSelected(View view){
        rdBtnBlackDuck.setChecked(false);
        rdBtnPlasticDuck.setChecked(false);

        duck = new WhiteDuck();
    }

    public void onPlasticDuckSelected(View view){
        rdBtnBlackDuck.setChecked(false);
        rdBtnWhiteDuck.setChecked(false);

        duck = new PlasticDuck();
    }
}
