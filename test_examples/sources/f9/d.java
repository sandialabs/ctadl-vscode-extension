package f9;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final ProtoBuf$StringTable f11003a;

    /* renamed from: b  reason: collision with root package name */
    public final ProtoBuf$QualifiedNameTable f11004b;

    public d(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        this.f11003a = protoBuf$StringTable;
        this.f11004b = protoBuf$QualifiedNameTable;
    }

    @Override // f9.c
    public final boolean a(int i10) {
        return c(i10).f12974k.booleanValue();
    }

    @Override // f9.c
    public final String b(int i10) {
        Triple<List<String>, List<String>, Boolean> c = c(i10);
        List<String> list = c.f12972i;
        String t22 = kotlin.collections.c.t2(c.f12973j, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return t22;
        }
        return kotlin.collections.c.t2(list, "/", null, null, null, 62) + '/' + t22;
    }

    public final Triple<List<String>, List<String>, Boolean> c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f11004b.f14250j.get(i10);
            String str = (String) this.f11003a.f14274j.get(qualifiedName.f14258l);
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.f14259m;
            v7.g.c(kind);
            int ordinal = kind.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        linkedList2.addFirst(str);
                        z10 = true;
                    }
                } else {
                    linkedList.addFirst(str);
                }
            } else {
                linkedList2.addFirst(str);
            }
            i10 = qualifiedName.f14257k;
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // f9.c
    public final String getString(int i10) {
        String str = (String) this.f11003a.f14274j.get(i10);
        v7.g.e(str, "strings.getString(index)");
        return str;
    }
}
