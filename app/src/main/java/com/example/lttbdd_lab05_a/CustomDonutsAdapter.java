package com.example.lttbdd_lab05_a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class CustomDonutsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Donuts> arrayList;
    private int indexSelected = -1;

    public CustomDonutsAdapter(Context ctx, int layoutItem, ArrayList<Donuts> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutItem, viewGroup, false);
        }

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvStatus = view.findViewById(R.id.tvStatus);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        ImageView imageView = view.findViewById(R.id.imageView);
        ImageButton imageButton = view.findViewById(R.id.imageButton);
        ConstraintLayout constraintLayout = view.findViewById(R.id.itemConStraintLayout);
        Donuts donuts = arrayList.get(i);

        if(arrayList != null && !arrayList.isEmpty()) {
            tvName.setText(donuts.getName());
            tvStatus.setText(donuts.getStatus());
            tvPrice.setText(donuts.getFormatPrice());
            imageView.setImageResource(arrayList.get(i).getImagesDonut());
        }

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ctx, DeTailDonutActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("image", donuts.getImagesDonut());
                bundle.putString("name", donuts.getName());
                bundle.putString("price", donuts.getFormatPrice());

                in.putExtras(bundle);
                ctx.startActivity(in);
            }
        });

        return view;
    }
}
