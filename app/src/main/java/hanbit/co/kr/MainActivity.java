package hanbit.co.kr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

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

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Button", "onClickListener called!\n");
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Log.d("Button","onLongClick called!\n");
                return false;
            }
        });

        ImageView image = findViewById(R.id.imageView);
        image.setScaleType(ImageView.ScaleType.CENTER);
        image.setImageResource(R.drawable.ic_launcher_foreground);

        final CheckBox checkBox = findViewById(R.id.checkBox);
        final TextView textView2 = findViewById(R.id.textView);

        checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView2.setText(""+checkBox.isChecked());
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textView2.setText("" + isChecked);
            }
        });

        final ToggleButton toggleButton = findViewById(R.id.toggleButton);
        final TextView textView3 = findViewById(R.id.textView);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                textView3.setText(""+isChecked);
            }
        });

        final Switch mySwitch = findViewById(R.id.mySwitch);
        final TextView textView4 = findViewById(R.id.textView);

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                textView4.setText("" + isChecked);
            }
        });

        final RadioButton radioButton = findViewById(R.id.radioButton);
        final TextView textView5 = findViewById(R.id.textView);

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                textView5.setText(""+isChecked);
            }
        });



        progressBar = findViewById(R.id.progressBar);


        Log.d("LifeCycleActivity", "onCreate()");
    }
    public void clickImageButton(View v) {

    }
    ProgressBar progressBar;
    public void step(View v) {
        progressBar.incrementProgressBy(5);
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