package es.montanus.catchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));

        TextView textView = findViewById(R.id.text_view);
        textView.setText(getMessage());
    }

    protected abstract CharSequence getMessage();
}
