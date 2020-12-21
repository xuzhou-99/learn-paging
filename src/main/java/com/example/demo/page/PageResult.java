package com.example.demo.page;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title PageResult
 * @date 2020/12/16 16:09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 2405172041950251807L;

    private int rowStart;

    private int rowEnd;

    private int rowTotal;

    private int pageNum;

    private int pageSize;

    private int pageTotal;

    private List<T> result;

    private int prePage;

    private int nextPage;
}
