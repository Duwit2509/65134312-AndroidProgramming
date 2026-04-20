package thigk2.tranducviet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChuViDienTichActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chu_vi_dien_tich);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText edtDai = findViewById(R.id.edtChieuDai);
        EditText edtRong = findViewById(R.id.edtChieuRong);
        Button btnTinh = findViewById(R.id.btnTinhToan);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        //
        btnTinh.setOnClickListener(v -> {
            String strDai = edtDai.getText().toString();
            String strRong = edtRong.getText().toString();

            if (strDai.isEmpty() || strRong.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                double dai = Double.parseDouble(strDai);
                double rong = Double.parseDouble(strRong);

                // Tính toán theo công thức hình chữ nhật
                double chuVi = (dai + rong) * 2;
                double dienTich = dai * rong;

                // Hiển thị
                String ketQua = "Chu vi: " + chuVi + " m\nDiện tích: " + dienTich + " m²";
                tvKetQua.setText(ketQua);

            } catch (Exception e) {
                Toast.makeText(this, "Dữ liệu nhập không hợp lệ!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}