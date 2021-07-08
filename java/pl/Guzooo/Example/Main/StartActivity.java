package pl.Guzooo.Example.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.Guzooo.Example.Elements.BusinessCardActivity;
import pl.Guzooo.Example.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onClickBusinessCard(View v){
        Intent intent = new Intent(this, BusinessCardActivity.class);
        startActivity(intent);
    }
}
