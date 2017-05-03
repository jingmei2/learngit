package com.example.magi.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by magi on 2017/4/23.
 */

public class MyAdapter extends BaseAdapter {
    private List<ItemBean> mBeanList;
    private LayoutInflater mInflater;
    //构造方法，初始化对象
    public MyAdapter(Context context, List<ItemBean> list){
        //
        mBeanList = list;
        //context为要使用adapter的界面对象，mInflater布局装载器对象
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return mBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //传入 xml 布局文件，转化为视图

        //常规用法
        //每次去初始化 View 浪费效率。
//        View view = mInflater.inflate(R.layout.item,null);
//        ImageView iv_image = (ImageView) view.findViewById(R.id.iv_image);
//        TextView tv_title = (TextView) view.findViewById(R.id.tv_title);
//        TextView tv_content = (TextView) view.findViewById(R.id.tv_content);
//        ItemBean itemBean = mBeanList.get(position);
//        iv_image.setImageResource(itemBean.getItemImageResId());
//        tv_title.setText(itemBean.getTitle());
//        tv_content.setText(itemBean.getContent());

        //一般用法
//        if (convertView==null){
//            convertView = mInflater.inflate(R.layout.item,null);
//        }
//        ImageView iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
//        TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);
//        TextView tv_content = (TextView) convertView.findViewById(R.id.tv_content);
//        ItemBean itemBean = mBeanList.get(position);
//        iv_image.setImageResource(itemBean.getItemImageResId());
//        tv_title.setText(itemBean.getTitle());
//        tv_content.setText(itemBean.getContent());

        //高级用法
        //创建内部类ViewHolder
        //判断converView是否为空
        //通过 setTag将ViewHolder与converView绑定
        ViewHolder viewHolder;
        if (convertView==null){
            //在需要使用的时候再实例化对象
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tv_content = (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ItemBean itemBean = mBeanList.get(position);
        viewHolder.iv_image.setImageResource(itemBean.getItemImageResId());
        viewHolder.tv_title.setText(itemBean.getTitle());
        viewHolder.tv_content.setText(itemBean.getContent());

        return convertView;
    }

    class ViewHolder {
        ImageView iv_image;
        TextView tv_title;
        TextView tv_content;
    }

}
