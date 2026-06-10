package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import y9.r;
import y9.v;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$supertypes$2 extends Lambda implements u7.a<List<? extends KTypeImpl>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T>.Data f13131j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T> f13132k;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements u7.a<Type> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass3 f13136j = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // u7.a
        public final /* bridge */ /* synthetic */ Type k0() {
            return Object.class;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.f13131j = data;
        this.f13132k = kClassImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[SYNTHETIC] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<? extends KTypeImpl> k0() {
        boolean z10;
        KClassImpl<T>.Data data = this.f13131j;
        Collection<r> f10 = data.a().o().f();
        v7.g.e(f10, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList(f10.size());
        for (r rVar : f10) {
            v7.g.e(rVar, "kotlinType");
            arrayList.add(new KTypeImpl(rVar, new KClassImpl$Data$supertypes$2$1$1(rVar, data, this.f13132k)));
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.e.I(data.a())) {
            boolean z11 = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ClassKind h10 = k9.d.c(((KTypeImpl) it.next()).f13217a).h();
                    v7.g.e(h10, "getClassDescriptorForType(it.type).kind");
                    if (h10 != ClassKind.f13432j && h10 != ClassKind.f13435m) {
                        z10 = false;
                        continue;
                        if (!z10) {
                            z11 = false;
                            break;
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
            }
            if (z11) {
                v f11 = DescriptorUtilsKt.e(data.a()).f();
                v7.g.e(f11, "descriptor.builtIns.anyType");
                arrayList.add(new KTypeImpl(f11, AnonymousClass3.f13136j));
            }
        }
        return m0.b.G(arrayList);
    }
}
