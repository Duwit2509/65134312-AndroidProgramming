package duwit.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // gắn Layout tương ứng với file này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Lang nghe va xu ly su kien click nut tinh tong
    public void XuLyCong(View view) {
        //Tim, tham chieu den dieu khien tren xml
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText  editTextSoB = findViewById(R.id.edtB);
        EditText  editTexKetQua = findViewById(R.id.edtKQ);

        //Lay du lieu ve o dieu khien so A
        String strA = editTextSoA.getText().toString();
        //Lay du lieu ve o dieu khien so B
        String strB = editTextSoB.getText().toString();

        //Chuyen du lieu sang dang so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        //Tinh toan theo yeu cau
        int tong =  so_A + so_B;
        String strTong = String.valueOf(tong);
        //Hien ra man hinh
        editTexKetQua.setText(strTong);

    }
}