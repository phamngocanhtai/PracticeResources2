package com.example.practiceresources2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ItemRestaurantVH> {
    Context context;
    ArrayList<Restaurant> restaurantArrayList;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurantArrayList) {
        this.context = context;
        this.restaurantArrayList = restaurantArrayList;
    }

    @NonNull
    @Override
    public ItemRestaurantVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_item, parent, false);

        return new ItemRestaurantVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.ItemRestaurantVH holder, int position) {
        Restaurant restaurant = restaurantArrayList.get(position);
        holder.imgRestaurant.setImageResource(restaurant.getImageRes());
        holder.txtNameRestaurant.setText(restaurant.getNameRes());
        holder.txtFoodRestaurant.setText(restaurant.getFoodRes());
        holder.txtVoteRestaurant.setText(restaurant.getVoteRes());
        holder.txtDeliveryRestaurant.setText(String.valueOf(restaurant.getTimeDeliveryRes()));
        holder.txtRateRestaurant.setText(String.valueOf(restaurant.getRateRes()));
        if (restaurant.getFeeDeliveryRes() == 0)
        {
            holder.txtFeeRestaurant.setText("Free");
        }
        else holder.txtFeeRestaurant.setText(String.valueOf(restaurant.getFeeDeliveryRes()));

    }

    @Override
    public int getItemCount() {
        return restaurantArrayList.size();
    }


    class ItemRestaurantVH extends RecyclerView.ViewHolder {
        ImageView imgRestaurant;
        TextView txtNameRestaurant, txtRateRestaurant, txtVoteRestaurant, txtDeliveryRestaurant, txtFoodRestaurant, txtFeeRestaurant;

        public ItemRestaurantVH(@NonNull View itemView) {
            super(itemView);

            imgRestaurant = itemView.findViewById(R.id.imgRestaurant);
            txtNameRestaurant = itemView.findViewById(R.id.txtNameRestaurant);
            txtRateRestaurant = itemView.findViewById(R.id.txtRateRestaurant);
            txtDeliveryRestaurant = itemView.findViewById(R.id.txtDeliveryRestaurant);
            txtFeeRestaurant = itemView.findViewById(R.id.txtFeeRestaurant);
            txtVoteRestaurant = itemView.findViewById(R.id.txtVoteRestaurant);
            txtFoodRestaurant = itemView.findViewById(R.id.txtFoodRestaurant);
        }
    }
}
