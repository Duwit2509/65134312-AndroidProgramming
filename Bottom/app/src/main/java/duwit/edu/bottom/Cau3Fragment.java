package duwit.edu.bottom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {
    //Khai báo các biến cần thiết

    //1. KHai báo các biến toàn cục
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    //2. Khai bao caác biến dạo diện cho cacsc view câần tương tác
    RecyclerView recyclerViewLandScape;

    public Cau3Fragment(){

    }
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. Chuẩn bị dữ liệu cho list
        list = new ArrayList<LandScape>();
        list.add(new LandScape("Cot co Ha Noi", "hanoi_flag_tower"));
        list.add(new LandScape("Thap Eiffel", "eiffel_tower"));
        list.add(new LandScape("Cung dien Buckingham", "buckingham_palace"));
        list.add(new LandScape("Tuong nu than tu do", "nu_than_tu_do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);

        //4. Tim dieu khiển RecyclcrView
        recyclerViewLandScape = viewCau3.findViewById(R.id.ryCau3);
        //5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        //7. Gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);
        return viewCau3;
    }
}