package x6;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.noto.app.domain.model.Layout;
import com.noto.app.folder.NoteItem;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class i0 extends com.airbnb.epoxy.y<NoteItem> {

    /* renamed from: h  reason: collision with root package name */
    public final Layout f18687h;

    /* renamed from: i  reason: collision with root package name */
    public final u7.a<m7.n> f18688i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.airbnb.epoxy.m mVar, Layout layout, u7.a<m7.n> aVar) {
        super(mVar, NoteItem.class);
        v7.g.f(layout, "layout");
        this.f18687h = layout;
        this.f18688i = aVar;
    }

    @Override // com.airbnb.epoxy.e
    public final int a(com.airbnb.epoxy.r rVar) {
        int i10;
        NoteItem noteItem = (NoteItem) rVar;
        int ordinal = this.f18687h.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i10 = 51;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 3;
        }
        return (i10 << 16) | 0 | ((0 | i10) << 0);
    }

    @Override // com.airbnb.epoxy.y
    public final void t(NoteItem noteItem, View view) {
        NoteItem noteItem2 = noteItem;
        if (view != null) {
            view.setSelected(false);
        }
    }

    @Override // com.airbnb.epoxy.y
    public final void u(com.airbnb.epoxy.r rVar, View view) {
        Integer num;
        Context context;
        NoteItem noteItem = (NoteItem) rVar;
        if (view != null) {
            view.setSelected(true);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Integer num2 = null;
            if (noteItem != null) {
                num = Integer.valueOf(f7.q.j(noteItem.E()));
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
        NoteItem noteItem = (NoteItem) rVar;
        this.f18688i.k0();
    }
}
