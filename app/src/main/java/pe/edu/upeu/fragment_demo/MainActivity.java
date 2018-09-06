package pe.edu.upeu.fragment_demo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Fragment01 fragment01;
    private Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btnfragment1);
        btn2 = (Button) findViewById(R.id.btnfragment2);
        btn3 = (Button) findViewById(R.id.btnfragment3);
        fragment01 = new Fragment01();
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new Fragment01()).disallowAddToBackStack().commit();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new Fragment01()).disallowAddToBackStack().commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new Fragment02()).disallowAddToBackStack().commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new Fragment03()).disallowAddToBackStack().commit();
            }
        });

    }


}
