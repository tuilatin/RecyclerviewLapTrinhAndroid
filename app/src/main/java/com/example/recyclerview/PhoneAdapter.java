package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder> {
    private Context context_144;
    private List<Phone> phoneList_144;

    public PhoneAdapter(Context context_144, List<Phone> phoneList_144) {
        this.context_144 = context_144;
        this.phoneList_144 = phoneList_144;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_144 = LayoutInflater.from(context_144).inflate(R.layout.item_phone, parent, false);
        return new ViewHolder(view_144);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder_144, int position_144) {
        Phone phone_144 = phoneList_144.get(position_144);
        holder_144.tvName_144.setText(phone_144.getName_144());
        holder_144.tvPrice_144.setText(phone_144.getPrice_144());

        holder_144.itemView.setOnClickListener(v ->
                Toast.makeText(context_144, "Bạn chọn: " + phone_144.getName_144(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() {
        return phoneList_144.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName_144, tvPrice_144;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName_144 = itemView.findViewById(R.id.tvName_144);
            tvPrice_144 = itemView.findViewById(R.id.tvPrice_144);
        }
    }
}
