package com.example.sanghunlee_desktop.amie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;


public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_screen);
    }

    public void login(View view) {
        //Do something in response to button
        setContentView(R.layout.login);
    }

    public void register(View view) {
        //Do something in response to button
        setContentView(R.layout.register);
    }

    public void team_sign_up(View view) {
        //Do something in response to button
        setContentView(R.layout.team);
    }

    public void free_agent_sign_up(View view) {
        //Do something in response to button
        setContentView(R.layout.free_agent);
    }

    public void coach_sign_up(View view) {
        //Do something in response to button
        setContentView(R.layout.coach);
    }

    public void search_preferences(View view){
        setContentView(R.layout.searchpreferences);
    }

    public void main_menu(View view){
        setContentView(R.layout.main_menu);
    }

}
/*
public class SwipeDeckAdapter extends BaseAdapter {

    private List<String> data;
    private Context context;

    public SwipeDeckAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            //    LayoutInflater inflater = context.getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // normally use a viewholder
            //  v = inflater.inflate(R.layout.test_card2, parent, false);
        }

        ImageView imageView = (ImageView) v.findViewById(R.id.offer_image);
        Picasso.with(context).load(R.drawable.food).fit().centerCrop().into(imageView);
        TextView textView = (TextView) v.findViewById(R.id.sample_text);
        String item = (String)getItem(position);
        textView.setText(item);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Layer type: ", Integer.toString(v.getLayerType()));
                Log.i("Hardware Accel type:", Integer.toString(View.LAYER_TYPE_HARDWARE));
            }
        });
        return v;
    }
}
*/