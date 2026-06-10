package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.p;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class z<S> extends Fragment {

    /* renamed from: d0  reason: collision with root package name */
    public final LinkedHashSet<y<S>> f7122d0 = new LinkedHashSet<>();

    public boolean Z(p.d dVar) {
        return this.f7122d0.add(dVar);
    }
}
