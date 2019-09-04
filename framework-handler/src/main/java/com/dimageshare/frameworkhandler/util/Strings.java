package com.dimageshare.frameworkhandler.util;

import com.google.common.collect.Lists;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

public final class Strings extends StringUtils {

    public static final String EMPTY = "";

    private Strings() {
    }

    public static String nvl(final String value) {
        return Optional.ofNullable(value).orElse("");
    }

    public static List<String> intersection(List<String>... lists) {
        List<String> resultList = null;
        for (List<String> list : lists) {
            if (list == null) {
                continue;
            }
            if (resultList == null) {
                resultList = Lists.newArrayList();
                resultList.addAll(list);
                continue;
            }
            resultList.removeIf(result -> {
                return !list.contains(result);
            });
        }
        return resultList;
    }

    public static String inline(String source) {
        return source == null ? "null" : source.replace("\n", " ");
    }

    public static String inline(Object source) {
        return source == null ? "null" : inline(source.toString());
    }
}
