package x;

import android.graphics.Rect;
import android.view.View;
import j1.h;
import m7.n;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: i  reason: collision with root package name */
    public final View f18543i;

    public a(View view) {
        v7.g.f(view, "view");
        this.f18543i = view;
    }

    @Override // x.c
    public final Object a(u0.d dVar, h hVar, p7.c<? super n> cVar) {
        v7.g.f(hVar, "<this>");
        u0.d d5 = dVar.d(hVar.T(u0.c.f17721b));
        this.f18543i.requestRectangleOnScreen(new Rect((int) d5.f17726a, (int) d5.f17727b, (int) d5.c, (int) d5.f17728d), false);
        return n.f16010a;
    }
}
