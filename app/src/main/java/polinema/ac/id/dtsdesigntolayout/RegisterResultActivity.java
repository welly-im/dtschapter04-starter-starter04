package polinema.ac.id.dtsdesigntolayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterResultActivity extends AppCompatActivity {

    TextView tvResultNama, tvResultTanggalLahir, tvResultJenisKelamin, tvResultUsername;

    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);

        tvResultNama = findViewById(R.id.tvResultNama);
        tvResultTanggalLahir = findViewById(R.id.tvResultTanggalLahir);
        tvResultJenisKelamin = findViewById(R.id.tvResultJenisKelamin);
        tvResultUsername = findViewById(R.id.tvResultUsername);

        Register register = getIntent().getParcelableExtra(Key_RegisterActivity);

        tvResultNama.setText(register.getNama());
        tvResultTanggalLahir.setText(register.getTanggalLahir());
        tvResultJenisKelamin.setText(register.getJenisKelamin());
        tvResultUsername.setText(register.getUsername());
    }
}
