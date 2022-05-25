package Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.test.mymovies.R;

public class Detail_Activity extends AppCompatActivity {
    private TextView titre , genre, annee;
    private ImageView imageView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        extras = getIntent().getExtras();
        titre= findViewById(R.id.titre);
        genre= findViewById(R.id.genre);
        annee= findViewById(R.id.year);
        imageView= findViewById(R.id.imageView2);

        if(extras != null){
            titre.setText(extras.getString("titre"));
            genre.setText(extras.getString("genree"));
            annee.setText(extras.getString("annee"));
            imageView.setImageResource(extras.getInt("image"));
        }
    }
}