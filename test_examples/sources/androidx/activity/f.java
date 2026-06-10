package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.f;
import b.a;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f454i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a.C0051a f455j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f456k;

    public f(ComponentActivity.b bVar, int i10, a.C0051a c0051a) {
        this.f456k = bVar;
        this.f454i = i10;
        this.f455j = c0051a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b<O> bVar;
        T t10 = this.f455j.f6331a;
        ComponentActivity.b bVar2 = this.f456k;
        String str = (String) bVar2.f479b.get(Integer.valueOf(this.f454i));
        if (str != null) {
            f.a aVar = (f.a) bVar2.f482f.get(str);
            if (aVar != null && (bVar = aVar.f485a) != 0) {
                if (bVar2.f481e.remove(str)) {
                    bVar.a(t10);
                    return;
                }
                return;
            }
            bVar2.f484h.remove(str);
            bVar2.f483g.put(str, t10);
        }
    }
}
