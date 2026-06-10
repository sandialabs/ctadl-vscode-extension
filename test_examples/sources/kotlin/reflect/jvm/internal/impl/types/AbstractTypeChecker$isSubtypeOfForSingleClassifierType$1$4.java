package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 extends Lambda implements u7.l<m.a, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<ba.g> f14925j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f14926k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ba.l f14927l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ba.g f14928m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends Lambda implements u7.a<Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ m f14929j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ba.l f14930k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ba.g f14931l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ba.g f14932m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar, ba.l lVar, ba.g gVar, ba.g gVar2) {
            super(0);
            this.f14929j = mVar;
            this.f14930k = lVar;
            this.f14931l = gVar;
            this.f14932m = gVar2;
        }

        @Override // u7.a
        public final Boolean k0() {
            return Boolean.valueOf(c.h(this.f14929j, this.f14930k.n(this.f14931l), this.f14932m));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(ArrayList arrayList, m mVar, ba.l lVar, ba.g gVar) {
        super(1);
        this.f14925j = arrayList;
        this.f14926k = mVar;
        this.f14927l = lVar;
        this.f14928m = gVar;
    }

    @Override // u7.l
    public final m7.n U(m.a aVar) {
        m.a aVar2 = aVar;
        v7.g.f(aVar2, "$this$runForkingPoint");
        for (ba.g gVar : this.f14925j) {
            ba.g gVar2 = this.f14928m;
            aVar2.a(new AnonymousClass1(this.f14926k, this.f14927l, gVar, gVar2));
        }
        return m7.n.f16010a;
    }
}
