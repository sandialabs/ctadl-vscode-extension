package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 implements l1.c0 {

    /* renamed from: i  reason: collision with root package name */
    public final int f3822i;

    /* renamed from: j  reason: collision with root package name */
    public final List<a1> f3823j;

    /* renamed from: k  reason: collision with root package name */
    public Float f3824k;

    /* renamed from: l  reason: collision with root package name */
    public Float f3825l;

    /* renamed from: m  reason: collision with root package name */
    public o1.h f3826m;
    public o1.h n;

    public a1(int i10, ArrayList arrayList) {
        v7.g.f(arrayList, "allScopes");
        this.f3822i = i10;
        this.f3823j = arrayList;
        this.f3824k = null;
        this.f3825l = null;
        this.f3826m = null;
        this.n = null;
    }

    @Override // l1.c0
    public final boolean w() {
        return this.f3823j.contains(this);
    }
}
