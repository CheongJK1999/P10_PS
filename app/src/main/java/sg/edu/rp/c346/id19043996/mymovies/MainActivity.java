package sg.edu.rp.c346.id19043996.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovies;
    ArrayList<Movie> alMovies;
    CustomAdapter caMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovies = findViewById(R.id.listViewMovies);
        alMovies = new ArrayList<>();

        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentDetail = new Intent( MainActivity.this, MovieDetailsActivity.class);

                Movie currentMovie = alMovies.get(position);
                intentDetail.putExtra("title", currentMovie.getTitle());
                intentDetail.putExtra("year", currentMovie.getYear());
                intentDetail.putExtra("rated", currentMovie.getRated());
                intentDetail.putExtra("genre", currentMovie.getGenre());
                intentDetail.putExtra("watchDate", currentMovie.getWatched_on_String());
                intentDetail.putExtra("theatre", currentMovie.getIn_theatre());
                intentDetail.putExtra("desc", currentMovie.getDescription());

                intentDetail.putExtra("rating", currentMovie.getRated());
                startActivity(intentDetail);
            }
        });
    }


}
