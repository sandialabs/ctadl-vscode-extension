package p2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.List;
import java.util.Random;
import kotlin.collections.EmptyList;
import p2.f;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16732i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f16733j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f16734k;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f16732i = i10;
        this.f16733j = obj;
        this.f16734k = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        int i10 = this.f16732i;
        Object obj = this.f16734k;
        Object obj2 = this.f16733j;
        switch (i10) {
            case 0:
                ((f.e) obj2).d((Typeface) obj);
                return;
            case 1:
                androidx.lifecycle.f fVar = (androidx.lifecycle.f) obj2;
                Runnable runnable = (Runnable) obj;
                v7.g.f(fVar, "this$0");
                v7.g.f(runnable, "$runnable");
                if (fVar.f5385d.offer(runnable)) {
                    fVar.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = ProfileInstallerInitializer.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new d.i(context, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                v7.g.f((y3.i) obj2, "this$0");
                v7.g.f((String) obj, "$sql");
                EmptyList emptyList = EmptyList.f12981i;
                throw null;
            default:
                List<s4.a> list = (List) obj2;
                u4.h hVar = (u4.h) obj;
                v7.g.f(list, "$listenersList");
                v7.g.f(hVar, "this$0");
                for (s4.a aVar : list) {
                    aVar.a(hVar.f17790e);
                }
                return;
        }
    }
}
