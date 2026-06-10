package androidx.compose.ui.platform;

import a3.j0;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import b3.g;
import com.noto.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractChannel;
import u1.e;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends a3.a {

    /* renamed from: z */
    public static final int[] f3610z = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d */
    public final AndroidComposeView f3611d;

    /* renamed from: e */
    public int f3612e;

    /* renamed from: f */
    public final AccessibilityManager f3613f;

    /* renamed from: g */
    public final Handler f3614g;

    /* renamed from: h */
    public final b3.h f3615h;

    /* renamed from: i */
    public int f3616i;

    /* renamed from: j */
    public final p.i<p.i<CharSequence>> f3617j;

    /* renamed from: k */
    public final p.i<Map<CharSequence, Integer>> f3618k;

    /* renamed from: l */
    public int f3619l;

    /* renamed from: m */
    public Integer f3620m;
    public final p.d<LayoutNode> n;

    /* renamed from: o */
    public final AbstractChannel f3621o;

    /* renamed from: p */
    public boolean f3622p;

    /* renamed from: q */
    public e f3623q;

    /* renamed from: r */
    public Map<Integer, b1> f3624r;

    /* renamed from: s */
    public final p.d<Integer> f3625s;

    /* renamed from: t */
    public final LinkedHashMap f3626t;

    /* renamed from: u */
    public f f3627u;

    /* renamed from: v */
    public boolean f3628v;

    /* renamed from: w */
    public final androidx.activity.b f3629w;

    /* renamed from: x */
    public final ArrayList f3630x;

    /* renamed from: y */
    public final u7.l<a1, m7.n> f3631y;

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
            AndroidComposeViewAccessibilityDelegateCompat.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            v7.g.f(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            v7.g.f(view, "view");
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat.f3614g.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.f3629w);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final void a(b3.g gVar, SemanticsNode semanticsNode) {
            v7.g.f(gVar, "info");
            v7.g.f(semanticsNode, "semanticsNode");
            if (p.a(semanticsNode)) {
                o1.a aVar = (o1.a) SemanticsConfigurationKt.a(semanticsNode.f3939f, o1.i.f16196e);
                if (aVar != null) {
                    gVar.b(new g.a(16908349, aVar.f16184a));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final void a(AccessibilityEvent accessibilityEvent, int i10, int i11) {
            v7.g.f(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i10);
            accessibilityEvent.setScrollDeltaY(i11);
        }
    }

    /* loaded from: classes.dex */
    public final class d extends AccessibilityNodeProvider {
        public d() {
            AndroidComposeViewAccessibilityDelegateCompat.this = r1;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            SemanticsNode semanticsNode;
            String str2;
            int i11;
            Boolean bool;
            boolean z10;
            long T;
            int i12;
            u0.d dVar;
            RectF rectF;
            v7.g.f(accessibilityNodeInfo, "info");
            v7.g.f(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            b1 b1Var = androidComposeViewAccessibilityDelegateCompat.p().get(Integer.valueOf(i10));
            if (b1Var != null && (semanticsNode = b1Var.f3831a) != null) {
                String q10 = AndroidComposeViewAccessibilityDelegateCompat.q(semanticsNode);
                androidx.compose.ui.semantics.a<o1.a<u7.l<List<p1.n>, Boolean>>> aVar = o1.i.f16193a;
                o1.j jVar = semanticsNode.f3939f;
                if (jVar.d(aVar) && bundle != null && v7.g.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i14 > 0 && i13 >= 0) {
                        if (q10 != null) {
                            i11 = q10.length();
                        } else {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 < i11) {
                            ArrayList arrayList = new ArrayList();
                            u7.l lVar = (u7.l) ((o1.a) jVar.g(aVar)).f16185b;
                            if (lVar != null) {
                                bool = (Boolean) lVar.U(arrayList);
                            } else {
                                bool = null;
                            }
                            if (v7.g.a(bool, Boolean.TRUE)) {
                                p1.n nVar = (p1.n) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                int i15 = 0;
                                while (i15 < i14) {
                                    int i16 = i13 + i15;
                                    if (i16 >= nVar.f16696a.f16687a.length()) {
                                        i12 = i14;
                                    } else {
                                        p1.c cVar = nVar.f16697b;
                                        MultiParagraphIntrinsics multiParagraphIntrinsics = cVar.f16649a;
                                        if (i16 >= 0 && i16 < multiParagraphIntrinsics.f3995a.f16641i.length()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            ArrayList arrayList3 = cVar.f16655h;
                                            p1.e eVar = (p1.e) arrayList3.get(v0.p.n(i16, arrayList3));
                                            p1.d dVar2 = eVar.f16656a;
                                            int i17 = eVar.f16657b;
                                            u0.d c = dVar2.c(a1.c.c0(i16, i17, eVar.c) - i17);
                                            v7.g.f(c, "<this>");
                                            u0.d d5 = c.d(a1.c.s(0.0f, eVar.f16660f));
                                            if (!semanticsNode.c.z()) {
                                                T = u0.c.f17721b;
                                            } else {
                                                T = semanticsNode.b().T(u0.c.f17721b);
                                            }
                                            u0.d d10 = d5.d(T);
                                            u0.d d11 = semanticsNode.d();
                                            if (d10.b(d11)) {
                                                i12 = i14;
                                                dVar = new u0.d(Math.max(d10.f17726a, d11.f17726a), Math.max(d10.f17727b, d11.f17727b), Math.min(d10.c, d11.c), Math.min(d10.f17728d, d11.f17728d));
                                            } else {
                                                i12 = i14;
                                                dVar = null;
                                            }
                                            if (dVar != null) {
                                                long s10 = a1.c.s(dVar.f17726a, dVar.f17727b);
                                                AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f3611d;
                                                long a10 = androidComposeView.a(s10);
                                                long a11 = androidComposeView.a(a1.c.s(dVar.c, dVar.f17728d));
                                                rectF = new RectF(u0.c.b(a10), u0.c.c(a10), u0.c.b(a11), u0.c.c(a11));
                                                arrayList2.add(rectF);
                                                i15++;
                                                i14 = i12;
                                            }
                                        } else {
                                            StringBuilder o10 = a4.b.o("offset(", i16, ") is out of bounds [0, ");
                                            o10.append(multiParagraphIntrinsics.f3995a.length());
                                            o10.append(')');
                                            throw new IllegalArgumentException(o10.toString().toString());
                                        }
                                    }
                                    rectF = null;
                                    arrayList2.add(rectF);
                                    i15++;
                                    i14 = i12;
                                }
                                Bundle extras = accessibilityNodeInfo.getExtras();
                                Object[] array = arrayList2.toArray(new RectF[0]);
                                v7.g.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                extras.putParcelableArray(str, (Parcelable[]) array);
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                androidx.compose.ui.semantics.a<String> aVar2 = SemanticsProperties.f3959p;
                if (jVar.d(aVar2) && bundle != null && v7.g.a(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) SemanticsConfigurationKt.a(jVar, aVar2)) != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:1003:0x0965  */
        /* JADX WARN: Removed duplicated region for block: B:1004:0x0969  */
        /* JADX WARN: Removed duplicated region for block: B:684:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:685:0x0305  */
        /* JADX WARN: Removed duplicated region for block: B:800:0x052a  */
        /* JADX WARN: Removed duplicated region for block: B:819:0x0590  */
        /* JADX WARN: Removed duplicated region for block: B:832:0x05bc  */
        /* JADX WARN: Removed duplicated region for block: B:835:0x05c7  */
        /* JADX WARN: Removed duplicated region for block: B:838:0x05d6  */
        /* JADX WARN: Removed duplicated region for block: B:879:0x06ca  */
        /* JADX WARN: Removed duplicated region for block: B:882:0x06cf  */
        /* JADX WARN: Removed duplicated region for block: B:885:0x06e8  */
        /* JADX WARN: Removed duplicated region for block: B:888:0x06ed  */
        /* JADX WARN: Removed duplicated region for block: B:889:0x06f3  */
        /* JADX WARN: Removed duplicated region for block: B:892:0x06f9  */
        /* JADX WARN: Removed duplicated region for block: B:898:0x071c  */
        /* JADX WARN: Removed duplicated region for block: B:901:0x0732  */
        /* JADX WARN: Removed duplicated region for block: B:904:0x073c  */
        /* JADX WARN: Removed duplicated region for block: B:929:0x0788  */
        /* JADX WARN: Removed duplicated region for block: B:932:0x079e  */
        /* JADX WARN: Removed duplicated region for block: B:935:0x07a8  */
        /* JADX WARN: Removed duplicated region for block: B:943:0x07d4  */
        /* JADX WARN: Removed duplicated region for block: B:944:0x07d8  */
        /* JADX WARN: Removed duplicated region for block: B:947:0x07e7  */
        /* JADX WARN: Removed duplicated region for block: B:996:0x0957 A[ADDED_TO_REGION] */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            Lifecycle.State state;
            boolean z10;
            AccessibilityNodeInfo accessibilityNodeInfo;
            g.a aVar;
            SpannableString spannableString;
            SpannableString spannableString2;
            String str;
            int i11;
            NodeCoordinator b5;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            o1.f fVar;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            o1.h hVar;
            o1.h hVar2;
            boolean z14;
            boolean z15;
            Map map;
            boolean z16;
            g.a aVar2;
            boolean z17;
            g.a aVar3;
            String str2;
            String string;
            float floatValue;
            float floatValue2;
            float floatValue3;
            float floatValue4;
            boolean z18;
            float floatValue5;
            boolean z19;
            boolean z20;
            int c0;
            boolean z21;
            String str3;
            boolean z22;
            boolean z23;
            boolean z24;
            boolean z25;
            boolean z26;
            boolean z27;
            Resources resources;
            int i13;
            boolean z28;
            Resources resources2;
            int i14;
            boolean z29;
            p1.a aVar4;
            boolean z30;
            boolean z31;
            boolean z32;
            boolean z33;
            boolean z34;
            boolean z35;
            String str4;
            boolean z36;
            View view;
            androidx.lifecycle.q qVar;
            androidx.lifecycle.r i02;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f3611d;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners != null && (qVar = viewTreeOwners.f3601a) != null && (i02 = qVar.i0()) != null) {
                state = i02.f5413d;
            } else {
                state = null;
            }
            if (state != Lifecycle.State.DESTROYED) {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                b3.g gVar = new b3.g(obtain);
                b1 b1Var = androidComposeViewAccessibilityDelegateCompat.p().get(Integer.valueOf(i10));
                if (b1Var == null) {
                    obtain.recycle();
                } else {
                    int i15 = -1;
                    SemanticsNode semanticsNode = b1Var.f3831a;
                    if (i10 == -1) {
                        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                        ViewParent f10 = j0.d.f(androidComposeView);
                        if (f10 instanceof View) {
                            view = (View) f10;
                        } else {
                            view = null;
                        }
                        gVar.f6358b = -1;
                        obtain.setParent(view);
                    } else if (semanticsNode.g() != null) {
                        SemanticsNode g10 = semanticsNode.g();
                        v7.g.c(g10);
                        int i16 = androidComposeView.getSemanticsOwner().a().f3940g;
                        int i17 = g10.f3940g;
                        if (i17 != i16) {
                            i15 = i17;
                        }
                        gVar.f6358b = i15;
                        obtain.setParent(androidComposeView, i15);
                    } else {
                        throw new IllegalStateException(a4.b.i("semanticsNode ", i10, " has null parent"));
                    }
                    gVar.c = i10;
                    obtain.setSource(androidComposeView, i10);
                    Rect rect = b1Var.f3832b;
                    long a10 = androidComposeView.a(a1.c.s(rect.left, rect.top));
                    long a11 = androidComposeView.a(a1.c.s(rect.right, rect.bottom));
                    obtain.setBoundsInScreen(new Rect((int) Math.floor(u0.c.b(a10)), (int) Math.floor(u0.c.c(a10)), (int) Math.ceil(u0.c.b(a11)), (int) Math.ceil(u0.c.c(a11))));
                    v7.g.f(semanticsNode, "semanticsNode");
                    boolean z37 = semanticsNode.f3937d;
                    LayoutNode layoutNode = semanticsNode.c;
                    if (!z37 && semanticsNode.e(false).isEmpty() && p.d(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$isUnmergedLeafNode$1.f3646j) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gVar.i("android.view.View");
                    androidx.compose.ui.semantics.a<o1.g> aVar5 = SemanticsProperties.f3958o;
                    o1.j jVar = semanticsNode.f3939f;
                    o1.g gVar2 = (o1.g) SemanticsConfigurationKt.a(jVar, aVar5);
                    if (gVar2 != null) {
                        if (semanticsNode.f3937d || semanticsNode.e(false).isEmpty()) {
                            int i18 = gVar2.f16190a;
                            if (i18 == 4) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            if (z30) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView.getContext().getResources().getString(R.string.tab));
                            } else {
                                if (i18 == 0) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                if (z31) {
                                    str4 = "android.widget.Button";
                                } else {
                                    if (i18 == 1) {
                                        z32 = true;
                                    } else {
                                        z32 = false;
                                    }
                                    if (z32) {
                                        str4 = "android.widget.CheckBox";
                                    } else {
                                        if (i18 == 2) {
                                            z33 = true;
                                        } else {
                                            z33 = false;
                                        }
                                        if (z33) {
                                            str4 = "android.widget.Switch";
                                        } else {
                                            if (i18 == 3) {
                                                z34 = true;
                                            } else {
                                                z34 = false;
                                            }
                                            if (z34) {
                                                str4 = "android.widget.RadioButton";
                                            } else {
                                                if (i18 == 5) {
                                                    z35 = true;
                                                } else {
                                                    z35 = false;
                                                }
                                                if (z35) {
                                                    str4 = "android.widget.ImageView";
                                                } else {
                                                    str4 = null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i18 == 5) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                if (!z36 || z10 || jVar.f16207j) {
                                    gVar.i(str4);
                                }
                            }
                        }
                        m7.n nVar = m7.n.f16010a;
                    }
                    if (p.f(semanticsNode)) {
                        gVar.i("android.widget.EditText");
                    }
                    if (semanticsNode.f().d(SemanticsProperties.f3960q)) {
                        gVar.i("android.widget.TextView");
                    }
                    obtain.setPackageName(androidComposeView.getContext().getPackageName());
                    if (Build.VERSION.SDK_INT >= 24) {
                        obtain.setImportantForAccessibility(true);
                    }
                    List e10 = semanticsNode.e(true);
                    int size = e10.size();
                    int i19 = 0;
                    while (true) {
                        accessibilityNodeInfo = gVar.f6357a;
                        if (i19 >= size) {
                            break;
                        }
                        SemanticsNode semanticsNode2 = (SemanticsNode) e10.get(i19);
                        List list = e10;
                        if (androidComposeViewAccessibilityDelegateCompat.p().containsKey(Integer.valueOf(semanticsNode2.f3940g))) {
                            c2.a aVar6 = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.c);
                            if (aVar6 != null) {
                                obtain.addChild(aVar6);
                            } else {
                                accessibilityNodeInfo.addChild(androidComposeView, semanticsNode2.f3940g);
                            }
                        }
                        i19++;
                        e10 = list;
                    }
                    if (androidComposeViewAccessibilityDelegateCompat.f3616i == i10) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        aVar = g.a.f6361g;
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        aVar = g.a.f6360f;
                    }
                    gVar.b(aVar);
                    e.a fontFamilyResolver = androidComposeView.getFontFamilyResolver();
                    p1.a r3 = AndroidComposeViewAccessibilityDelegateCompat.r(jVar);
                    if (r3 != null) {
                        spannableString = m0.b.p1(r3, androidComposeView.getDensity(), fontFamilyResolver);
                    } else {
                        spannableString = null;
                    }
                    SpannableString spannableString3 = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.I(spannableString);
                    List list2 = (List) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3960q);
                    if (list2 != null && (aVar4 = (p1.a) kotlin.collections.c.p2(list2)) != null) {
                        spannableString2 = m0.b.p1(aVar4, androidComposeView.getDensity(), fontFamilyResolver);
                    } else {
                        spannableString2 = null;
                    }
                    SpannableString spannableString4 = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.I(spannableString2);
                    if (spannableString3 == null) {
                        spannableString3 = spannableString4;
                    }
                    gVar.q(spannableString3);
                    androidx.compose.ui.semantics.a<String> aVar7 = SemanticsProperties.f3966w;
                    if (jVar.d(aVar7)) {
                        obtain.setContentInvalid(true);
                        accessibilityNodeInfo.setError((CharSequence) SemanticsConfigurationKt.a(jVar, aVar7));
                    }
                    gVar.p((CharSequence) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3947b));
                    ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3964u);
                    if (toggleableState != null) {
                        accessibilityNodeInfo.setCheckable(true);
                        int ordinal = toggleableState.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2 && gVar.f() == null) {
                                    resources2 = androidComposeView.getContext().getResources();
                                    i14 = R.string.indeterminate;
                                    gVar.p(resources2.getString(i14));
                                }
                                m7.n nVar2 = m7.n.f16010a;
                            } else {
                                accessibilityNodeInfo.setChecked(false);
                                if (gVar2 != null && gVar2.f16190a == 2) {
                                    z29 = true;
                                    if (z29 && gVar.f() == null) {
                                        resources2 = androidComposeView.getContext().getResources();
                                        i14 = R.string.off;
                                        gVar.p(resources2.getString(i14));
                                    }
                                    m7.n nVar22 = m7.n.f16010a;
                                }
                                z29 = false;
                                if (z29) {
                                    resources2 = androidComposeView.getContext().getResources();
                                    i14 = R.string.off;
                                    gVar.p(resources2.getString(i14));
                                }
                                m7.n nVar222 = m7.n.f16010a;
                            }
                        } else {
                            accessibilityNodeInfo.setChecked(true);
                            if (gVar2 != null && gVar2.f16190a == 2) {
                                z28 = true;
                                if (z28 && gVar.f() == null) {
                                    resources2 = androidComposeView.getContext().getResources();
                                    i14 = R.string.on;
                                    gVar.p(resources2.getString(i14));
                                }
                                m7.n nVar2222 = m7.n.f16010a;
                            }
                            z28 = false;
                            if (z28) {
                                resources2 = androidComposeView.getContext().getResources();
                                i14 = R.string.on;
                                gVar.p(resources2.getString(i14));
                            }
                            m7.n nVar22222 = m7.n.f16010a;
                        }
                    }
                    Boolean bool = (Boolean) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3963t);
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        if (gVar2 != null && gVar2.f16190a == 4) {
                            z27 = true;
                            if (!z27) {
                                obtain.setSelected(booleanValue);
                            } else {
                                accessibilityNodeInfo.setCheckable(true);
                                accessibilityNodeInfo.setChecked(booleanValue);
                                if (gVar.f() == null) {
                                    if (booleanValue) {
                                        resources = androidComposeView.getContext().getResources();
                                        i13 = R.string.selected;
                                    } else {
                                        resources = androidComposeView.getContext().getResources();
                                        i13 = R.string.not_selected;
                                    }
                                    gVar.p(resources.getString(i13));
                                }
                            }
                            m7.n nVar3 = m7.n.f16010a;
                        }
                        z27 = false;
                        if (!z27) {
                        }
                        m7.n nVar32 = m7.n.f16010a;
                    }
                    if (!jVar.f16207j || semanticsNode.e(false).isEmpty()) {
                        List list3 = (List) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3946a);
                        if (list3 != null) {
                            str = (String) kotlin.collections.c.p2(list3);
                        } else {
                            str = null;
                        }
                        gVar.l(str);
                    }
                    String str5 = (String) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3959p);
                    if (str5 != null) {
                        SemanticsNode semanticsNode3 = semanticsNode;
                        while (true) {
                            if (semanticsNode3 != null) {
                                androidx.compose.ui.semantics.a<Boolean> aVar8 = SemanticsPropertiesAndroid.f3975a;
                                o1.j jVar2 = semanticsNode3.f3939f;
                                if (jVar2.d(aVar8)) {
                                    z26 = ((Boolean) jVar2.g(aVar8)).booleanValue();
                                    break;
                                }
                                semanticsNode3 = semanticsNode3.g();
                            } else {
                                z26 = false;
                                break;
                            }
                        }
                        if (z26) {
                            obtain.setViewIdResourceName(str5);
                        }
                    }
                    if (((m7.n) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3952h)) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo.setHeading(true);
                        } else {
                            gVar.h(2, true);
                        }
                        m7.n nVar4 = m7.n.f16010a;
                    }
                    obtain.setPassword(semanticsNode.f().d(SemanticsProperties.f3965v));
                    obtain.setEditable(p.f(semanticsNode));
                    accessibilityNodeInfo.setEnabled(p.a(semanticsNode));
                    androidx.compose.ui.semantics.a<Boolean> aVar9 = SemanticsProperties.f3955k;
                    accessibilityNodeInfo.setFocusable(jVar.d(aVar9));
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.setFocused(((Boolean) jVar.g(aVar9)).booleanValue());
                        if (accessibilityNodeInfo.isFocused()) {
                            i11 = 2;
                            gVar.a(2);
                        } else {
                            i11 = 2;
                            gVar.a(1);
                        }
                    } else {
                        i11 = 2;
                    }
                    if (semanticsNode.f3937d) {
                        SemanticsNode g11 = semanticsNode.g();
                        if (g11 != null) {
                            b5 = g11.b();
                        } else {
                            b5 = null;
                        }
                    } else {
                        b5 = semanticsNode.b();
                    }
                    if (b5 != null) {
                        z11 = b5.b1();
                    } else {
                        z11 = false;
                    }
                    if (!z11 && SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3956l) == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    accessibilityNodeInfo.setVisibleToUser(z12);
                    o1.e eVar = (o1.e) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3954j);
                    if (eVar != null) {
                        int i20 = eVar.f16186a;
                        if (i20 == 0) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if (!z24) {
                            if (i20 == 1) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (z25) {
                                obtain.setLiveRegion(i11);
                                m7.n nVar5 = m7.n.f16010a;
                            }
                        }
                        i11 = 1;
                        obtain.setLiveRegion(i11);
                        m7.n nVar52 = m7.n.f16010a;
                    }
                    accessibilityNodeInfo.setClickable(false);
                    o1.a aVar10 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16194b);
                    if (aVar10 != null) {
                        boolean a12 = v7.g.a(SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3963t), Boolean.TRUE);
                        accessibilityNodeInfo.setClickable(!a12);
                        if (p.a(semanticsNode) && !a12) {
                            gVar.b(new g.a(16, aVar10.f16184a));
                        }
                        m7.n nVar6 = m7.n.f16010a;
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    o1.a aVar11 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.c);
                    if (aVar11 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (p.a(semanticsNode)) {
                            gVar.b(new g.a(32, aVar11.f16184a));
                        }
                        m7.n nVar7 = m7.n.f16010a;
                    }
                    o1.a aVar12 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16199h);
                    if (aVar12 != null) {
                        gVar.b(new g.a(16384, aVar12.f16184a));
                        m7.n nVar8 = m7.n.f16010a;
                    }
                    if (p.a(semanticsNode)) {
                        o1.a aVar13 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16198g);
                        if (aVar13 != null) {
                            gVar.b(new g.a(2097152, aVar13.f16184a));
                            m7.n nVar9 = m7.n.f16010a;
                        }
                        o1.a aVar14 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16200i);
                        if (aVar14 != null) {
                            gVar.b(new g.a(65536, aVar14.f16184a));
                            m7.n nVar10 = m7.n.f16010a;
                        }
                        o1.a aVar15 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16201j);
                        if (aVar15 != null) {
                            if (accessibilityNodeInfo.isFocused()) {
                                ClipDescription primaryClipDescription = androidComposeView.getClipboardManager().f3852a.getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    z23 = primaryClipDescription.hasMimeType("text/plain");
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    gVar.b(new g.a(32768, aVar15.f16184a));
                                }
                            }
                            m7.n nVar11 = m7.n.f16010a;
                        }
                    }
                    String q10 = AndroidComposeViewAccessibilityDelegateCompat.q(semanticsNode);
                    if (q10 != null && q10.length() != 0) {
                        z13 = false;
                        if (!z13) {
                            obtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.o(semanticsNode), androidComposeViewAccessibilityDelegateCompat.n(semanticsNode));
                            o1.a aVar16 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16197f);
                            if (aVar16 != null) {
                                str3 = aVar16.f16184a;
                            } else {
                                str3 = null;
                            }
                            gVar.b(new g.a(131072, str3));
                            gVar.a(256);
                            gVar.a(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            List list4 = (List) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3946a);
                            if (list4 != null && !list4.isEmpty()) {
                                z22 = false;
                                if (z22 && jVar.d(o1.i.f16193a) && !p.b(semanticsNode)) {
                                    accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 4 | 16);
                                }
                            }
                            z22 = true;
                            if (z22) {
                                accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 4 | 16);
                            }
                        }
                        i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 26) {
                            ArrayList arrayList = new ArrayList();
                            CharSequence g12 = gVar.g();
                            if (g12 != null && g12.length() != 0) {
                                z21 = false;
                                if (!z21 && jVar.d(o1.i.f16193a)) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (jVar.d(SemanticsProperties.f3959p)) {
                                    arrayList.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (!arrayList.isEmpty()) {
                                    i.f3848a.a(obtain, arrayList);
                                }
                            }
                            z21 = true;
                            if (!z21) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (jVar.d(SemanticsProperties.f3959p)) {
                            }
                            if (!arrayList.isEmpty()) {
                            }
                        }
                        fVar = (o1.f) SemanticsConfigurationKt.a(jVar, SemanticsProperties.c);
                        if (fVar == null) {
                            androidx.compose.ui.semantics.a<o1.a<u7.l<Float, Boolean>>> aVar17 = o1.i.f16196e;
                            if (jVar.d(aVar17)) {
                                str2 = "android.widget.SeekBar";
                            } else {
                                str2 = "android.widget.ProgressBar";
                            }
                            gVar.i(str2);
                            o1.f fVar2 = o1.f.f16187d;
                            float f11 = fVar.f16188a;
                            b8.e<Float> eVar2 = fVar.f16189b;
                            if (fVar != fVar2) {
                                accessibilityNodeInfo2 = obtain;
                                accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, eVar2.d().floatValue(), eVar2.c().floatValue(), f11));
                                if (gVar.f() == null) {
                                    if (eVar2.c().floatValue() - eVar2.d().floatValue() == 0.0f) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (z18) {
                                        floatValue5 = 0.0f;
                                    } else {
                                        floatValue5 = (f11 - eVar2.d().floatValue()) / (eVar2.c().floatValue() - eVar2.d().floatValue());
                                    }
                                    float b02 = a1.c.b0(floatValue5, 0.0f, 1.0f);
                                    if (b02 == 0.0f) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        c0 = 0;
                                    } else {
                                        if (b02 == 1.0f) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        if (z20) {
                                            c0 = 100;
                                        } else {
                                            c0 = a1.c.c0(m0.b.g1(b02 * 100), 1, 99);
                                        }
                                    }
                                    string = androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(c0));
                                    gVar.p(string);
                                }
                                if (jVar.d(aVar17) && p.a(semanticsNode)) {
                                    floatValue = eVar2.c().floatValue();
                                    floatValue2 = eVar2.d().floatValue();
                                    if (floatValue < floatValue2) {
                                        floatValue = floatValue2;
                                    }
                                    if (f11 < floatValue) {
                                        gVar.b(g.a.f6362h);
                                    }
                                    floatValue3 = eVar2.d().floatValue();
                                    floatValue4 = eVar2.c().floatValue();
                                    if (floatValue3 > floatValue4) {
                                        floatValue3 = floatValue4;
                                    }
                                    if (f11 > floatValue3) {
                                        gVar.b(g.a.f6363i);
                                    }
                                }
                            } else {
                                accessibilityNodeInfo2 = obtain;
                                if (gVar.f() == null) {
                                    string = androidComposeView.getContext().getResources().getString(R.string.in_progress);
                                    gVar.p(string);
                                }
                                if (jVar.d(aVar17)) {
                                    floatValue = eVar2.c().floatValue();
                                    floatValue2 = eVar2.d().floatValue();
                                    if (floatValue < floatValue2) {
                                    }
                                    if (f11 < floatValue) {
                                    }
                                    floatValue3 = eVar2.d().floatValue();
                                    floatValue4 = eVar2.c().floatValue();
                                    if (floatValue3 > floatValue4) {
                                    }
                                    if (f11 > floatValue3) {
                                    }
                                }
                            }
                        } else {
                            accessibilityNodeInfo2 = obtain;
                        }
                        if (i12 >= 24) {
                            b.a(gVar, semanticsNode);
                        }
                        androidx.compose.ui.platform.accessibility.a.c(gVar, semanticsNode);
                        androidx.compose.ui.platform.accessibility.a.d(gVar, semanticsNode);
                        hVar = (o1.h) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3957m);
                        o1.a aVar18 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16195d);
                        if (hVar != null && aVar18 != null) {
                            if (!androidx.compose.ui.platform.accessibility.a.b(semanticsNode)) {
                                gVar.i("android.widget.HorizontalScrollView");
                            }
                            if (hVar.f16192b.k0().floatValue() > 0.0f) {
                                gVar.o(true);
                            }
                            if (p.a(semanticsNode)) {
                                boolean x3 = AndroidComposeViewAccessibilityDelegateCompat.x(hVar);
                                LayoutDirection layoutDirection = LayoutDirection.Rtl;
                                if (x3) {
                                    gVar.b(g.a.f6362h);
                                    if (layoutNode.f3429y == layoutDirection) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        aVar3 = g.a.f6369p;
                                    } else {
                                        aVar3 = g.a.n;
                                    }
                                    gVar.b(aVar3);
                                }
                                if (AndroidComposeViewAccessibilityDelegateCompat.w(hVar)) {
                                    gVar.b(g.a.f6363i);
                                    if (layoutNode.f3429y == layoutDirection) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z16) {
                                        aVar2 = g.a.n;
                                    } else {
                                        aVar2 = g.a.f6369p;
                                    }
                                    gVar.b(aVar2);
                                }
                            }
                        }
                        hVar2 = (o1.h) SemanticsConfigurationKt.a(jVar, SemanticsProperties.n);
                        if (hVar2 != null && aVar18 != null) {
                            if (!androidx.compose.ui.platform.accessibility.a.b(semanticsNode)) {
                                gVar.i("android.widget.ScrollView");
                            }
                            if (hVar2.f16192b.k0().floatValue() > 0.0f) {
                                gVar.o(true);
                            }
                            if (p.a(semanticsNode)) {
                                if (AndroidComposeViewAccessibilityDelegateCompat.x(hVar2)) {
                                    gVar.b(g.a.f6362h);
                                    gVar.b(g.a.f6368o);
                                }
                                if (AndroidComposeViewAccessibilityDelegateCompat.w(hVar2)) {
                                    gVar.b(g.a.f6363i);
                                    gVar.b(g.a.f6367m);
                                }
                            }
                        }
                        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3948d);
                        if (i12 < 28) {
                            accessibilityNodeInfo.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (p.a(semanticsNode)) {
                            o1.a aVar19 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16202k);
                            if (aVar19 != null) {
                                gVar.b(new g.a(262144, aVar19.f16184a));
                                m7.n nVar12 = m7.n.f16010a;
                            }
                            o1.a aVar20 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16203l);
                            if (aVar20 != null) {
                                gVar.b(new g.a(524288, aVar20.f16184a));
                                m7.n nVar13 = m7.n.f16010a;
                            }
                            o1.a aVar21 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16204m);
                            if (aVar21 != null) {
                                gVar.b(new g.a(1048576, aVar21.f16184a));
                                m7.n nVar14 = m7.n.f16010a;
                            }
                            androidx.compose.ui.semantics.a<List<o1.d>> aVar22 = o1.i.f16205o;
                            if (jVar.d(aVar22)) {
                                List list5 = (List) jVar.g(aVar22);
                                if (list5.size() < 32) {
                                    p.i<CharSequence> iVar = new p.i<>();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    p.i<Map<CharSequence, Integer>> iVar2 = androidComposeViewAccessibilityDelegateCompat.f3618k;
                                    boolean c = iVar2.c(i10);
                                    int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.f3610z;
                                    if (c) {
                                        Map map2 = (Map) iVar2.e(i10, null);
                                        ArrayList arrayList2 = new ArrayList(32);
                                        for (int i21 = 0; i21 < 32; i21++) {
                                            arrayList2.add(Integer.valueOf(iArr[i21]));
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int size2 = list5.size();
                                        int i22 = 0;
                                        while (i22 < size2) {
                                            o1.d dVar = (o1.d) list5.get(i22);
                                            v7.g.c(map2);
                                            dVar.getClass();
                                            int i23 = size2;
                                            if (map2.containsKey(null)) {
                                                Integer num = (Integer) map2.get(null);
                                                v7.g.c(num);
                                                map = map2;
                                                iVar.f(num.intValue(), null);
                                                linkedHashMap.put(null, num);
                                                arrayList2.remove(num);
                                                gVar.b(new g.a(num.intValue(), (String) null));
                                            } else {
                                                map = map2;
                                                arrayList3.add(dVar);
                                            }
                                            i22++;
                                            size2 = i23;
                                            map2 = map;
                                        }
                                        int size3 = arrayList3.size();
                                        for (int i24 = 0; i24 < size3; i24++) {
                                            int intValue = ((Number) arrayList2.get(i24)).intValue();
                                            ((o1.d) arrayList3.get(i24)).getClass();
                                            iVar.f(intValue, null);
                                            linkedHashMap.put(null, Integer.valueOf(intValue));
                                            gVar.b(new g.a(intValue, (String) null));
                                        }
                                    } else {
                                        int size4 = list5.size();
                                        for (int i25 = 0; i25 < size4; i25++) {
                                            int i26 = iArr[i25];
                                            ((o1.d) list5.get(i25)).getClass();
                                            iVar.f(i26, null);
                                            linkedHashMap.put(null, Integer.valueOf(i26));
                                            gVar.b(new g.a(i26, (String) null));
                                        }
                                    }
                                    androidComposeViewAccessibilityDelegateCompat.f3617j.f(i10, iVar);
                                    iVar2.f(i10, linkedHashMap);
                                } else {
                                    throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                                }
                            }
                        }
                        if (accessibilityNodeInfo.getContentDescription() == null && gVar.g() == null && gVar.e() == null && gVar.f() == null && !accessibilityNodeInfo.isCheckable()) {
                            z14 = false;
                            if (!jVar.f16207j && (!z10 || !z14)) {
                                z15 = false;
                                if (Build.VERSION.SDK_INT < 28) {
                                    accessibilityNodeInfo.setScreenReaderFocusable(z15);
                                } else {
                                    gVar.h(1, z15);
                                }
                                return accessibilityNodeInfo2;
                            }
                            z15 = true;
                            if (Build.VERSION.SDK_INT < 28) {
                            }
                            return accessibilityNodeInfo2;
                        }
                        z14 = true;
                        if (!jVar.f16207j) {
                            z15 = false;
                            if (Build.VERSION.SDK_INT < 28) {
                            }
                            return accessibilityNodeInfo2;
                        }
                        z15 = true;
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        return accessibilityNodeInfo2;
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 26) {
                    }
                    fVar = (o1.f) SemanticsConfigurationKt.a(jVar, SemanticsProperties.c);
                    if (fVar == null) {
                    }
                    if (i12 >= 24) {
                    }
                    androidx.compose.ui.platform.accessibility.a.c(gVar, semanticsNode);
                    androidx.compose.ui.platform.accessibility.a.d(gVar, semanticsNode);
                    hVar = (o1.h) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3957m);
                    o1.a aVar182 = (o1.a) SemanticsConfigurationKt.a(jVar, o1.i.f16195d);
                    if (hVar != null) {
                        if (!androidx.compose.ui.platform.accessibility.a.b(semanticsNode)) {
                        }
                        if (hVar.f16192b.k0().floatValue() > 0.0f) {
                        }
                        if (p.a(semanticsNode)) {
                        }
                    }
                    hVar2 = (o1.h) SemanticsConfigurationKt.a(jVar, SemanticsProperties.n);
                    if (hVar2 != null) {
                        if (!androidx.compose.ui.platform.accessibility.a.b(semanticsNode)) {
                        }
                        if (hVar2.f16192b.k0().floatValue() > 0.0f) {
                        }
                        if (p.a(semanticsNode)) {
                        }
                    }
                    CharSequence charSequence2 = (CharSequence) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3948d);
                    if (i12 < 28) {
                    }
                    if (p.a(semanticsNode)) {
                    }
                    if (accessibilityNodeInfo.getContentDescription() == null) {
                        z14 = false;
                        if (!jVar.f16207j) {
                        }
                        z15 = true;
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        return accessibilityNodeInfo2;
                    }
                    z14 = true;
                    if (!jVar.f16207j) {
                    }
                    z15 = true;
                    if (Build.VERSION.SDK_INT < 28) {
                    }
                    return accessibilityNodeInfo2;
                }
            }
            return null;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
            	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:503:0x00aa A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:507:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:514:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:515:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:518:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:519:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:527:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:530:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:531:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:533:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:541:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:635:0x026e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:638:0x0282 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:641:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:644:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:647:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:648:0x02b7  */
        /* JADX WARN: Removed duplicated region for block: B:651:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:654:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:658:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:659:0x02f5  */
        /* JADX WARN: Removed duplicated region for block: B:750:0x0432  */
        /* JADX WARN: Removed duplicated region for block: B:751:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:759:0x0446  */
        /* JADX WARN: Removed duplicated region for block: B:760:0x0448  */
        /* JADX WARN: Removed duplicated region for block: B:804:0x0530  */
        /* JADX WARN: Removed duplicated region for block: B:805:0x0532  */
        /* JADX WARN: Removed duplicated region for block: B:836:0x0584  */
        /* JADX WARN: Removed duplicated region for block: B:837:0x0587  */
        /* JADX WARN: Removed duplicated region for block: B:889:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:501:0x00a7 -> B:502:0x00a8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:508:0x00b7 -> B:509:0x00b9). Please submit an issue!!! */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean performAction(int r18, int r19, android.os.Bundle r20) {
            /*
                Method dump skipped, instructions count: 1556
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.d.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final SemanticsNode f3639a;

        /* renamed from: b */
        public final int f3640b;
        public final int c;

        /* renamed from: d */
        public final int f3641d;

        /* renamed from: e */
        public final int f3642e;

        /* renamed from: f */
        public final long f3643f;

        public e(SemanticsNode semanticsNode, int i10, int i11, int i12, int i13, long j2) {
            this.f3639a = semanticsNode;
            this.f3640b = i10;
            this.c = i11;
            this.f3641d = i12;
            this.f3642e = i13;
            this.f3643f = j2;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final o1.j f3644a;

        /* renamed from: b */
        public final LinkedHashSet f3645b;

        public f(SemanticsNode semanticsNode, Map<Integer, b1> map) {
            v7.g.f(semanticsNode, "semanticsNode");
            v7.g.f(map, "currentSemanticsNodes");
            this.f3644a = semanticsNode.f3939f;
            this.f3645b = new LinkedHashSet();
            List e10 = semanticsNode.e(false);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) e10.get(i10);
                if (map.containsKey(Integer.valueOf(semanticsNode2.f3940g))) {
                    this.f3645b.add(Integer.valueOf(semanticsNode2.f3940g));
                }
            }
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        v7.g.f(androidComposeView, "view");
        this.f3611d = androidComposeView;
        this.f3612e = Integer.MIN_VALUE;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        v7.g.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f3613f = (AccessibilityManager) systemService;
        this.f3614g = new Handler(Looper.getMainLooper());
        this.f3615h = new b3.h(new d());
        this.f3616i = Integer.MIN_VALUE;
        this.f3617j = new p.i<>();
        this.f3618k = new p.i<>();
        this.f3619l = -1;
        this.n = new p.d<>();
        this.f3621o = a1.b.f(-1, null, 6);
        this.f3622p = true;
        this.f3624r = kotlin.collections.d.K1();
        this.f3625s = new p.d<>();
        this.f3626t = new LinkedHashMap();
        this.f3627u = new f(androidComposeView.getSemanticsOwner().a(), kotlin.collections.d.K1());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f3629w = new androidx.activity.b(5, this);
        this.f3630x = new ArrayList();
        this.f3631y = new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1(this);
    }

    public static /* synthetic */ void B(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.A(i10, i11, num, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence I(CharSequence charSequence) {
        boolean z10;
        if (charSequence != null && charSequence.length() != 0) {
            z10 = false;
            if (z10) {
                int i10 = 100000;
                if (charSequence.length() <= 100000) {
                    return charSequence;
                }
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i10);
                v7.g.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
            return charSequence;
        }
        z10 = true;
        if (z10) {
        }
    }

    public static String q(SemanticsNode semanticsNode) {
        p1.a aVar;
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.semantics.a<List<String>> aVar2 = SemanticsProperties.f3946a;
        o1.j jVar = semanticsNode.f3939f;
        if (jVar.d(aVar2)) {
            return a1.c.s0((List) jVar.g(aVar2));
        }
        if (p.f(semanticsNode)) {
            p1.a r3 = r(jVar);
            if (r3 == null) {
                return null;
            }
            return r3.f16641i;
        }
        List list = (List) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3960q);
        if (list == null || (aVar = (p1.a) kotlin.collections.c.p2(list)) == null) {
            return null;
        }
        return aVar.f16641i;
    }

    public static p1.a r(o1.j jVar) {
        return (p1.a) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3961r);
    }

    public static final boolean u(o1.h hVar, float f10) {
        u7.a<Float> aVar = hVar.f16191a;
        if ((f10 < 0.0f && aVar.k0().floatValue() > 0.0f) || (f10 > 0.0f && aVar.k0().floatValue() < hVar.f16192b.k0().floatValue())) {
            return true;
        }
        return false;
    }

    public static final float v(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    public static final boolean w(o1.h hVar) {
        u7.a<Float> aVar = hVar.f16191a;
        float floatValue = aVar.k0().floatValue();
        boolean z10 = hVar.c;
        return (floatValue > 0.0f && !z10) || (aVar.k0().floatValue() < hVar.f16192b.k0().floatValue() && z10);
    }

    public static final boolean x(o1.h hVar) {
        u7.a<Float> aVar = hVar.f16191a;
        float floatValue = aVar.k0().floatValue();
        float floatValue2 = hVar.f16192b.k0().floatValue();
        boolean z10 = hVar.c;
        return (floatValue < floatValue2 && !z10) || (aVar.k0().floatValue() > 0.0f && z10);
    }

    public final boolean A(int i10, int i11, Integer num, List<String> list) {
        if (i10 != Integer.MIN_VALUE && s()) {
            AccessibilityEvent l2 = l(i10, i11);
            if (num != null) {
                l2.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                l2.setContentDescription(a1.c.s0(list));
            }
            return z(l2);
        }
        return false;
    }

    public final void C(int i10, int i11, String str) {
        AccessibilityEvent l2 = l(y(i10), 32);
        l2.setContentChangeTypes(i11);
        if (str != null) {
            l2.getText().add(str);
        }
        z(l2);
    }

    public final void D(int i10) {
        e eVar = this.f3623q;
        if (eVar != null) {
            SemanticsNode semanticsNode = eVar.f3639a;
            if (i10 != semanticsNode.f3940g) {
                return;
            }
            if (SystemClock.uptimeMillis() - eVar.f3643f <= 1000) {
                AccessibilityEvent l2 = l(y(semanticsNode.f3940g), 131072);
                l2.setFromIndex(eVar.f3641d);
                l2.setToIndex(eVar.f3642e);
                l2.setAction(eVar.f3640b);
                l2.setMovementGranularity(eVar.c);
                l2.getText().add(q(semanticsNode));
                z(l2);
            }
        }
        this.f3623q = null;
    }

    public final void E(a1 a1Var) {
        if (a1Var.w()) {
            this.f3611d.getSnapshotObserver().b(a1Var, this.f3631y, new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(this, a1Var));
        }
    }

    public final void F(SemanticsNode semanticsNode, f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List e10 = semanticsNode.e(false);
        int size = e10.size();
        int i10 = 0;
        while (true) {
            LayoutNode layoutNode = semanticsNode.c;
            if (i10 < size) {
                SemanticsNode semanticsNode2 = (SemanticsNode) e10.get(i10);
                if (p().containsKey(Integer.valueOf(semanticsNode2.f3940g))) {
                    LinkedHashSet linkedHashSet2 = fVar.f3645b;
                    int i11 = semanticsNode2.f3940g;
                    if (!linkedHashSet2.contains(Integer.valueOf(i11))) {
                        t(layoutNode);
                        return;
                    }
                    linkedHashSet.add(Integer.valueOf(i11));
                }
                i10++;
            } else {
                for (Number number : fVar.f3645b) {
                    if (!linkedHashSet.contains(Integer.valueOf(number.intValue()))) {
                        t(layoutNode);
                        return;
                    }
                }
                List e11 = semanticsNode.e(false);
                int size2 = e11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    SemanticsNode semanticsNode3 = (SemanticsNode) e11.get(i12);
                    if (p().containsKey(Integer.valueOf(semanticsNode3.f3940g))) {
                        Object obj = this.f3626t.get(Integer.valueOf(semanticsNode3.f3940g));
                        v7.g.c(obj);
                        F(semanticsNode3, (f) obj);
                    }
                }
                return;
            }
        }
    }

    public final void G(LayoutNode layoutNode, p.d<Integer> dVar) {
        LayoutNode d5;
        l1.h0 r3;
        if (!layoutNode.z() || this.f3611d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            return;
        }
        l1.h0 r10 = v0.p.r(layoutNode);
        if (r10 == null) {
            LayoutNode d10 = p.d(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1.f3651j);
            if (d10 != null) {
                r10 = v0.p.r(d10);
            } else {
                r10 = null;
            }
            if (r10 == null) {
                return;
            }
        }
        if (!m0.b.E(r10).f16207j && (d5 = p.d(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.f3650j)) != null && (r3 = v0.p.r(d5)) != null) {
            r10 = r3;
        }
        int i10 = v0.p.E(r10).f3415j;
        if (!dVar.add(Integer.valueOf(i10))) {
            return;
        }
        B(this, y(i10), 2048, 1, 8);
    }

    public final boolean H(SemanticsNode semanticsNode, int i10, int i11, boolean z10) {
        String q10;
        Integer num;
        Integer num2;
        androidx.compose.ui.semantics.a<o1.a<u7.q<Integer, Integer, Boolean, Boolean>>> aVar = o1.i.f16197f;
        o1.j jVar = semanticsNode.f3939f;
        boolean z11 = false;
        if (jVar.d(aVar) && p.a(semanticsNode)) {
            u7.q qVar = (u7.q) ((o1.a) jVar.g(aVar)).f16185b;
            if (qVar == null) {
                return false;
            }
            return ((Boolean) qVar.O(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } else if ((i10 == i11 && i11 == this.f3619l) || (q10 = q(semanticsNode)) == null) {
            return false;
        } else {
            if (i10 < 0 || i10 != i11 || i11 > q10.length()) {
                i10 = -1;
            }
            this.f3619l = i10;
            if (q10.length() > 0) {
                z11 = true;
            }
            int i12 = semanticsNode.f3940g;
            int y10 = y(i12);
            Integer num3 = null;
            if (z11) {
                num = Integer.valueOf(this.f3619l);
            } else {
                num = null;
            }
            if (z11) {
                num2 = Integer.valueOf(this.f3619l);
            } else {
                num2 = null;
            }
            if (z11) {
                num3 = Integer.valueOf(q10.length());
            }
            z(m(y10, num, num2, num3, q10));
            D(i12);
            return true;
        }
    }

    public final void J(int i10) {
        int i11 = this.f3612e;
        if (i11 == i10) {
            return;
        }
        this.f3612e = i10;
        B(this, i10, 128, null, 12);
        B(this, i11, 256, null, 12);
    }

    @Override // a3.a
    public final b3.h b(View view) {
        v7.g.f(view, "host");
        return this.f3615h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0072 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:67:0x002c, B:77:0x0057, B:81:0x006a, B:83:0x0072, B:86:0x007d, B:88:0x0082, B:89:0x0091, B:91:0x0098, B:92:0x00a1, B:72:0x0040), top: B:103:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v6, types: [la.e] */
    /* JADX WARN: Type inference failed for: r2v7, types: [la.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00b2 -> B:68:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(p7.c<? super m7.n> cVar) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i10;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        p.d<Integer> dVar;
        AbstractChannel.a aVar;
        p.d<Integer> dVar2;
        AbstractChannel.a aVar2;
        Object a10;
        try {
            if (cVar instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) cVar;
                int i11 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q = i11 - Integer.MIN_VALUE;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3635o;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                ?? r22 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.n;
                                dVar2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3634m;
                                androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3633l;
                                m0.b.n1(obj);
                                AbstractChannel.a aVar3 = r22;
                                dVar = dVar2;
                                aVar = aVar3;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3633l = androidComposeViewAccessibilityDelegateCompat;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3634m = dVar;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.n = aVar;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q = 1;
                                a10 = aVar.a(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                                if (a10 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                AbstractChannel.a aVar4 = aVar;
                                dVar2 = dVar;
                                obj = a10;
                                aVar2 = aVar4;
                                if (!((Boolean) obj).booleanValue()) {
                                    aVar2.next();
                                    boolean s10 = androidComposeViewAccessibilityDelegateCompat.s();
                                    p.d<LayoutNode> dVar3 = androidComposeViewAccessibilityDelegateCompat.n;
                                    if (s10) {
                                        int i12 = dVar3.f16550k;
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            Object obj2 = dVar3.f16549j[i13];
                                            v7.g.c(obj2);
                                            androidComposeViewAccessibilityDelegateCompat.G((LayoutNode) obj2, dVar2);
                                        }
                                        dVar2.clear();
                                        if (!androidComposeViewAccessibilityDelegateCompat.f3628v) {
                                            androidComposeViewAccessibilityDelegateCompat.f3628v = true;
                                            androidComposeViewAccessibilityDelegateCompat.f3614g.post(androidComposeViewAccessibilityDelegateCompat.f3629w);
                                        }
                                    }
                                    dVar3.clear();
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3633l = androidComposeViewAccessibilityDelegateCompat;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3634m = dVar2;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.n = aVar2;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q = 2;
                                    aVar3 = aVar2;
                                    if (m0.b.S(100L, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    dVar = dVar2;
                                    aVar = aVar3;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3633l = androidComposeViewAccessibilityDelegateCompat;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3634m = dVar;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.n = aVar;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q = 1;
                                    a10 = aVar.a(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                                    if (a10 == coroutineSingletons) {
                                    }
                                } else {
                                    androidComposeViewAccessibilityDelegateCompat.n.clear();
                                    return m7.n.f16010a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ?? r23 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.n;
                            dVar2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3634m;
                            androidComposeViewAccessibilityDelegateCompat = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3633l;
                            m0.b.n1(obj);
                            aVar2 = r23;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        m0.b.n1(obj);
                        try {
                            dVar = new p.d<>();
                            AbstractChannel abstractChannel = this.f3621o;
                            abstractChannel.getClass();
                            aVar = new AbstractChannel.a(abstractChannel);
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3633l = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3634m = dVar;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.n = aVar;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q = 1;
                            a10 = aVar.a(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (a10 == coroutineSingletons) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat.n.clear();
                            throw th;
                        }
                    }
                }
            }
            if (i10 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, cVar);
        Object obj3 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3635o;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f3637q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00d1, code lost:
        if (r4.k0().floatValue() < r1.f16192b.k0().floatValue()) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(int i10, long j2, boolean z10) {
        boolean z11;
        androidx.compose.ui.semantics.a<o1.h> aVar;
        boolean z12;
        o1.h hVar;
        int i11;
        boolean z13;
        Collection<b1> values = p().values();
        v7.g.f(values, "currentSemanticsNodes");
        if (u0.c.a(j2, u0.c.f17722d)) {
            return false;
        }
        if (!Float.isNaN(u0.c.b(j2)) && !Float.isNaN(u0.c.c(j2))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                aVar = SemanticsProperties.n;
            } else if (!z10) {
                aVar = SemanticsProperties.f3957m;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (values.isEmpty()) {
                return false;
            }
            for (b1 b1Var : values) {
                Rect rect = b1Var.f3832b;
                v7.g.f(rect, "<this>");
                float f10 = rect.top;
                float f11 = rect.right;
                float f12 = rect.bottom;
                if (u0.c.b(j2) >= rect.left && u0.c.b(j2) < f11 && u0.c.c(j2) >= f10 && u0.c.c(j2) < f12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && (hVar = (o1.h) SemanticsConfigurationKt.a(b1Var.f3831a.f(), aVar)) != null) {
                    boolean z14 = hVar.c;
                    if (z14) {
                        i11 = -i10;
                    } else {
                        i11 = i10;
                    }
                    if (i10 == 0 && z14) {
                        i11 = -1;
                    }
                    u7.a<Float> aVar2 = hVar.f16191a;
                    if (i11 < 0) {
                        if (aVar2.k0().floatValue() > 0.0f) {
                            z13 = true;
                            continue;
                        }
                    }
                    if (z13) {
                        return true;
                    }
                }
                z13 = false;
                continue;
                if (z13) {
                }
            }
            return false;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public final AccessibilityEvent l(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        v7.g.e(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f3611d;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i10);
        b1 b1Var = p().get(Integer.valueOf(i10));
        if (b1Var != null) {
            obtain.setPassword(b1Var.f3831a.f().d(SemanticsProperties.f3965v));
        }
        return obtain;
    }

    public final AccessibilityEvent m(int i10, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent l2 = l(i10, 8192);
        if (num != null) {
            l2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            l2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            l2.setItemCount(num3.intValue());
        }
        if (str != null) {
            l2.getText().add(str);
        }
        return l2;
    }

    public final int n(SemanticsNode semanticsNode) {
        androidx.compose.ui.semantics.a<List<String>> aVar = SemanticsProperties.f3946a;
        o1.j jVar = semanticsNode.f3939f;
        if (!jVar.d(aVar)) {
            androidx.compose.ui.semantics.a<p1.o> aVar2 = SemanticsProperties.f3962s;
            if (jVar.d(aVar2)) {
                return p1.o.a(((p1.o) jVar.g(aVar2)).f16702a);
            }
        }
        return this.f3619l;
    }

    public final int o(SemanticsNode semanticsNode) {
        androidx.compose.ui.semantics.a<List<String>> aVar = SemanticsProperties.f3946a;
        o1.j jVar = semanticsNode.f3939f;
        if (!jVar.d(aVar)) {
            androidx.compose.ui.semantics.a<p1.o> aVar2 = SemanticsProperties.f3962s;
            if (jVar.d(aVar2)) {
                return (int) (((p1.o) jVar.g(aVar2)).f16702a >> 32);
            }
        }
        return this.f3619l;
    }

    public final Map<Integer, b1> p() {
        if (this.f3622p) {
            o1.m semanticsOwner = this.f3611d.getSemanticsOwner();
            v7.g.f(semanticsOwner, "<this>");
            SemanticsNode a10 = semanticsOwner.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LayoutNode layoutNode = a10.c;
            if (layoutNode.A && layoutNode.z()) {
                Region region = new Region();
                region.set(m0.b.q1(a10.d()));
                p.e(region, a10, linkedHashMap, a10);
            }
            this.f3624r = linkedHashMap;
            this.f3622p = false;
        }
        return this.f3624r;
    }

    public final boolean s() {
        AccessibilityManager accessibilityManager = this.f3613f;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void t(LayoutNode layoutNode) {
        if (this.n.add(layoutNode)) {
            this.f3621o.F(m7.n.f16010a);
        }
    }

    public final int y(int i10) {
        if (i10 == this.f3611d.getSemanticsOwner().a().f3940g) {
            return -1;
        }
        return i10;
    }

    public final boolean z(AccessibilityEvent accessibilityEvent) {
        if (s()) {
            View view = this.f3611d;
            return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
