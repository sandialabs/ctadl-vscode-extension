package x5;

import android.graphics.Typeface;
import androidx.datastore.preferences.protobuf.k;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: i  reason: collision with root package name */
    public final Typeface f18631i;

    /* renamed from: j  reason: collision with root package name */
    public final InterfaceC0239a f18632j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18633k;

    /* renamed from: x5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0239a {
    }

    public a(u5.b bVar, Typeface typeface) {
        this.f18631i = typeface;
        this.f18632j = bVar;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void D0(int i10) {
        if (!this.f18633k) {
            com.google.android.material.internal.a aVar = ((u5.b) this.f18632j).f17802a;
            if (aVar.j(this.f18631i)) {
                aVar.h(false);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void E0(Typeface typeface, boolean z10) {
        if (!this.f18633k) {
            com.google.android.material.internal.a aVar = ((u5.b) this.f18632j).f17802a;
            if (aVar.j(typeface)) {
                aVar.h(false);
            }
        }
    }
}
