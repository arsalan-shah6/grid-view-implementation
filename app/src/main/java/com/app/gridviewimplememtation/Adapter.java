package com.app.gridviewimplememtation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView .Adapter<Adapter.viewholder> {
    List<String>name;
    List<Integer>icon;
    Context context;

    public Adapter(List<String> name, List<Integer> icon, Context context) {
        this.name = name;
        this.icon = icon;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

View view=LayoutInflater.from( context ).inflate( R.layout.grid_item,parent,false );
        return new viewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.textView.setText( name.get( position ) );
        holder .circleImageView.setImageResource( icon.get( position ) );

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    class viewholder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        TextView textView;
        ImageView circleImageView;
        public viewholder(@NonNull View itemView) {
            super( itemView );
            textView=itemView.findViewById( R.id.textView );
            circleImageView =itemView.findViewById( R.id.profile_image );
            itemView.setOnClickListener( this );
        }

        @Override
        public void onClick(View view) {
            Intent intent=new Intent(context,HomeActivity.class);
intent.putExtra( "key",name.get( getAdapterPosition() ) );
intent.putExtra( "image" ,icon.get( getAdapterPosition() ));
            context.startActivity( intent );
        }
    }

}
