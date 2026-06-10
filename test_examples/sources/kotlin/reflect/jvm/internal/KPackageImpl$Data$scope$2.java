package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a;
import o8.p;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KPackageImpl$Data$scope$2 extends Lambda implements u7.a<MemberScope> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPackageImpl.Data f13180j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$scope$2(KPackageImpl.Data data) {
        super(0);
        this.f13180j = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // u7.a
    public final MemberScope k0() {
        ?? N0;
        String[] strArr;
        KPackageImpl.Data data = this.f13180j;
        q8.e a10 = KPackageImpl.Data.a(data);
        if (a10 != null) {
            boolean z10 = false;
            c8.j<Object> jVar = KDeclarationContainerImpl.Data.f13143b[0];
            Object k02 = data.f13144a.k0();
            v7.g.e(k02, "<get-moduleData>(...)");
            q8.a aVar = ((q8.h) k02).f16956b;
            aVar.getClass();
            ConcurrentHashMap<h9.b, MemberScope> concurrentHashMap = aVar.c;
            h9.b d5 = a10.d();
            MemberScope memberScope = concurrentHashMap.get(d5);
            if (memberScope == null) {
                h9.c h10 = a10.d().h();
                v7.g.e(h10, "fileClass.classId.packageFqName");
                KotlinClassHeader kotlinClassHeader = a10.f16951b;
                KotlinClassHeader.Kind kind = kotlinClassHeader.f13953a;
                KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.f13963o;
                if (kind == kind2) {
                    if (kind == kind2) {
                        z10 = true;
                    }
                    List<String> list = null;
                    if (z10) {
                        strArr = kotlinClassHeader.c;
                    } else {
                        strArr = null;
                    }
                    if (strArr != null) {
                        list = n7.i.Z1(strArr);
                    }
                    if (list == null) {
                        list = EmptyList.f12981i;
                    }
                    N0 = new ArrayList();
                    for (String str : list) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.h a11 = d9.g.a(aVar.f16947b, h9.b.l(new h9.c(p9.b.d(str).f16781a.replace('/', '.'))));
                        if (a11 != null) {
                            N0.add(a11);
                        }
                    }
                } else {
                    N0 = a1.c.N0(a10);
                }
                kotlin.reflect.jvm.internal.impl.load.kotlin.g gVar = aVar.f16946a;
                p pVar = new p(gVar.c().f17902b, h10);
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar : N0) {
                    w9.f a12 = gVar.a(pVar, hVar);
                    if (a12 != null) {
                        arrayList.add(a12);
                    }
                }
                memberScope = a.C0166a.a("package " + h10 + " (" + a10 + ')', kotlin.collections.c.L2(arrayList));
                MemberScope putIfAbsent = concurrentHashMap.putIfAbsent(d5, memberScope);
                if (putIfAbsent != null) {
                    memberScope = putIfAbsent;
                }
            }
            v7.g.e(memberScope, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
            return memberScope;
        }
        return MemberScope.a.f14741b;
    }
}
