package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "T", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$nestedClasses$2 extends Lambda implements u7.a<List<? extends KClassImpl<? extends Object>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T>.Data f13126j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$nestedClasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.f13126j = data;
    }

    @Override // u7.a
    public final List<? extends KClassImpl<? extends Object>> k0() {
        MemberScope w02 = this.f13126j.a().w0();
        v7.g.e(w02, "descriptor.unsubstitutedInnerClassesScope");
        Collection a10 = c.a.a(w02, null, 3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (!k9.d.m((l8.f) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l8.f fVar = (l8.f) it.next();
            l8.b bVar = fVar instanceof l8.b ? (l8.b) fVar : null;
            Class<?> j2 = bVar != null ? f8.i.j(bVar) : null;
            KClassImpl kClassImpl = j2 != null ? new KClassImpl(j2) : null;
            if (kClassImpl != null) {
                arrayList2.add(kClassImpl);
            }
        }
        return arrayList2;
    }
}
