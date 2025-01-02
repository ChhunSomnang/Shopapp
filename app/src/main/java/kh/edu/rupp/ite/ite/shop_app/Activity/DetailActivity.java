package kh.edu.rupp.ite.ite.shop_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.bumptech.glide.Glide;

import kh.edu.rupp.ite.ite.shop_app.Helper.ManagmentCart;
import kh.edu.rupp.ite.ite.shop_app.R;
import kh.edu.rupp.ite.ite.shop_app.databinding.ActivityDetailBinding;
import kh.edu.rupp.ite.ite.shop_app.domain.PopularDomain;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;
    private PopularDomain object;
    private int numberOrder = 1;
    private ManagmentCart managmentCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getBundles();
        managmentCart=new ManagmentCart(this);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window = DetailActivity.this.getWindow();
        ((Window) window).setStatusBarColor(ContextCompat.getColor(DetailActivity.this, R.color.white));
    }
    private void getBundles() {
        object = (PopularDomain) getIntent().getSerializableExtra("object");

        int drawableResourceId=this.getResources().getIdentifier(object.getPicUrl(),"drawable",this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(binding.itemPic);

        binding.titleTxt.setText(object.getTitle());
        binding.priceTxt.setText("$"+object.getPrice());
        binding.descriptionTxt.setText(object.getDescription());
        binding.reviewTxt.setText(object.getReview()+"");
        binding.ratingTxt.setText(object.getScore()+"");

        binding.addToCartBtn.setOnClickListener(v -> {
            object.setNumberInCart(numberOrder);
            managmentCart.insertFood(object);
        });

        binding.backbtn.setOnClickListener(v -> finish());
    }
}