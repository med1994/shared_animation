package mohamed.com.sharedanimation;



import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img_profil,logo;
    TextView name;
    TextView txt_detail;
    RelativeLayout forme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_profil=(ImageView)findViewById(R.id.image_profil);
        logo=(ImageView)findViewById(R.id.imageView);

        name=(TextView)findViewById(R.id.name_text);
        txt_detail=(TextView)findViewById(R.id.txt_detail);
        forme=(RelativeLayout)findViewById(R.id.form_A);

        forme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                Pair[]  pairs=new Pair[4];
                pairs[0] =new Pair<View,String>(img_profil,"imagetransition");
                pairs[1] =new Pair<View,String>(name,"nametransition");
                pairs[2] =new Pair<View,String>(txt_detail,"detailTransiton");
                pairs[3] =new Pair<View,String>(logo,"logotransition");


                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);

                startActivity(intent,options.toBundle());
            }
        });

    }
}
