package com.tounans.easyiot.common.entity.device;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 格子
 * @since 2019-12-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("iot_device_gpio_log")
public class DeviceGpioLog implements Serializable {

    private static final long serialVersionUID = 267530788042641586L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 设备ID
     */
    private Integer userDeviceId;

    private Integer userId;

    private Integer userLogId;

    /**
     * GPIO
     */
    private Integer userGpioId;

    /**
     * 类型   0上报 1下发
     */
    private Integer type;

    /**
     * 状态
     */
    private Integer state;


    private LocalDateTime addTime;


}
