package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ha.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import l8.m;
import l8.z;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Ll8/z;", "kotlin.jvm.PlatformType", "invoke", "()Ll8/z;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KPropertyImpl$_descriptor$1 extends Lambda implements u7.a<z> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPropertyImpl<V> f13214j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KPropertyImpl$_descriptor$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.f13214j = kPropertyImpl;
    }

    @Override // u7.a
    public final z k0() {
        ha.d dVar;
        Object C2;
        String concat;
        KPropertyImpl<V> kPropertyImpl = this.f13214j;
        KDeclarationContainerImpl kDeclarationContainerImpl = kPropertyImpl.f13199j;
        kDeclarationContainerImpl.getClass();
        String str = kPropertyImpl.f13200k;
        v7.g.f(str, "name");
        String str2 = kPropertyImpl.f13201l;
        v7.g.f(str2, "signature");
        Regex regex = KDeclarationContainerImpl.f13142i;
        regex.getClass();
        Matcher matcher = regex.f15129i.matcher(str2);
        v7.g.e(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            dVar = null;
        } else {
            dVar = new ha.d(matcher, str2);
        }
        boolean z10 = true;
        if (dVar != null) {
            String str3 = (String) ((d.a) dVar.a()).get(1);
            z j2 = kDeclarationContainerImpl.j(Integer.parseInt(str3));
            if (j2 == null) {
                StringBuilder p10 = a4.b.p("Local property #", str3, " not found in ");
                p10.append(kDeclarationContainerImpl.e());
                throw new KotlinReflectionInternalError(p10.toString());
            }
            return j2;
        }
        Collection<z> m10 = kDeclarationContainerImpl.m(h9.e.k(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (v7.g.a(i.b((z) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    m g10 = ((z) next).g();
                    Object obj2 = linkedHashMap.get(g10);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(g10, obj2);
                    }
                    ((List) obj2).add(next);
                }
                Collection values = m0.b.B1(linkedHashMap, new f8.f(KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2.f13151j)).values();
                v7.g.e(values, "properties\n             …\n                }.values");
                List list = (List) kotlin.collections.c.u2(values);
                if (list.size() == 1) {
                    C2 = kotlin.collections.c.n2(list);
                } else {
                    String t22 = kotlin.collections.c.t2(kDeclarationContainerImpl.m(h9.e.k(str)), "\n", null, null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.f13150j, 30);
                    StringBuilder sb = new StringBuilder("Property '");
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
            } else {
                C2 = kotlin.collections.c.C2(arrayList);
            }
            return (z) C2;
        }
        throw new KotlinReflectionInternalError("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + kDeclarationContainerImpl);
    }
}
