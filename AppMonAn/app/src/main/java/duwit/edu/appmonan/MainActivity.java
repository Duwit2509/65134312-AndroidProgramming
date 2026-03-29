package duwit.edu.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        //Tim ListView
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();

        dsMonAn.add(new MonAn("Com tam suon", 25000, "Mo ta o day", R.drawable.cts));
        dsMonAn.add(new MonAn("Com suon trung", 27000, "Mo ta o day", R.drawable.cst));
        dsMonAn.add(new MonAn("Ga xoi mo", 30000, "Mo ta o day", R.drawable.cg));
        dsMonAn.add(new MonAn("Suong bi cha", 32000, "Mo ta o day", R.drawable.sp));
        dsMonAn.add(new MonAn("Dac biet", 35000, "Mo ta o day", R.drawable.db));

        //
        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Lay phan tu duoc chon
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}