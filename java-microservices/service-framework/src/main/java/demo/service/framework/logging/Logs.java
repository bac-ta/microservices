package demo.service.framework.logging;

import demo.service.framework.utils.Strings;

final class Logs {

    private static final String EMPTY_REQUEST_ID;
    static {
        final int requestIdMaxLength = 36;
        char[] buf = new char[requestIdMaxLength];
        for (int i = requestIdMaxLength - 1; i >= 0; i--) {
            buf[i] = '-';
        }
        EMPTY_REQUEST_ID = new String(buf);
    }

    private Logs() {}

    static String toAlternateRequestIdIfEmpty(String requestId) {
        return Strings.isEmpty(requestId) ? EMPTY_REQUEST_ID : requestId;
    }
}
