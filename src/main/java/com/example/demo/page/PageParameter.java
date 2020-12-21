package com.example.demo.page;


import lombok.Getter;
import lombok.Setter;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title PageParameter
 * @date 2020/12/16 15:40
 */
@Getter
@Setter
public class PageParameter {

    private static final int DEFAULT_PAGE_SIZE = 10;

    private static final int DEFAULT_CURRENT_PAGE = 1;

    /**
     * 当前页
     */
    private int pageNum;
    /**
     * 每页大小
     */
    private int pageSize;
    /**
     * 偏移量
     */
    private int offset;
    /**
     * 总页数
     */
    private int pageTotal;
    /**
     * 总记录数
     */
    private int rowTotal;
    /**
     * 上一页
     */
    private int prePage;
    /**
     * 下一页
     */
    private int nestPage;
    /**
     * 记录开始
     */
    private int rowStart;
    /**
     * 记录结束
     */
    private int rowEnd;


    private PageParameter(){
        this.pageNum = DEFAULT_CURRENT_PAGE;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    private PageParameter(final Integer currentPage, final Integer pageSize){
        this.pageNum = (currentPage == null || currentPage <= 0) ? DEFAULT_CURRENT_PAGE : currentPage;
        this.pageSize = (pageSize == null || pageSize <= 0) ? DEFAULT_PAGE_SIZE : pageSize;
        this.offset = (this.pageNum - 1) * this.pageSize;
    }

    private PageParameter(final Integer currentPage, final Integer pageSize, final Integer rowTotal) {

        this.pageNum = (currentPage == null || currentPage <= 0) ? DEFAULT_CURRENT_PAGE : currentPage;
        this.pageSize = (pageSize == null || pageSize <= 0) ? DEFAULT_PAGE_SIZE : pageSize;
        this.offset = (this.pageNum - 1) * this.pageSize;

        this.rowTotal = rowTotal;
        this.pageTotal = (int) Math.ceil((double)rowTotal / (double)this.pageSize);
        this.prePage = this.pageNum <= 1 ? 1 : this.pageNum - 1;
        this.nestPage = this.pageNum >= this.pageTotal ? this.pageTotal : this.pageNum + 1;

        if( rowTotal == 0){
            this.rowStart = 0;
            this.rowEnd = 0;
        }else {
            this.rowStart = prePage * this.pageSize;
            this.rowEnd = this.pageNum * this.pageSize;
        }

    }


    public static PageParameter create(){
        return new PageParameter();
    }

    public static PageParameter create(final Integer currentPage, final Integer pageSize){
        return new PageParameter(currentPage, pageSize);
    }

    public static PageParameter create(final Integer currentPage, final Integer pageSize, final Integer rowTotal){
        return new PageParameter(currentPage, pageSize, rowTotal);
    }

}
