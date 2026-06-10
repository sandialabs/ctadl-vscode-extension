package a0;

import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;
import p1.a;
import p1.j;
import p1.p;
import u1.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final p1.a f6a;

    /* renamed from: b  reason: collision with root package name */
    public final p f7b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9e;

    /* renamed from: f  reason: collision with root package name */
    public final b2.b f10f;

    /* renamed from: g  reason: collision with root package name */
    public final e.a f11g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a.C0207a<j>> f12h;

    /* renamed from: i  reason: collision with root package name */
    public MultiParagraphIntrinsics f13i;

    /* renamed from: j  reason: collision with root package name */
    public LayoutDirection f14j;

    public c(p1.a aVar, p pVar, int i10, boolean z10, int i11, b2.b bVar, e.a aVar2) {
        boolean z11;
        EmptyList emptyList = EmptyList.f12981i;
        this.f6a = aVar;
        this.f7b = pVar;
        this.c = i10;
        this.f8d = z10;
        this.f9e = i11;
        this.f10f = bVar;
        this.f11g = aVar2;
        this.f12h = emptyList;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
