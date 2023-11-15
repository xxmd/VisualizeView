package io.github.xxmd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public abstract class VisualizeView extends View {
    private int minUnit;
    public VisualizeView(Context context) {
        super(context);
        init();
    }

    public VisualizeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {

    }
}
