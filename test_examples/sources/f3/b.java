package f3;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public final class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public final a f10906a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f10906a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((w0) this.f10906a).d((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        w0 w0Var = (w0) this.f10906a;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            w0Var.getClass();
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = w0Var.f1121s;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = w0Var.h(w0Var.f1122t, charSequence2);
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f10906a;
        Cursor cursor = ((f3.a) aVar).f10900k;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((w0) aVar).c((Cursor) obj);
        }
    }
}
