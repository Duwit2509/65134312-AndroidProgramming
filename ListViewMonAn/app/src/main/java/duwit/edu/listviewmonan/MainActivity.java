package duwit.edu.listviewmonan;

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
    ListView lvMonAn;
    ArrayList<String> dsMonAn;
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
        lvMonAn = findViewById(R.id.monan);

        //Tao nguon du lieu
        dsMonAn = new ArrayList<>();
        dsMonAn.add("Mon an 1");
        dsMonAn.add("Mon an 2");
        dsMonAn.add("Mon an 3");
        dsMonAn.add("...");
        dsMonAn.add("...");
        dsMonAn.add("...");
        //Khoi tao Adapter
        adapter = new ArrayAdapter<>(
                this,
                R.layout.mon_an,
                R.id.tvMonAn,
                dsMonAn
        );

        //Do du lieu len ListView
        lvMonAn.setAdapter(adapter);
    }
}