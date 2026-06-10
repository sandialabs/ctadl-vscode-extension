package ya;

import android.util.Log;
import hb.b;
import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public final class a extends b {
    public a() {
        super(Level.ERROR);
    }

    @Override // hb.b
    public final void d(String str, Level level) {
        g.f(str, "msg");
        if (this.f11615a.compareTo(level) <= 0) {
            int ordinal = level.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    Log.e("[Koin]", str);
                    return;
                } else {
                    Log.i("[Koin]", str);
                    return;
                }
            }
            Log.d("[Koin]", str);
        }
    }
}
