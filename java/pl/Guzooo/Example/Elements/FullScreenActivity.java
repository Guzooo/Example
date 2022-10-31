package pl.Guzooo.Example.Elements;

import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import pl.Guzooo.Base.ModifiedElements.GActivity;
import pl.Guzooo.Base.Utils.FullScreenUtils;
import pl.Guzooo.Example.R;

public class FullScreenActivity extends GActivity {

    View mainScroll;
    ArrayList<View> otherScrolls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        initialization();
        setFullScreen();
    }

    private void initialization(){
        mainScroll = findViewById(R.id.main_scroll);
        otherScrolls.add(findViewById(R.id.scroll1));
        otherScrolls.add(findViewById(R.id.scroll2));
        otherScrolls.add(findViewById(R.id.scroll3));
        otherScrolls.add(findViewById(R.id.scroll4));
        otherScrolls.add(findViewById(R.id.scroll5));
        otherScrolls.add(findViewById(R.id.scroll6));
        otherScrolls.add(findViewById(R.id.scroll7));
    }

    private void setFullScreen(){
        View scroll = findViewById(R.id.main_scroll);
        FullScreenUtils.setUIVisibility(scroll);
        FullScreenUtils.setApplyWindowInsets(scroll, getOnApplyWindowInsetsListener());
    }

    private OnApplyWindowInsetsListener getOnApplyWindowInsetsListener(){
        return new OnApplyWindowInsetsListener() {
            @Override
            public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                setInsets(insets);
                setMainScrollPadding(insets);
                setOtherScrollPadding(insets);
                return insets;
            }
        };
    }

    private void setMainScrollPadding(WindowInsetsCompat insets){
        mainScroll.setPadding(
                mainScroll.getLeft(),
                mainScroll.getTop() + WindowInsetsCompat.Type.systemBars(),
                mainScroll.getRight(),
                mainScroll.getBottom() + WindowInsetsCompat.Type.systemBars()
        );
    }

    private void setOtherScrollPadding(WindowInsetsCompat insets){
        for(View v : otherScrolls)
            v.setPadding(
                    v.getLeft() + WindowInsetsCompat.Type.systemBars(),
                    v.getTop(),
                    v.getRight() + WindowInsetsCompat.Type.systemBars(),
                    v.getBottom()
            );
    }
}
