package gk2.tranducviet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //XU ly su kien sang man hinh khac
    public void ChuyenSangBMI(View v){
        Intent iManHinhKhac1 = new Intent(this, BMIActivity.class);
        startActivity(iManHinhKhac1);
    }

    public void ChuyenSangMonAn(View v){
        Intent iManHinhKhac2 = new Intent(this, MonAnActivity.class);
        startActivity(iManHinhKhac2);
    }

    public void ChuyenSangBaiThuoc(View v){
        Intent iManHinhKhac3 = new Intent(this, BaiThuocActivity.class );
        startActivity(iManHinhKhac3);

    }

    public void ChuyenSangGioiThieu(View v){
        Intent iManHinhKhac4 = new Intent(this, GioiThieuActivity.class );
        startActivity(iManHinhKhac4);

    }
}