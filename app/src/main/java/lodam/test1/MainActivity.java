package lodam.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    //private GridView gridView;
    //private GridView gridView2;
    //private  GridViewAdapter gridAdapter;
    GridView grid;

    int[] images = {
            R.drawable.aatrox,
            R.drawable.ahri,
            R.drawable.akali,
            R.drawable.alistar,
            R.drawable.amumu,
            R.drawable.anivia,
            R.drawable.akali,
            R.drawable.alistar,
            R.drawable.aatrox,
            R.drawable.ahri,
            R.drawable.akali,
            R.drawable.alistar,
    };

    String[] titles = {
            "ahri",
            "ahri",
            "ahri",
            "ahri",
            "ahri",
            "ahri",
            "ahri",
            "ahri",
            "ahri",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, titles, images);
        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);

    }


    //gridView = (GridView) findViewById(R.id.gridView);
    //gridView2 = (GridView) findViewById(R.id.gridView2);
    //gridAdapter = new GridViewAdapter(MainActivity.this, images);
    //gridView.setAdapter(gridAdapter);

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
