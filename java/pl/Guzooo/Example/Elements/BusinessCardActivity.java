package pl.Guzooo.Example.Elements;

import android.os.Bundle;
import android.view.View;

import pl.Guzooo.Base.Elements.BusinessCard;
import pl.Guzooo.Base.ModifiedElements.GActivity;
import pl.Guzooo.Example.R;

public class BusinessCardActivity extends GActivity {

    BusinessCard bc1;
    BusinessCard bc2;
    BusinessCard bc3;
    BusinessCard bc4;
    View lg1;
    View lg2;
    View lg3;
    View lg4;

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
        bc4 = findViewById(R.id.bc6);
        lg1 = findViewById(R.id.lg1);
        lg2 = findViewById(R.id.lg2);
        lg3 = findViewById(R.id.lg3);
        lg4 = findViewById(R.id.lg4);
    }

    private void setBC(){
        bc1.setLogo(lg1);
        bc2.setLogo(lg2);
        bc3.setLogo(lg3);
        bc4.setLogo(lg4);
    }
}
