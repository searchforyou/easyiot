package com.tounans.easyiot.common.view.device;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DeviceUartView {
    private Integer id;

    private String imei;
    private Integer deviceId;


    private Integer uartId;

    private String alias;

    /**
     * UserId
     */
    private Integer userId;

    /**
     * 用户UartID
     */
    private Integer userUartId;

    /**
     * --1读  0写
     */
    private Integer method;

    /**
     * 波特率
     */
    private Integer baud;

    /**
     * 数据位
     */
    private Integer databits;

    /**
     * 校验位
     */
    private Integer parity;

    /**
     * 停止位
     */
    private Integer stopbits;

    private Boolean state;

    private LocalDateTime addTime;
}
