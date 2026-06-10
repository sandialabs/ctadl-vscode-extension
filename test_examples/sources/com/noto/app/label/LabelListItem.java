package com.noto.app.label;

import android.annotation.SuppressLint;
import android.view.View;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.p;
import com.airbnb.epoxy.z;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import f7.e;
import java.util.List;
import m7.n;
import t6.c;
import u7.l;
import v7.g;
import y6.h;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class LabelListItem extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public List<h> f8743k;

    /* renamed from: l  reason: collision with root package name */
    public NotoColor f8744l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f8745m;
    public l<? super c, n> n;

    /* renamed from: o  reason: collision with root package name */
    public l<? super c, Boolean> f8746o;

    /* renamed from: p  reason: collision with root package name */
    public View.OnClickListener f8747p;

    /* loaded from: classes.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public s6.b f8748a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            g.f(view, "itemView");
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view;
            this.f8748a = new s6.b(epoxyRecyclerView, epoxyRecyclerView, 1);
        }
    }

    @Override // com.airbnb.epoxy.z
    public final void A(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "holder");
        s6.b bVar = aVar2.f8748a;
        if (bVar != null) {
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) bVar.f17293a;
            g.e(epoxyRecyclerView, "holder.binding.root");
            ViewUtilsKt.q(epoxyRecyclerView);
            return;
        }
        g.l("binding");
        throw null;
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        g.f(aVar, "holder");
        s6.b bVar = aVar.f8748a;
        if (bVar != null) {
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) bVar.f17294b;
            epoxyRecyclerView.setEdgeEffectFactory(new e());
            epoxyRecyclerView.p0(new LabelListItem$bind$1$1(this));
            return;
        }
        g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f8744l;
        if (notoColor != null) {
            return notoColor;
        }
        g.l("color");
        throw null;
    }

    public final List<h> F() {
        List<h> list = this.f8743k;
        if (list != null) {
            return list;
        }
        g.l("labels");
        throw null;
    }

    public final View.OnClickListener G() {
        View.OnClickListener onClickListener = this.f8745m;
        if (onClickListener != null) {
            return onClickListener;
        }
        g.l("onAllLabelClickListener");
        throw null;
    }

    public final View.OnClickListener H() {
        View.OnClickListener onClickListener = this.f8747p;
        if (onClickListener != null) {
            return onClickListener;
        }
        g.l("onNewLabelClickListener");
        throw null;
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void q(Object obj) {
        a aVar = (a) obj;
        g.f(aVar, "holder");
        s6.b bVar = aVar.f8748a;
        if (bVar != null) {
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) bVar.f17293a;
            g.e(epoxyRecyclerView, "holder.binding.root");
            ViewUtilsKt.q(epoxyRecyclerView);
            return;
        }
        g.l("binding");
        throw null;
    }
}
