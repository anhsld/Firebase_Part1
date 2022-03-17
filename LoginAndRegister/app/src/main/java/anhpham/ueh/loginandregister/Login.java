package anhpham.ueh.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText useName = findViewById(R.id.useName);
        final EditText password = findViewById(R.id.password);
        final Button signInBtn = findViewById(R.id.signInBtn);
        final TextView signUpBtn = findViewById(R.id.signUpBtn);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usenameTxt = useName.getText().toString();
                final String passwordTxt = password.getText().toString();

                if (usenameTxt.isEmpty()||passwordTxt.isEmpty()){
                    Toast.makeText(Login.this,"Please enter your mobile or password",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}