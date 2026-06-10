package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import h9.e;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import r9.f;
import u7.l;

/* loaded from: classes.dex */
public interface MemberScope extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f14737a = Companion.f14738a;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f14738a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final l<e, Boolean> f14739b = MemberScope$Companion$ALL_NAME_FILTER$1.f14740j;
    }

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f14741b = new a();

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set<e> c() {
            return EmptySet.f12983i;
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set<e> d() {
            return EmptySet.f12983i;
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set<e> g() {
            return EmptySet.f12983i;
        }
    }

    Collection a(e eVar, NoLookupLocation noLookupLocation);

    Collection b(e eVar, NoLookupLocation noLookupLocation);

    Set<e> c();

    Set<e> d();

    Set<e> g();
}
