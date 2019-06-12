package cn.chyson.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: admin
 * Date: 2019/6/12
 * Time: 13:39
 */
public class QYD {
    private static final long serialVersionUID = 2911678135156187326L;

    private Integer pageSize;
    private Integer curPageNo;
    private Integer totalItemsCount;
    private List<Integer> orderList;


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurPageNo() {
        return curPageNo;
    }

    public void setCurPageNo(Integer curPageNo) {
        this.curPageNo = curPageNo;
    }

    public Integer getTotalItemsCount() {
        return totalItemsCount;
    }

    public void setTotalItemsCount(Integer totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
    }

    public List<Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Integer> orderList) {
        this.orderList = orderList;
    }
}
