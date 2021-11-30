package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.Hodler>{

    ArrayList<model>list;
    Context context;

    public adapter(ArrayList<model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Hodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample,parent,false);
        return new Hodler(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Hodler holder, int position) {
        model model = list.get(position);

        int pos=holder.getAdapterPosition();
        holder.imageView.setImageResource(model.getImage());
        holder.textView.setText(model.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

          switch(pos){
              case (0):
                  Toast.makeText(context, "Clicked"+pos, Toast.LENGTH_SHORT).show();
                  break;

              case  (1):
                  Toast.makeText(context, "Clicked"+pos, Toast.LENGTH_SHORT).show();
                  break;

          }
      }
  });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Hodler extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public Hodler(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);


        }
    }

}
