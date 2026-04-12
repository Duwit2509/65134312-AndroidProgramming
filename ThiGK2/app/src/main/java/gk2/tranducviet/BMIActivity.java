package gk2.tranducviet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText edtCanNang = findViewById(R.id.edtCanNang);
        EditText edtChieuCao = findViewById(R.id.edtChieuCao);
        EditText edtKetQua = findViewById(R.id.edtKetQua);
        Button btnTinh = findViewById(R.id.btnCalculate);

        btnTinh.setOnClickListener(v -> {
            double canNang = Double.parseDouble(edtCanNang.getText().toString());
            double chieuCao = Double.parseDouble(edtChieuCao.getText().toString()) / 100;
            double bmi = canNang / (chieuCao * chieuCao);

            String phanLoai;
            if (bmi < 18.5) phanLoai = "Thiếu cân";
            else if (bmi < 25) phanLoai = "Bình thường";
            else if (bmi < 30) phanLoai = "Thừa cân";
            else phanLoai = "Béo phì";

            edtKetQua.setText(String.format("BMI = %.2f - %s", bmi, phanLoai));
        });
    }


}