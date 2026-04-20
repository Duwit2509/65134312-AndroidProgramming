package thigk2.tranducviet;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TinhThanhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tinh_thanh);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lv = findViewById(R.id.lvTinhThanh);
        ArrayList<String> ds = new ArrayList<>();

        ds.add("Hà Nội");
        ds.add("TP. Hồ Chí Minh");
        ds.add("Đà Nẵng");
        ds.add("Hải Phòng");
        ds.add("Cần Thơ");
        ds.add("Nha Trang");
        ds.add("Huế");
        ds.add("Đà Lạt");
        ds.add("Vũng Tàu");
        ds.add("Trần Đức Việt (65134312)");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, ds);
        lv.setAdapter(adapter);
    }
}