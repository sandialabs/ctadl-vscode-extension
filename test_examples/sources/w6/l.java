package w6;

import android.os.Bundle;
import android.os.Parcelable;
import com.noto.app.filtered.FilteredItemModel;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final FilteredItemModel f18456a;

    public l(FilteredItemModel filteredItemModel) {
        this.f18456a = filteredItemModel;
    }

    public static final l fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", l.class, "model")) {
            if (!Parcelable.class.isAssignableFrom(FilteredItemModel.class) && !Serializable.class.isAssignableFrom(FilteredItemModel.class)) {
                throw new UnsupportedOperationException(FilteredItemModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            FilteredItemModel filteredItemModel = (FilteredItemModel) bundle.get("model");
            if (filteredItemModel != null) {
                return new l(filteredItemModel);
            }
            throw new IllegalArgumentException("Argument \"model\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"model\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f18456a == ((l) obj).f18456a;
    }

    public final int hashCode() {
        return this.f18456a.hashCode();
    }

    public final String toString() {
        return "FilteredFragmentArgs(model=" + this.f18456a + ")";
    }
}
