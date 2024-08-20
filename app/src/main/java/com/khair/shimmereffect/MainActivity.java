package com.khair.shimmereffect;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {
    ShimmerFrameLayout shimmerFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shimmerFrameLayout = findViewById(R.id.shimmer_view_container);

        // Start the shimmer animation
        shimmerFrameLayout.startShimmer();

        // Simulate loading content
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Stop the shimmer animation once the content is loaded
                shimmerFrameLayout.stopShimmer();
                shimmerFrameLayout.setVisibility(View.GONE);
                // Display the actual content here
            }
        }, 5000);

    }
}