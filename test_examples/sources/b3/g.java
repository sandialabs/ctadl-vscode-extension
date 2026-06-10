package b3;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.datastore.preferences.PreferencesProto$Value;
import b3.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static int f6356d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f6357a;

    /* renamed from: b  reason: collision with root package name */
    public int f6358b = -1;
    public int c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f6359e;

        /* renamed from: f  reason: collision with root package name */
        public static final a f6360f;

        /* renamed from: g  reason: collision with root package name */
        public static final a f6361g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f6362h;

        /* renamed from: i  reason: collision with root package name */
        public static final a f6363i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f6364j;

        /* renamed from: k  reason: collision with root package name */
        public static final a f6365k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f6366l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f6367m;
        public static final a n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f6368o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f6369p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f6370q;

        /* renamed from: a  reason: collision with root package name */
        public final Object f6371a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6372b;
        public final Class<? extends k.a> c;

        /* renamed from: d  reason: collision with root package name */
        public final k f6373d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            new a(1, (String) null);
            new a(2, (String) null);
            new a(4, (String) null);
            new a(8, (String) null);
            f6359e = new a(16, (String) null);
            new a(32, (String) null);
            f6360f = new a(64, (String) null);
            f6361g = new a(128, (String) null);
            new a(256, k.b.class);
            new a(512, k.b.class);
            new a(1024, k.c.class);
            new a(2048, k.c.class);
            f6362h = new a(4096, (String) null);
            f6363i = new a(8192, (String) null);
            new a(16384, (String) null);
            new a(32768, (String) null);
            new a(65536, (String) null);
            new a(131072, k.g.class);
            f6364j = new a(262144, (String) null);
            f6365k = new a(524288, (String) null);
            f6366l = new a(1048576, (String) null);
            new a(2097152, k.h.class);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction30;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, 16908342, null, null, null);
            if (i10 >= 23) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction29;
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, 16908343, null, null, k.e.class);
            if (i10 >= 23) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction28;
            } else {
                accessibilityAction3 = null;
            }
            f6367m = new a(accessibilityAction3, 16908344, null, null, null);
            if (i10 >= 23) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction27;
            } else {
                accessibilityAction4 = null;
            }
            n = new a(accessibilityAction4, 16908345, null, null, null);
            if (i10 >= 23) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction26;
            } else {
                accessibilityAction5 = null;
            }
            f6368o = new a(accessibilityAction5, 16908346, null, null, null);
            if (i10 >= 23) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction25;
            } else {
                accessibilityAction6 = null;
            }
            f6369p = new a(accessibilityAction6, 16908347, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            if (i10 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction7 = accessibilityAction24;
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, 16908359, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            if (i10 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction8 = accessibilityAction23;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, 16908361, null, null, null);
            if (i10 >= 23) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction9 = accessibilityAction22;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, 16908348, null, null, null);
            if (i10 >= 24) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction10 = accessibilityAction21;
            } else {
                accessibilityAction10 = null;
            }
            f6370q = new a(accessibilityAction10, 16908349, null, null, k.f.class);
            if (i10 >= 26) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction11 = accessibilityAction20;
            } else {
                accessibilityAction11 = null;
            }
            new a(accessibilityAction11, 16908354, null, null, k.d.class);
            if (i10 >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction12 = accessibilityAction19;
            } else {
                accessibilityAction12 = null;
            }
            new a(accessibilityAction12, 16908356, null, null, null);
            if (i10 >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction13 = accessibilityAction18;
            } else {
                accessibilityAction13 = null;
            }
            new a(accessibilityAction13, 16908357, null, null, null);
            if (i10 >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction14 = accessibilityAction17;
            } else {
                accessibilityAction14 = null;
            }
            new a(accessibilityAction14, 16908362, null, null, null);
            if (i10 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction15 = accessibilityAction16;
            } else {
                accessibilityAction15 = null;
            }
            new a(accessibilityAction15, 16908372, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(int i10, String str) {
            this(null, i10, str, null, null);
        }

        public a(Object obj, int i10, String str, k kVar, Class cls) {
            this.f6372b = i10;
            this.f6373d = kVar;
            this.f6371a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, str) : obj;
            this.c = cls;
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6371a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6371a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = ((a) obj).f6371a;
                Object obj3 = this.f6371a;
                return obj3 == null ? obj2 == null : obj3.equals(obj2);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f6371a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6374a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f6374a = collectionInfo;
        }

        public static b a(int i10, int i11, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6375a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f6375a = collectionItemInfo;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
        }
    }

    public g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f6357a = accessibilityNodeInfo;
    }

    public final void a(int i10) {
        this.f6357a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f6357a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6371a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f6357a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        CharSequence hintText;
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        if (i10 >= 26) {
            hintText = accessibilityNodeInfo.getHintText();
            return hintText;
        }
        return accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f6357a;
            if (accessibilityNodeInfo2 == null) {
                if (accessibilityNodeInfo != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
                return false;
            }
            return this.c == gVar.c && this.f6358b == gVar.f6358b;
        }
        return false;
    }

    public final CharSequence f() {
        boolean z10;
        CharSequence stateDescription;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        if (z10) {
            stateDescription = accessibilityNodeInfo.getStateDescription();
            return stateDescription;
        }
        return accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public final CharSequence g() {
        boolean z10 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        if (z10) {
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i10 = 0; i10 < c10.size(); i10++) {
                spannableString.setSpan(new b3.a(((Integer) c13.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void h(int i10, boolean z10) {
        Bundle extras = this.f6357a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f6357a.setClassName(charSequence);
    }

    public final void j(b bVar) {
        this.f6357a.setCollectionInfo(bVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) bVar.f6374a);
    }

    public final void k(c cVar) {
        this.f6357a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f6375a);
    }

    public final void l(CharSequence charSequence) {
        this.f6357a.setContentDescription(charSequence);
    }

    public final void m(boolean z10) {
        this.f6357a.setDismissable(z10);
    }

    public final void n(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void o(boolean z10) {
        this.f6357a.setScrollable(z10);
    }

    public final void p(CharSequence charSequence) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        if (z10) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void q(CharSequence charSequence) {
        this.f6357a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6357a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (v2.a.a()) {
            string = accessibilityNodeInfo.getUniqueId();
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                emptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < emptyList.size(); i11++) {
            a aVar = (a) emptyList.get(i11);
            int a10 = aVar.a();
            if (a10 != 1) {
                if (a10 != 2) {
                    switch (a10) {
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 512:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 1024:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case 8192:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case 16384:
                            str = "ACTION_COPY";
                            break;
                        case 32768:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case 16908354:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (a10) {
                                case 16908342:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case 16908343:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case 16908344:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case 16908345:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case 16908346:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case 16908347:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case 16908348:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case 16908349:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (a10) {
                                        case 16908356:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case 16908357:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case 16908358:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case 16908359:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case 16908360:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case 16908361:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case 16908362:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (a10) {
                                                case 16908372:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case 16908373:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case 16908374:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case 16908375:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                str = aVar.b().toString();
            }
            sb.append(str);
            if (i11 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
