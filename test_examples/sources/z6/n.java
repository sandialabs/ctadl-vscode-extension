package z6;

import android.os.Bundle;
import android.os.Parcelable;
import com.noto.R;
import com.noto.app.filtered.FilteredItemModel;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class n implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final FilteredItemModel f19156a;

    public n(FilteredItemModel filteredItemModel) {
        this.f19156a = filteredItemModel;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(FilteredItemModel.class);
        FilteredItemModel filteredItemModel = this.f19156a;
        if (isAssignableFrom) {
            v7.g.d(filteredItemModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("model", (Parcelable) filteredItemModel);
        } else if (!Serializable.class.isAssignableFrom(FilteredItemModel.class)) {
            throw new UnsupportedOperationException(FilteredItemModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        } else {
            v7.g.d(filteredItemModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("model", filteredItemModel);
        }
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainFragment_to_filteredFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f19156a == ((n) obj).f19156a;
    }

    public final int hashCode() {
        return this.f19156a.hashCode();
    }

    public final String toString() {
        return "ActionMainFragmentToFilteredFragment(model=" + this.f19156a + ")";
    }
}
