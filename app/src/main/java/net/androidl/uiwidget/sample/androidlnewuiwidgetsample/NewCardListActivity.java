package net.androidl.uiwidget.sample.androidlnewuiwidgetsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import net.androidl.uiwidget.sample.androidlnewuiwidgetsample.R;

import java.util.ArrayList;
import java.util.List;

public class NewCardListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_card_list);

        List shigaInfo = new ArrayList();
        shigaInfo.add(new LocalGovInfo("大津市", R.drawable.otsu));
        shigaInfo.add(new LocalGovInfo("草津市", R.drawable.kusatsu));
        shigaInfo.add(new LocalGovInfo("近江八幡市", R.drawable.omihachiman));
        shigaInfo.add(new LocalGovInfo("野洲市", R.drawable.yasu));
        shigaInfo.add(new LocalGovInfo("湖南市", R.drawable.konan));
        shigaInfo.add(new LocalGovInfo("東近江市", R.drawable.higashiomi));
        shigaInfo.add(new LocalGovInfo("日野町", R.drawable.hino));
        shigaInfo.add(new LocalGovInfo("多賀町 ", R.drawable.taga));

        RecyclerView rv = (RecyclerView)findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new NewCardListAdapter(this, shigaInfo));
        rv.setVerticalScrollBarEnabled(false);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new_card_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
