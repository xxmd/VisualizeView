package io.github.xxmd;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class AudioVisualizeView extends View {
    private String audioFilePath;

    public String getAudioFilePath() {
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
        initAudioInfo();
    }

    private void initAudioInfo() {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        retriever.setDataSource(audioFilePath);
        retriever.get

    }

    public AudioVisualizeView(Context context) {
        super(context);
        init();
    }

    public AudioVisualizeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {

    }
}
