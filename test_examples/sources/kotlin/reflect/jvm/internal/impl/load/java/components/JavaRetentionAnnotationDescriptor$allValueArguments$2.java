package kotlin.reflect.jvm.internal.impl.load.java.components;

import b9.b;
import b9.m;
import h9.e;
import java.util.EnumSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import m9.g;
import m9.i;
import u7.a;
import v8.c;
import v8.d;

/* loaded from: classes.dex */
public final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<e, ? extends g<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JavaRetentionAnnotationDescriptor f13671j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor$allValueArguments$2(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        super(0);
        this.f13671j = javaRetentionAnnotationDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<e, ? extends g<?>> k0() {
        m mVar;
        i iVar;
        String str;
        Map<String, EnumSet<KotlinTarget>> map = d.f18184a;
        b bVar = this.f13671j.f13661d;
        Map<e, ? extends g<?>> map2 = null;
        if (bVar instanceof m) {
            mVar = (m) bVar;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            Map<String, KotlinRetention> map3 = d.f18185b;
            e a10 = mVar.a();
            if (a10 != null) {
                str = a10.b();
            } else {
                str = null;
            }
            KotlinRetention kotlinRetention = map3.get(str);
            if (kotlinRetention != null) {
                iVar = new i(h9.b.l(g.a.f13379v), e.k(kotlinRetention.name()));
                if (iVar != null) {
                    map2 = m0.b.P0(new Pair(c.c, iVar));
                }
                if (map2 != null) {
                    return kotlin.collections.d.K1();
                }
                return map2;
            }
        }
        iVar = null;
        if (iVar != null) {
        }
        if (map2 != null) {
        }
    }
}
