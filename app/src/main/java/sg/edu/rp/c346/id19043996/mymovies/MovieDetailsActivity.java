package sg.edu.rp.c346.id19043996.mymovies;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieDetailsActivity extends MainActivity{

    RatingBar rBar;
    TextView tvTitle, tvDescription, tvWatchDate, tvTheatre, tvGenre;
    ImageView ivRated;

    public void onCreate(Bundle savedInstance){
        rBar = findViewById(R.id.ratingBar);
        tvTitle = findViewById(R.id.textViewTitle);
        tvDescription = findViewById(R.id.textViewDescription);
        tvWatchDate = findViewById(R.id.textViewWatchDate);
        tvTheatre = findViewById(R.id.textViewTheatre);
        tvGenre = findViewById(R.id.textViewYearGenre);
        ivRated = findViewById(R.id.imageViewRated);

        ivRated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tvTitle.setText("");
                tvGenre.setText("");
                tvDescription.setText("");
                tvWatchDate.setText("");
                tvTheatre.setText("");
            }
        }    );
    }

}
