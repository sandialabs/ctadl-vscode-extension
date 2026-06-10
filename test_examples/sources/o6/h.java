package o6;

import android.annotation.SuppressLint;
import android.view.View;
import com.airbnb.epoxy.p;
import com.airbnb.epoxy.z;
import com.google.android.material.textview.MaterialTextView;
import com.noto.app.util.ViewUtilsKt;
import s6.s;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class h extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public String f16371k;

    /* loaded from: classes.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public s f16372a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            MaterialTextView materialTextView = (MaterialTextView) view;
            this.f16372a = new s(materialTextView, materialTextView, 1);
        }
    }

    @Override // com.airbnb.epoxy.z
    public final void A(a aVar) {
        a aVar2 = aVar;
        v7.g.f(aVar2, "holder");
        s sVar = aVar2.f16372a;
        if (sVar != null) {
            MaterialTextView materialTextView = (MaterialTextView) sVar.f17467a;
            v7.g.e(materialTextView, "holder.binding.root");
            ViewUtilsKt.q(materialTextView);
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final String D() {
        String str = this.f16371k;
        if (str != null) {
            return str;
        }
        v7.g.l("placeholder");
        throw null;
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void f(Object obj) {
        a aVar = (a) obj;
        v7.g.f(aVar, "holder");
        s sVar = aVar.f16372a;
        if (sVar != null) {
            ((MaterialTextView) sVar.f17468b).setText(D());
        } else {
            v7.g.l("binding");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void q(Object obj) {
        a aVar = (a) obj;
        v7.g.f(aVar, "holder");
        s sVar = aVar.f16372a;
        if (sVar != null) {
            MaterialTextView materialTextView = (MaterialTextView) sVar.f17467a;
            v7.g.e(materialTextView, "holder.binding.root");
            ViewUtilsKt.q(materialTextView);
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    @Override // com.airbnb.epoxy.z
    public final void w(a aVar) {
        a aVar2 = aVar;
        v7.g.f(aVar2, "holder");
        s sVar = aVar2.f16372a;
        if (sVar != null) {
            ((MaterialTextView) sVar.f17468b).setText(D());
        } else {
            v7.g.l("binding");
            throw null;
        }
    }
}
