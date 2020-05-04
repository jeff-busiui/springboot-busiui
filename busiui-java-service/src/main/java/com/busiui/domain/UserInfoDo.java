package com.busiui.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.annotation.Id;

/**
 * @author sunbaojin
 * @date 2020/5/4 22:28
 */
@Data
@TableName(value="user_info")
public class UserInfoDo {
    @TableId(type= IdType.AUTO)
    private Long id;
    private String userName;
    private String userEmail;
}
