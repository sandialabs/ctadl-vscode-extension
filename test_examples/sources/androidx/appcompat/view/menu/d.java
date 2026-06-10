package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.noto.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: i  reason: collision with root package name */
    public Context f600i;

    /* renamed from: j  reason: collision with root package name */
    public LayoutInflater f601j;

    /* renamed from: k  reason: collision with root package name */
    public f f602k;

    /* renamed from: l  reason: collision with root package name */
    public ExpandedMenuView f603l;

    /* renamed from: m  reason: collision with root package name */
    public j.a f604m;
    public a n;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: i  reason: collision with root package name */
        public int f605i = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f602k;
            h hVar = fVar.f632v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f621j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f605i = i10;
                        return;
                    }
                }
            }
            this.f605i = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final h getItem(int i10) {
            d dVar = d.this;
            f fVar = dVar.f602k;
            fVar.i();
            ArrayList<h> arrayList = fVar.f621j;
            dVar.getClass();
            int i11 = i10 + 0;
            int i12 = this.f605i;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f602k;
            fVar.i();
            int size = fVar.f621j.size();
            dVar.getClass();
            int i10 = size + 0;
            if (this.f605i < 0) {
                return i10;
            }
            return i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f601j.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f600i = context;
        this.f601j = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        j.a aVar = this.f604m;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(Context context, f fVar) {
        if (this.f600i != null) {
            this.f600i = context;
            if (this.f601j == null) {
                this.f601j = LayoutInflater.from(context);
            }
        }
        this.f602k = fVar;
        a aVar = this.n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f() {
        a aVar = this.n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean h(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        Context context = mVar.f613a;
        b.a aVar = new b.a(context);
        AlertController.b bVar = aVar.f536a;
        d dVar = new d(bVar.f520a);
        gVar.f637k = dVar;
        dVar.f604m = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f637k;
        if (dVar2.n == null) {
            dVar2.n = new a();
        }
        bVar.f527i = dVar2.n;
        bVar.f528j = gVar;
        View view = mVar.f625o;
        if (view != null) {
            bVar.f523e = view;
        } else {
            bVar.c = mVar.n;
            bVar.f522d = mVar.f624m;
        }
        bVar.f526h = gVar;
        androidx.appcompat.app.b a10 = aVar.a();
        gVar.f636j = a10;
        a10.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f636j.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f636j.show();
        j.a aVar2 = this.f604m;
        if (aVar2 != null) {
            aVar2.c(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(j.a aVar) {
        this.f604m = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
        this.f602k.q(this.n.getItem(i10), this, 0);
    }
}
