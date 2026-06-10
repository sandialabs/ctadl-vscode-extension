package org.koin.androidx.viewmodel.ext.android;

import a1.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i0;
import c8.b;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final i0 a(Fragment fragment, b bVar) {
        g.f(fragment, "<this>");
        g.f(bVar, "clazz");
        return c.H0(a1.b.V(fragment), null, new SharedViewModelExtKt$getSharedViewModel$1(fragment), bVar, null);
    }
}
