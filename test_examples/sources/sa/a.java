package sa;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17508a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends Annotation> f17509b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f17510d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f17511e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f17512f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f17513g;

    public a(String str) {
        v7.g.f(str, "serialName");
        this.f17508a = str;
        this.f17509b = EmptyList.f12981i;
        this.c = new ArrayList();
        this.f17510d = new HashSet();
        this.f17511e = new ArrayList();
        this.f17512f = new ArrayList();
        this.f17513g = new ArrayList();
    }

    public static void b(a aVar, String str, e eVar) {
        aVar.a(str, eVar, EmptyList.f12981i, false);
    }

    public final void a(String str, e eVar, List<? extends Annotation> list, boolean z10) {
        v7.g.f(str, "elementName");
        v7.g.f(eVar, "descriptor");
        v7.g.f(list, "annotations");
        if (this.f17510d.add(str)) {
            this.c.add(str);
            this.f17511e.add(eVar);
            this.f17512f.add(list);
            this.f17513g.add(Boolean.valueOf(z10));
            return;
        }
        StringBuilder p10 = a4.b.p("Element with name '", str, "' is already registered in ");
        p10.append(this.f17508a);
        throw new IllegalArgumentException(p10.toString().toString());
    }
}
