package r0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f17042a = new e();

    public final AutofillId a(ViewStructure viewStructure) {
        AutofillId autofillId;
        v7.g.f(viewStructure, "structure");
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    public final boolean b(AutofillValue autofillValue) {
        boolean isDate;
        v7.g.f(autofillValue, "value");
        isDate = autofillValue.isDate();
        return isDate;
    }

    public final boolean c(AutofillValue autofillValue) {
        boolean isList;
        v7.g.f(autofillValue, "value");
        isList = autofillValue.isList();
        return isList;
    }

    public final boolean d(AutofillValue autofillValue) {
        boolean isText;
        v7.g.f(autofillValue, "value");
        isText = autofillValue.isText();
        return isText;
    }

    public final boolean e(AutofillValue autofillValue) {
        boolean isToggle;
        v7.g.f(autofillValue, "value");
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        v7.g.f(viewStructure, "structure");
        v7.g.f(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        v7.g.f(viewStructure, "structure");
        v7.g.f(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i10);
    }

    public final void h(ViewStructure viewStructure, int i10) {
        v7.g.f(viewStructure, "structure");
        viewStructure.setAutofillType(i10);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        CharSequence textValue;
        v7.g.f(autofillValue, "value");
        textValue = autofillValue.getTextValue();
        v7.g.e(textValue, "value.textValue");
        return textValue;
    }
}
