package v9;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import v7.g;

/* loaded from: classes.dex */
public final class b {
    public static InputStream a(String str) {
        g.f(str, "path");
        ClassLoader classLoader = b.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
