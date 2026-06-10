package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import v7.g;

/* loaded from: classes.dex */
public final class KotlinClassHeader {

    /* renamed from: a  reason: collision with root package name */
    public final Kind f13953a;

    /* renamed from: b  reason: collision with root package name */
    public final g9.e f13954b;
    public final String[] c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f13955d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f13956e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13957f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13958g;

    /* loaded from: classes.dex */
    public enum Kind {
        f13960k("UNKNOWN"),
        f13961l("CLASS"),
        f13962m("FILE_FACADE"),
        n("SYNTHETIC_CLASS"),
        f13963o("MULTIFILE_CLASS"),
        f13964p("MULTIFILE_CLASS_PART");
        

        /* renamed from: j  reason: collision with root package name */
        public static final LinkedHashMap f13959j;

        /* renamed from: i  reason: collision with root package name */
        public final int f13966i;

        static {
            Kind[] values = values();
            int O0 = m0.b.O0(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(O0 < 16 ? 16 : O0);
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.f13966i), kind);
            }
            f13959j = linkedHashMap;
        }

        Kind(String str) {
            this.f13966i = r2;
        }
    }

    public KotlinClassHeader(Kind kind, g9.e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10) {
        g.f(kind, "kind");
        this.f13953a = kind;
        this.f13954b = eVar;
        this.c = strArr;
        this.f13955d = strArr2;
        this.f13956e = strArr3;
        this.f13957f = str;
        this.f13958g = i10;
    }

    public final String toString() {
        return this.f13953a + " version=" + this.f13954b;
    }
}
