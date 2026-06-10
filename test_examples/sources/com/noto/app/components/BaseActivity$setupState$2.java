package com.noto.app.components;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Language;
import com.noto.app.util.ModelUtilsKt;
import d.j;
import d.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import n7.l;
import o6.a;
import p.g;
import q7.c;
import u7.p;
import v2.h;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Language;", "language", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.components.BaseActivity$setupState$2", f = "BaseActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BaseActivity$setupState$2 extends SuspendLambda implements p<Language, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f7596m;
    public final /* synthetic */ BaseActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivity$setupState$2(BaseActivity baseActivity, p7.c<? super BaseActivity$setupState$2> cVar) {
        super(2, cVar);
        this.n = baseActivity;
    }

    @Override // u7.p
    public final Object R(Language language, p7.c<? super n> cVar) {
        return ((BaseActivity$setupState$2) a(language, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        BaseActivity$setupState$2 baseActivity$setupState$2 = new BaseActivity$setupState$2(this.n, cVar);
        baseActivity$setupState$2.f7596m = obj;
        return baseActivity$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        h hVar;
        b.n1(obj);
        Language language = (Language) this.f7596m;
        BaseActivity baseActivity = this.n;
        int i10 = BaseActivity.G;
        baseActivity.getClass();
        Language[] values = Language.values();
        ArrayList arrayList = new ArrayList();
        for (Language language2 : values) {
            if (!Language.f8182i.contains(language2)) {
                arrayList.add(language2);
            }
        }
        List<Language> G2 = kotlin.collections.c.G2(arrayList, new a(language));
        int i11 = ModelUtilsKt.f9848a;
        g.f(G2, "<this>");
        try {
            ArrayList arrayList2 = new ArrayList(l.Z1(G2, 10));
            for (Language language3 : G2) {
                arrayList2.add(ModelUtilsKt.F(language3));
            }
            Locale[] localeArr = (Locale[]) arrayList2.toArray(new Locale[0]);
            hVar = h.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        } catch (Exception unused) {
            hVar = h.f18148b;
            g.e(hVar, "{\n        LocaleListComp…etEmptyLocaleList()\n    }");
        }
        w.a aVar = j.f10246i;
        if (v2.a.a()) {
            Object k3 = j.k();
            if (k3 != null) {
                j.b.b(k3, j.a.a(hVar.f18149a.a()));
            }
        } else if (!hVar.equals(j.f10248k)) {
            synchronized (j.f10252p) {
                j.f10248k = hVar;
                Iterator<WeakReference<j>> it = j.f10251o.iterator();
                while (true) {
                    g.a aVar2 = (g.a) it;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    j jVar = (j) ((WeakReference) aVar2.next()).get();
                    if (jVar != null) {
                        jVar.d();
                    }
                }
            }
        }
        return n.f16010a;
    }
}
