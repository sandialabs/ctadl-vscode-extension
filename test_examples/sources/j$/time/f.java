package j$.time;

import j$.time.temporal.q;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11900a;

    public /* synthetic */ f(int i10) {
        this.f11900a = i10;
    }

    @Override // j$.time.temporal.q
    public final Object d(j$.time.temporal.l lVar) {
        switch (this.f11900a) {
            case 0:
                return LocalDate.u(lVar);
            case 1:
                return LocalDateTime.u(lVar);
            default:
                return OffsetDateTime.t(lVar);
        }
    }
}
