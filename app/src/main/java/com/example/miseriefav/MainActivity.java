package com.example.miseriefav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;
    private Button _btn_link;
    String _url = "https://www.filmaffinity.com/es/film539830.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://i.pinimg.com/564x/60/45/76/6045767654fa06590cd0503e0982d790.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.liverpoolmuseums.org.uk/styles/dynamic/public/2021-12/Peaky%20Blinders.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.pinimg.com/564x/4b/c2/85/4bc285ae60f41b3f4e2fcf53502d5da8.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.pinimg.com/564x/c7/cb/2e/c7cb2e5d0f35c71bd9a9ef9466568e38.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.pinimg.com/564x/37/5d/a8/375da8e94a812c0dd8f419d18f1a873d.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.pinimg.com/564x/bf/ea/ee/bfeaeecd98cc18e0cae38650b861cf30.jpg", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        _btn_link = findViewById(R.id.bt_link);

        _btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);

                //Log.d("click","ok");
            }
        });


    }
}