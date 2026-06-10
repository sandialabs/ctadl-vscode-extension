package q3;

import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0212a f16894a;

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0212a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f16895a;

        /* renamed from: b  reason: collision with root package name */
        public final g f16896b;

        public C0212a(EditText editText) {
            this.f16895a = editText;
            g gVar = new g(editText);
            this.f16896b = gVar;
            editText.addTextChangedListener(gVar);
            if (q3.b.f16898b == null) {
                synchronized (q3.b.f16897a) {
                    if (q3.b.f16898b == null) {
                        q3.b.f16898b = new q3.b();
                    }
                }
            }
            editText.setEditableFactory(q3.b.f16898b);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f16894a = new C0212a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
