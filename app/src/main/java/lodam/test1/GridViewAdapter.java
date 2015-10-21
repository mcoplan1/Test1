package lodam.test1;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

/**
 * Created by Matt on 10/6/2015.
 */

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    //private String[] titles;
    private  int[] images;

    public GridViewAdapter(Context context, int[] images){
        super();
        this.context = context;
        this.images = images;
        //this.titles = titles;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView img = null;
        if (convertView == null) {
            img = new ImageView(context);

            convertView = img;
            img.setPadding(5, 5, 5, 5);
        } else {
            img = (ImageView) convertView;
        }

        Picasso.with(context)
                .load(images[position])
                .placeholder(android.R.drawable.picture_frame)
                .into(img);

        return convertView;
    }
}
