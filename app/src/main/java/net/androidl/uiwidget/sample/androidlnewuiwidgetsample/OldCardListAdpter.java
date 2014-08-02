package net.androidl.uiwidget.sample.androidlnewuiwidgetsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OldCardListAdpter extends BaseAdapter{

    LayoutInflater mInflater;
    List mData;

    public OldCardListAdpter(Context context, List data) {
        super();
        mInflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.old_card_info, parent, false);

            holder = new ViewHolder();
            holder.iv_mark = (ImageView)convertView.findViewById(R.id.iv_old_mark);
            holder.tv_name = (TextView)convertView.findViewById(R.id.tv_old_name);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        LocalGovInfo shigaInfo = (LocalGovInfo)getItem(position);
        holder.iv_mark.setImageResource(shigaInfo.markResource);
        holder.tv_name.setText(shigaInfo.name);
        return convertView;
    }

    static class ViewHolder {
        ImageView iv_mark;
        TextView tv_name;
    }
}
