package com.ubay.achmadirjikubay_1202154184_modul6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AIUBAY on 01/04/2018.
 */

public class komenAdapter extends RecyclerView.Adapter<komenAdapter.ViewHolder> {
    String useremail;
    String url;
    Context context;
    List<komen> MainImageUploadInfoList;

    public komenAdapter(Context context, List<komen> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }

    @Override
    public komenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.komenlayout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(komenAdapter.ViewHolder holder, int position) {
        komen UploadInfo = MainImageUploadInfoList.get(position);
        holder.komentarUSer.setText(UploadInfo.getKomentar());
        holder.namaUser.setText(UploadInfo.getUserKomen());


    }

    @Override
    public int getItemCount() {
        return MainImageUploadInfoList.size();

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView namaUser;
        public TextView komentarUSer;

        public ViewHolder(View itemView) {
            super(itemView);

            //imageView = (ImageView) itemView.findViewById(R.id.imageView);
            namaUser = (TextView) itemView.findViewById(R.id.namauser);
            komentarUSer = (TextView) itemView.findViewById(R.id.thecoment);

        }
    }
}
