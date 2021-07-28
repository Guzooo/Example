package pl.Guzooo.Example.Elements;

import android.os.Bundle;
import android.view.View;

import pl.Guzooo.Base.ModifiedElements.GActivity;
import pl.Guzooo.Base.Utils.SettingsUtils;
import pl.Guzooo.Example.R;

public class SettingsActivity extends GActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setFragment();
    }

    private void setFragment(){
        View content = findViewById(R.id.content);
        SettingsUtils.setSettingsFragment(content, this);
    }
}