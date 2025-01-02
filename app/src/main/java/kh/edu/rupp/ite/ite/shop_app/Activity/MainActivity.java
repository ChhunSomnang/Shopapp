package kh.edu.rupp.ite.ite.shop_app.Activity;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import kh.edu.rupp.ite.ite.shop_app.Adapter.PopularAdapter;
import kh.edu.rupp.ite.ite.shop_app.R;
import kh.edu.rupp.ite.ite.shop_app.databinding.ActivityMainBinding;
import kh.edu.rupp.ite.ite.shop_app.domain.PopularDomain;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusBarColor();
        initRecyclerView();
    }

    private void statusBarColor() {
        Window window=MainActivity.this.getWindow();
        ((Window) window).setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.purple_Dark));
    }

    private void initRecyclerView(){
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("T-shirt black","item_1",15,4,500,"test"));
        items.add(new PopularDomain("Smart Watch","item_2",10,4.5,450,"test"));
        items.add(new PopularDomain("Phone","item_3",3,4.9,800,"test"));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}
