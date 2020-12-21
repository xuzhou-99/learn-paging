package com.example.demo.page;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title PageResultUtils
 * @date 2020/12/16 16:24
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PageResultUtils {
    public static <T> PageResult<T> buildPageResult(@NonNull final PageParameter pageParameter, Supplier<List<T>> supplier){
        return PageResult.<T>builder()
                .rowStart(pageParameter.getRowStart())
                .rowEnd(pageParameter.getRowEnd())
                .rowTotal(pageParameter.getRowTotal())
                .pageNum(pageParameter.getPageNum())
                .pageSize(pageParameter.getPageSize())
                .pageTotal(pageParameter.getPageTotal())
                .prePage(pageParameter.getPrePage())
                .nextPage(pageParameter.getNestPage())
                .result(supplier.get())
                .build();
    }


    public static <T> PageResult<T> buildEnptyPageResult(final PageParameter pageParameter){
        return PageResult.<T>builder()
                .rowStart(pageParameter.getRowStart())
                .rowEnd(pageParameter.getRowEnd())
                .rowTotal(pageParameter.getRowTotal())
                .pageNum(pageParameter.getPageNum())
                .pageSize(pageParameter.getPageSize())
                .pageTotal(pageParameter.getPageTotal())
                .prePage(pageParameter.getPrePage())
                .nextPage(pageParameter.getNestPage())
                .result(Collections.emptyList())
                .build();
    }
}
