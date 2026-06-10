package n4;

import androidx.work.OverwritingInputMerger;
import n4.k;

/* loaded from: classes.dex */
public final class h extends k {

    /* loaded from: classes.dex */
    public static final class a extends k.a<a, h> {
        public a(Class<? extends androidx.work.d> cls) {
            super(cls);
            this.f16096b.f18336d = OverwritingInputMerger.class.getName();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar) {
        super(aVar.f16095a, aVar.f16096b, aVar.c);
        v7.g.f(aVar, "builder");
    }
}
