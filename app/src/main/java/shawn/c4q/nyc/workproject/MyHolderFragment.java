package shawn.c4q.nyc.workproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import shawn.c4q.nyc.workproject.POJOS.ColorPalette;

/**
 * Created by shawnspeaks on 11/14/16.
 */


public class MyHolderFragment extends Fragment {

    private RecyclerView rv;
    private Adapter adapter;

    @Override
    public void onCreate(@Nullable Bundle bundle){
        super.onCreate(bundle);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle bundle){
        return inflater.inflate(R.layout.fragment, parent, false);
    }

    public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


        private List<ColorPalette> colorPalettesList;

        public Adapter(List<ColorPalette> cpList){
            this.colorPalettesList = cpList;
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ColorPalette colorPalette = colorPalettesList.get(position);

        }

        @Override
        public int getItemCount() {
            if (colorPalettesList == null) {
                return 0;
            }
            return colorPalettesList.size();
        }

        public void addToColorPalettelist(ColorPalette cp) {
            this.colorPalettesList.add(cp);
            notifyDataSetChanged();
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView textView;
        private ColorPalette currentColorPalette;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.imported_color);
            textView.setOnClickListener(this);
        }


        public void bind(ColorPalette colorPalette) {
            this.currentColorPalette = colorPalette;
            String colorName = colorPalette.getName();
            String hexText = colorPalette.getValue();
            if (colorName != null) {
                textView.setText(colorName);
            }
        }


        @Override
        public void onClick(View view) {
            /**
             * 1.IMPLEMENT LOGIC HERE TO NAVIGATE TO NEW ACTIVITY
             * 2. STORE DATA INSIDE VIEW TO POPULATE COLOR ON NEXT ACTIVITY
             */

        }


    }
}