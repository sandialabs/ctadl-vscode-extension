package r0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final View f17039a;

    /* renamed from: b  reason: collision with root package name */
    public final h f17040b;
    public final AutofillManager c;

    public a(View view, h hVar) {
        Object systemService;
        v7.g.f(view, "view");
        v7.g.f(hVar, "autofillTree");
        this.f17039a = view;
        this.f17040b = hVar;
        systemService = view.getContext().getSystemService(AutofillManager.class);
        AutofillManager autofillManager = (AutofillManager) systemService;
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
