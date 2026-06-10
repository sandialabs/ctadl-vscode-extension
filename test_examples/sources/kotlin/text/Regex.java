package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Regex implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final Pattern f15129i;

    public Regex(String str) {
        Pattern compile = Pattern.compile(str);
        g.e(compile, "compile(pattern)");
        this.f15129i = compile;
    }

    public final String toString() {
        String pattern = this.f15129i.toString();
        g.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
