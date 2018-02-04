package mohamed.com.sharedanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView img_profil;
    TextView name;
    TextView txt_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img_profil=(ImageView)findViewById(R.id.image_prof);
        name=(TextView)findViewById(R.id.name_txt);
        txt_detail=(TextView)findViewById(R.id.txt_det);
    }
}
