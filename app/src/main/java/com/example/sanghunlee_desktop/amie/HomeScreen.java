package com.example.sanghunlee_desktop.amie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import java.util.*;
import android.widget.Button;
import android.widget.CheckBox;

import com.daprlabs.aaron.swipedeck.SwipeDeck;


public class HomeScreen extends AppCompatActivity {
    private SwipeDeck cardStack;
    private SwipeDeckAdapter deckAdapter;
    private ArrayList<String> testData;
    private CheckBox dragCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_screen);
        //Below is the swipecard code

    }
    public void swipe_deck(View view){
        setContentView(R.layout.swipe_deck);
        cardStack = (SwipeDeck) findViewById(R.id.swipe_deck);
        //dragCheckbox = (CheckBox) findViewById(R.id.checkbox_drag);
        testData = new ArrayList<>();
        for(int x = 0; x <10; x++){
            testData.add("Sample Bio: " + x);
        }
        deckAdapter = new SwipeDeckAdapter(testData,this);
        if(cardStack != null){
            cardStack.setAdapter(deckAdapter);
        }
        cardStack.setCallback(new SwipeDeck.SwipeDeckCallback() {
            @Override
            public void cardSwipedLeft(long stableId) {
                Log.i("MainActivity", "card was swiped left, position in adapter: " + stableId);
            }

            @Override
            public void cardSwipedRight(long stableId) {
                Log.i("MainActivity", "card was swiped right, position in adapter: " + stableId);

            }


            public boolean isDragEnabled(long itemId) {
                return dragCheckbox.isChecked();
            }
        });
        cardStack.setLeftImage(R.id.left_image);
        cardStack.setRightImage(R.id.right_image);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardStack.swipeTopCardLeft(500);

            }
        });
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardStack.swipeTopCardRight(500);
            }
        });
    }

    public void login(View view) {
        //Do something in response to button
        //Below is the original code. This should be changed before final product.
        setContentView(R.layout.login);
      //  setContentView(R.layout.swipe_deck);
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