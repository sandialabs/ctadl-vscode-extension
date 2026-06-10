package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.noto.R;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: i  reason: collision with root package name */
    public final Context f568i;

    /* renamed from: j  reason: collision with root package name */
    public Context f569j;

    /* renamed from: k  reason: collision with root package name */
    public f f570k;

    /* renamed from: l  reason: collision with root package name */
    public final LayoutInflater f571l;

    /* renamed from: m  reason: collision with root package name */
    public j.a f572m;
    public final int n = R.layout.abc_action_menu_layout;

    /* renamed from: o  reason: collision with root package name */
    public final int f573o = R.layout.abc_action_menu_item_layout;

    /* renamed from: p  reason: collision with root package name */
    public k f574p;

    public a(Context context) {
        this.f568i = context;
        this.f571l = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(j.a aVar) {
        this.f572m = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(h hVar) {
        return false;
    }
}
