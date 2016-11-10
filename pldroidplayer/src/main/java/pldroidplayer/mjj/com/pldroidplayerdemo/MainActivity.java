package pldroidplayer.mjj.com.pldroidplayerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pldroidplayer.mjj.com.videoplayer.VideoActivity;
import pldroidplayer.mjj.com.videoplayer.util.ClickUtils;

/**
 * 视频播放
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_startVideo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 防止连续点击
                if (ClickUtils.isFastDoubleClick()) {
                    return;
                }
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("videoUrl", "http://flv2.bn.netease.com/videolib3/1610/11/qZaiS5996/HD/qZaiS5996-mobile.mp4");
                startActivity(intent);
            }
        });
    }
}
