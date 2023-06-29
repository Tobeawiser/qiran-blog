package com.qiran.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author lcy
 * @since 2023-06-28
 */
@Data
@TableName("article")
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String articleType;

    private String shortContent;

    private String content;

    private String creater;

    private LocalDateTime createTime;

    private String updater;

    private LocalDateTime updateTime;


}
