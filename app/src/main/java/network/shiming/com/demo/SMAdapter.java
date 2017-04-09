package network.shiming.com.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

import network.shiming.com.demo.bean.TadayBean;

/**
 * Created by shiming on 2017/4/9.
 */
public class SMAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private ArrayList<TadayBean> mDatas;
    public SMAdapter(Context context, ArrayList<TadayBean> data) {
        mContext=context;
        if (data==null){
            mDatas=new ArrayList<>();
        }else {
            mDatas=data;
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return  new MyViewHolder( LayoutInflater.from(mContext).inflate(R.layout.adapter_layout, parent, false));
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TadayBean tadayBean = mDatas.get(position);
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.mData.setText("时间"+tadayBean.year+"年"
        +tadayBean.month+"月"+tadayBean.day+"日"+"\n\r"
                +"农历："+tadayBean.lunar
        );
        myViewHolder.mTitle.setText(tadayBean.title);
        myViewHolder.mDes.setText(tadayBean.des);
        ImageLoader.getInstance().displayImage(tadayBean.pic, myViewHolder.mImg);
    }
    @Override
    public int getItemCount() {
        return mDatas!=null?mDatas.size():0;
    }
    public void addData(ArrayList<TadayBean> bean) {
        mDatas.addAll(bean);
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private  TextView mData;
        private TextView mTitle;
        private  TextView mDes;
        private  ImageView mImg;
        public MyViewHolder(View itemView) {
           super(itemView);
            mData = (TextView) itemView.findViewById(R.id.tv_data);
            mDes = (TextView) itemView.findViewById(R.id.tv_des);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
            mImg = (ImageView) itemView.findViewById(R.id.img);

       }
   }
 }
