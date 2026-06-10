package androidx.activity.result;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.a f477b;
    public final /* synthetic */ f c;

    public e(f fVar, String str, b.a aVar) {
        this.c = fVar;
        this.f476a = str;
        this.f477b = aVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        f fVar = this.c;
        HashMap hashMap = fVar.c;
        String str = this.f476a;
        Integer num = (Integer) hashMap.get(str);
        b.a aVar = this.f477b;
        if (num != null) {
            fVar.f481e.add(str);
            try {
                fVar.b(num.intValue(), aVar, obj);
                return;
            } catch (Exception e10) {
                fVar.f481e.remove(str);
                throw e10;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final void b() {
        this.c.f(this.f476a);
    }
}
