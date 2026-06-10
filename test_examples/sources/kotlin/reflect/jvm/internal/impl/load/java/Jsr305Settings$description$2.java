package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Jsr305Settings$description$2 extends Lambda implements u7.a<String[]> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f13622j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(e eVar) {
        super(0);
        this.f13622j = eVar;
    }

    @Override // u7.a
    public final String[] k0() {
        ListBuilder listBuilder = new ListBuilder();
        e eVar = this.f13622j;
        listBuilder.add(eVar.f13681a.f13629i);
        ReportLevel reportLevel = eVar.f13682b;
        if (reportLevel != null) {
            listBuilder.add("under-migration:" + reportLevel.f13629i);
        }
        for (Map.Entry<h9.c, ReportLevel> entry : eVar.c.entrySet()) {
            listBuilder.add("@" + entry.getKey() + ':' + entry.getValue().f13629i);
        }
        a1.c.S(listBuilder);
        return (String[]) listBuilder.toArray(new String[0]);
    }
}
