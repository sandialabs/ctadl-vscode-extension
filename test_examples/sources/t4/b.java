package t4;

import u4.h;
import v7.g;
import w4.s;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17568f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u4.c cVar) {
        super(cVar);
        g.f(cVar, "tracker");
    }

    @Override // t4.c
    public final boolean b(s sVar) {
        switch (this.f17568f) {
            case 0:
                g.f(sVar, "workSpec");
                return sVar.f18342j.f16078d;
            default:
                g.f(sVar, "workSpec");
                return sVar.f18342j.f16079e;
        }
    }

    @Override // t4.c
    public final boolean c(Object obj) {
        int i10 = this.f17568f;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                    default:
                        return !booleanValue;
                }
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                    default:
                        return !booleanValue2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar) {
        super(hVar);
        g.f(hVar, "tracker");
    }
}
