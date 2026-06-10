package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import g9.d;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import l8.n;
import l8.z;
import u8.p;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KPropertyImpl$_javaField$1 extends Lambda implements u7.a<Field> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPropertyImpl<V> f13215j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KPropertyImpl$_javaField$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.f13215j = kPropertyImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field k0() {
        boolean z10;
        boolean i10;
        boolean z11;
        Class<?> enclosingClass;
        l8.f c;
        h9.b bVar = i.f13291a;
        KPropertyImpl<V> kPropertyImpl = this.f13215j;
        b b5 = i.b(kPropertyImpl.d());
        if (b5 instanceof b.c) {
            b.c cVar = (b.c) b5;
            kotlin.reflect.jvm.internal.impl.protobuf.d dVar = g9.h.f11279a;
            ProtoBuf$Property protoBuf$Property = cVar.f13241b;
            boolean z12 = true;
            d.a b10 = g9.h.b(protoBuf$Property, cVar.f13242d, cVar.f13243e, true);
            if (b10 == null) {
                return null;
            }
            z zVar = cVar.f13240a;
            if (zVar != null) {
                if (zVar.h() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    l8.f c10 = zVar.c();
                    if (c10 != null) {
                        if (k9.d.l(c10)) {
                            l8.f c11 = c10.c();
                            if (!k9.d.n(c11, ClassKind.f13431i) && !k9.d.n(c11, ClassKind.f13433k)) {
                                z11 = false;
                                if (z11) {
                                    LinkedHashSet linkedHashSet = kotlin.reflect.jvm.internal.impl.builtins.a.f13321a;
                                    if (!m0.b.H0((l8.b) c10)) {
                                        z10 = true;
                                        if (!z10) {
                                            if (k9.d.l(zVar.c())) {
                                                n a02 = zVar.a0();
                                                if (a02 != null && a02.getAnnotations().i(p.f17862a)) {
                                                    i10 = true;
                                                } else {
                                                    i10 = zVar.getAnnotations().i(p.f17862a);
                                                }
                                                if (i10) {
                                                }
                                            }
                                        }
                                        KDeclarationContainerImpl kDeclarationContainerImpl = kPropertyImpl.f13199j;
                                        if (!z12 && !g9.h.d(protoBuf$Property)) {
                                            c = zVar.c();
                                            if (!(c instanceof l8.b)) {
                                                enclosingClass = f8.i.j((l8.b) c);
                                            } else {
                                                enclosingClass = kDeclarationContainerImpl.e();
                                            }
                                            if (enclosingClass == null) {
                                                return null;
                                            }
                                            try {
                                                return enclosingClass.getDeclaredField(b10.f11270a);
                                            } catch (NoSuchFieldException unused) {
                                                return null;
                                            }
                                        }
                                        enclosingClass = kDeclarationContainerImpl.e().getEnclosingClass();
                                        if (enclosingClass == null) {
                                        }
                                    }
                                }
                            }
                            z11 = true;
                            if (z11) {
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.f13199j;
                        if (!z12) {
                            c = zVar.c();
                            if (!(c instanceof l8.b)) {
                            }
                            if (enclosingClass == null) {
                            }
                        }
                        enclosingClass = kDeclarationContainerImpl2.e().getEnclosingClass();
                        if (enclosingClass == null) {
                        }
                    } else {
                        u8.e.a(1);
                        throw null;
                    }
                }
                z12 = false;
                KDeclarationContainerImpl kDeclarationContainerImpl22 = kPropertyImpl.f13199j;
                if (!z12) {
                }
                enclosingClass = kDeclarationContainerImpl22.e().getEnclosingClass();
                if (enclosingClass == null) {
                }
            } else {
                u8.e.a(0);
                throw null;
            }
        } else if (b5 instanceof b.a) {
            return ((b.a) b5).f13237a;
        } else {
            if ((b5 instanceof b.C0141b) || (b5 instanceof b.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
