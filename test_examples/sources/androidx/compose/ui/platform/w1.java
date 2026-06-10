package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    public static final w1 f3917a = new w1();

    public final Map<Integer, Integer> a(View view) {
        Map<Integer, Integer> attributeSourceResourceMap;
        v7.g.f(view, "view");
        attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        v7.g.e(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
