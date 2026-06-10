package com.noto.app.util;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.l;
import kotlin.Metadata;
import m7.n;
import v7.g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u001c\u0010\b\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002R(\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRD\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/noto/app/util/CustomEditText;", "Landroidx/appcompat/widget/l;", "Lkotlin/Function1;", "", "Lm7/n;", "listener", "setOnSelectionChangedListener", "", "setOnCursorPositionChangedListener", "value", "o", "Ljava/lang/String;", "setSelectedText", "(Ljava/lang/String;)V", "selectedText", "p", "Lu7/l;", "setSelectionChangedListener", "(Lu7/l;)V", "selectionChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CustomEditText extends l {

    /* renamed from: o  reason: collision with root package name */
    public String f9812o;

    /* renamed from: p  reason: collision with root package name */
    public u7.l<? super String, n> f9813p;

    /* renamed from: q  reason: collision with root package name */
    public u7.l<? super Integer, n> f9814q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.f(context, "context");
        g.f(attributeSet, "attrs");
    }

    private final void setSelectedText(String str) {
        if (g.a(this.f9812o, str)) {
            return;
        }
        this.f9812o = str;
        u7.l<? super String, n> lVar = this.f9813p;
        if (lVar != null) {
            lVar.U(str);
        }
    }

    private final void setSelectionChangedListener(u7.l<? super String, n> lVar) {
        this.f9813p = lVar;
        if (lVar != null) {
            lVar.U(this.f9812o);
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        String str;
        super.onSelectionChanged(i10, i11);
        u7.l<? super Integer, n> lVar = this.f9814q;
        if (lVar != null) {
            lVar.U(Integer.valueOf(i10));
        }
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        if (min == -1 || max == -1) {
            str = null;
        } else {
            str = String.valueOf(getText()).substring(min, max);
            g.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        setSelectedText(str);
    }

    public final void setOnCursorPositionChangedListener(u7.l<? super Integer, n> lVar) {
        this.f9814q = lVar;
    }

    public final void setOnSelectionChangedListener(u7.l<? super String, n> lVar) {
        setSelectionChangedListener(lVar);
    }
}
