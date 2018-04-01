package com.ubay.achmadirjikubay_1202154184_modul6;

/**
 * Created by AIUBAY on 30/03/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by AndroidJSon.com on 6/18/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    String useremail;
    String url;
    Context context;
    List<ImageUploadInfo> MainImageUploadInfoList;

    public RecyclerViewAdapter(Context context, List<ImageUploadInfo> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageUploadInfo UploadInfo = MainImageUploadInfoList.get(position);
        holder.tUser.setText(UploadInfo.getUserImage());
        holder.imageNameTextView.setText(UploadInfo.getImageName());
        url = UploadInfo.getImageURL();
        useremail = UploadInfo.getUserImage();

        //Loading image from Glide library.
        Glide.with(context).load(url).into(holder.imageView);
    }


    @Override
    public int getItemCount() {

        return MainImageUploadInfoList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tUser;
        public ImageView imageView;
        public TextView imageNameTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            tUser = (TextView) itemView.findViewById(R.id.user1);
            imageNameTextView = (TextView) itemView.findViewById(R.id.ImageNameTextView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
// Use that to access the affected item in mWordList.
            String element = MainImageUploadInfoList.get(mPosition).toString();
            String uri = MainImageUploadInfoList.get(mPosition).getImageURL();
            String nama = MainImageUploadInfoList.get(mPosition).getImageName();
            Intent i = new Intent(view.getContext(), DetailGambar.class);
            i.putExtra("useremail",useremail);
            i.putExtra("url",uri);
            i.putExtra("nama",nama);
            view.getContext().startActivity(i);


        }
    }
}