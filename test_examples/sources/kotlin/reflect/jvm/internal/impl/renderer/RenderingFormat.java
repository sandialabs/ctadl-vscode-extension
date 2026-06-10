package kotlin.reflect.jvm.internal.impl.renderer;

import ha.i;
import v7.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class RenderingFormat {

    /* renamed from: i  reason: collision with root package name */
    public static final RenderingFormat f14668i;

    /* renamed from: j  reason: collision with root package name */
    public static final RenderingFormat f14669j;

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ RenderingFormat[] f14670k;

    static {
        RenderingFormat renderingFormat = new RenderingFormat() { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
            @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
            public final String a(String str) {
                g.f(str, "string");
                return str;
            }
        };
        f14668i = renderingFormat;
        RenderingFormat renderingFormat2 = new RenderingFormat() { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
            public final String a(String str) {
                g.f(str, "string");
                return i.W0(i.W0(str, "<", "&lt;"), ">", "&gt;");
            }
        };
        f14669j = renderingFormat2;
        f14670k = new RenderingFormat[]{renderingFormat, renderingFormat2};
    }

    public RenderingFormat() {
        throw null;
    }

    public RenderingFormat(String str, int i10) {
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) f14670k.clone();
    }

    public abstract String a(String str);
}
