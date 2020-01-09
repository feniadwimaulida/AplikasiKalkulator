package id.ac.poliban.mi.fenia.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etAngkaPertama = findViewById(R.id.etAngkaPertama);
        final EditText etAngkaKedua = findViewById(R.id.etAngkaKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);

        btTambah.setOnClickListener(view -> {
            double a = Double.parseDouble(etAngkaPertama.getText().toString());
            double b = Double.parseDouble(etAngkaKedua.getText().toString());
            double hasil = a + b;

        });
    }
}
