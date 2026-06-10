package q1;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class g implements m {
    @Override // q1.m
    public StaticLayout a(n nVar) {
        StaticLayout.Builder obtain;
        StaticLayout build;
        v7.g.f(nVar, "params");
        obtain = StaticLayout.Builder.obtain(nVar.f16846a, nVar.f16847b, nVar.c, nVar.f16848d, nVar.f16849e);
        obtain.setTextDirection(nVar.f16850f);
        obtain.setAlignment(nVar.f16851g);
        obtain.setMaxLines(nVar.f16852h);
        obtain.setEllipsize(nVar.f16853i);
        obtain.setEllipsizedWidth(nVar.f16854j);
        obtain.setLineSpacing(nVar.f16856l, nVar.f16855k);
        obtain.setIncludePad(nVar.n);
        obtain.setBreakStrategy(nVar.f16859p);
        obtain.setHyphenationFrequency(nVar.f16862s);
        obtain.setIndents(nVar.f16863t, nVar.f16864u);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            h.a(obtain, nVar.f16857m);
        }
        if (i10 >= 28) {
            i.a(obtain, nVar.f16858o);
        }
        if (i10 >= 33) {
            j.b(obtain, nVar.f16860q, nVar.f16861r);
        }
        build = obtain.build();
        v7.g.e(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
