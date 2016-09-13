package thailand.mwp.lucky.myyoutubelearningbasic01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    private EditText var1;
    private EditText var2;
    private Button add , deduct ,multi ,divide ;

    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        var1 = (EditText) findViewById(R.id.var1);
        var2 = (EditText) findViewById(R.id.var2);
        add = (Button) findViewById(R.id.add);
        deduct = (Button) findViewById(R.id.deduct);
        multi = (Button) findViewById(R.id.multi);
        divide = (Button) findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.reuslt);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(var1.getText().toString());
                double b = Integer.parseInt(var2.getText().toString());

                double c = (a + b);

                result.setText(String.valueOf(c));
            }
        });
        deduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(var1.getText().toString());
                double b = Integer.parseInt(var2.getText().toString());

                double c = (a - b);

                result.setText(String.valueOf(c));
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(var1.getText().toString());
                double b = Integer.parseInt(var2.getText().toString());

                double c = (a * b);

                result.setText(String.valueOf(c));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(var1.getText().toString());
                double b = Integer.parseInt(var2.getText().toString());

                double c = (a / b);

                result.setText(String.valueOf(c));
            }
        });
    }
}
