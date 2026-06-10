package l8;

import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final MapBuilder f15854a;

    /* loaded from: classes.dex */
    public static final class a extends n0 {
        public static final a c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 {
        public static final b c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 {
        public static final c c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 {
        public static final d c = new d();

        public d() {
            super("local", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 {
        public static final e c = new e();

        public e() {
            super("private", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 {
        public static final f c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // l8.n0
        public final String b() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends n0 {
        public static final g c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends n0 {
        public static final h c = new h();

        public h() {
            super("public", true);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends n0 {
        public static final i c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(f.c, 0);
        mapBuilder.put(e.c, 0);
        mapBuilder.put(b.c, 1);
        mapBuilder.put(g.c, 1);
        mapBuilder.put(h.c, 2);
        mapBuilder.b();
        mapBuilder.f13010t = true;
        f15854a = mapBuilder;
    }
}
