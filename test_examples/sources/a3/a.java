package a3;

import a3.j0;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b3.g;
import b3.k;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f108a;

    /* renamed from: b  reason: collision with root package name */
    public final C0000a f109b;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0000a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f110a;

        public C0000a(a aVar) {
            this.f110a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f110a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b3.h b5 = this.f110a.b(view);
            if (b5 != null) {
                return (AccessibilityNodeProvider) b5.f6376a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f110a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z10;
            Object tag;
            boolean z11;
            boolean z12;
            Object tag2;
            boolean z13;
            Object tag3;
            int i10;
            b3.g gVar = new b3.g(accessibilityNodeInfo);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            boolean z14 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = true;
            } else {
                z10 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z10) {
                tag = Boolean.valueOf(j0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                g.x(accessibilityNodeInfo, z11);
            } else {
                gVar.h(1, z11);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                tag2 = Boolean.valueOf(j0.m.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i11 >= 28) {
                f.y(accessibilityNodeInfo, z13);
            } else {
                gVar.h(2, z13);
            }
            CharSequence d5 = j0.d(view);
            if (i11 >= 28) {
                g.w(accessibilityNodeInfo, d5);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d5);
            }
            if (Build.VERSION.SDK_INT < 30) {
                z14 = false;
            }
            if (z14) {
                tag3 = j0.o.a(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            gVar.p((CharSequence) tag3);
            this.f110a.d(view, gVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i11 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    gVar.f6357a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i14 = 0; i14 < clickableSpanArr.length; i14++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i14];
                        int i15 = 0;
                        while (true) {
                            if (i15 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                    i10 = sparseArray2.keyAt(i15);
                                    break;
                                }
                                i15++;
                            } else {
                                i10 = b3.g.f6356d;
                                b3.g.f6356d = i10 + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i14]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                        Spanned spanned = (Spanned) text;
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i16 = 0; i16 < list.size(); i16++) {
                gVar.b((g.a) list.get(i16));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f110a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f110a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f110a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f110a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f110a.i(view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f108a = accessibilityDelegate;
        this.f109b = new C0000a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f108a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b3.h b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f108a, view);
        if (a10 != null) {
            return new b3.h(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f108a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, b3.g gVar) {
        this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f108a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f108a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            g.a aVar = (g.a) list.get(i11);
            if (aVar.a() == i10) {
                b3.k kVar = aVar.f6373d;
                if (kVar != null) {
                    Class<? extends k.a> cls = aVar.c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = kVar.a(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f108a, view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                        if (clickableSpan.equals(clickableSpanArr[i13])) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    clickableSpan.onClick(view);
                    z12 = true;
                }
            }
            return z12;
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f108a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f108a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
