package q1;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Pair<Integer, Integer> f16868a = new Pair<>(0, 0);

    public static final TextDirectionHeuristic a(int i10) {
        TextDirectionHeuristic textDirectionHeuristic;
        String str;
        if (i10 == 0) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
            str = "LTR";
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    str = "FIRSTSTRONG_RTL";
                } else if (i10 == 4) {
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    str = "ANYRTL_LTR";
                } else if (i10 == 5) {
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    str = "LOCALE";
                }
            }
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            v7.g.e(textDirectionHeuristic2, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic2;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
            str = "RTL";
        }
        v7.g.e(textDirectionHeuristic, str);
        return textDirectionHeuristic;
    }
}
