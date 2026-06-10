package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KFunctionImpl$descriptor$2 extends Lambda implements u7.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KFunctionImpl f13159j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f13160k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$descriptor$2(KFunctionImpl kFunctionImpl, String str) {
        super(0);
        this.f13159j = kFunctionImpl;
        this.f13160k = str;
    }

    @Override // u7.a
    public final kotlin.reflect.jvm.internal.impl.descriptors.e k0() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> i10;
        String concat;
        KFunctionImpl kFunctionImpl = this.f13159j;
        KDeclarationContainerImpl kDeclarationContainerImpl = kFunctionImpl.f13153j;
        kDeclarationContainerImpl.getClass();
        String str = this.f13160k;
        v7.g.f(str, "name");
        String str2 = kFunctionImpl.f13154k;
        v7.g.f(str2, "signature");
        if (v7.g.a(str, "<init>")) {
            i10 = kotlin.collections.c.L2(kDeclarationContainerImpl.h());
        } else {
            i10 = kDeclarationContainerImpl.i(h9.e.k(str));
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> collection = i10;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (v7.g.a(i.c((kotlin.reflect.jvm.internal.impl.descriptors.e) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        boolean z10 = true;
        if (arrayList.size() != 1) {
            String t22 = kotlin.collections.c.t2(collection, "\n", null, null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.f13149j, 30);
            StringBuilder sb = new StringBuilder("Function '");
            sb.append(str);
            sb.append("' (JVM signature: ");
            sb.append(str2);
            sb.append(") not resolved in ");
            sb.append(kDeclarationContainerImpl);
            sb.append(':');
            if (t22.length() != 0) {
                z10 = false;
            }
            if (z10) {
                concat = " no members found";
            } else {
                concat = "\n".concat(t22);
            }
            sb.append(concat);
            throw new KotlinReflectionInternalError(sb.toString());
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.e) kotlin.collections.c.C2(arrayList);
    }
}
