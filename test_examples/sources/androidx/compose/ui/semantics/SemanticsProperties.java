package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import java.util.List;
import m7.n;
import o1.b;
import o1.c;
import o1.e;
import o1.f;
import o1.g;
import o1.h;
import p1.o;

/* loaded from: classes.dex */
public final class SemanticsProperties {

    /* renamed from: a  reason: collision with root package name */
    public static final a<List<String>> f3946a = new a<>("ContentDescription", SemanticsProperties$ContentDescription$1.f3967j);

    /* renamed from: b  reason: collision with root package name */
    public static final a<String> f3947b = new a<>("StateDescription");
    public static final a<f> c = new a<>("ProgressBarRangeInfo");

    /* renamed from: d  reason: collision with root package name */
    public static final a<String> f3948d = new a<>("PaneTitle", SemanticsProperties$PaneTitle$1.f3971j);

    /* renamed from: e  reason: collision with root package name */
    public static final a<n> f3949e = new a<>("SelectableGroup");

    /* renamed from: f  reason: collision with root package name */
    public static final a<b> f3950f = new a<>("CollectionInfo");

    /* renamed from: g  reason: collision with root package name */
    public static final a<c> f3951g = new a<>("CollectionItemInfo");

    /* renamed from: h  reason: collision with root package name */
    public static final a<n> f3952h = new a<>("Heading");

    /* renamed from: i  reason: collision with root package name */
    public static final a<n> f3953i = new a<>("Disabled");

    /* renamed from: j  reason: collision with root package name */
    public static final a<e> f3954j = new a<>("LiveRegion");

    /* renamed from: k  reason: collision with root package name */
    public static final a<Boolean> f3955k = new a<>("Focused");

    /* renamed from: l  reason: collision with root package name */
    public static final a<n> f3956l = new a<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.f3968j);

    /* renamed from: m  reason: collision with root package name */
    public static final a<h> f3957m = new a<>("HorizontalScrollAxisRange");
    public static final a<h> n = new a<>("VerticalScrollAxisRange");

    /* renamed from: o  reason: collision with root package name */
    public static final a<g> f3958o;

    /* renamed from: p  reason: collision with root package name */
    public static final a<String> f3959p;

    /* renamed from: q  reason: collision with root package name */
    public static final a<List<p1.a>> f3960q;

    /* renamed from: r  reason: collision with root package name */
    public static final a<p1.a> f3961r;

    /* renamed from: s  reason: collision with root package name */
    public static final a<o> f3962s;

    /* renamed from: t  reason: collision with root package name */
    public static final a<Boolean> f3963t;

    /* renamed from: u  reason: collision with root package name */
    public static final a<ToggleableState> f3964u;

    /* renamed from: v  reason: collision with root package name */
    public static final a<n> f3965v;

    /* renamed from: w  reason: collision with root package name */
    public static final a<String> f3966w;

    static {
        v7.g.f(SemanticsProperties$IsPopup$1.f3970j, "mergePolicy");
        v7.g.f(SemanticsProperties$IsDialog$1.f3969j, "mergePolicy");
        f3958o = new a<>("Role", SemanticsProperties$Role$1.f3972j);
        f3959p = new a<>("TestTag", SemanticsProperties$TestTag$1.f3973j);
        f3960q = new a<>("Text", SemanticsProperties$Text$1.f3974j);
        f3961r = new a<>("EditableText");
        f3962s = new a<>("TextSelectionRange");
        v7.g.f(SemanticsPropertyKey$1.f3978j, "mergePolicy");
        f3963t = new a<>("Selected");
        f3964u = new a<>("ToggleableState");
        f3965v = new a<>("Password");
        f3966w = new a<>("Error");
        v7.g.f(SemanticsPropertyKey$1.f3978j, "mergePolicy");
    }
}
