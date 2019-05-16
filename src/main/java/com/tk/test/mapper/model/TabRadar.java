package com.tk.test.mapper.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tab_radar")
public class TabRadar implements Serializable {
    /**
     * 时间对应id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 访问量
     */
    private Double visit;

    /**
     * 成功率
     */
    private Double success;

    /**
     * 应用响应
     */
    private Double apprespond;

    /**
     * 网络响应
     */
    private Double netrespond;

    /**
     * 并发用户
     */
    private Double user;

    /**
     * 总流量
     */
    private Double totalflow;

    /**
     * 最大网络响应
     */
    private Double maxnet;

    /**
     * 告警事件
     */
    private Double alarm;

    /**
     * 平均网络响应
     */
    private Double avernet;

    /**
     * 日期
     */
    private Date riqi;

    private static final long serialVersionUID = 1L;
}