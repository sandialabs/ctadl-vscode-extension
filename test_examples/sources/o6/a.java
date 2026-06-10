package o6;

import com.noto.app.domain.model.Language;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Language f16358a;

    public a(Language language) {
        this.f16358a = language;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        Language language = (Language) t11;
        boolean z10 = true;
        Language language2 = this.f16358a;
        Boolean valueOf = Boolean.valueOf(language == language2);
        if (((Language) t10) != language2) {
            z10 = false;
        }
        return a1.c.g0(valueOf, Boolean.valueOf(z10));
    }
}
