package kotlin.reflect.jvm.internal.calls;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 extends Lambda implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 f13262j = new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1();

    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(Map.Entry<? extends String, ? extends Object> entry) {
        String obj;
        Map.Entry<? extends String, ? extends Object> entry2 = entry;
        g.f(entry2, "entry");
        String key = entry2.getKey();
        Object value = entry2.getValue();
        if (value instanceof boolean[]) {
            obj = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            obj = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            obj = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            obj = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            obj = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            obj = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            obj = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            obj = Arrays.toString((double[]) value);
        } else if (value instanceof Object[]) {
            obj = Arrays.toString((Object[]) value);
        } else {
            obj = value.toString();
            return key + '=' + obj;
        }
        g.e(obj, "toString(this)");
        return key + '=' + obj;
    }
}
