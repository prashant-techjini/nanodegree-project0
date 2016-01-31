package com.nanodegree.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class AppListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);

        findViewById(R.id.button_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.button_scores_app).setOnClickListener(this);
        findViewById(R.id.button_library_app).setOnClickListener(this);
        findViewById(R.id.button_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.button_xyz_reader).setOnClickListener(this);
        findViewById(R.id.button_capstone_my_app).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_spotify_streamer:
                Toast.makeText(AppListActivity.this, getResources().getString(R.string.button_click_msg)
                        + " " + getResources().getString(R.string.spotify_streamer).toLowerCase()
                        + " " + getResources().getString(R.string.app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_scores_app:
                Toast.makeText(AppListActivity.this, getResources().getString(R.string.button_click_msg)
                        + " " + getResources().getString(R.string.scores_app).toLowerCase()
                        + ".", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_library_app:
                Toast.makeText(AppListActivity.this, getResources().getString(R.string.button_click_msg)
                        + " " + getResources().getString(R.string.library_app).toLowerCase()
                        + ".", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_build_it_bigger:
                Toast.makeText(AppListActivity.this, getResources().getString(R.string.button_click_msg)
                        + " " + getResources().getString(R.string.build_it_bigger).toLowerCase()
                        + " " + getResources().getString(R.string.app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_xyz_reader:
                Toast.makeText(AppListActivity.this, getResources().getString(R.string.button_click_msg)
                        + " " + getResources().getString(R.string.xyz_reader).toLowerCase()
                        + " " + getResources().getString(R.string.app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_capstone_my_app:
                Toast.makeText(AppListActivity.this, getResources().getString(R.string.button_click_msg)
                        + " " + getResources().getString(R.string.capstone).toLowerCase()
                        + " " + getResources().getString(R.string.app), Toast.LENGTH_SHORT).show();
                break;

            default:
                break;

        }

    }
}
