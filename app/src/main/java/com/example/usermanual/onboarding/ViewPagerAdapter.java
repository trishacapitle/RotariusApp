package com.example.usermanual.onboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.usermanual.R;


public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int[] sliderAllText = {R.string.Terms_and_Conditions, R.string.Safety_Precautions};
    int[] sliderAllAgree = {R.string.agree_tc, R.string.agree_sp};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return sliderAllText.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_screen, container, false);

        TextView text = view.findViewById(R.id.tvText);
        TextView text2 = view.findViewById(R.id.checkBox);

        text.setText(this.sliderAllText[position]);
        text2.setText(this.sliderAllAgree[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);

    }
}
