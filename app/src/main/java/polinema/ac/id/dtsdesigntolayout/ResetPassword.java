package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextCode,editTextNewPass,editTextConfirmNewPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        editTextCode = findViewById(R.id.edt_txt_code);
        editTextNewPass = findViewById(R.id.edt_new_password);
        editTextConfirmNewPass = findViewById(R.id.edt_confirm_password);

    }


    public void postChangePassword(View view) {
        // Validasi kosong
        if (TextUtils.isEmpty(editTextCode.getText().toString().trim()) ||
                TextUtils.isEmpty(editTextNewPass.getText().toString().trim()) ||
                TextUtils.isEmpty(editTextConfirmNewPass.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Data masih ada yang kosong", Toast.LENGTH_LONG).show();
        }
        else if (editTextNewPass.getText().toString().length() > 15) {
            Toast.makeText(view.getContext(), "Password tidak boleh lebih dari 15 karakter!", Toast.LENGTH_SHORT).show();
        }
        //contoh kasus menyamakan karakter selain menggunakan != dan ==
        else if (!editTextNewPass.getText().toString().contentEquals(editTextConfirmNewPass.getText().toString())) {
            Toast.makeText(view.getContext(), "Password tidak sama!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }

    }
}
