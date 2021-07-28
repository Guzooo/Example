package pl.Guzooo.Example.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pl.Guzooo.Base.ModifiedElements.GActivity;
import pl.Guzooo.Base.Utils.ThemeUtils;
import pl.Guzooo.Example.Elements.BusinessCardActivity;
import pl.Guzooo.Example.Elements.FullScreenActivity;
import pl.Guzooo.Example.Elements.SettingsActivity;
import pl.Guzooo.Example.R;

public class StartActivity extends GActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeUtils.setTheme(this);
        setContentView(R.layout.activity_start);
    }

    public void onClickBusinessCard(View v){
        Intent intent = new Intent(this, BusinessCardActivity.class);
        startActivity(intent);
    }

    public void onClickFullScreen(View v){
        Intent intent = new Intent(this, FullScreenActivity.class);
        startActivity(intent);
    }

    public void onClickSettings(View v){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
