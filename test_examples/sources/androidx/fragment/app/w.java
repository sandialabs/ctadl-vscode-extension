package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class w<E> extends androidx.datastore.preferences.protobuf.k {

    /* renamed from: i  reason: collision with root package name */
    public final Activity f5262i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f5263j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f5264k;

    /* renamed from: l  reason: collision with root package name */
    public final a0 f5265l;

    public w(s sVar) {
        Handler handler = new Handler();
        this.f5265l = new a0();
        this.f5262i = sVar;
        if (sVar != null) {
            this.f5263j = sVar;
            this.f5264k = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void L0(PrintWriter printWriter, String[] strArr);

    public abstract s M0();

    public abstract LayoutInflater N0();

    public abstract void O0();
}
