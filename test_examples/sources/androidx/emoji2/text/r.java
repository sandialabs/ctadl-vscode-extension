package androidx.emoji2.text;

import android.text.Spannable;
import j$.util.stream.IntStream;

/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static /* synthetic */ IntStream a(Spannable spannable) {
        return IntStream.VivifiedWrapper.convert(spannable.codePoints());
    }
}
