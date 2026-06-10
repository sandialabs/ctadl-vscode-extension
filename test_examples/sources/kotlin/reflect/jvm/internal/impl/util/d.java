package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.text.Regex;
import u7.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final h9.e f15099a;

    /* renamed from: b  reason: collision with root package name */
    public final Regex f15100b;
    public final Collection<h9.e> c;

    /* renamed from: d  reason: collision with root package name */
    public final l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> f15101d;

    /* renamed from: e  reason: collision with root package name */
    public final b[] f15102e;

    public d() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(h9.e eVar, Regex regex, Collection<h9.e> collection, l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> lVar, b... bVarArr) {
        this.f15099a = eVar;
        this.f15100b = regex;
        this.c = collection;
        this.f15101d = lVar;
        this.f15102e = bVarArr;
    }

    public /* synthetic */ d(h9.e eVar, b[] bVarArr) {
        this(eVar, bVarArr, Checks$2.f15080j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(h9.e eVar, b[] bVarArr, l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> lVar) {
        this(eVar, null, null, lVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        v7.g.f(eVar, "name");
        v7.g.f(lVar, "additionalChecks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Collection<h9.e> collection, b[] bVarArr, l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> lVar) {
        this(null, null, collection, lVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        v7.g.f(collection, "nameList");
        v7.g.f(lVar, "additionalChecks");
    }

    public /* synthetic */ d(Set set, b[] bVarArr) {
        this(set, bVarArr, Checks$4.f15082j);
    }
}
