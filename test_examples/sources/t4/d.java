package t4;

import android.os.Build;
import androidx.work.NetworkType;
import u4.h;
import v7.g;
import w4.s;

/* loaded from: classes.dex */
public final class d extends c<s4.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h<s4.b> hVar) {
        super(hVar);
        g.f(hVar, "tracker");
    }

    @Override // t4.c
    public final boolean b(s sVar) {
        g.f(sVar, "workSpec");
        if (sVar.f18342j.f16076a == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // t4.c
    public final boolean c(s4.b bVar) {
        s4.b bVar2 = bVar;
        g.f(bVar2, "value");
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = bVar2.f17271a;
        if (i10 < 26 ? z10 : z10 && bVar2.f17272b) {
            return false;
        }
        return true;
    }
}
