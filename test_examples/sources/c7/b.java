package c7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.p;
import com.airbnb.epoxy.z;
import com.noto.R;
import com.noto.app.domain.model.Icon;
import f7.q;
import kotlin.NoWhenBranchMatchedException;
import ma.i;
import s6.s;
import v7.g;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class b extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public Icon f6553k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6554l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f6555m;

    /* loaded from: classes.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public s f6556a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            g.f(view, "itemView");
            TextView textView = (TextView) view;
            this.f6556a = new s(textView, textView, 0);
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        BitmapDrawable bitmapDrawable;
        int i10;
        Drawable mutate;
        g.f(aVar, "holder");
        s sVar = aVar.f6556a;
        if (sVar != null) {
            TextView textView = sVar.f17467a;
            Context context = textView.getContext();
            if (context != null) {
                Drawable c = q.c(context, q.i(E()));
                if (c != null && (mutate = c.mutate()) != null) {
                    bitmapDrawable = new BitmapDrawable(textView.getResources(), a1.b.H0(mutate, q.d(50), q.d(50)));
                } else {
                    bitmapDrawable = null;
                }
                switch (E().ordinal()) {
                    case 0:
                        i10 = R.string.futuristic;
                        break;
                    case 1:
                        i10 = R.string.dark_rain;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        i10 = R.string.airplane;
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        i10 = R.string.blossom_ice;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        i10 = R.string.dark_alpine;
                        break;
                    case 5:
                        i10 = R.string.dark_side;
                        break;
                    case 6:
                        i10 = R.string.earth;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        i10 = R.string.fire;
                        break;
                    case 8:
                        i10 = R.string.purpleberry;
                        break;
                    case i.f16046m /* 9 */:
                        i10 = R.string.sanguine_sun;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                textView.setText(q.f(context, i10, new Object[0]));
                int a10 = q.a(context, R.attr.notoSurfaceColor);
                int a11 = q.a(context, R.attr.notoBackgroundColor);
                Drawable background = textView.getBackground();
                if (background != null) {
                    if (!((c) this).f6554l) {
                        a10 = a11;
                    }
                    background.setTint(a10);
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
            }
            textView.setOnClickListener(F());
            return;
        }
        g.l("binding");
        throw null;
    }

    public final Icon E() {
        Icon icon = this.f6553k;
        if (icon != null) {
            return icon;
        }
        g.l("icon");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f6555m;
        if (onClickListener != null) {
            return onClickListener;
        }
        g.l("onClickListener");
        throw null;
    }
}
