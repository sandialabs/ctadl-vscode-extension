package w6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.epoxy.z;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.filtered.FilteredItemModel;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class r extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public FilteredItemModel f18476k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18477l = true;

    /* renamed from: m  reason: collision with root package name */
    public int f18478m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnClickListener f18479o;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.f f18480a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            MaterialCardView materialCardView = (MaterialCardView) view;
            int i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) a1.b.O(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.ll;
                if (((LinearLayout) a1.b.O(view, R.id.ll)) != null) {
                    i10 = R.id.tv_notes_count;
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_notes_count);
                    if (materialTextView != null) {
                        i10 = R.id.tv_title;
                        MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(view, R.id.tv_title);
                        if (materialTextView2 != null) {
                            this.f18480a = new s6.f(materialCardView, imageView, materialTextView, materialTextView2);
                            return;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    @Override // com.airbnb.epoxy.z
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(a aVar) {
        int i10;
        int i11;
        v7.g.f(aVar, "holder");
        s6.f fVar = aVar.f18480a;
        if (fVar != null) {
            t tVar = (t) this;
            boolean z10 = tVar.n;
            MaterialCardView materialCardView = fVar.f17337a;
            materialCardView.setSelected(z10);
            materialCardView.setOnClickListener(F());
            MaterialTextView materialTextView = fVar.c;
            v7.g.e(materialTextView, "tvNotesCount");
            if (tVar.f18477l) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            materialTextView.setVisibility(i10);
            materialTextView.setText(String.valueOf(this.f18478m));
            materialCardView.setStrokeWidth(s.f18481a);
            Context context = materialCardView.getContext();
            if (context != null) {
                int ordinal = E().ordinal();
                ImageView imageView = fVar.f17338b;
                MaterialTextView materialTextView2 = fVar.f17339d;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                materialTextView2.setText(f7.q.f(context, R.string.archived, new Object[0]));
                                i11 = R.drawable.ic_round_inventory_24;
                            } else {
                                int b5 = f7.q.b(context, f7.q.j(E().f8287j));
                                int a10 = f7.q.a(context, R.attr.notoBackgroundColor);
                                materialCardView.setRippleColor(f7.q.h(b5));
                                materialCardView.setStrokeColor(b5);
                                if (!tVar.n) {
                                    materialCardView.setCardBackgroundColor(q2.a.d(b5, 32));
                                } else {
                                    materialCardView.setCardBackgroundColor(a10);
                                }
                                materialTextView2.setTextColor(b5);
                                imageView.setImageTintList(f7.q.h(b5));
                                materialTextView.setTextColor(b5);
                                m7.n nVar = m7.n.f16010a;
                                return;
                            }
                        } else {
                            materialTextView2.setText(f7.q.f(context, R.string.scheduled, new Object[0]));
                            i11 = R.drawable.ic_round_notifications_active_24;
                        }
                    } else {
                        materialTextView2.setText(f7.q.f(context, R.string.recent, new Object[0]));
                        i11 = R.drawable.ic_round_schedule_24;
                    }
                } else {
                    materialTextView2.setText(f7.q.f(context, R.string.all, new Object[0]));
                    i11 = R.drawable.ic_round_all_notes_24;
                }
                imageView.setImageResource(i11);
                int b52 = f7.q.b(context, f7.q.j(E().f8287j));
                int a102 = f7.q.a(context, R.attr.notoBackgroundColor);
                materialCardView.setRippleColor(f7.q.h(b52));
                materialCardView.setStrokeColor(b52);
                if (!tVar.n) {
                }
                materialTextView2.setTextColor(b52);
                imageView.setImageTintList(f7.q.h(b52));
                materialTextView.setTextColor(b52);
                m7.n nVar2 = m7.n.f16010a;
                return;
            }
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final FilteredItemModel E() {
        FilteredItemModel filteredItemModel = this.f18476k;
        if (filteredItemModel != null) {
            return filteredItemModel;
        }
        v7.g.l("model");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f18479o;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }
}
