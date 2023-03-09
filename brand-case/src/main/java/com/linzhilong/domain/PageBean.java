package com.linzhilong.domain;

import java.util.List;

//当前页
public class PageBean<T> {

    //总记录数
    private Long totalCount;

    //当前页数据
    private List<T> rows;


    public PageBean() {
    }

    public PageBean(Long totalCount, List<T> rows) {
        this.totalCount = totalCount;
        this.rows = rows;
    }

    /**
     * 获取
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * 设置
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取
     * @return rows
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * 设置
     * @param rows
     */
    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public String toString() {
        return "PageBean{totalCount = " + totalCount + ", rows = " + rows + "}";
    }
}