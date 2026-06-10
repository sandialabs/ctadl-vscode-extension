package q3;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f16901a;

    /* renamed from: b  reason: collision with root package name */
    public a f16902b;

    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f16903a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f16904b;

        public a(TextView textView, d dVar) {
            this.f16903a = new WeakReference(textView);
            this.f16904b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            boolean z10;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f16903a.get();
            InputFilter inputFilter = (InputFilter) this.f16904b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                if (text == null) {
                    length = 0;
                } else {
                    a10.getClass();
                    length = text.length();
                }
                CharSequence f10 = a10.f(0, length, text);
                if (text == f10) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(f10);
                int selectionEnd = Selection.getSelectionEnd(f10);
                textView.setText(f10);
                if (f10 instanceof Spannable) {
                    Spannable spannable = (Spannable) f10;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f16901a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f16901a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b5 = androidx.emoji2.text.f.a().b();
        if (b5 != 0) {
            boolean z10 = true;
            if (b5 != 1) {
                if (b5 != 3) {
                    return charSequence;
                }
            } else {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z10 = false;
                }
                if (z10 && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    return androidx.emoji2.text.f.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
        if (this.f16902b == null) {
            this.f16902b = new a(textView, this);
        }
        a10.g(this.f16902b);
        return charSequence;
    }
}
