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
    //images
    int[] images = {
            R.drawable.aatrox,
            R.drawable.ahri,
            R.drawable.akali,
            R.drawable.alistar,
            R.drawable.amumu,
            R.drawable.anivia,
            R.drawable.annie,
            R.drawable.ashe,
            R.drawable.azir,
            R.drawable.bard,
            R.drawable.blitzcrank,
            R.drawable.brand,
            R.drawable.braum,
            R.drawable.caitlyn,
            R.drawable.cassiopeia,
            R.drawable.chogath,
            R.drawable.corki,
            R.drawable.darius,
            R.drawable.diana,
            R.drawable.draven,
            R.drawable.drmundo,
            R.drawable.ekko,
            R.drawable.elise,
            R.drawable.evelynn,
            R.drawable.ezreal,
            R.drawable.fiddlesticks,
            R.drawable.fiora,
            R.drawable.fizz,
            R.drawable.galio,
            R.drawable.gangplank,
            R.drawable.garen,
            R.drawable.gnar,
            R.drawable.gragas,
            R.drawable.graves,
            R.drawable.hecarim,
            R.drawable.heimerdinger,
            R.drawable.irelia,
            R.drawable.janna,
            R.drawable.jarvaniv,
            R.drawable.jax,
            R.drawable.jayce,
            R.drawable.jinx,
            R.drawable.kalista,
            R.drawable.karma,
            R.drawable.karthus,
            R.drawable.kassadin,
            R.drawable.katarina,
            R.drawable.kayle,
            R.drawable.kennen,
            R.drawable.khazix,
            R.drawable.kogmaw,
            R.drawable.leblanc,
            R.drawable.leesin,
            R.drawable.leona,
            R.drawable.lissandra,
            R.drawable.lucian,
            R.drawable.lulu,
            R.drawable.lux,
            R.drawable.malphite,
            R.drawable.malzahar,
            R.drawable.maokai,
            R.drawable.masteryi,
            R.drawable.missfortune,
            R.drawable.monkeyking,
            R.drawable.mordekaiser,
            R.drawable.morgana,
            R.drawable.nami,
            R.drawable.nasus,
            R.drawable.nautilus,
            R.drawable.nidalee,
            R.drawable.nocturne,
            R.drawable.nunu,
            R.drawable.olaf,
            R.drawable.orianna,
            R.drawable.pantheon,
            R.drawable.poppy,
            R.drawable.quinn,
            R.drawable.rammus,
            R.drawable.reksai,
            R.drawable.renekton,
            R.drawable.rengar,
            R.drawable.riven,
            R.drawable.rumble,
            R.drawable.ryze,
            R.drawable.sejuani,
            R.drawable.shaco,
            R.drawable.shen,
            R.drawable.shyvana,
            R.drawable.singed,
            R.drawable.sion,
            R.drawable.sivir,
            R.drawable.skarner,
            R.drawable.sona,
            R.drawable.soraka,
            R.drawable.swain,
            R.drawable.syndra,
            R.drawable.tahmkench,
            R.drawable.talon,
            R.drawable.taric,
            R.drawable.teemo,
            R.drawable.thresh,
            R.drawable.tristana,
            R.drawable.trundle,
            R.drawable.tryndamere,
            R.drawable.twistedfate,
            R.drawable.twitch,
            R.drawable.udyr,
            R.drawable.urgot,
            R.drawable.varus,
            R.drawable.vayne,
            R.drawable.veigar,
            R.drawable.velkoz,
            R.drawable.vi,
            R.drawable.viktor,
            R.drawable.vladimir,
            R.drawable.volibear,
            R.drawable.warwick,
            R.drawable.xerath,
            R.drawable.xinzhao,
            R.drawable.yasuo,
            R.drawable.yorick,
            R.drawable.zac,
            R.drawable.zed,
            R.drawable.ziggs,
            R.drawable.zilean,
            R.drawable.zyra,
    };

    String[] titles = {
            "aatrox",
            "ahri",
            "akali",
            "alistar",
            "amumu",
            "anivia",
            "annie",
            "ashe",
            "azir",
            "bard",
            "blitzcrank",
            "brand",
            "braum",
            "caitlyn",
            "cassiopeia",
            "chogath",
            "corki",
            "darius",
            "diana",
            "draven",
            "drmundo",
            "ekko",
            "elise",
            "evelynn",
            "ezreal",
            "fiddlesticks",
            "fiora",
            "fizz",
            "galio",
            "gangplank",
            "garen",
            "gnar",
            "gragas",
            "graves",
            "hecarim",
            "heimerdinger",
            "irelia",
            "janna",
            "jarvaniv",
            "jax",
            "jayce",
            "jinx",
            "kalista",
            "karma",
            "karthus",
            "kassadin",
            "katarina",
            "kayle",
            "kennen",
            "khazix",
            "kogmaw",
            "leblanc",
            "leesin",
            "leona",
            "lissandra",
            "lucian",
            "lulu",
            "lux",
            "malphite",
            "malzahar",
            "maokai",
            "masteryi",
            "missfortune",
            "monkeyking",
            "mordekaiser",
            "morgana",
            "nami",
            "nasus",
            "nautilus",
            "nidalee",
            "nocturne",
            "nunu",
            "olaf",
            "orianna",
            "pantheon",
            "poppy",
            "quinn",
            "rammus",
            "reksai",
            "renekton",
            "rengar",
            "riven",
            "rumble",
            "ryze",
            "sejuani",
            "shaco",
            "shen",
            "shyvana",
            "singed",
            "sion",
            "sivir",
            "skarner",
            "sona",
            "soraka",
            "swain",
            "syndra",
            "tahmkench",
            "talon",
            "taric",
            "teemo",
            "thresh",
            "tristana",
            "trundle",
            "tryndamere",
            "twistedfate",
            "twitch",
            "udyr",
            "urgot",
            "varus",
            "vayne",
            "veigar",
            "velkoz",
            "vi",
            "viktor",
            "vladimir",
            "volibear",
            "warwick",
            "xerath",
            "xinzhao",
            "yasuo",
            "yorick",
            "zac",
            "zed",
            "ziggs",
            "zilean",
            "zyra",
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
