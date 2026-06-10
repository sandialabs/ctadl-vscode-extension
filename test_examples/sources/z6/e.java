package z6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ModelUtilsKt;

/* loaded from: classes.dex */
public final class e extends com.airbnb.epoxy.y<d> {

    /* renamed from: h  reason: collision with root package name */
    public final u7.p<com.airbnb.epoxy.b0, Integer, m7.n> f19142h;

    /* renamed from: i  reason: collision with root package name */
    public final u7.a<m7.n> f19143i;

    /* JADX WARN: Multi-variable type inference failed */
    public e(com.airbnb.epoxy.m mVar, u7.p<? super com.airbnb.epoxy.b0, ? super Integer, m7.n> pVar, u7.a<m7.n> aVar) {
        super(mVar, d.class);
        this.f19142h = pVar;
        this.f19143i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // com.airbnb.epoxy.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.airbnb.epoxy.r rVar) {
        boolean z10;
        int i10;
        d dVar = (d) rVar;
        if (dVar != null) {
            z10 = true;
            if (ModelUtilsKt.u(dVar.E())) {
                if (!z10) {
                    i10 = 0;
                } else {
                    i10 = 48;
                }
                return (i10 << 8) | ((i10 | 3) << 0) | 196608;
            }
        }
        z10 = false;
        if (!z10) {
        }
        return (i10 << 8) | ((i10 | 3) << 0) | 196608;
    }

    @Override // androidx.recyclerview.widget.n.d
    public final boolean i() {
        return false;
    }

    @Override // com.airbnb.epoxy.y, com.airbnb.epoxy.a0
    public final void q(Canvas canvas, RecyclerView recyclerView, com.airbnb.epoxy.b0 b0Var, float f10, float f11, int i10, boolean z10) {
        Drawable c;
        v7.g.f(canvas, "c");
        v7.g.f(recyclerView, "recyclerView");
        v7.g.f(b0Var, "viewHolder");
        super.q(canvas, recyclerView, b0Var, f10, f11, i10, z10);
        View view = b0Var.f5666a;
        v7.g.e(view, "viewHolder.itemView");
        Context context = view.getContext();
        b0Var.s();
        com.airbnb.epoxy.r rVar = b0Var.f6617u;
        v7.g.d(rVar, "null cannot be cast to non-null type com.noto.app.main.FolderItem");
        v7.g.e(context, "context");
        int b5 = f7.q.b(context, f7.q.j(((d) rVar).E().f17595e));
        int dimension = (int) context.getResources().getDimension(R.dimen.spacing_normal);
        float dimension2 = context.getResources().getDimension(R.dimen.spacing_small);
        Paint paint = new Paint();
        paint.setColor(q2.a.d(b5, 32));
        if (f10 > 0.0f) {
            Drawable c10 = f7.q.c(context, R.drawable.ic_round_move_in_24);
            if (c10 != null) {
                c10.setTint(b5);
                int bottom = (((view.getBottom() - view.getTop()) / 2) - (c10.getIntrinsicHeight() / 2)) + view.getTop();
                float left = view.getLeft();
                float top = view.getTop();
                float right = view.getRight() + f10;
                float right2 = view.getRight();
                if (right > right2) {
                    right = right2;
                }
                canvas.drawRoundRect(new RectF(left, top, right, view.getBottom()), dimension2, dimension2, paint);
                c10.setBounds(view.getLeft() + dimension, bottom, c10.getIntrinsicWidth() + view.getLeft() + dimension, c10.getIntrinsicHeight() + bottom);
                c10.draw(canvas);
            }
        } else if (f10 < 0.0f && (c = f7.q.c(context, R.drawable.ic_round_move_out_24)) != null) {
            c.setTint(b5);
            int intrinsicHeight = c.getIntrinsicHeight() / 2;
            int bottom2 = (((view.getBottom() - view.getTop()) / 2) - intrinsicHeight) + view.getTop();
            float left2 = view.getLeft() + f10;
            float left3 = view.getLeft();
            if (left2 < left3) {
                left2 = left3;
            }
            canvas.drawRoundRect(new RectF(left2, view.getTop(), view.getRight(), view.getBottom()), dimension2, dimension2, paint);
            c.setBounds((view.getRight() - dimension) - (intrinsicHeight * 2), bottom2, view.getRight() - dimension, c.getIntrinsicHeight() + bottom2);
            c.draw(canvas);
        }
    }

    @Override // com.airbnb.epoxy.y, com.airbnb.epoxy.a0
    public final void r(com.airbnb.epoxy.b0 b0Var, int i10) {
        v7.g.f(b0Var, "viewHolder");
        super.r(b0Var, i10);
        this.f19142h.R(b0Var, Integer.valueOf(i10));
    }

    @Override // com.airbnb.epoxy.y
    public final void t(d dVar, View view) {
        d dVar2 = dVar;
        if (view != null) {
            view.setSelected(false);
        }
    }

    @Override // com.airbnb.epoxy.y
    public final void u(com.airbnb.epoxy.r rVar, View view) {
        Integer num;
        Context context;
        NotoColor notoColor;
        d dVar = (d) rVar;
        if (view != null) {
            view.setSelected(true);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Integer num2 = null;
            if (dVar != null && (notoColor = dVar.E().f17595e) != null) {
                num = Integer.valueOf(f7.q.j(notoColor));
            } else {
                num = null;
            }
            if (num != null) {
                if (view != null && (context = view.getContext()) != null) {
                    num2 = Integer.valueOf(f7.q.b(context, num.intValue()));
                }
                if (num2 != null) {
                    view.setOutlineAmbientShadowColor(num2.intValue());
                    view.setOutlineSpotShadowColor(num2.intValue());
                }
            }
        }
    }

    @Override // com.airbnb.epoxy.y
    public final void v(com.airbnb.epoxy.r rVar) {
        d dVar = (d) rVar;
        this.f19143i.k0();
    }
}
