package com.yandex.disk.rest;

import java.io.IOException;
import java.io.InputStream;

public interface FileSupplier {
    InputStream read() throws IOException;

    long length();
}
