package com.wasisoft.fitsa_user_app.Adaptors;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wasisoft.fitsa_user_app.Model.Nutritionist_items;
import com.wasisoft.fitsa_user_app.R;

public class Nutritionist_firestore_adp{
        //extends RecyclerView.Adapter<Nutritionist_firestore_adp.ViewHolder> {





    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImage;
        private TextView mTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.nut_title);
            mImage = itemView.findViewById(R.id.nut_imgv);
        }
    }



}