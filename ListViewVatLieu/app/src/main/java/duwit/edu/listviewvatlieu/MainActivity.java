package duwit.edu.listviewvatlieu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvVatLieu;
    ArrayList<String> dsVatLieu;
    ArrayAdapter<String> adapter;
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
        // Anh xa
        lvVatLieu = findViewById(R.id.vatlieu);

        //Tao nguon du lieu
        dsVatLieu = new ArrayList<>();
        dsVatLieu.add("Xi mang");
        dsVatLieu.add("Gach");
        dsVatLieu.add("Da op lat");
        dsVatLieu.add("Ong nhua");
        dsVatLieu.add("Son chong tham");
        dsVatLieu.add("...");
        //Khoi tao Adapter
        adapter = new ArrayAdapter<>(
                this,
                R.layout.vat_lieu, // Sử dụng layout tùy chỉnh của bạn
                R.id.tvTenVatLieu,      // ID của TextView bên trong item_vat_lieu.xml
                dsVatLieu
        );

        //Do du lieu len ListView
        lvVatLieu.setAdapter(adapter);
    }
}