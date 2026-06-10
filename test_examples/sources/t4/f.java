package t4;

import android.os.Build;
import androidx.work.NetworkType;
import n4.g;
import u4.h;
import w4.s;

/* loaded from: classes.dex */
public final class f extends c<s4.b> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f17574f;

    static {
        String f10 = g.f("NetworkNotRoamingCtrlr");
        v7.g.e(f10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f17574f = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h<s4.b> hVar) {
        super(hVar);
        v7.g.f(hVar, "tracker");
    }

    @Override // t4.c
    public final boolean b(s sVar) {
        v7.g.f(sVar, "workSpec");
        if (sVar.f18342j.f16076a == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // t4.c
    public final boolean c(s4.b bVar) {
        s4.b bVar2 = bVar;
        v7.g.f(bVar2, "value");
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = bVar2.f17271a;
        if (i10 < 24) {
            g.d().a(f17574f, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (!z10) {
                return true;
            }
            return false;
        }
        if (z10) {
            if (!bVar2.f17273d) {
            }
            return false;
        }
        return true;
    }
}
