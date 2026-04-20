package thigk2.tranducviet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class DuLichAdapter extends BaseAdapter {
    private ArrayList<DuLich> ds;
    private Context context;

    public DuLichAdapter(ArrayList<DuLich> ds, Context context) {
        this.ds = ds;
        this.context = context;
    }

    @Override
    public int getCount() { return ds.size(); }

    @Override
    public Object getItem(int position) { return ds.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_dulich, parent, false);
        }

        DuLich dl = ds.get(position);

        ImageView img = convertView.findViewById(R.id.imgAnhDiaDiem);
        TextView txtTen = convertView.findViewById(R.id.txtTenDiaDiem);
        TextView txtDia = convertView.findViewById(R.id.txtDiaChi);

        txtTen.setText(dl.getTenDiaDiem());
        txtDia.setText(dl.getDiaChi());
        img.setImageResource(dl.getIdAnh());

        return convertView;
    }
}