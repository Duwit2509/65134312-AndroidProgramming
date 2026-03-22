package duwit.edu.xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    Button nutCong, nutTru, nutNhan, nutChia;
    public void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }
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
        //Gan bo lang nghe su kien va code xu ly tung nutnut
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly bo lang nghe cong
                String strSo1 = editTextSo1.getText().toString();
                String strSo2 = editTextSo2.getText().toString();
                //Chuyen du lieu tu chuoi sang so
                float so1 = Float.parseFloat(strSo1);
                float so2 = Float.parseFloat(strSo2);

                //Tinh toan
                float tong = so1 + so2;

                String chuoiKQ = String.valueOf(tong);
                editTextKQ.setText(chuoiKQ);
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu 2 dieu khien do
                String strSo1 = editTextSo1.getText().toString();
                String strSo2 = editTextSo2.getText().toString();

                //Chuyen du lieu tu chuoi sang so
                float so1 = Float.parseFloat(strSo1);
                float so2 = Float.parseFloat(strSo2);

                //Tinh toan
                float tong = so1 - so2;

                String chuoiKQ = String.valueOf(tong);
                editTextKQ.setText(chuoiKQ);
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu 2 dieu khien do
                String strSo1 = editTextSo1.getText().toString();
                String strSo2 = editTextSo2.getText().toString();
                //Chuyen du lieu tu chuoi sang so
                float so1 = Float.parseFloat(strSo1);
                float so2 = Float.parseFloat(strSo2);

                //Tinh toan
                float tong = so1 * so2;

                String chuoiKQ = String.valueOf(tong);
                editTextKQ.setText(chuoiKQ);
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu 2 dieu khien do
                String strSo1 = editTextSo1.getText().toString();
                String strSo2 = editTextSo2.getText().toString();
                //Chuyen du lieu tu chuoi sang so
                float so1 = Float.parseFloat(strSo1);
                float so2 = Float.parseFloat(strSo2);

                //Tinh toan
                float tong = so1 / so2;

                String chuoiKQ = String.valueOf(tong);
                editTextKQ.setText(chuoiKQ);
            }
        });
    }



}