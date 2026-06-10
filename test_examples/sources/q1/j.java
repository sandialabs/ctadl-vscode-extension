package q1;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class j {
    public static final boolean a(StaticLayout staticLayout) {
        v7.g.f(staticLayout, "layout");
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        v7.g.f(builder, "builder");
        LineBreakConfig build = new LineBreakConfig.Builder().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build();
        v7.g.e(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
