package com.muhfajrinaljabar_f55121037.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


    public class HewanAdapter extends BaseAdapter {
        private final Context context;
        private ArrayList<Hewan> hewans;

        public void setHewans(ArrayList<Hewan> hewans) {
            this.hewans = hewans;
        }

        public HewanAdapter(Context context) {
            this.context = context;
            hewans = new ArrayList<>();
        }

        @Override
        public int getCount() {
            return hewans.size();
        }

        @Override
        public Object getItem(int i) {
            return hewans.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.item_hewan, viewGroup, false);

            }

            ViewHolder viewHolder = new ViewHolder(view);
            Hewan hewan = (Hewan) getItem(i);
            viewHolder.bind(hewan);
            return view;
        }

        private class ViewHolder {
            private TextView txtName;
            private TextView txtDescription;
            private ImageView imgPhoto;

            ViewHolder(View view) {
                txtName = view.findViewById(R.id.jenis_hewan1);
                imgPhoto = view.findViewById(R.id.hewan);
            }

            void bind(Hewan hewan) {
                txtName.setText(hewan.getName());
                imgPhoto.setImageResource(hewan.getPhoto());
            }
        }
    }
