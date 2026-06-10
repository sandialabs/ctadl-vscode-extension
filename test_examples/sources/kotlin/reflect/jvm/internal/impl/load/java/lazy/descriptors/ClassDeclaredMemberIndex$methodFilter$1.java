package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.i;
import b9.j;
import b9.q;
import b9.w;
import b9.z;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class ClassDeclaredMemberIndex$methodFilter$1 extends Lambda implements l<q, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ClassDeclaredMemberIndex f13708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        super(1);
        this.f13708j = classDeclaredMemberIndex;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
        if (r0.equals("toString") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(q qVar) {
        boolean z10;
        boolean isEmpty;
        w wVar;
        h9.c e10;
        q qVar2 = qVar;
        g.f(qVar2, "m");
        boolean z11 = false;
        if (this.f13708j.f13704b.U(qVar2).booleanValue()) {
            if (qVar2.t().B()) {
                String b5 = qVar2.getName().b();
                int hashCode = b5.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != -1295482945) {
                        if (hashCode == 147696667) {
                            if (!b5.equals("hashCode")) {
                            }
                            isEmpty = qVar2.m().isEmpty();
                        }
                    } else if (b5.equals("equals")) {
                        z zVar = (z) kotlin.collections.c.E2(qVar2.m());
                        j jVar = null;
                        if (zVar != null) {
                            wVar = zVar.b();
                        } else {
                            wVar = null;
                        }
                        if (wVar instanceof j) {
                            jVar = (j) wVar;
                        }
                        if (jVar != null) {
                            i c = jVar.c();
                            if ((c instanceof b9.g) && (e10 = ((b9.g) c).e()) != null && g.a(e10.b(), "java.lang.Object")) {
                                isEmpty = true;
                            }
                        }
                    }
                    isEmpty = false;
                }
                if (isEmpty) {
                    z10 = true;
                    if (!z10) {
                        z11 = true;
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return Boolean.valueOf(z11);
    }
}
