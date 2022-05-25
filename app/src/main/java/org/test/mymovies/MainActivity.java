package org.test.mymovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.test.mymovies.Controller.MoviesAdapter;
import org.test.mymovies.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> moviesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewId);
        moviesAdapter = new MoviesAdapter(this,moviesList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(moviesAdapter);
         MoviesData();

    }
    public void MoviesData() {
        Movie movie= new Movie("The Shawshank Redemption","Drama","(1994)" ,
               R.drawable.a);
        moviesList.add(movie);

        Movie movie1= new Movie("2. The Godfather","Drama | Action","(1972)" ,
                R.drawable.a1);
        moviesList.add(movie1);

        Movie movie2= new Movie("The Dark Knight","Crime","(2008)" ,
                R.drawable.a2);
        moviesList.add(movie2);

        Movie movie3= new Movie("The Godfather: Part II","Adventure","(1972)" ,
                R.drawable.a3);
        moviesList.add(movie3);

        Movie movie4= new Movie("12 Angry Men","Drama","(1957)" ,
                R.drawable.a4);
        moviesList.add(movie4);

        Movie movie5= new Movie("Schindler's List","Crime","(1993)" ,
                R.drawable.a5);
        moviesList.add(movie5);

        Movie movie6= new Movie("The Lord of the Rings: The Return of the King","Drama","(2003)" ,
                R.drawable.a6);
        moviesList.add(movie6);

        Movie movie7= new Movie("Pulp Fiction","Adventure","(1994)" ,
                R.drawable.a7);
        moviesList.add(movie7);

        Movie movie8= new Movie(" The Lord of the Rings: The Fellowship of the Ring","Action","(2001)" ,
                R.drawable.a8);
        moviesList.add(movie8);

        Movie movie9= new Movie("Il buono, il brutto, il cattivo","Drama | Action","(1966)" ,
                R.drawable.a1);
        moviesList.add(movie9);

        Movie movie10= new Movie("Forrest Gump","Drama","(1994)" ,
                R.drawable.a2);
        moviesList.add(movie10);

        Movie movie11= new Movie("Fight Club","Action","(1999)" ,
                R.drawable.a3);
        moviesList.add(movie11);

        moviesAdapter.notifyDataSetChanged();
    }
}