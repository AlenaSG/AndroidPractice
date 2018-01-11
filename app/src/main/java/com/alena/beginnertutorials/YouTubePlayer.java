package com.alena.beginnertutorials;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayerView;


public class YouTubePlayer extends AppCompatActivity {

//    private static final String TAG = "YouTubePlayer";
//
//    YouTubePlayerView mYouTubePlayerView;
//    Button btnPlay;
//    YouTubePlayer.OnInitializedListener mOnInitializedListener;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.player_youtube);
//
//        Log.d(TAG, "onCreate: Starting Youtube");
//
//        btnPlay = (Button) findViewById(R.id.btnPlay);
//        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);
//
//        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("OKbpLQp509Y");
//            }
//
//            @Override
//            public void onInitializationFailure(com.google.android.youtube.player.YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Log.d(TAG, "onInitializationFailure: initialization failed");
//            }
//        };
//
//
//        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider, YouTubePlayer youTubePlayer, boolean b) {
//                Log.d(TAG, "onInitializationSuccess: done initializing");
//
//                youTubePlayer.loadVideo("OKbpLQp509Y");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider, YouTubePlayer youTubeInitializationResult youTubeInitializationResult) {
//                Log.d(TAG, "onInitializationFailure: failed to initialize");
//            }
//        };
//
//        btnPlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: initializing youtube player");
//                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);
//            }
//        });
//    }
}
