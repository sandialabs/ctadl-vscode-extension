package w2;

import android.content.Context;
import java.util.concurrent.Callable;
import w2.j;

/* loaded from: classes.dex */
public final class f implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18271a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f18272b;
    public final /* synthetic */ e c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f18273d;

    public f(String str, Context context, e eVar, int i10) {
        this.f18271a = str;
        this.f18272b = context;
        this.c = eVar;
        this.f18273d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() {
        return j.a(this.f18271a, this.f18272b, this.c, this.f18273d);
    }
}
