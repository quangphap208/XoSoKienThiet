package com.example.asus.ketquasoxo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class RecylerViewAdapter extends
        RecyclerView.Adapter<RecylerViewAdapter.ViewHolder> {

    private List<Ngay> mContacts;
    Context c;

    public RecylerViewAdapter(List<Ngay> contacts, Context c) {
        mContacts = contacts;
        this.c = c;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNgay;
        TextView tvGiai;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNgay = (TextView) itemView.findViewById(R.id.tvNgay);
            tvGiai = (TextView) itemView.findViewById(R.id.tvGiai);
        }
    }

    @Override
    public RecylerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_recylerview, parent, false);

        RecylerViewAdapter.ViewHolder viewHolder = new RecylerViewAdapter.ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecylerViewAdapter.ViewHolder holder, int position) {
        final Ngay ngay = mContacts.get(position);
        holder.tvNgay.setText("Ngày " + ngay.getNgay());
        String giaiDb = "Giải Đặc Biệt: ";
        for (int i = 0; i < ngay.getdB().size(); i++) {
            giaiDb += ngay.getdB().get(i).toString();
        }
        giaiDb += "\n" + "\n";
        String giai1 = "Giải nhất:  ";
        for (int i = 0; i < ngay.getGiai1().size(); i++) {
            giai1 += ngay.getGiai1().get(i).toString();
        }
        giai1 += "\n" + "\n";
        String giai2 = "Giải hai:  ";
        for (int i = 0; i < ngay.getGiai2().size(); i++) {
            giai2 += ngay.getGiai2().get(i).toString();
        }
        giai2 += "\n" + "\n";
        String giai3 = "Giải ba:  ";
        for (int i = 0; i < ngay.getGiai3().size(); i++) {
            giai3 += ngay.getGiai3().get(i).toString() + "  ";
        }
        giai3 += "\n" + "\n";
        String giai4 = "Giải tư:  ";
        for (int i = 0; i < ngay.getGiai4().size(); i++) {
            giai4 += ngay.getGiai4().get(i).toString() + "  ";
        }
        giai4 += "\n" + "\n";
        String giai5 = "Giải năm:  ";
        for (int i = 0; i < ngay.getGiai5().size(); i++) {
            giai5 += ngay.getGiai5().get(i).toString();
        }        giai5 += "\n" + "\n";
        String giai6 = "Giải sáu:  ";
        for (int i = 0; i < ngay.getGiai6().size(); i++) {
            giai6 += ngay.getGiai6().get(i).toString() + "  ";
        }
        giai6 += "\n" + "\n";
        String giai7 = "Giải bảy:  ";
        for (int i = 0; i < ngay.getGiai7().size(); i++) {
            giai7 += ngay.getGiai7().get(i).toString();
        }
        giai7 += "\n" +"\n";
        String giai8 = "Giải tám:  ";
        for (int i = 0; i < ngay.getGiai8().size(); i++) {
            giai8 += ngay.getGiai8().get(i).toString();
        }
        giai8 += "\n" +"\n";

        String ketQua = giaiDb + giai1 + giai2 + giai3 + giai4 + giai5 + giai6 + giai7 + giai8 ;
        holder.tvGiai.setText(ketQua);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}

