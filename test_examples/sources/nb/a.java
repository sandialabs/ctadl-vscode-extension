package nb;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16153a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<c> f16154b = new ArrayList<>();

    /* renamed from: nb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0200a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16155a = a1.c.O0(a.class.getName(), b.class.getName(), c.class.getName(), C0200a.class.getName());

        static {
            Pattern.compile("(\\$\\d+)+$");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public c() {
            new ThreadLocal();
        }
    }

    public a() {
        throw new AssertionError();
    }
}
