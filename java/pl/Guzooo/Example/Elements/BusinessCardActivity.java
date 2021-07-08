package pl.Guzooo.Example.Elements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pl.Guzooo.Base.Elements.BusinessCard;
import pl.Guzooo.Example.R;

public class BusinessCardActivity extends AppCompatActivity {

    BusinessCard bc1;
    BusinessCard bc2;
    BusinessCard bc3;
    View lg1;
    View lg2;
    View lg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_card);
        initialization();
        setBC();
    }

    private void initialization(){
        bc1 = findViewById(R.id.bc1);
        bc2 = findViewById(R.id.bc2);
        bc3 = findViewById(R.id.bc3);
        lg1 = findViewById(R.id.lg1);
        lg2 = findViewById(R.id.lg2);
        lg3 = findViewById(R.id.lg3);
    }

    private void setBC(){
        bc1.setOpenerView(lg1);
        bc2.setOpenerView(lg2);
        bc3.setOpenerView(lg3);
    }
}
