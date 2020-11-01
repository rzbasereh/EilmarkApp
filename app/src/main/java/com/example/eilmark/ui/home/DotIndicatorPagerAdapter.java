package com.example.eilmark.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;

import com.example.eilmark.R;

import java.util.Arrays;
import java.util.List;

public class DotIndicatorPagerAdapter extends PagerAdapter {
    private static final List<Item> items =
            Arrays.asList(new Item(R.color.black), new Item(R.color.design_default_color_on_primary),
                    new Item(R.color.design_default_color_secondary), new Item(R.color.light_green),
                    new Item(R.color.material_on_surface_stroke));

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View item = LayoutInflater.from(container.getContext())
                .inflate(R.layout.carousel_item, container, false);
        CardView cardView = item.findViewById(R.id.card_view);
        cardView.setCardBackgroundColor(
                ContextCompat.getColor(container.getContext(), (items.get(position).color)));
        container.addView(item);
        return item;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    private static class Item {
        private final int color;

        private Item(int color) {
            this.color = color;
        }
    }
}