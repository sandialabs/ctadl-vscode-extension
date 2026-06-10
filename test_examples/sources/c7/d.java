package c7;

import com.noto.app.domain.model.Language;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class d<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        List<Language> list = Language.f8182i;
        List<Language> list2 = Language.f8182i;
        return a1.c.g0(Boolean.valueOf(list2.contains((Language) t10)), Boolean.valueOf(list2.contains((Language) t11)));
    }
}
