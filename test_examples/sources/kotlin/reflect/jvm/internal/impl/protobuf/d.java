package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f14564b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.d<?, ?>> f14565a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f14566a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14567b;

        public a(int i10, h hVar) {
            this.f14566a = hVar;
            this.f14567b = i10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f14566a == aVar.f14566a && this.f14567b == aVar.f14567b;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f14566a) * 65535) + this.f14567b;
        }
    }

    static {
        new d(0);
    }

    public d() {
        this.f14565a = new HashMap();
    }

    public d(int i10) {
        this.f14565a = Collections.emptyMap();
    }

    public final void a(GeneratedMessageLite.d<?, ?> dVar) {
        this.f14565a.put(new a(dVar.f14535d.f14529i, dVar.f14533a), dVar);
    }
}
