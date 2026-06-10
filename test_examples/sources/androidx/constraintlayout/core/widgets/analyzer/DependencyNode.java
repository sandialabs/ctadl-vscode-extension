package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class DependencyNode implements g2.d {

    /* renamed from: d  reason: collision with root package name */
    public final WidgetRun f4288d;

    /* renamed from: f  reason: collision with root package name */
    public int f4290f;

    /* renamed from: g  reason: collision with root package name */
    public int f4291g;

    /* renamed from: a  reason: collision with root package name */
    public WidgetRun f4286a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4287b = false;
    public boolean c = false;

    /* renamed from: e  reason: collision with root package name */
    public Type f4289e = Type.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f4292h = 1;

    /* renamed from: i  reason: collision with root package name */
    public a f4293i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4294j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4295k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4296l = new ArrayList();

    /* loaded from: classes.dex */
    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f4288d = widgetRun;
    }

    @Override // g2.d
    public final void a(g2.d dVar) {
        ArrayList arrayList = this.f4296l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f4294j) {
                return;
            }
        }
        this.c = true;
        WidgetRun widgetRun = this.f4286a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.f4287b) {
            this.f4288d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        DependencyNode dependencyNode = null;
        int i10 = 0;
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof a)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.f4294j) {
            a aVar = this.f4293i;
            if (aVar != null) {
                if (!aVar.f4294j) {
                    return;
                }
                this.f4290f = this.f4292h * aVar.f4291g;
            }
            d(dependencyNode.f4291g + this.f4290f);
        }
        WidgetRun widgetRun2 = this.f4286a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(g2.d dVar) {
        this.f4295k.add(dVar);
        if (this.f4294j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f4296l.clear();
        this.f4295k.clear();
        this.f4294j = false;
        this.f4291g = 0;
        this.c = false;
        this.f4287b = false;
    }

    public void d(int i10) {
        if (this.f4294j) {
            return;
        }
        this.f4294j = true;
        this.f4291g = i10;
        Iterator it = this.f4295k.iterator();
        while (it.hasNext()) {
            g2.d dVar = (g2.d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4288d.f4306b.f4255k0);
        sb.append(":");
        sb.append(this.f4289e);
        sb.append("(");
        if (this.f4294j) {
            obj = Integer.valueOf(this.f4291g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f4296l.size());
        sb.append(":d=");
        sb.append(this.f4295k.size());
        sb.append(">");
        return sb.toString();
    }
}
