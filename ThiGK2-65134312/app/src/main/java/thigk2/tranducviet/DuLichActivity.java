package thigk2.tranducviet;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class DuLichActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<DuLich> dsDuLich;
    DuLichAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_du_lich);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lv = findViewById(R.id.lvDuLich);
        dsDuLich = new ArrayList<>();


        ListView lv = findViewById(R.id.lvDuLich);
        ArrayList<DuLich> ds = new ArrayList<>();

        ds.add(new DuLich("Tháp Bà Ponagar", "Đường 2/4, Nha Trang", R.drawable.reze));
        ds.add(new DuLich("Chùa Long Sơn", "20 Đường 23/10, Nha Trang", R.drawable.reze));
        ds.add(new DuLich("VinWonders", "Đảo Hòn Tre, Nha Trang", R.drawable.reze));
        ds.add(new DuLich("Viện Hải Dương Học", "1 Cầu Đá, Nha Trang", R.drawable.reze));
        ds.add(new DuLich("Nhà Thờ Núi", "31 Thái Nguyên, Nha Trang", R.drawable.reze));

        DuLichAdapter adapter = new DuLichAdapter(ds, this);
        lv.setAdapter(adapter);
    }
}