package duwit.edu.listviewthanhpho;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

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

        //Hien thi du lieu len list view
        //b1+: Can co du lieu
        // ?? tu dau co:: từ cơ sở dữ liệu
        // ở bài này: chúng ta có hash code dữ liệu trực tiếp
        //cần biến phù hợp để chứa dữ liày này

        ArrayList<String> dsTenTinhThanhVN; //Khai báo
        dsTenTinhThanhVN = new ArrayList<String>();

        //Thêm dữ liệu ở đây(Đúng ra, ta phải đọc từ 1 nguồn
        //Nhưng ta hard code (cho sắn để demo)
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        //B2. Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                                                                                    dsTenTinhThanhVN);

        //B3. Gắào vào điều khiển hiển thị ListView
        //B3.1 Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //B3.2 Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //B3.3 Lắng nghe và xử lý sự kiện user tương ứng
        //Gan bộ lắngng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //Tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào mặt bien
    //Ví du: bọ lắng nghe và xử lý
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //code xử lý ở đây
            //possition là vị trí phần tử vừa được click
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + String.valueOf(position), Toast.LENGTH_LONG).show();
        }
    };
}