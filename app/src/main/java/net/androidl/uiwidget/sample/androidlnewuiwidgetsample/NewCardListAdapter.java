package net.androidl.uiwidget.sample.androidlnewuiwidgetsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewCardListAdapter extends RecyclerView.Adapter {

    LayoutInflater mInflater;
    List mData;

    public NewCardListAdapter(Context context, List data) {
        mInflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.new_card_info, parent, false);
        RecyclerView.ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        LocalGovInfo shigaInfo = (LocalGovInfo)mData.get(position);
        ViewHolder h = (ViewHolder)holder;
        h.iv_mark.setImageResource(shigaInfo.markResource);
        h.tv_name.setText(shigaInfo.name);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_mark;
        TextView tv_name;

        ViewHolder(View itemView) {
            super(itemView);
            iv_mark = (ImageView)itemView.findViewById(R.id.iv_new_mark);
            tv_name = (TextView)itemView.findViewById(R.id.tv_new_name);
        }
    }
}
