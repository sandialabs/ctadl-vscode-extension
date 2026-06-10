package kotlin.reflect.jvm.internal.impl.renderer;

import h9.d;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import m8.c;
import u7.l;
import v7.g;
import y9.f0;
import y9.r;

/* loaded from: classes.dex */
public abstract class DescriptorRenderer {

    /* renamed from: a  reason: collision with root package name */
    public static final DescriptorRendererImpl f14593a;

    /* renamed from: b  reason: collision with root package name */
    public static final DescriptorRendererImpl f14594b;

    /* loaded from: classes.dex */
    public static final class a {
        public static DescriptorRendererImpl a(l lVar) {
            g.f(lVar, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            lVar.U(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.f14632a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14605a = new a();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public final void a(StringBuilder sb) {
                g.f(sb, "builder");
                sb.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public final void b(StringBuilder sb) {
                g.f(sb, "builder");
                sb.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public final void c(h hVar, StringBuilder sb) {
                g.f(hVar, "parameter");
                g.f(sb, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.b
            public final void d(h hVar, int i10, int i11, StringBuilder sb) {
                g.f(sb, "builder");
                if (i10 != i11 - 1) {
                    sb.append(", ");
                }
            }
        }

        void a(StringBuilder sb);

        void b(StringBuilder sb);

        void c(h hVar, StringBuilder sb);

        void d(h hVar, int i10, int i11, StringBuilder sb);
    }

    static {
        a.a(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.f14597j);
        a.a(DescriptorRenderer$Companion$COMPACT$1.f14595j);
        a.a(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.f14596j);
        a.a(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.f14598j);
        a.a(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.f14603j);
        f14593a = a.a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.f14600j);
        a.a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1.f14601j);
        a.a(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.f14604j);
        f14594b = a.a(DescriptorRenderer$Companion$DEBUG_TEXT$1.f14599j);
        a.a(DescriptorRenderer$Companion$HTML$1.f14602j);
    }

    public abstract String p(c cVar, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String r(String str, String str2, e eVar);

    public abstract String s(d dVar);

    public abstract String t(h9.e eVar, boolean z10);

    public abstract String u(r rVar);

    public abstract String v(f0 f0Var);
}
