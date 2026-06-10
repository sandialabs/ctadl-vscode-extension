package kotlin.reflect.jvm.internal.impl.renderer;

import h9.e;
import java.util.ArrayList;
import l8.d;
import l8.f;
import l8.i0;
import l8.u;
import n7.y;
import v7.g;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0165a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0165a f14671a = new C0165a();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        public final String a(d dVar, DescriptorRenderer descriptorRenderer) {
            g.f(descriptorRenderer, "renderer");
            if (dVar instanceof i0) {
                e name = ((i0) dVar).getName();
                g.e(name, "classifier.name");
                return descriptorRenderer.t(name, false);
            }
            h9.d g10 = k9.d.g(dVar);
            g.e(g10, "getFqName(classifier)");
            return descriptorRenderer.s(g10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14672a = new b();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        public final String a(d dVar, DescriptorRenderer descriptorRenderer) {
            boolean z10;
            g.f(descriptorRenderer, "renderer");
            if (dVar instanceof i0) {
                e name = ((i0) dVar).getName();
                g.e(name, "classifier.name");
                return descriptorRenderer.t(name, false);
            }
            ArrayList arrayList = new ArrayList();
            d dVar2 = dVar;
            do {
                arrayList.add(dVar2.getName());
                f c = dVar2.c();
                z10 = c instanceof l8.b;
                dVar2 = c;
            } while (z10);
            return m0.b.Z0(new y(arrayList));
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14673a = new c();

        public static String b(d dVar) {
            String str;
            e name = dVar.getName();
            g.e(name, "descriptor.name");
            String Y0 = m0.b.Y0(name);
            if (dVar instanceof i0) {
                return Y0;
            }
            f c = dVar.c();
            g.e(c, "descriptor.containingDeclaration");
            if (c instanceof l8.b) {
                str = b((d) c);
            } else if (c instanceof u) {
                h9.d i10 = ((u) c).e().i();
                g.e(i10, "descriptor.fqName.toUnsafe()");
                str = m0.b.Z0(i10.f());
            } else {
                str = null;
            }
            if (str != null && !g.a(str, "")) {
                return str + '.' + Y0;
            }
            return Y0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        public final String a(d dVar, DescriptorRenderer descriptorRenderer) {
            g.f(descriptorRenderer, "renderer");
            return b(dVar);
        }
    }

    String a(d dVar, DescriptorRenderer descriptorRenderer);
}
