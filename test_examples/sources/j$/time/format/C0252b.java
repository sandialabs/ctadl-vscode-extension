package j$.time.format;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0252b extends B {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ A f11932d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0252b(A a10) {
        this.f11932d = a10;
    }

    @Override // j$.time.format.B
    public final String d(j$.time.temporal.o oVar, long j2, G g10, Locale locale) {
        return this.f11932d.a(j2, g10);
    }

    @Override // j$.time.format.B
    public final Iterator e(j$.time.temporal.o oVar, G g10, Locale locale) {
        return this.f11932d.b(g10);
    }
}
