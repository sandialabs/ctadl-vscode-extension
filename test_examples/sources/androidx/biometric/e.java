package androidx.biometric;

import androidx.profileinstaller.b;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f1186i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f1187j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f1188k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f1189l;

    public /* synthetic */ e(int i10, int i11, Object obj, Object obj2) {
        this.f1186i = i11;
        this.f1188k = obj;
        this.f1187j = i10;
        this.f1189l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1186i;
        Object obj = this.f1189l;
        int i11 = this.f1187j;
        Object obj2 = this.f1188k;
        switch (i10) {
            case 0:
                n nVar = ((k) obj2).f1203d0;
                if (nVar.f1213e == null) {
                    nVar.f1213e = new m();
                }
                nVar.f1213e.getClass();
                return;
            case 1:
                ((androidx.profileinstaller.a) obj2).f5566b.a(i11, obj);
                return;
            default:
                ((b.c) obj2).a(i11, obj);
                return;
        }
    }
}
