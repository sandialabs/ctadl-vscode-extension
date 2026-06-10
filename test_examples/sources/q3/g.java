package q3;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: i  reason: collision with root package name */
    public final EditText f16911i;

    /* renamed from: k  reason: collision with root package name */
    public a f16913k;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16912j = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16914l = true;

    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f16915a;

        public a(EditText editText) {
            this.f16915a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            g.a((EditText) this.f16915a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f16911i = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int b5;
        boolean z11;
        EditText editText = this.f16911i;
        if (!editText.isInEditMode()) {
            if (this.f16914l) {
                z10 = false;
                if (!this.f16912j) {
                    if (androidx.emoji2.text.f.f4981j != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z10 && i11 <= i12 && (charSequence instanceof Spannable)) {
                    b5 = androidx.emoji2.text.f.a().b();
                    if (b5 != 0) {
                        if (b5 != 1) {
                            if (b5 != 3) {
                                return;
                            }
                        } else {
                            androidx.emoji2.text.f.a().f(i10, i12 + i10, (Spannable) charSequence);
                            return;
                        }
                    }
                    androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                    if (this.f16913k == null) {
                        this.f16913k = new a(editText);
                    }
                    a10.g(this.f16913k);
                }
                return;
            }
            z10 = true;
            if (!z10) {
                b5 = androidx.emoji2.text.f.a().b();
                if (b5 != 0) {
                }
                androidx.emoji2.text.f a102 = androidx.emoji2.text.f.a();
                if (this.f16913k == null) {
                }
                a102.g(this.f16913k);
            }
        }
    }
}
