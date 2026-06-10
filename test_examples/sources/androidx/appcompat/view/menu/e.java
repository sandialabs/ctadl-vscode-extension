package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: i  reason: collision with root package name */
    public final f f607i;

    /* renamed from: j  reason: collision with root package name */
    public int f608j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f609k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f610l;

    /* renamed from: m  reason: collision with root package name */
    public final LayoutInflater f611m;
    public final int n;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f610l = z10;
        this.f611m = layoutInflater;
        this.f607i = fVar;
        this.n = i10;
        b();
    }

    public final void b() {
        f fVar = this.f607i;
        h hVar = fVar.f632v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f621j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f608j = i10;
                    return;
                }
            }
        }
        this.f608j = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final h getItem(int i10) {
        ArrayList<h> l2;
        boolean z10 = this.f610l;
        f fVar = this.f607i;
        if (z10) {
            fVar.i();
            l2 = fVar.f621j;
        } else {
            l2 = fVar.l();
        }
        int i11 = this.f608j;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return l2.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l2;
        boolean z10 = this.f610l;
        f fVar = this.f607i;
        if (z10) {
            fVar.i();
            l2 = fVar.f621j;
        } else {
            l2 = fVar.l();
        }
        int i10 = this.f608j;
        int size = l2.size();
        if (i10 < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f611m.inflate(this.n, viewGroup, false);
        }
        int i12 = getItem(i10).f639b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f639b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f607i.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f609k) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
