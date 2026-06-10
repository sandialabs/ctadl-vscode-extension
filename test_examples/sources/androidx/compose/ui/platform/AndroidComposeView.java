package androidx.compose.ui.platform;

import a3.q0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.focus.FocusManagerImpl;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import u1.d;
import u1.e;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004½\u0001¾\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R.\u0010;\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010W\u001a\u00020N8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010V\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010f\u001a\u00020^8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010V\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR/\u0010m\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR \u0010t\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u0010V\u001a\u0004\bq\u0010rR \u0010{\u001a\u00020u8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bv\u0010w\u0012\u0004\bz\u0010V\u001a\u0004\bx\u0010yR.\u0010\u0082\u0001\u001a\u00020|2\u0006\u0010\u0016\u001a\u00020|8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0004\b}\u0010h\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R3\u0010\u0089\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0016\u001a\u00030\u0083\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010h\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0095\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u009b\u0001\u001a\u00030\u0096\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010¡\u0001\u001a\u00030\u009c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010¤\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u001a\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0016\u0010¶\u0001\u001a\u00020^8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010bR\u0016\u0010¸\u0001\u001a\u00020N8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010RR\u0018\u0010¼\u0001\u001a\u00030¹\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006¿\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Ll1/b0;", "", "Lg1/x;", "Landroidx/lifecycle/e;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "Lm7/n;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Ll1/o;", "k", "Ll1/o;", "getSharedDrawScope", "()Ll1/o;", "sharedDrawScope", "Lb2/b;", "<set-?>", "l", "Lb2/b;", "getDensity", "()Lb2/b;", "density", "Landroidx/compose/ui/node/LayoutNode;", "r", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Ll1/g0;", "s", "Ll1/g0;", "getRootForTest", "()Ll1/g0;", "rootForTest", "Lo1/m;", "t", "Lo1/m;", "getSemanticsOwner", "()Lo1/m;", "semanticsOwner", "Lr0/h;", "v", "Lr0/h;", "getAutofillTree", "()Lr0/h;", "autofillTree", "Landroid/content/res/Configuration;", "B", "Lu7/l;", "getConfigurationChangeObserver", "()Lu7/l;", "setConfigurationChangeObserver", "(Lu7/l;)V", "configurationChangeObserver", "Landroidx/compose/ui/platform/k;", "E", "Landroidx/compose/ui/platform/k;", "getClipboardManager", "()Landroidx/compose/ui/platform/k;", "clipboardManager", "Landroidx/compose/ui/platform/j;", "F", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "G", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "", "H", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/j1;", "N", "Landroidx/compose/ui/platform/j1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/j1;", "viewConfiguration", "", "S", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "W", "Lg0/g0;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "Lv1/d;", "f0", "Lv1/d;", "getTextInputService", "()Lv1/d;", "getTextInputService$annotations", "textInputService", "Lu1/d$a;", "g0", "Lu1/d$a;", "getFontLoader", "()Lu1/d$a;", "getFontLoader$annotations", "fontLoader", "Lu1/e$a;", "h0", "getFontFamilyResolver", "()Lu1/e$a;", "setFontFamilyResolver", "(Lu1/e$a;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "j0", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lb1/a;", "k0", "Lb1/a;", "getHapticFeedBack", "()Lb1/a;", "hapticFeedBack", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "m0", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/c1;", "n0", "Landroidx/compose/ui/platform/c1;", "getTextToolbar", "()Landroidx/compose/ui/platform/c1;", "textToolbar", "Lg1/m;", "z0", "Lg1/m;", "getPointerIconService", "()Lg1/m;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Lt0/d;", "getFocusManager", "()Lt0/d;", "focusManager", "Landroidx/compose/ui/platform/n1;", "getWindowInfo", "()Landroidx/compose/ui/platform/n1;", "windowInfo", "Lr0/b;", "getAutofill", "()Lr0/b;", "autofill", "Landroidx/compose/ui/platform/a0;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/a0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lc1/b;", "getInputModeManager", "()Lc1/b;", "inputModeManager", "a", "b", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements l1.b0, l1.g0, g1.x, androidx.lifecycle.e {
    public static Class<?> A0;
    public static Method B0;
    public final g1.s A;
    public u7.l<? super Configuration, m7.n> B;
    public final r0.a C;
    public boolean D;
    public final k E;
    public final j F;
    public final OwnerSnapshotObserver G;
    public boolean H;
    public a0 I;
    public j0 J;
    public b2.a K;
    public boolean L;
    public final l1.s M;
    public final z N;
    public long O;
    public final int[] P;
    public final float[] Q;
    public final float[] R;
    public long S;
    public boolean T;
    public long U;
    public boolean V;
    public final g0.k0 W;

    /* renamed from: a0  reason: collision with root package name */
    public u7.l<? super b, m7.n> f3558a0;

    /* renamed from: b0  reason: collision with root package name */
    public final l f3559b0;
    public final m c0;

    /* renamed from: d0  reason: collision with root package name */
    public final n f3560d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextInputServiceAndroid f3561e0;

    /* renamed from: f0  reason: collision with root package name */
    public final v1.d f3562f0;

    /* renamed from: g0  reason: collision with root package name */
    public final p f3563g0;

    /* renamed from: h0  reason: collision with root package name */
    public final g0.k0 f3564h0;

    /* renamed from: i  reason: collision with root package name */
    public long f3565i;

    /* renamed from: i0  reason: collision with root package name */
    public int f3566i0;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3567j;

    /* renamed from: j0  reason: collision with root package name */
    public final g0.k0 f3568j0;

    /* renamed from: k  reason: collision with root package name */
    public final l1.o f3569k;

    /* renamed from: k0  reason: collision with root package name */
    public final b1.b f3570k0;

    /* renamed from: l  reason: collision with root package name */
    public b2.c f3571l;

    /* renamed from: l0  reason: collision with root package name */
    public final c1.c f3572l0;

    /* renamed from: m  reason: collision with root package name */
    public final FocusManagerImpl f3573m;

    /* renamed from: m0  reason: collision with root package name */
    public final ModifierLocalManager f3574m0;
    public final o1 n;

    /* renamed from: n0  reason: collision with root package name */
    public final a1.b f3575n0;

    /* renamed from: o  reason: collision with root package name */
    public final e1.c f3576o;

    /* renamed from: o0  reason: collision with root package name */
    public MotionEvent f3577o0;

    /* renamed from: p  reason: collision with root package name */
    public final q0.d f3578p;

    /* renamed from: p0  reason: collision with root package name */
    public long f3579p0;

    /* renamed from: q  reason: collision with root package name */
    public final j0.c f3580q;

    /* renamed from: q0  reason: collision with root package name */
    public final g0.e1 f3581q0;

    /* renamed from: r  reason: collision with root package name */
    public final LayoutNode f3582r;

    /* renamed from: r0  reason: collision with root package name */
    public final h0.e<u7.a<m7.n>> f3583r0;

    /* renamed from: s  reason: collision with root package name */
    public final AndroidComposeView f3584s;

    /* renamed from: s0  reason: collision with root package name */
    public final d f3585s0;

    /* renamed from: t  reason: collision with root package name */
    public final o1.m f3586t;

    /* renamed from: t0  reason: collision with root package name */
    public final androidx.appcompat.widget.j1 f3587t0;

    /* renamed from: u  reason: collision with root package name */
    public final AndroidComposeViewAccessibilityDelegateCompat f3588u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f3589u0;

    /* renamed from: v  reason: collision with root package name */
    public final r0.h f3590v;

    /* renamed from: v0  reason: collision with root package name */
    public final u7.a<m7.n> f3591v0;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f3592w;

    /* renamed from: w0  reason: collision with root package name */
    public final c0 f3593w0;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f3594x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f3595x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3596y;

    /* renamed from: y0  reason: collision with root package name */
    public g1.l f3597y0;

    /* renamed from: z  reason: collision with root package name */
    public final g1.g f3598z;

    /* renamed from: z0  reason: collision with root package name */
    public final c f3599z0;

    /* loaded from: classes.dex */
    public static final class a {
        public static final boolean a() {
            Object obj;
            Class<?> cls = AndroidComposeView.A0;
            try {
                if (AndroidComposeView.A0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.A0 = cls2;
                    AndroidComposeView.B0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.B0;
                Boolean bool = null;
                if (method != null) {
                    obj = method.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.q f3601a;

        /* renamed from: b  reason: collision with root package name */
        public final b4.d f3602b;

        public b(androidx.lifecycle.q qVar, b4.d dVar) {
            this.f3601a = qVar;
            this.f3602b = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g1.m {
        public c(AndroidComposeView androidComposeView) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Runnable {
        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r3 != 1) goto L12;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z10;
            int i10;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f3577o0;
            if (motionEvent != null) {
                boolean z11 = false;
                if (motionEvent.getToolType(0) == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (z10) {
                    if (actionMasked != 10 && actionMasked != 1) {
                        z11 = true;
                    }
                    if (z11) {
                        if (actionMasked != 7 && actionMasked != 9) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                        androidComposeView2.K(motionEvent, i10, androidComposeView2.f3579p0, false);
                    }
                }
            }
        }
    }

    static {
        new a();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.ui.platform.l] */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.ui.platform.m] */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.ui.platform.n] */
    public AndroidComposeView(Context context) {
        super(context);
        boolean z10;
        r0.a aVar;
        int i10;
        int i11;
        c0 d0Var;
        this.f3565i = u0.c.f17722d;
        this.f3567j = true;
        this.f3569k = new l1.o();
        this.f3571l = ma.i.c(context);
        o1.l lVar = new o1.l(false, false, AndroidComposeView$semanticsModifier$1.f3608j, InspectableValueKt.f3744a);
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl();
        this.f3573m = focusManagerImpl;
        this.n = new o1();
        e1.c cVar = new e1.c(new AndroidComposeView$keyInputModifier$1(this));
        this.f3576o = cVar;
        q0.d a10 = RotaryInputModifierKt.a(AndroidComposeView$rotaryInputModifier$1.f3607j);
        this.f3578p = a10;
        this.f3580q = new j0.c(1);
        LayoutNode layoutNode = new LayoutNode(3, false, 0);
        layoutNode.b(RootMeasurePolicy.f3326a);
        layoutNode.e(getDensity());
        layoutNode.f(androidx.activity.e.b(lVar, a10).Z(focusManagerImpl.f3014b).Z(cVar));
        this.f3582r = layoutNode;
        this.f3584s = this;
        this.f3586t = new o1.m(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f3588u = androidComposeViewAccessibilityDelegateCompat;
        this.f3590v = new r0.h();
        this.f3592w = new ArrayList();
        this.f3598z = new g1.g();
        this.A = new g1.s(getRoot());
        this.B = AndroidComposeView$configurationChangeObserver$1.f3603j;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar = new r0.a(this, getAutofillTree());
        } else {
            aVar = null;
        }
        this.C = aVar;
        this.E = new k(context);
        this.F = new j(context);
        this.G = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.M = new l1.s(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        v7.g.e(viewConfiguration, "get(context)");
        this.N = new z(viewConfiguration);
        this.O = ma.i.g(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.P = new int[]{0, 0};
        this.Q = v0.p.k();
        this.R = v0.p.k();
        this.S = -1L;
        this.U = u0.c.c;
        this.V = true;
        this.W = a1.c.V0(null);
        this.f3559b0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.l
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class<?> cls = AndroidComposeView.A0;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                v7.g.f(androidComposeView, "this$0");
                androidComposeView.L();
            }
        };
        this.c0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.m
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class<?> cls = AndroidComposeView.A0;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                v7.g.f(androidComposeView, "this$0");
                androidComposeView.L();
            }
        };
        this.f3560d0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                int i13;
                Class<?> cls = AndroidComposeView.A0;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                v7.g.f(androidComposeView, "this$0");
                if (z11) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                androidComposeView.f3572l0.f6516b.setValue(new c1.a(i13));
                m0.b.H1(androidComposeView.f3573m.f3013a);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(this);
        this.f3561e0 = textInputServiceAndroid;
        this.f3562f0 = (v1.d) ((AndroidComposeView_androidKt$textInputServiceFactory$1) AndroidComposeView_androidKt.f3653a).U(textInputServiceAndroid);
        this.f3563g0 = new p(context);
        this.f3564h0 = a1.c.U0(m0.b.R(context), g0.s0.f11078a);
        Configuration configuration = context.getResources().getConfiguration();
        v7.g.e(configuration, "context.resources.configuration");
        if (i12 >= 31) {
            i10 = configuration.fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        this.f3566i0 = i10;
        Configuration configuration2 = context.getResources().getConfiguration();
        v7.g.e(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection != 0 && layoutDirection == 1) {
            layoutDirection2 = LayoutDirection.Rtl;
        }
        this.f3568j0 = a1.c.V0(layoutDirection2);
        this.f3570k0 = new b1.b(this);
        if (isInTouchMode()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f3572l0 = new c1.c(i11, new AndroidComposeView$_inputModeManager$1(this));
        this.f3574m0 = new ModifierLocalManager(this);
        this.f3575n0 = new a1.b(this);
        this.f3581q0 = new g0.e1(2);
        this.f3583r0 = new h0.e<>(new u7.a[16]);
        this.f3585s0 = new d();
        this.f3587t0 = new androidx.appcompat.widget.j1(2, this);
        this.f3591v0 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        if (i12 >= 29) {
            d0Var = new e0();
        } else {
            d0Var = new d0();
        }
        this.f3593w0 = d0Var;
        setWillNotDraw(false);
        setFocusable(true);
        if (i12 >= 26) {
            s.f3896a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        a3.j0.p(this, androidComposeViewAccessibilityDelegateCompat);
        getRoot().g(this);
        if (i12 >= 29) {
            q.f3876a.a(this);
        }
        this.f3599z0 = new c(this);
    }

    public static boolean B(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        if ((Float.isInfinite(x3) || Float.isNaN(x3)) ? false : true) {
            float y10 = motionEvent.getY();
            if ((Float.isInfinite(y10) || Float.isNaN(y10)) ? false : true) {
                float rawX = motionEvent.getRawX();
                if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
                    float rawY = motionEvent.getRawY();
                    if ((Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(e.a aVar) {
        this.f3564h0.setValue(aVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f3568j0.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(b bVar) {
        this.W.setValue(bVar);
    }

    public static void u(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).j();
            } else if (childAt instanceof ViewGroup) {
                u((ViewGroup) childAt);
            }
        }
    }

    public static Pair w(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return new Pair(Integer.valueOf(size), Integer.valueOf(size));
                }
                throw new IllegalStateException();
            }
            return new Pair(0, Integer.MAX_VALUE);
        }
        return new Pair(0, Integer.valueOf(size));
    }

    public static View x(View view, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (v7.g.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    v7.g.e(childAt, "currentView.getChildAt(i)");
                    View x3 = x(childAt, i10);
                    if (x3 != null) {
                        return x3;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static void z(LayoutNode layoutNode) {
        layoutNode.v();
        h0.e<LayoutNode> r3 = layoutNode.r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                z(layoutNodeArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public final void A(LayoutNode layoutNode) {
        int i10 = 0;
        this.M.n(layoutNode, false);
        h0.e<LayoutNode> r3 = layoutNode.r();
        int i11 = r3.f11334k;
        if (i11 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                A(layoutNodeArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    public final boolean C(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x3 && x3 <= ((float) getWidth())) {
            if (0.0f <= y10 && y10 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f3577o0) != null) {
            if (motionEvent.getRawX() == motionEvent2.getRawX()) {
                return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
            }
            return true;
        }
        return true;
    }

    public final void E(boolean z10) {
        u7.a<m7.n> aVar;
        l1.s sVar = this.M;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                aVar = this.f3591v0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            aVar = null;
        }
        if (sVar.f(aVar)) {
            requestLayout();
        }
        sVar.a(false);
        m7.n nVar = m7.n.f16010a;
        Trace.endSection();
    }

    public final void F(l1.z zVar, boolean z10) {
        v7.g.f(zVar, "layer");
        ArrayList arrayList = this.f3592w;
        if (!z10) {
            if (!this.f3596y && !arrayList.remove(zVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f3596y) {
            arrayList.add(zVar);
        } else {
            ArrayList arrayList2 = this.f3594x;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f3594x = arrayList2;
            }
            arrayList2.add(zVar);
        }
    }

    public final void G() {
        if (!this.T) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.S) {
                this.S = currentAnimationTimeMillis;
                c0 c0Var = this.f3593w0;
                float[] fArr = this.Q;
                c0Var.a(this, fArr);
                v0.p.t(fArr, this.R);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.P;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.U = a1.c.s(iArr[0] - iArr[0], iArr[1] - iArr[1]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(l1.z zVar) {
        boolean z10;
        v7.g.f(zVar, "layer");
        j0 j0Var = this.J;
        g0.e1 e1Var = this.f3581q0;
        if (j0Var != null && !ViewLayer.A && Build.VERSION.SDK_INT < 23) {
            e1Var.b();
            if (((h0.e) e1Var.f11042a).f11334k >= 10) {
                z10 = false;
                if (z10) {
                    e1Var.b();
                    ((h0.e) e1Var.f11042a).b(new WeakReference(zVar, (ReferenceQueue) e1Var.f11043b));
                }
                return z10;
            }
        }
        z10 = true;
        if (z10) {
        }
        return z10;
    }

    public final void I(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.L && layoutNode != null) {
                while (layoutNode != null && layoutNode.E == LayoutNode.UsageByParent.InMeasureBlock) {
                    layoutNode = layoutNode.p();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
                return;
            }
            requestLayout();
        }
    }

    public final int J(MotionEvent motionEvent) {
        Object obj;
        boolean z10 = false;
        if (this.f3595x0) {
            this.f3595x0 = false;
            int metaState = motionEvent.getMetaState();
            this.n.getClass();
            o1.f3864b.setValue(new g1.w(metaState));
        }
        g1.g gVar = this.f3598z;
        g1.q a10 = gVar.a(motionEvent, this);
        g1.s sVar = this.A;
        if (a10 != null) {
            List list = (List) a10.c;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((g1.r) obj).f11181e) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            g1.r rVar = (g1.r) obj;
            if (rVar != null) {
                this.f3565i = rVar.f11180d;
            }
            int a11 = sVar.a(a10, this, C(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                if ((a11 & 1) != 0) {
                    z10 = true;
                }
                if (!z10) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    gVar.c.delete(pointerId);
                    gVar.f11146b.delete(pointerId);
                }
            }
            return a11;
        } else if (sVar.f11190e) {
            return 0;
        } else {
            sVar.c.f11173a.clear();
            g1.j jVar = (g1.j) sVar.f11188b.f11043b;
            jVar.c();
            jVar.f11158a.g();
            return 0;
        }
    }

    public final void K(MotionEvent motionEvent, int i10, long j2, boolean z10) {
        int i11;
        int i12;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            i11 = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i11 = (i10 == 9 || i10 == 10) ? 0 : 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i11 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
        }
        for (int i15 = 0; i15 < pointerCount; i15++) {
            if (i11 >= 0 && i15 >= i11) {
                i12 = 1;
                int i16 = i12 + i15;
                motionEvent.getPointerProperties(i16, pointerPropertiesArr[i15]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
                motionEvent.getPointerCoords(i16, pointerCoords);
                long a10 = a(a1.c.s(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = u0.c.b(a10);
                pointerCoords.y = u0.c.c(a10);
            }
            i12 = 0;
            int i162 = i12 + i15;
            motionEvent.getPointerProperties(i162, pointerPropertiesArr[i15]);
            MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i15];
            motionEvent.getPointerCoords(i162, pointerCoords2);
            long a102 = a(a1.c.s(pointerCoords2.x, pointerCoords2.y));
            pointerCoords2.x = u0.c.b(a102);
            pointerCoords2.y = u0.c.c(a102);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        v7.g.e(obtain, "event");
        g1.q a11 = this.f3598z.a(obtain, this);
        v7.g.c(a11);
        this.A.a(a11, this, true);
        obtain.recycle();
    }

    public final void L() {
        int[] iArr = this.P;
        getLocationOnScreen(iArr);
        long j2 = this.O;
        int i10 = (int) (j2 >> 32);
        int a10 = b2.g.a(j2);
        boolean z10 = false;
        int i11 = iArr[0];
        if (i10 != i11 || a10 != iArr[1]) {
            this.O = ma.i.g(i11, iArr[1]);
            if (i10 != Integer.MAX_VALUE && a10 != Integer.MAX_VALUE) {
                getRoot().K.f3452k.x0();
                z10 = true;
            }
        }
        this.M.a(z10);
    }

    @Override // g1.x
    public final long a(long j2) {
        G();
        long w10 = v0.p.w(this.Q, j2);
        return a1.c.s(u0.c.b(this.U) + u0.c.b(w10), u0.c.c(this.U) + u0.c.c(w10));
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        boolean z10;
        r0.a aVar;
        v7.g.f(sparseArray, "values");
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar = this.C) != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = sparseArray.get(keyAt);
                r0.e eVar = r0.e.f17042a;
                v7.g.e(autofillValue, "value");
                if (eVar.d(autofillValue)) {
                    String obj = eVar.i(autofillValue).toString();
                    r0.h hVar = aVar.f17040b;
                    hVar.getClass();
                    v7.g.f(obj, "value");
                    r0.g gVar = (r0.g) hVar.f17044a.get(Integer.valueOf(keyAt));
                } else if (!eVar.b(autofillValue)) {
                    if (!eVar.c(autofillValue)) {
                        if (eVar.e(autofillValue)) {
                            throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    } else {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                } else {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.q qVar) {
        setShowLayoutBounds(a.a());
    }

    @Override // l1.b0
    public final void c(LayoutNode layoutNode, boolean z10, boolean z11) {
        v7.g.f(layoutNode, "layoutNode");
        l1.s sVar = this.M;
        if (z10) {
            if (!sVar.l(layoutNode, z11)) {
                return;
            }
        } else if (!sVar.n(layoutNode, z11)) {
            return;
        }
        I(layoutNode);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f3588u.k(i10, this.f3565i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f3588u.k(i10, this.f3565i, true);
    }

    @Override // androidx.lifecycle.e
    public final void d(androidx.lifecycle.q qVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v7.g.f(canvas, "canvas");
        if (!isAttachedToWindow()) {
            z(getRoot());
        }
        int i10 = l1.a0.f15727a;
        E(true);
        this.f3596y = true;
        j0.c cVar = this.f3580q;
        v0.c cVar2 = (v0.c) cVar.f12625b;
        Canvas canvas2 = cVar2.f18085a;
        cVar2.getClass();
        cVar2.f18085a = canvas;
        getRoot().l((v0.c) cVar.f12625b);
        ((v0.c) cVar.f12625b).s(canvas2);
        ArrayList arrayList = this.f3592w;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((l1.z) arrayList.get(i11)).h();
            }
        }
        if (ViewLayer.A) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.f3596y = false;
        ArrayList arrayList2 = this.f3594x;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        float a10;
        float a11;
        v7.g.f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                float f10 = -motionEvent.getAxisValue(26);
                Context context = getContext();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    Method method = a3.q0.f209a;
                    a10 = q0.a.b(viewConfiguration);
                } else {
                    a10 = a3.q0.a(viewConfiguration, context);
                }
                float f11 = a10 * f10;
                Context context2 = getContext();
                if (i10 >= 26) {
                    a11 = q0.a.a(viewConfiguration);
                } else {
                    a11 = a3.q0.a(viewConfiguration, context2);
                }
                i1.a aVar = new i1.a(f11, a11 * f10, motionEvent.getEventTime());
                FocusModifier Y = m0.b.Y(this.f3573m.f3013a);
                if (Y != null) {
                    d1.a<i1.a> aVar2 = Y.f3021o;
                    if (aVar2 != null) {
                        if (aVar2.c(aVar)) {
                            return true;
                        }
                        if (aVar2.a(aVar)) {
                            return true;
                        }
                    }
                }
            } else if (!B(motionEvent) && isAttachedToWindow()) {
                if ((y(motionEvent) & 1) != 0) {
                    return true;
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        l1.h0 h0Var;
        int i10;
        boolean dispatchGenericMotionEvent;
        l1.h0 h0Var2;
        LayoutNode E;
        v7.g.f(motionEvent, "event");
        boolean z10 = this.f3589u0;
        androidx.appcompat.widget.j1 j1Var = this.f3587t0;
        if (z10) {
            removeCallbacks(j1Var);
            j1Var.run();
        }
        if (!B(motionEvent) && isAttachedToWindow()) {
            if (motionEvent.isFromSource(4098) && motionEvent.getToolType(0) == 1) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3588u;
                androidComposeViewAccessibilityDelegateCompat.getClass();
                if (!androidComposeViewAccessibilityDelegateCompat.s()) {
                    return false;
                }
                int action = motionEvent.getAction();
                AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f3611d;
                if (action != 7 && action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    if (androidComposeViewAccessibilityDelegateCompat.f3612e != Integer.MIN_VALUE) {
                        androidComposeViewAccessibilityDelegateCompat.J(Integer.MIN_VALUE);
                        return true;
                    }
                    dispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    return dispatchGenericMotionEvent;
                }
                float x3 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int i11 = l1.a0.f15727a;
                androidComposeView.E(true);
                l1.f fVar = new l1.f();
                LayoutNode root = androidComposeView.getRoot();
                long s10 = a1.c.s(x3, y10);
                LayoutNode.b bVar = LayoutNode.S;
                root.getClass();
                l1.v vVar = root.J;
                vVar.c.Y0(NodeCoordinator.L, vVar.c.Q0(s10), fVar, true, true);
                l1.h0 h0Var3 = (l1.h0) kotlin.collections.c.w2(fVar);
                if (h0Var3 != null && (E = v0.p.E(h0Var3)) != null) {
                    h0Var = v0.p.r(E);
                } else {
                    h0Var = null;
                }
                if (h0Var != null) {
                    LayoutNode E2 = v0.p.E(h0Var);
                    v7.g.f(E2, "layoutNode");
                    o1.j E3 = m0.b.E(h0Var);
                    if (!E3.f16207j || (h0Var2 = v0.p.q(E2)) == null) {
                        h0Var2 = h0Var;
                    }
                    NodeCoordinator D = v0.p.D(h0Var2, 8);
                    if (!E3.d(SemanticsProperties.f3956l) && !D.b1()) {
                        LayoutNode E4 = v0.p.E(h0Var);
                        if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(E4) == null) {
                            i10 = androidComposeViewAccessibilityDelegateCompat.y(E4.f3415j);
                            dispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                            androidComposeViewAccessibilityDelegateCompat.J(i10);
                            if (i10 == Integer.MIN_VALUE) {
                                return dispatchGenericMotionEvent;
                            }
                            return true;
                        }
                    }
                }
                i10 = Integer.MIN_VALUE;
                dispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                androidComposeViewAccessibilityDelegateCompat.J(i10);
                if (i10 == Integer.MIN_VALUE) {
                }
                return true;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && C(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3) {
                        MotionEvent motionEvent2 = this.f3577o0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f3577o0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f3589u0 = true;
                        post(j1Var);
                        return false;
                    } else if (motionEvent.getButtonState() != 0) {
                        return false;
                    }
                }
            } else if (!D(motionEvent)) {
                return false;
            }
            if ((y(motionEvent) & 1) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r2.c(r11) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return r2.a(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        FocusModifier X;
        LayoutNode layoutNode;
        v7.g.f(keyEvent, "event");
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.n.getClass();
            o1.f3864b.setValue(new g1.w(metaState));
            e1.c cVar = this.f3576o;
            cVar.getClass();
            FocusModifier focusModifier = cVar.f10602k;
            if (focusModifier != null && (X = m0.b.X(focusModifier)) != null) {
                NodeCoordinator nodeCoordinator = X.f3027u;
                e1.c cVar2 = null;
                if (nodeCoordinator != null && (layoutNode = nodeCoordinator.f3499o) != null) {
                    h0.e<e1.c> eVar = X.f3030x;
                    int i10 = eVar.f11334k;
                    if (i10 > 0) {
                        e1.c[] cVarArr = eVar.f11332i;
                        v7.g.d(cVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int i11 = 0;
                        do {
                            e1.c cVar3 = cVarArr[i11];
                            if (v7.g.a(cVar3.f10604m, layoutNode)) {
                                if (cVar2 != null) {
                                    LayoutNode layoutNode2 = cVar3.f10604m;
                                    e1.c cVar4 = cVar2;
                                    while (!v7.g.a(cVar4, cVar3)) {
                                        cVar4 = cVar4.f10603l;
                                        if (cVar4 != null) {
                                            if (!v7.g.a(cVar4.f10604m, layoutNode2)) {
                                            }
                                        }
                                    }
                                }
                                cVar2 = cVar3;
                                break;
                            }
                            i11++;
                        } while (i11 < i10);
                        if (cVar2 != null) {
                            cVar2 = X.f3029w;
                        }
                    } else if (cVar2 != null) {
                    }
                }
            }
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        v7.g.f(motionEvent, "motionEvent");
        if (this.f3589u0) {
            androidx.appcompat.widget.j1 j1Var = this.f3587t0;
            removeCallbacks(j1Var);
            MotionEvent motionEvent2 = this.f3577o0;
            v7.g.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                    z11 = false;
                    if (z11) {
                        this.f3589u0 = false;
                    }
                }
                z11 = true;
                if (z11) {
                }
            }
            j1Var.run();
        }
        if (!B(motionEvent) && isAttachedToWindow()) {
            if (motionEvent.getActionMasked() == 2 && !D(motionEvent)) {
                return false;
            }
            int y10 = y(motionEvent);
            if ((y10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((y10 & 1) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // l1.b0
    public final void e(LayoutNode layoutNode, boolean z10, boolean z11) {
        v7.g.f(layoutNode, "layoutNode");
        l1.s sVar = this.M;
        if (z10) {
            if (!sVar.k(layoutNode, z11)) {
                return;
            }
        } else if (!sVar.m(layoutNode, z11)) {
            return;
        }
        I(null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:10:0x0032). Please submit an issue!!! */
    public final View findViewByAccessibilityIdTraversal(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        }
        return x(this, i10);
    }

    @Override // l1.b0
    public final void g(BackwardsCompatNode.a aVar) {
        l1.s sVar = this.M;
        sVar.getClass();
        sVar.f15770e.b(aVar);
        I(null);
    }

    @Override // l1.b0
    public j getAccessibilityManager() {
        return this.F;
    }

    public final a0 getAndroidViewsHandler$ui_release() {
        if (this.I == null) {
            Context context = getContext();
            v7.g.e(context, "context");
            a0 a0Var = new a0(context);
            this.I = a0Var;
            addView(a0Var);
        }
        a0 a0Var2 = this.I;
        v7.g.c(a0Var2);
        return a0Var2;
    }

    @Override // l1.b0
    public r0.b getAutofill() {
        return this.C;
    }

    @Override // l1.b0
    public r0.h getAutofillTree() {
        return this.f3590v;
    }

    @Override // l1.b0
    public k getClipboardManager() {
        return this.E;
    }

    public final u7.l<Configuration, m7.n> getConfigurationChangeObserver() {
        return this.B;
    }

    @Override // l1.b0
    public b2.b getDensity() {
        return this.f3571l;
    }

    @Override // l1.b0
    public t0.d getFocusManager() {
        return this.f3573m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        m7.n nVar;
        v7.g.f(rect, "rect");
        FocusModifier Y = m0.b.Y(this.f3573m.f3013a);
        if (Y != null) {
            u0.d f02 = m0.b.f0(Y);
            rect.left = m0.b.g1(f02.f17726a);
            rect.top = m0.b.g1(f02.f17727b);
            rect.right = m0.b.g1(f02.c);
            rect.bottom = m0.b.g1(f02.f17728d);
            nVar = m7.n.f16010a;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // l1.b0
    public e.a getFontFamilyResolver() {
        return (e.a) this.f3564h0.getValue();
    }

    @Override // l1.b0
    public d.a getFontLoader() {
        return this.f3563g0;
    }

    @Override // l1.b0
    public b1.a getHapticFeedBack() {
        return this.f3570k0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.M.f15768b.f3550a.isEmpty();
    }

    @Override // l1.b0
    public c1.b getInputModeManager() {
        return this.f3572l0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.S;
    }

    @Override // android.view.View, android.view.ViewParent, l1.b0
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f3568j0.getValue();
    }

    public long getMeasureIteration() {
        l1.s sVar = this.M;
        if (sVar.c) {
            return sVar.f15771f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // l1.b0
    public ModifierLocalManager getModifierLocalManager() {
        return this.f3574m0;
    }

    @Override // l1.b0
    public g1.m getPointerIconService() {
        return this.f3599z0;
    }

    public LayoutNode getRoot() {
        return this.f3582r;
    }

    public l1.g0 getRootForTest() {
        return this.f3584s;
    }

    public o1.m getSemanticsOwner() {
        return this.f3586t;
    }

    @Override // l1.b0
    public l1.o getSharedDrawScope() {
        return this.f3569k;
    }

    @Override // l1.b0
    public boolean getShowLayoutBounds() {
        return this.H;
    }

    @Override // l1.b0
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.G;
    }

    @Override // l1.b0
    public v1.d getTextInputService() {
        return this.f3562f0;
    }

    @Override // l1.b0
    public c1 getTextToolbar() {
        return this.f3575n0;
    }

    public View getView() {
        return this;
    }

    @Override // l1.b0
    public j1 getViewConfiguration() {
        return this.N;
    }

    public final b getViewTreeOwners() {
        return (b) this.W.getValue();
    }

    @Override // l1.b0
    public n1 getWindowInfo() {
        return this.n;
    }

    @Override // androidx.lifecycle.e
    public final void h(androidx.lifecycle.q qVar) {
    }

    @Override // l1.b0
    public final long i(long j2) {
        G();
        return v0.p.w(this.Q, j2);
    }

    @Override // l1.b0
    public final void j() {
        if (this.D) {
            getSnapshotObserver().a();
            this.D = false;
        }
        a0 a0Var = this.I;
        if (a0Var != null) {
            u(a0Var);
        }
        while (true) {
            h0.e<u7.a<m7.n>> eVar = this.f3583r0;
            if (eVar.j()) {
                int i10 = eVar.f11334k;
                for (int i11 = 0; i11 < i10; i11++) {
                    u7.a<m7.n>[] aVarArr = eVar.f11332i;
                    u7.a<m7.n> aVar = aVarArr[i11];
                    aVarArr[i11] = null;
                    if (aVar != null) {
                        aVar.k0();
                    }
                }
                eVar.o(0, i10);
            } else {
                return;
            }
        }
    }

    @Override // l1.b0
    public final void k(LayoutNode layoutNode) {
        l1.s sVar = this.M;
        sVar.getClass();
        l1.y yVar = sVar.f15769d;
        yVar.getClass();
        yVar.f15791a.b(layoutNode);
        layoutNode.Q = true;
        I(null);
    }

    @Override // l1.b0
    public final void l() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3588u;
        androidComposeViewAccessibilityDelegateCompat.f3622p = true;
        if (androidComposeViewAccessibilityDelegateCompat.s() && !androidComposeViewAccessibilityDelegateCompat.f3628v) {
            androidComposeViewAccessibilityDelegateCompat.f3628v = true;
            androidComposeViewAccessibilityDelegateCompat.f3614g.post(androidComposeViewAccessibilityDelegateCompat.f3629w);
        }
    }

    @Override // androidx.lifecycle.e
    public final void m(androidx.lifecycle.q qVar) {
    }

    @Override // l1.b0
    public final l1.z n(u7.a aVar, u7.l lVar) {
        Object obj;
        j0 k1Var;
        v7.g.f(lVar, "drawBlock");
        v7.g.f(aVar, "invalidateParentLayer");
        g0.e1 e1Var = this.f3581q0;
        e1Var.b();
        while (true) {
            h0.e eVar = (h0.e) e1Var.f11042a;
            if (eVar.j()) {
                obj = ((Reference) eVar.n(eVar.f11334k - 1)).get();
                if (obj != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l1.z zVar = (l1.z) obj;
        if (zVar != null) {
            zVar.e(aVar, lVar);
            return zVar;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.V) {
            try {
                return new RenderNodeLayer(this, lVar, aVar);
            } catch (Throwable unused) {
                this.V = false;
            }
        }
        if (this.J == null) {
            if (!ViewLayer.f3767z) {
                ViewLayer.b.a(new View(getContext()));
            }
            if (ViewLayer.A) {
                Context context = getContext();
                v7.g.e(context, "context");
                k1Var = new j0(context);
            } else {
                Context context2 = getContext();
                v7.g.e(context2, "context");
                k1Var = new k1(context2);
            }
            this.J = k1Var;
            addView(k1Var);
        }
        j0 j0Var = this.J;
        v7.g.c(j0Var);
        return new ViewLayer(this, j0Var, lVar, aVar);
    }

    @Override // l1.b0
    public final void o(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "layoutNode");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3588u;
        androidComposeViewAccessibilityDelegateCompat.getClass();
        androidComposeViewAccessibilityDelegateCompat.f3622p = true;
        if (androidComposeViewAccessibilityDelegateCompat.s()) {
            androidComposeViewAccessibilityDelegateCompat.t(layoutNode);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r4 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
        r2 = r4.f3601a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        r2 = r2.i0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        r2.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        r0.i0().a(r6);
        r2 = new androidx.compose.ui.platform.AndroidComposeView.b(r0, r1);
        setViewTreeOwners(r2);
        r0 = r6.f3558a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        r0.U(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        r6.f3558a0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        throw new java.lang.IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z10;
        androidx.lifecycle.q qVar;
        r0.a aVar;
        super.onAttachedToWindow();
        A(getRoot());
        z(getRoot());
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f3537a;
        u7.p<Set<? extends Object>, p0.f, m7.n> pVar = snapshotStateObserver.f2960b;
        v7.g.f(pVar, "observer");
        SnapshotKt.f(SnapshotKt.f2938a);
        synchronized (SnapshotKt.c) {
            SnapshotKt.f2943g.add(pVar);
        }
        snapshotStateObserver.f2962e = new p0.e(pVar);
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar = this.C) != null) {
            r0.f.f17043a.a(aVar);
        }
        androidx.lifecycle.q a10 = ViewTreeLifecycleOwner.a(this);
        b4.d a11 = ViewTreeSavedStateRegistryOwner.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a10 == null || a11 == null || (a10 == (qVar = viewTreeOwners.f3601a) && a11 == qVar))) {
            z11 = false;
        }
        b viewTreeOwners2 = getViewTreeOwners();
        v7.g.c(viewTreeOwners2);
        viewTreeOwners2.f3601a.i0().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f3559b0);
        getViewTreeObserver().addOnScrollChangedListener(this.c0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f3560d0);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        this.f3561e0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        v7.g.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        v7.g.e(context, "context");
        this.f3571l = ma.i.c(context);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 >= 31) {
            i10 = configuration.fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        if (i10 != this.f3566i0) {
            if (i11 >= 31) {
                i12 = configuration.fontWeightAdjustment;
            }
            this.f3566i0 = i12;
            Context context2 = getContext();
            v7.g.e(context2, "context");
            setFontFamilyResolver(m0.b.R(context2));
        }
        this.B.U(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        v7.g.f(editorInfo, "outAttrs");
        this.f3561e0.getClass();
        return null;
    }

    @Override // androidx.lifecycle.e
    public final void onDestroy(androidx.lifecycle.q qVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z10;
        r0.a aVar;
        androidx.lifecycle.q qVar;
        androidx.lifecycle.r i02;
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f3537a;
        p0.e eVar = snapshotStateObserver.f2962e;
        if (eVar != null) {
            eVar.a();
        }
        synchronized (snapshotStateObserver.f2961d) {
            h0.e<SnapshotStateObserver.ObservedScopeMap> eVar2 = snapshotStateObserver.f2961d;
            int i10 = eVar2.f11334k;
            z10 = false;
            if (i10 > 0) {
                SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = eVar2.f11332i;
                v7.g.d(observedScopeMapArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = observedScopeMapArr[i11];
                    observedScopeMap.f2968e.b();
                    h0.b<Object, h0.a> bVar = observedScopeMap.f2969f;
                    bVar.c = 0;
                    n7.i.h2(bVar.f11323a, null);
                    n7.i.h2(bVar.f11324b, null);
                    observedScopeMap.f2974k.b();
                    observedScopeMap.f2975l.clear();
                    i11++;
                } while (i11 < i10);
                m7.n nVar = m7.n.f16010a;
            } else {
                m7.n nVar2 = m7.n.f16010a;
            }
        }
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (qVar = viewTreeOwners.f3601a) != null && (i02 = qVar.i0()) != null) {
            i02.c(this);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = true;
        }
        if (z10 && (aVar = this.C) != null) {
            r0.f.f17043a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f3559b0);
        getViewTreeObserver().removeOnScrollChangedListener(this.c0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f3560d0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        v7.g.f(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        FocusManagerImpl focusManagerImpl = this.f3573m;
        if (z10) {
            FocusModifier focusModifier = focusManagerImpl.f3013a;
            if (focusModifier.f3019l == FocusStateImpl.Inactive) {
                focusModifier.c(FocusStateImpl.Active);
                return;
            }
            return;
        }
        FocusTransactionsKt.b(focusManagerImpl.f3013a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.M.f(this.f3591v0);
        this.K = null;
        L();
        if (this.I != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        l1.s sVar = this.M;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                A(getRoot());
            }
            Pair w10 = w(i10);
            int intValue = ((Number) w10.f12962i).intValue();
            int intValue2 = ((Number) w10.f12963j).intValue();
            Pair w11 = w(i11);
            long b5 = v8.b.b(intValue, intValue2, ((Number) w11.f12962i).intValue(), ((Number) w11.f12963j).intValue());
            b2.a aVar = this.K;
            if (aVar == null) {
                this.K = new b2.a(b5);
                this.L = false;
            } else if (!b2.a.b(aVar.f6336a, b5)) {
                this.L = true;
            }
            sVar.o(b5);
            sVar.g();
            setMeasuredDimension(getRoot().K.f3452k.f12640i, getRoot().K.f3452k.f12641j);
            if (this.I != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().K.f3452k.f12640i, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().K.f3452k.f12641j, 1073741824));
            }
            m7.n nVar = m7.n.f16010a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        boolean z10;
        r0.a aVar;
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && viewStructure != null && (aVar = this.C) != null) {
            r0.c cVar = r0.c.f17041a;
            r0.h hVar = aVar.f17040b;
            int a10 = cVar.a(viewStructure, hVar.f17044a.size());
            for (Map.Entry entry : hVar.f17044a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                r0.g gVar = (r0.g) entry.getValue();
                ViewStructure b5 = cVar.b(viewStructure, a10);
                if (b5 == null) {
                    a10++;
                } else {
                    r0.e eVar = r0.e.f17042a;
                    AutofillId a11 = eVar.a(viewStructure);
                    v7.g.c(a11);
                    eVar.g(b5, a11, intValue);
                    cVar.d(b5, intValue, aVar.f17039a.getContext().getPackageName(), null, null);
                    eVar.h(b5, 1);
                    gVar.getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f3567j) {
            u7.l<? super v1.c, ? extends v1.d> lVar = AndroidComposeView_androidKt.f3653a;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            if (i10 != 0 && i10 == 1) {
                layoutDirection = LayoutDirection.Rtl;
            }
            setLayoutDirection(layoutDirection);
            FocusManagerImpl focusManagerImpl = this.f3573m;
            focusManagerImpl.getClass();
            focusManagerImpl.c = layoutDirection;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean a10;
        this.n.f3865a.setValue(Boolean.valueOf(z10));
        this.f3595x0 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (a10 = a.a())) {
            setShowLayoutBounds(a10);
            z(getRoot());
        }
    }

    @Override // l1.b0
    public final void p(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "layoutNode");
        this.M.d(layoutNode);
    }

    @Override // g1.x
    public final long q(long j2) {
        G();
        return v0.p.w(this.R, a1.c.s(u0.c.b(j2) - u0.c.b(this.U), u0.c.c(j2) - u0.c.c(this.U)));
    }

    @Override // l1.b0
    public final void r(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "node");
        l1.s sVar = this.M;
        sVar.getClass();
        sVar.f15768b.b(layoutNode);
        this.D = true;
    }

    @Override // l1.b0
    public final void s(u7.a<m7.n> aVar) {
        h0.e<u7.a<m7.n>> eVar = this.f3583r0;
        if (eVar.h(aVar)) {
            return;
        }
        eVar.b(aVar);
    }

    public final void setConfigurationChangeObserver(u7.l<? super Configuration, m7.n> lVar) {
        v7.g.f(lVar, "<set-?>");
        this.B = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.S = j2;
    }

    public final void setOnViewTreeOwnersAvailable(u7.l<? super b, m7.n> lVar) {
        v7.g.f(lVar, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.U(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f3558a0 = lVar;
    }

    @Override // l1.b0
    public void setShowLayoutBounds(boolean z10) {
        this.H = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // l1.b0
    public final void t(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "node");
    }

    @Override // androidx.lifecycle.e
    public final void v(androidx.lifecycle.q qVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0113, blocks: (B:3:0x0008, B:55:0x00fc, B:57:0x0105, B:4:0x004e, B:6:0x0057, B:11:0x0062, B:13:0x006c, B:21:0x007f, B:33:0x0097, B:35:0x009d, B:36:0x00b3, B:39:0x00bd, B:24:0x0086, B:40:0x00c9, B:49:0x00db, B:51:0x00e1, B:53:0x00ef, B:54:0x00f2), top: B:65:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0113, blocks: (B:3:0x0008, B:55:0x00fc, B:57:0x0105, B:4:0x004e, B:6:0x0057, B:11:0x0062, B:13:0x006c, B:21:0x007f, B:33:0x0097, B:35:0x009d, B:36:0x00b3, B:39:0x00bd, B:24:0x0086, B:40:0x00c9, B:49:0x00db, B:51:0x00e1, B:53:0x00ef, B:54:0x00f2), top: B:65:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0113, blocks: (B:3:0x0008, B:55:0x00fc, B:57:0x0105, B:4:0x004e, B:6:0x0057, B:11:0x0062, B:13:0x006c, B:21:0x007f, B:33:0x0097, B:35:0x009d, B:36:0x00b3, B:39:0x00bd, B:24:0x0086, B:40:0x00c9, B:49:0x00db, B:51:0x00e1, B:53:0x00ef, B:54:0x00f2), top: B:65:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int y(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked;
        boolean z12;
        float[] fArr = this.Q;
        removeCallbacks(this.f3585s0);
        try {
            this.S = AnimationUtils.currentAnimationTimeMillis();
            this.f3593w0.a(this, fArr);
            v0.p.t(fArr, this.R);
            long w10 = v0.p.w(fArr, a1.c.s(motionEvent.getX(), motionEvent.getY()));
            this.U = a1.c.s(motionEvent.getRawX() - u0.c.b(w10), motionEvent.getRawY() - u0.c.c(w10));
            boolean z13 = true;
            this.T = true;
            E(false);
            this.f3597y0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked2 = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f3577o0;
            if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (motionEvent2 != null) {
                if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                    z11 = false;
                    if (z11) {
                        if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                            z12 = false;
                            if (!z12) {
                                g1.s sVar = this.A;
                                if (!sVar.f11190e) {
                                    sVar.c.f11173a.clear();
                                    g1.j jVar = (g1.j) sVar.f11188b.f11043b;
                                    jVar.c();
                                    jVar.f11158a.g();
                                }
                            } else if (motionEvent2.getActionMasked() != 10 && z10) {
                                K(motionEvent2, 10, motionEvent2.getEventTime(), true);
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                    }
                }
                z11 = true;
                if (z11) {
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z13 = false;
            }
            if (!z10 && z13 && actionMasked2 != 3 && actionMasked2 != 9 && C(motionEvent)) {
                K(motionEvent, 9, motionEvent.getEventTime(), true);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f3577o0 = MotionEvent.obtainNoHistory(motionEvent);
            int J = J(motionEvent);
            Trace.endSection();
            if (Build.VERSION.SDK_INT >= 24) {
                r.f3879a.a(this, this.f3597y0);
            }
            return J;
        } finally {
            this.T = false;
        }
    }
}
