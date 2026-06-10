package f3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.activity.e;
import f3.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: o  reason: collision with root package name */
    public f3.b f10903o;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10899j = true;

    /* renamed from: k  reason: collision with root package name */
    public Cursor f10900k = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10898i = false;

    /* renamed from: l  reason: collision with root package name */
    public int f10901l = -1;

    /* renamed from: m  reason: collision with root package name */
    public C0115a f10902m = new C0115a();
    public b n = new b();

    /* renamed from: f3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0115a extends ContentObserver {
        public C0115a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f10899j && (cursor = aVar.f10900k) != null && !cursor.isClosed()) {
                aVar.f10898i = aVar.f10900k.requery();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f10898i = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f10898i = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f10900k;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0115a c0115a = this.f10902m;
                if (c0115a != null) {
                    cursor2.unregisterContentObserver(c0115a);
                }
                b bVar = this.n;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f10900k = cursor;
            if (cursor != null) {
                C0115a c0115a2 = this.f10902m;
                if (c0115a2 != null) {
                    cursor.registerContentObserver(c0115a2);
                }
                b bVar2 = this.n;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f10901l = cursor.getColumnIndexOrThrow("_id");
                this.f10898i = true;
                notifyDataSetChanged();
            } else {
                this.f10901l = -1;
                this.f10898i = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f10898i || (cursor = this.f10900k) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f10898i) {
            this.f10900k.moveToPosition(i10);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.f10909r.inflate(cVar.f10908q, viewGroup, false);
            }
            b(view, this.f10900k);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f10903o == null) {
            this.f10903o = new f3.b(this);
        }
        return this.f10903o;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f10898i || (cursor = this.f10900k) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f10900k;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f10898i && (cursor = this.f10900k) != null && cursor.moveToPosition(i10)) {
            return this.f10900k.getLong(this.f10901l);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f10898i) {
            if (this.f10900k.moveToPosition(i10)) {
                if (view == null) {
                    view = e(viewGroup);
                }
                b(view, this.f10900k);
                return view;
            }
            throw new IllegalStateException(e.g("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
