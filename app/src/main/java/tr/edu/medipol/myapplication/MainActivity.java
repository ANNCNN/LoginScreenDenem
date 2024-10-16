package tr.edu.medipol.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            EditText etPin = findViewById(R.id.etPin);
            if (etPin.getText().toString().equals("123")){
                Toast.makeText(MainActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                btnLogin.setVisibility(View.GONE);
            }else {
                Toast.makeText(MainActivity.this, "Pin kodunuz hatalı", Toast.LENGTH_SHORT).show();
            }
        });

    }
}