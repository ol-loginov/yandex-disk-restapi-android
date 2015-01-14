package com.yandex.disk.rest.util;

public class ResourcePath {

    private final static String SEPARATOR = ":";

    private final String prefix, path;

    public ResourcePath(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        String[] arr = str.split(SEPARATOR);    // TODO search first ':' instead of split
        if (arr.length != 2) {
            if (arr.length < 2) {
                prefix = null;
                path = str;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            prefix = arr[0];
            path = arr[1];
            if (prefix == null || path == null || prefix.length() == 0 || path.length() == 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    public String getPrefix() {
        return prefix;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return prefix + SEPARATOR + path;
    }
}
