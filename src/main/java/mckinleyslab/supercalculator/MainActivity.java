package mckinleyslab.supercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAdd(View a) {
        if (a.getId() == R.id.addNum) {
            EditText a1 = (EditText) findViewById(R.id.numOne);
            EditText a2 = (EditText) findViewById(R.id.numTwo);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double answer;
            answer = num1 + num2;

            TextView res = (TextView) findViewById(R.id.result);
            String finalAnswer = ("" + answer);
            res.setText(finalAnswer);

        }

    }
    public void onClickSub(View a) {
        if (a.getId() == R.id.subNum) {
            EditText a1 = (EditText) findViewById(R.id.numOne);
            EditText a2 = (EditText) findViewById(R.id.numTwo);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double answer;
            answer = num1 - num2;

            TextView res = (TextView) findViewById(R.id.result);
            String finalAnswer = ("" + answer);
            res.setText(finalAnswer);

        }

    }
    public void onClickMul(View a) {
        if (a.getId() == R.id.mulNum) {
            EditText a1 = (EditText) findViewById(R.id.numOne);
            EditText a2 = (EditText) findViewById(R.id.numTwo);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double answer;
            answer = num1 * num2;

            TextView res = (TextView) findViewById(R.id.result);
            String finalAnswer = ("" + answer);
            res.setText(finalAnswer);

        }

    }
    public void onClickDiv(View a) {
        if (a.getId() == R.id.divNum) {
            EditText a1 = (EditText) findViewById(R.id.numOne);
            EditText a2 = (EditText) findViewById(R.id.numTwo);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double answer;
            answer = num1 / num2;

            TextView res = (TextView) findViewById(R.id.result);
            String finalAnswer = ("" + answer);
            res.setText(finalAnswer);

        }

    }
}