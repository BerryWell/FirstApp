package hanbit.co.kr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        textView.setText(textView.getText() +" 추가");
        textView.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        textView.setTextSize(20);
        EditText editText = findViewById(R.id.editText);
        editText.setText(editText.getText() + "에디트텍스트");
        final EditText editText2 = findViewById(R.id.editText);
        editText2.setOnKeyListener(new View.OnKeyListener(){
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                editText2.setText(keyCode + " ");
                return false;
            }
        });
        Log.d("LifeCycleActivity", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycleActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textView = findViewById(R.id.textView);
        textView.setText("onResume!");
        Log.d("LifeCycleActivity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycleActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycleActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycleActivity", "onDestroy()");
    }
}