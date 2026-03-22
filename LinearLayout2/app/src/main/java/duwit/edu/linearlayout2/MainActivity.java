package duwit.edu.linearlayout2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong gan voi dieu khien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
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
        TimDieuKhien();
    }

    public void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);    }

    //Xu ly cong
    public void XuLyCong(View v){
        //Lay du lieu
        //b1: Tim view
        //b1.1. Tim EditText so 1 va 2

        //b1.2. Lay du lieu tu 2 dieu khien do
        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(strSo1);
        float so2 = Float.parseFloat(strSo2);

        //b2: Tinh toan
        float tong = so1 + so2;

        //b3: Hien ket qua
        //b3.1.

        //b3.2. Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }

    //Xu ly tru
    public void XuLyTru(View v){
        //Lay du lieu
        //b1: Tim view
        //b1.1. Tim EditText so 1 va 2

        //b1.2. Lay du lieu tu 2 dieu khien do
        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(strSo1);
        float so2 = Float.parseFloat(strSo2);

        //b2: Tinh toan
        float tong = so1 - so2;

        //b3: Hien ket qua
        //b3.1.
        //b3.2. Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);

    }

    //Xu ly nhan
   public void XuLyNhan(View v){
        //Lay du lieu
        //b1: Tim view
        //b1.1. Tim EditText so 1 va 2

        //b1.2. Lay du lieu tu 2 dieu khien do
        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(strSo1);
        float so2 = Float.parseFloat(strSo2);

        //b2: Tinh toan
        float tong = so1 * so2;

        //b3: Hien ket qua
        //b3.1
        //b3.2. Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);

    }

    //Xu ly chia
   public void XuLyChia(View v){
        //Lay du lieu
        //b1: Tim view
        //b1.1. Tim EditText so 1 va 2
        //b1.2. Lay du lieu tu 2 dieu khien do
        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(strSo1);
        float so2 = Float.parseFloat(strSo2);

        //b2: Tinh toan
        float tong = so1 / so2;

        //b3: Hien ket qua
        //b3.1.
        //b3.2. Chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);

    }
}