package t4;

import android.os.Build;
import androidx.work.NetworkType;
import u4.h;
import v7.g;
import w4.s;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, int i10) {
        super(hVar);
        this.f17567f = i10;
        if (i10 != 1) {
            g.f(hVar, "tracker");
            return;
        }
        g.f(hVar, "tracker");
        super(hVar);
    }

    @Override // t4.c
    public final boolean b(s sVar) {
        switch (this.f17567f) {
            case 0:
                g.f(sVar, "workSpec");
                return sVar.f18342j.f16077b;
            default:
                g.f(sVar, "workSpec");
                NetworkType networkType = sVar.f18342j.f16076a;
                if (networkType != NetworkType.UNMETERED && (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED)) {
                    return false;
                }
                return true;
        }
    }

    @Override // t4.c
    public final boolean c(Object obj) {
        switch (this.f17567f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            default:
                s4.b bVar = (s4.b) obj;
                g.f(bVar, "value");
                if (!bVar.f17271a || bVar.c) {
                    return true;
                }
                return false;
        }
    }
}
