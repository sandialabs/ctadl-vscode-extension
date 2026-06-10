package com.noto.app.main;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.navigation.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.m;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import com.robinhood.ticker.TickerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import m7.e;
import s6.x;
import v7.g;
import v7.i;
import z6.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/MainFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainFragment extends o6.b {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8843u0;

    /* renamed from: v0  reason: collision with root package name */
    public final f f8844v0;

    /* renamed from: w0  reason: collision with root package name */
    public m f8845w0;

    /* renamed from: x0  reason: collision with root package name */
    public n f8846x0;

    /* renamed from: y0  reason: collision with root package name */
    public final e f8847y0;

    /* renamed from: z0  reason: collision with root package name */
    public final e f8848z0;

    public MainFragment() {
        super(true);
        this.f8843u0 = kotlin.a.a(LazyThreadSafetyMode.NONE, new MainFragment$special$$inlined$sharedViewModel$default$1(this));
        this.f8844v0 = new f(i.a(z6.m.class), new MainFragment$special$$inlined$navArgs$1(this));
        this.f8847y0 = kotlin.a.b(new MainFragment$selectedDestinationId$2(this));
        this.f8848z0 = kotlin.a.b(new MainFragment$popUpToDestinationId$2(this));
    }

    public static final int g0(MainFragment mainFragment) {
        return ((Number) mainFragment.f8848z0.getValue()).intValue();
    }

    @Override // o6.b, com.google.android.material.bottomsheet.c, d.s, androidx.fragment.app.m
    public final Dialog c0() {
        return new j(this, S());
    }

    public final MainViewModel h0() {
        return (MainViewModel) this.f8843u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TickerView tickerView;
        Typeface typeface;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.main_fragment, viewGroup, false);
        int i10 = R.id.fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) a1.b.O(inflate, R.id.fab);
        if (floatingActionButton != null) {
            i10 = R.id.ib_more;
            ImageButton imageButton = (ImageButton) a1.b.O(inflate, R.id.ib_more);
            if (imageButton != null) {
                i10 = R.id.ib_settings;
                ImageButton imageButton2 = (ImageButton) a1.b.O(inflate, R.id.ib_settings);
                if (imageButton2 != null) {
                    i10 = R.id.ib_sorting;
                    ImageButton imageButton3 = (ImageButton) a1.b.O(inflate, R.id.ib_sorting);
                    if (imageButton3 != null) {
                        i10 = R.id.rv;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                        if (epoxyRecyclerView != null) {
                            i10 = R.id.tb;
                            LinearLayout linearLayout = (LinearLayout) a1.b.O(inflate, R.id.tb);
                            if (linearLayout != null) {
                                i10 = R.id.tv_dialog_title;
                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_dialog_title)) != null) {
                                    i10 = R.id.tv_folders_count;
                                    TickerView tickerView2 = (TickerView) a1.b.O(inflate, R.id.tv_folders_count);
                                    if (tickerView2 != null) {
                                        i10 = R.id.tv_folders_count_rtl;
                                        MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_folders_count_rtl);
                                        if (materialTextView != null) {
                                            x xVar = new x((LinearLayout) inflate, floatingActionButton, imageButton, imageButton2, imageButton3, epoxyRecyclerView, linearLayout, tickerView2, materialTextView);
                                            f7.c.f(this);
                                            floatingActionButton.setOnClickListener(new b(this, 2));
                                            imageButton.setOnClickListener(new h6.b(6, this));
                                            imageButton2.setOnClickListener(new a(this, 2));
                                            imageButton3.setOnClickListener(new b(this, 3));
                                            epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                            j();
                                            epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                                            Context j2 = j();
                                            if (j2 != null) {
                                                try {
                                                    typeface = p2.f.b(j2, R.font.nunito_semibold);
                                                } catch (Throwable unused) {
                                                    typeface = null;
                                                }
                                                tickerView = tickerView2;
                                            } else {
                                                tickerView = tickerView2;
                                                typeface = null;
                                            }
                                            tickerView.setTypeface(typeface);
                                            tickerView.setAnimationInterpolator(new AccelerateInterpolator());
                                            kotlinx.coroutines.flow.f.b(new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new kotlinx.coroutines.flow.b[]{h0().f8910i, h0().f8908g, h0().f8909h, h0().n, h0().f8915o}, new MainFragment$setupState$1(this, xVar, null)), ma.i.z(this));
                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MainFragment$setupState$2(xVar, null), h0().f8908g), ma.i.z(this));
                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MainFragment$setupState$3(xVar, null), ViewUtilsKt.l(epoxyRecyclerView)), ma.i.z(this));
                                            if (ViewUtilsKt.i()) {
                                                tickerView.setVisibility(8);
                                                materialTextView.setVisibility(0);
                                            } else {
                                                tickerView.setVisibility(0);
                                                materialTextView.setVisibility(8);
                                            }
                                            LinearLayout linearLayout2 = xVar.f17481a;
                                            g.e(linearLayout2, "root");
                                            return linearLayout2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
