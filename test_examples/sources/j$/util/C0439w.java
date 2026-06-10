package j$.util;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* renamed from: j$.util.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0439w implements InterfaceC0278f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f12590a;

    @Override // j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        this.f12590a.accept(Long.valueOf(j2));
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }
}
