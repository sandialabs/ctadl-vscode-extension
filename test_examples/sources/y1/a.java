package y1;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import n7.l;
import v7.g;
import w1.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18786a = new a();

    public final Object a(c cVar) {
        g.f(cVar, "localeList");
        ArrayList arrayList = new ArrayList(l.Z1(cVar, 10));
        Iterator<w1.b> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(v8.b.L(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        g.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(x1.a aVar, c cVar) {
        g.f(aVar, "textPaint");
        g.f(cVar, "localeList");
        ArrayList arrayList = new ArrayList(l.Z1(cVar, 10));
        Iterator<w1.b> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(v8.b.L(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        g.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        aVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
