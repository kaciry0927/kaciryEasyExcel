package com.kaciry.own.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.converters.string.StringNumberConverter;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Kaciry Smith
 * @create 2021-10-30 1:17 下午
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("USER")
public class User extends Model<User> {

    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    @ExcelProperty(value = "ID")
    private Long id;

    @TableField(value = "USER_NAME")
    @ExcelProperty(value = "USER NAME")
    private String userName;

    @TableField(value = "RMB_ACCOUNT")
    @ExcelProperty(value = "RMB ACCOUNT", converter = StringNumberConverter.class)
    @ContentStyle(dataFormat = 4)
    private String rmbAccount;
}
