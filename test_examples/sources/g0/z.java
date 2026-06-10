package g0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11116a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public List<p7.c<m7.n>> f11117b = new ArrayList();
    public List<p7.c<m7.n>> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f11118d = true;

    public final boolean a() {
        boolean z10;
        synchronized (this.f11116a) {
            z10 = this.f11118d;
        }
        return z10;
    }
}
