package eecs1022.labfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class labfourActivity extends AppCompatActivity
{Bank bank;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labfour);
    }

    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }
    public void button1clicked (View view){
        String n11 = getInputOfTextField(R.id.Inputname1);
        String n22 = getInputOfTextField(R.id.Inputname2);
        String n33 = getInputOfTextField(R.id.Inputname3);
        String b1 = getInputOfTextField(R.id.Balance1);
        String b2 = getInputOfTextField(R.id.Balance2);
        String b3 = getInputOfTextField(R.id.Balance3);
        double bb1 = Double.parseDouble(b1);
        double bb2 = Double.parseDouble(b2);
        double bb3 = Double.parseDouble(b3);
        Client n1 = new Client (n11,bb1);
        Client n2 = new Client (n22,bb2);
        Client n3 = new Client (n33,bb3);


        bank = new Bank(n1,n2,n3);
        setContentsOfTextView(R.id.Result, bank.toString());



    }
    public void buttonTransClicked(View view) {
        String service = getItemSelected(R.id.spinner);
        String from = getItemSelected(R.id.spinner2);
        String to = getItemSelected(R.id.spinner3);
        String amount = getInputOfTextField(R.id.Amount);
        double a = Double.parseDouble(amount);
        bank.trans(service, from, to, a);
        setContentsOfTextView(R.id.Result, bank.toString());
    }
}
