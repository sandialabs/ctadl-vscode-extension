package com.noto.app.util;

import a1.b;
import a3.b1;
import a3.c1;
import a3.d1;
import a3.j0;
import a3.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.i;
import androidx.navigation.o;
import androidx.navigation.u;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.g;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.filtered.FilteredItemModel;
import f7.q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.c;
import m7.n;
import p2.f;
import t6.d;
import u7.l;
import v2.e;
import v2.h;
import v2.k;
import v7.g;

/* loaded from: classes.dex */
public final class ViewUtilsKt {
    public static final CallbackFlowBuilder a(CustomEditText customEditText) {
        return b.p(new ViewUtilsKt$cursorPositionAsFlow$1(customEditText, null));
    }

    public static final CallbackFlowBuilder b(NavController navController) {
        return b.p(new ViewUtilsKt$destinationAsFlow$1(navController, null));
    }

    public static final void c(final View view) {
        g.f(view, "<this>");
        view.animate().setDuration(250L).alpha(0.5f).withEndAction(new Runnable() { // from class: f7.r
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                v7.g.f(view2, "$this_disable");
                view2.setEnabled(false);
            }
        });
    }

    public static final void d(View view) {
        view.animate().setDuration(250L).alpha(1.0f).withEndAction(new c1(view, 2));
    }

    public static final int e(CustomEditText customEditText, int i10) {
        Layout layout = customEditText.getLayout();
        int lineForVertical = layout != null ? layout.getLineForVertical(i10) : 0;
        Layout layout2 = customEditText.getLayout();
        String substring = customEditText.getText().toString().substring(layout2 != null ? layout2.getLineStart(lineForVertical) : 0);
        g.e(substring, "this as java.lang.String).substring(startIndex)");
        return kotlin.text.b.e1(customEditText.getText().toString(), substring, 0, false, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        r1 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @SuppressLint({"RestrictedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long f(NavController navController) {
        boolean z10;
        Bundle bundle;
        Long l2;
        Object obj;
        FilteredItemModel filteredItemModel;
        ArrayDeque arrayDeque = navController.f5440h;
        g.e(arrayDeque, "backStack");
        Iterator it = arrayDeque.iterator();
        Object obj2 = null;
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i10 = ((i) next).f5479j.f5511k;
            if (i10 != R.id.folderFragment && i10 != R.id.filteredFragment) {
                z10 = false;
            }
        }
        i iVar = (i) obj2;
        if (iVar != null) {
            bundle = iVar.f5480k;
        } else {
            bundle = null;
        }
        if (bundle != null) {
            l2 = Long.valueOf(bundle.getLong("folder_id"));
            if (l2.longValue() != 0) {
                z10 = false;
            }
            if (!z10) {
                if (bundle == null) {
                    obj = bundle.get("model");
                } else {
                    obj = null;
                }
                if (!(obj instanceof FilteredItemModel)) {
                    filteredItemModel = (FilteredItemModel) obj;
                } else {
                    filteredItemModel = null;
                }
                if (l2 != null) {
                    if (filteredItemModel == null) {
                        return null;
                    }
                    return Long.valueOf(filteredItemModel.f8286i);
                }
                return l2;
            }
        }
        l2 = null;
        if (bundle == null) {
        }
        if (!(obj instanceof FilteredItemModel)) {
        }
        if (l2 != null) {
        }
    }

    public static final NavController g(Fragment fragment) {
        g.f(fragment, "<this>");
        if (fragment.s()) {
            NavController Z = NavHostFragment.Z(fragment);
            g.b(Z, "NavHostFragment.findNavController(this)");
            return Z;
        }
        return null;
    }

    public static final void h(s sVar, View view) {
        d1.e aVar;
        d1.e eVar;
        Window window = sVar.getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new d1.d(window);
        } else {
            if (i10 >= 26) {
                aVar = new d1.c(window, view);
            } else if (i10 >= 23) {
                aVar = new d1.b(window, view);
            } else {
                aVar = new d1.a(window, view);
            }
            eVar = aVar;
        }
        eVar.a(8);
    }

    public static final boolean i() {
        Configuration configuration;
        h a10;
        Locale locale = Locale.getDefault();
        Resources system = Resources.getSystem();
        String str = null;
        if (system != null) {
            configuration = system.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            a10 = new h(new k(e.a(configuration)));
        } else {
            a10 = h.a(configuration.locale);
        }
        Locale c = a10.c(0);
        if (c != null) {
            str = c.getLanguage();
        }
        if ((!g.a(str, "ar") || !g.a(locale.getLanguage(), "ar")) && !g.a(locale.getLanguage(), "ar")) {
            return false;
        }
        return true;
    }

    public static final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 j(CustomEditText customEditText) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new ViewUtilsKt$isFocusedAsFlow$2(customEditText, null), b.p(new ViewUtilsKt$isFocusedAsFlow$1(customEditText, null)));
    }

    public static final CallbackFlowBuilder k(NestedScrollView nestedScrollView) {
        return b.p(new ViewUtilsKt$isScrollingAsFlow$2(nestedScrollView, null));
    }

    public static final CallbackFlowBuilder l(EpoxyRecyclerView epoxyRecyclerView) {
        return b.p(new ViewUtilsKt$isScrollingAsFlow$1(epoxyRecyclerView, null));
    }

    public static final kotlinx.coroutines.flow.b m(final CoordinatorLayout coordinatorLayout) {
        final CallbackFlowBuilder p10 = b.p(new ViewUtilsKt$onPreDrawFlow$1(coordinatorLayout, null));
        return b.K(new kotlinx.coroutines.flow.b<Boolean>() { // from class: com.noto.app.util.ViewUtilsKt$keyboardVisibilityAsFlow$$inlined$map$1

            /* renamed from: com.noto.app.util.ViewUtilsKt$keyboardVisibilityAsFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f9869i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ View f9870j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.util.ViewUtilsKt$keyboardVisibilityAsFlow$$inlined$map$1$2", f = "ViewUtils.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.util.ViewUtilsKt$keyboardVisibilityAsFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f9871l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f9872m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f9871l = obj;
                        this.f9872m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, View view) {
                    this.f9869i = cVar;
                    this.f9870j = view;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f9872m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f9872m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f9871l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f9872m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                n nVar = (n) obj;
                                View view = this.f9870j;
                                g.f(view, "<this>");
                                b1 h10 = j0.h(view);
                                if (h10 != null) {
                                    z10 = h10.f140a.p(8);
                                } else {
                                    z10 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f9872m = 1;
                                if (this.f9869i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f9871l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f9872m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = p10.a(new AnonymousClass2(cVar, coordinatorLayout), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        });
    }

    public static final void n(Fragment fragment, List<d> list) {
        String obj = kotlin.text.b.w1(kotlin.collections.c.t2(list, "\n\n", null, null, ViewUtilsKt$launchShareNotesIntent$notesText$1.f9895j, 30)).toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", obj);
        Context j2 = fragment.j();
        fragment.Y(Intent.createChooser(intent, j2 != null ? q.e(j2, R.plurals.share_note, list.size(), Integer.valueOf(list.size())) : null));
    }

    public static final void o(NavController navController, o oVar, l<? super u, n> lVar) {
        androidx.navigation.d dVar;
        g.f(navController, "<this>");
        androidx.navigation.n e10 = navController.e();
        if (e10 != null) {
            dVar = e10.g(oVar.b());
        } else {
            dVar = null;
        }
        if (dVar != null) {
            if (lVar == null) {
                navController.h(oVar.b(), oVar.a(), null);
                return;
            }
            navController.h(oVar.b(), oVar.a(), ma.i.E(lVar));
        }
    }

    public static final CallbackFlowBuilder p(ViewGroup viewGroup) {
        return b.p(new ViewUtilsKt$scrollPositionAsFlow$1(viewGroup, null));
    }

    public static final void q(View view) {
        if (view.getLayoutParams() != null && (view.getLayoutParams() instanceof StaggeredGridLayoutManager.c)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            g.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            ((StaggeredGridLayoutManager.c) layoutParams).n = true;
        }
    }

    public static final void r(TextView textView, Font font) {
        Typeface typeface;
        int ordinal = font.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                typeface = Typeface.MONOSPACE;
            } else {
                return;
            }
        } else {
            Context context = textView.getContext();
            g.e(context, "context");
            try {
                typeface = f.b(context, R.font.nunito_medium);
            } catch (Throwable unused) {
                typeface = null;
            }
            if (typeface == null) {
                return;
            }
        }
        textView.setTypeface(typeface);
    }

    public static final void s(Drawable drawable, ColorStateList colorStateList) {
        Drawable mutate = drawable.mutate();
        g.d(mutate, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) mutate).setColor(colorStateList.withAlpha(32));
    }

    public static final void t(TextView textView, Font font) {
        Typeface typeface;
        g.f(font, "font");
        int ordinal = font.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                textView.setTypeface(Typeface.MONOSPACE, 1);
                return;
            }
            return;
        }
        Context context = textView.getContext();
        g.e(context, "context");
        try {
            typeface = f.b(context, R.font.nunito_semibold);
        } catch (Throwable unused) {
            typeface = null;
        }
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    public static void u(MaterialSwitch materialSwitch) {
        Context context = materialSwitch.getContext();
        g.e(context, "context");
        int a10 = q.a(context, R.attr.notoBackgroundColor);
        Context context2 = materialSwitch.getContext();
        g.e(context2, "context");
        int a11 = q.a(context2, R.attr.notoSecondaryColor);
        Context context3 = materialSwitch.getContext();
        g.e(context3, "context");
        int a12 = q.a(context3, R.attr.notoPrimaryColor);
        Context context4 = materialSwitch.getContext();
        g.e(context4, "context");
        int[][] iArr = {new int[]{16842912}, new int[]{-16842912}};
        materialSwitch.setThumbTintList(new ColorStateList(iArr, new int[]{a10, a11}));
        materialSwitch.setTrackTintList(new ColorStateList(iArr, new int[]{a12, q.a(context4, R.attr.notoSurfaceColor)}));
    }

    public static final void v(s sVar, View view) {
        d1.e aVar;
        d1.e eVar;
        Window window = sVar.getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new d1.d(window);
        } else {
            if (i10 >= 26) {
                aVar = new d1.c(window, view);
            } else if (i10 >= 23) {
                aVar = new d1.b(window, view);
            } else {
                aVar = new d1.a(window, view);
            }
            eVar = aVar;
        }
        eVar.f(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x016e, code lost:
        if (r11 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b2 A[Catch: all -> 0x01e6, TryCatch #0 {, blocks: (B:86:0x0186, B:88:0x018c, B:113:0x01e4, B:89:0x019b, B:92:0x01a1, B:100:0x01b2, B:102:0x01be, B:104:0x01c2, B:107:0x01ca, B:109:0x01d0, B:111:0x01de, B:112:0x01e2, B:101:0x01b7), top: B:120:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7 A[Catch: all -> 0x01e6, TryCatch #0 {, blocks: (B:86:0x0186, B:88:0x018c, B:113:0x01e4, B:89:0x019b, B:92:0x01a1, B:100:0x01b2, B:102:0x01be, B:104:0x01c2, B:107:0x01ca, B:109:0x01d0, B:111:0x01de, B:112:0x01e2, B:101:0x01b7), top: B:120:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d0 A[Catch: all -> 0x01e6, TryCatch #0 {, blocks: (B:86:0x0186, B:88:0x018c, B:113:0x01e4, B:89:0x019b, B:92:0x01a1, B:100:0x01b2, B:102:0x01be, B:104:0x01c2, B:107:0x01ca, B:109:0x01d0, B:111:0x01de, B:112:0x01e2, B:101:0x01b7), top: B:120:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w(View view, String str, Integer num, Integer num2, NotoColor notoColor, int i10) {
        boolean z10;
        ViewGroup viewGroup;
        boolean z11;
        int i11;
        int a10;
        Drawable mutate;
        com.google.android.material.snackbar.g b5;
        g.c cVar;
        g.c cVar2;
        boolean z12;
        Drawable[] compoundDrawablesRelative;
        Drawable drawable;
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            notoColor = null;
        }
        boolean z13 = true;
        if ((i10 & 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v7.g.f(view, "<this>");
        int[] iArr = Snackbar.C;
        View view2 = view;
        ViewGroup viewGroup2 = null;
        while (!(view2 instanceof CoordinatorLayout)) {
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    break;
                }
                viewGroup2 = (ViewGroup) view2;
            }
            ViewParent parent = view2.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
                continue;
            } else {
                view2 = null;
                continue;
            }
            if (view2 == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) view2;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.C);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1 && resourceId2 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i11 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i11, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f7302i.getChildAt(0)).getMessageView().setText(str);
            snackbar.f7304k = -1;
            snackbar.f7302i.setAnimationMode(0);
            TextView textView = (TextView) snackbar.f7302i.findViewById(R.id.snackbar_text);
            if (num2 != null) {
                int intValue = num2.intValue();
                View findViewById = viewGroup.findViewById(intValue);
                if (findViewById != null) {
                    BaseTransientBottomBar.d dVar = snackbar.f7305l;
                    if (dVar != null) {
                        dVar.a();
                    }
                    BaseTransientBottomBar.d dVar2 = new BaseTransientBottomBar.d(snackbar, findViewById);
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    if (j0.g.b(findViewById)) {
                        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(dVar2);
                    }
                    findViewById.addOnAttachStateChangeListener(dVar2);
                    snackbar.f7305l = dVar2;
                } else {
                    throw new IllegalArgumentException(androidx.activity.e.g("Unable to find anchor view with id: ", intValue));
                }
            }
            if (num != null) {
                if (textView != null) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(num.intValue(), 0, 0, 0);
                }
                if (textView != null) {
                    textView.setCompoundDrawablePadding((int) context.getResources().getDimension(R.dimen.spacing_normal));
                }
                if (textView != null) {
                    textView.setGravity(17);
                }
            }
            if (notoColor != null) {
                int b10 = q.b(context, q.j(notoColor));
                a10 = q.a(context, R.attr.notoBackgroundColor);
                snackbar.f7302i.setBackgroundTintList(ColorStateList.valueOf(b10));
                ((SnackbarContentLayout) snackbar.f7302i.getChildAt(0)).getMessageView().setTextColor(a10);
                if (textView != null && (compoundDrawablesRelative = textView.getCompoundDrawablesRelative()) != null && (drawable = compoundDrawablesRelative[0]) != null && (mutate = drawable.mutate()) != null) {
                    mutate.setTint(a10);
                }
                if (z10) {
                    view.performHapticFeedback(1, 2);
                }
                b5 = com.google.android.material.snackbar.g.b();
                int h10 = snackbar.h();
                BaseTransientBottomBar.c cVar3 = snackbar.f7313u;
                synchronized (b5.f7342a) {
                    if (b5.c(cVar3)) {
                        g.c cVar4 = b5.c;
                        cVar4.f7347b = h10;
                        b5.f7343b.removeCallbacksAndMessages(cVar4);
                        b5.f(b5.c);
                    } else {
                        g.c cVar5 = b5.f7344d;
                        if (cVar5 != null) {
                            if (cVar3 != null && cVar5.f7346a.get() == cVar3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (!z13) {
                                    b5.f7344d.f7347b = h10;
                                } else {
                                    b5.f7344d = new g.c(h10, cVar3);
                                }
                                cVar = b5.c;
                                if (cVar != null || !b5.a(cVar, 4)) {
                                    b5.c = null;
                                    cVar2 = b5.f7344d;
                                    if (cVar2 != null) {
                                        b5.c = cVar2;
                                        b5.f7344d = null;
                                        g.b bVar = cVar2.f7346a.get();
                                        if (bVar != null) {
                                            bVar.a();
                                        } else {
                                            b5.c = null;
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (!z13) {
                        }
                        cVar = b5.c;
                        if (cVar != null) {
                        }
                        b5.c = null;
                        cVar2 = b5.f7344d;
                        if (cVar2 != null) {
                        }
                    }
                }
                return;
            }
            int a11 = q.a(context, R.attr.notoPrimaryColor);
            a10 = q.a(context, R.attr.notoBackgroundColor);
            snackbar.f7302i.setBackgroundTintList(ColorStateList.valueOf(a11));
            ((SnackbarContentLayout) snackbar.f7302i.getChildAt(0)).getMessageView().setTextColor(a10);
            if (textView != null) {
                Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2 != null) {
                    Drawable drawable2 = compoundDrawablesRelative2[0];
                    if (drawable2 != null) {
                        mutate = drawable2.mutate();
                    }
                }
            }
            if (z10) {
            }
            b5 = com.google.android.material.snackbar.g.b();
            int h102 = snackbar.h();
            BaseTransientBottomBar.c cVar32 = snackbar.f7313u;
            synchronized (b5.f7342a) {
            }
        } else {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
    }

    public static final CallbackFlowBuilder x(EditText editText, boolean z10) {
        return b.p(new ViewUtilsKt$textAsFlow$1(z10, editText, null));
    }

    public static final CallbackFlowBuilder y(CustomEditText customEditText) {
        return b.p(new ViewUtilsKt$textSelectionAsFlow$1(customEditText, null));
    }
}
