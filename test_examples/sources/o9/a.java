package o9;

import android.os.LocaleList;
import fa.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import n7.l;
import v7.g;
import w1.e;

/* loaded from: classes.dex */
public final class a implements b.InterfaceC0118b, z3.a, e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16484b = new a();

    @Override // w1.e
    public List a() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        g.e(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        size = localeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            locale = localeList.get(i10);
            g.e(locale, "localeList[i]");
            arrayList.add(new w1.a(locale));
        }
        return arrayList;
    }

    @Override // w1.e
    public w1.a b(String str) {
        g.f(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        g.e(forLanguageTag, "forLanguageTag(languageTag)");
        return new w1.a(forLanguageTag);
    }

    @Override // fa.b.InterfaceC0118b
    public Iterable c(Object obj) {
        int i10 = DescriptorUtilsKt.f14713a;
        Collection<h> f10 = ((h) obj).f();
        ArrayList arrayList = new ArrayList(l.Z1(f10, 10));
        for (h hVar : f10) {
            arrayList.add(hVar.a());
        }
        return arrayList;
    }

    @Override // z3.a
    public /* synthetic */ void f(c4.b bVar) {
    }
}
