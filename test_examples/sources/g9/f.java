package g9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* loaded from: classes.dex */
public final class f extends g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(JvmProtoBuf.StringTableTypes stringTableTypes, String[] strArr) {
        super(strArr, r0, r1);
        Set Q2;
        List<Integer> list = stringTableTypes.f14486k;
        if (list.isEmpty()) {
            Q2 = EmptySet.f12983i;
        } else {
            Q2 = kotlin.collections.c.Q2(list);
        }
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.f14485j;
        v7.g.e(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list2) {
            int i10 = record.f14493k;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
    }
}
