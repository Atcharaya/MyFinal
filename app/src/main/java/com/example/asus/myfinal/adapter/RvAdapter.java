package com.example.asus.myfinal.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.myfinal.R;
import com.example.asus.myfinal.model.PhotoDao;
import com.example.asus.myfinal.model.UserdataDao;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ASUS on 17/5/2561.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.UserViewHolder>{
    private List<UserdataDao> userdata;
    private List<PhotoDao> photodata;

    public RvAdapter(List<UserdataDao> userdata,List<PhotoDao> photodata){
        this.userdata = userdata;
        this.photodata = photodata;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        UserViewHolder pv = new UserViewHolder(view);
        return pv;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        Picasso.get()
                .load(photodata.get(position).getThumbnailUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.img);
        holder.name.setText(userdata.get(position).getName());
        holder.username.setText(userdata.get(position).getUsername());
        holder.email.setText(userdata.get(position).getEmail());
        holder.address.setText(userdata.get(position).getAdderess().getStreet() + " , " + userdata.get(position).getAdderess().getSuite() + " , " + userdata.get(position).getAdderess().getCity() + " , " + userdata.get(position).getAdderess().getZipcode());
        holder.phone.setText(userdata.get(position).getPhone());
        holder.website.setText(userdata.get(position).getWebsite());
        holder.company.setText(userdata.get(position).getCompany().getName() + " , "+ userdata.get(position).getCompany().getCatchPhrase() + " , " + userdata.get(position).getCompany().getBs());
    }


    @Override
    public int getItemCount() {
        return userdata.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        TextView name, username, email, address, phone, website, company;
        ImageView img;
        public UserViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            username = itemView.findViewById(R.id.username);
            email = itemView.findViewById(R.id.email);
            address = itemView.findViewById(R.id.address);
            phone = itemView.findViewById(R.id.phone);
            website = itemView.findViewById(R.id.website);
            company = itemView.findViewById(R.id.company);
        }
    }


}
