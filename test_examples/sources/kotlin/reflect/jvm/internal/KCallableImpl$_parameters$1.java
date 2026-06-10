package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import l8.c0;
import l8.y;
import n7.m;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KCallableImpl$_parameters$1 extends Lambda implements u7.a<ArrayList<KParameter>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KCallableImpl<R> f13095j;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ll8/y;", "invoke", "()Ll8/y;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<y> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c0 f13096j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c0 c0Var) {
            super(0);
            this.f13096j = c0Var;
        }

        @Override // u7.a
        public final y k0() {
            return this.f13096j;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ll8/y;", "invoke", "()Ll8/y;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements u7.a<y> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c0 f13097j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c0 c0Var) {
            super(0);
            this.f13097j = c0Var;
        }

        @Override // u7.a
        public final y k0() {
            return this.f13097j;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ll8/y;", "invoke", "()Ll8/y;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements u7.a<y> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ CallableMemberDescriptor f13098j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f13099k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CallableMemberDescriptor callableMemberDescriptor, int i10) {
            super(0);
            this.f13098j = callableMemberDescriptor;
            this.f13099k = i10;
        }

        @Override // u7.a
        public final y k0() {
            kotlin.reflect.jvm.internal.impl.descriptors.h hVar = this.f13098j.m().get(this.f13099k);
            v7.g.e(hVar, "descriptor.valueParameters[i]");
            return hVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_parameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.f13095j = kCallableImpl;
    }

    @Override // u7.a
    public final ArrayList<KParameter> k0() {
        int i10;
        KCallableImpl<R> kCallableImpl = this.f13095j;
        CallableMemberDescriptor d5 = kCallableImpl.d();
        ArrayList<KParameter> arrayList = new ArrayList<>();
        int i11 = 0;
        if (kCallableImpl.f()) {
            i10 = 0;
        } else {
            c0 g10 = f8.i.g(d5);
            if (g10 != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.INSTANCE, new AnonymousClass1(g10)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            c0 R = d5.R();
            if (R != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.EXTENSION_RECEIVER, new AnonymousClass2(R)));
                i10++;
            }
        }
        int size = d5.m().size();
        while (i11 < size) {
            arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.VALUE, new AnonymousClass3(d5, i11)));
            i11++;
            i10++;
        }
        if (kCallableImpl.e() && (d5 instanceof w8.a) && arrayList.size() > 1) {
            m.d2(arrayList, new f8.d());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
