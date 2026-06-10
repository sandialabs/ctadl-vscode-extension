package w2;

import android.content.Context;
import java.util.concurrent.Callable;
import w2.j;

/* loaded from: classes.dex */
public final class h implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f18276b;
    public final /* synthetic */ e c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f18277d;

    public h(String str, Context context, e eVar, int i10) {
        this.f18275a = str;
        this.f18276b = context;
        this.c = eVar;
        this.f18277d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() {
        try {
            return j.a(this.f18275a, this.f18276b, this.c, this.f18277d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
