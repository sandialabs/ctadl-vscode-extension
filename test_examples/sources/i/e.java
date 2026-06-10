package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import i.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11628a;

    /* renamed from: b  reason: collision with root package name */
    public final i.a f11629b;

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0126a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f11630a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f11631b;
        public final ArrayList<e> c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final p.h<Menu, Menu> f11632d = new p.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f11631b = context;
            this.f11630a = callback;
        }

        @Override // i.a.InterfaceC0126a
        public final boolean a(i.a aVar, MenuItem menuItem) {
            return this.f11630a.onActionItemClicked(e(aVar), new j.c(this.f11631b, (t2.b) menuItem));
        }

        @Override // i.a.InterfaceC0126a
        public final boolean b(i.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(aVar);
            p.h<Menu, Menu> hVar = this.f11632d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new j.e(this.f11631b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.f11630a.onCreateActionMode(e10, orDefault);
        }

        @Override // i.a.InterfaceC0126a
        public final void c(i.a aVar) {
            this.f11630a.onDestroyActionMode(e(aVar));
        }

        @Override // i.a.InterfaceC0126a
        public final boolean d(i.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(aVar);
            p.h<Menu, Menu> hVar = this.f11632d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new j.e(this.f11631b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.f11630a.onPrepareActionMode(e10, orDefault);
        }

        public final e e(i.a aVar) {
            ArrayList<e> arrayList = this.c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar != null && eVar.f11629b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f11631b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, i.a aVar) {
        this.f11628a = context;
        this.f11629b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f11629b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f11629b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new j.e(this.f11628a, this.f11629b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f11629b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f11629b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f11629b.f11616i;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f11629b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f11629b.f11617j;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f11629b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f11629b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f11629b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f11629b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f11629b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f11629b.f11616i = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f11629b.n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f11629b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f11629b.p(z10);
    }
}
