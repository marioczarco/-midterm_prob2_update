package assignment1_411.multi_num_clicker_update;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Zarco on 11/3/2019.
 */

public class multiCounterAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return counterKeeper.getInstance().getCounterList().size();
    }

    @Override
    public Object getItem(int i) {
        return counterKeeper.getInstance().getCounterList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View row_view;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.clicker_row, viewGroup, false);
        } else row_view = view;

        final Counter p = counterKeeper.getInstance().getCounterList().get(i);
        ((TextView) row_view.findViewById(R.id.int_count)).setTextColor(Color.parseColor("#FFFFFF"));
        ((TextView) row_view.findViewById(R.id.int_count)).setTextSize(24);
        ((TextView) row_view.findViewById(R.id.int_count)).setText(Integer.toString(p.getTally()));
        row_view.setTag(new Integer(i));

        row_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //
                        ((TextView) row_view.findViewById(R.id.int_count)).setText(Integer.toString(p.getTally() + 1));
                        p.setTally(p.getTally() + 1);
                        Toast.makeText(view.getContext(), "View Object was touched by user.", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        return row_view;
    }



}
