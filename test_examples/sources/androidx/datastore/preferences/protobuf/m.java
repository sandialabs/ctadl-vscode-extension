package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static volatile m f4918b;
    public static final m c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f4919a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4920a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4921b;

        public a(int i10, Object obj) {
            this.f4920a = obj;
            this.f4921b = i10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f4920a == aVar.f4920a && this.f4921b == aVar.f4921b;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f4920a) * 65535) + this.f4921b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        c = new m(0);
    }

    public m() {
        this.f4919a = new HashMap();
    }

    public m(int i10) {
        this.f4919a = Collections.emptyMap();
    }

    public static m a() {
        m mVar = f4918b;
        if (mVar == null) {
            synchronized (m.class) {
                mVar = f4918b;
                if (mVar == null) {
                    Class<?> cls = l.f4900a;
                    if (cls != null) {
                        try {
                            mVar = (m) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f4918b = mVar;
                    }
                    mVar = c;
                    f4918b = mVar;
                }
            }
        }
        return mVar;
    }
}
