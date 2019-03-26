-- auto-generated definition
CREATE TABLE sys_log
(
  id          BIGINT(40) AUTO_INCREMENT
  COMMENT '主键'
    PRIMARY KEY,
  ip          VARCHAR(20) DEFAULT ''             NOT NULL
  COMMENT '操作地址的IP',
  create_by   DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
  COMMENT '操作时间',
  remark      VARCHAR(255) DEFAULT ''            NOT NULL
  COMMENT '操作内容',
  operate_url VARCHAR(50) DEFAULT ''             NOT NULL
  COMMENT '操作的访问地址',
  operate_by  VARCHAR(255) DEFAULT ''            NULL
  COMMENT '操作的浏览器'
)
  ENGINE = InnoDB;


-- auto-generated definition
CREATE TABLE sys_view
(
  id        BIGINT(40) AUTO_INCREMENT
    PRIMARY KEY,
  ip        VARCHAR(20)                        NOT NULL
  COMMENT '访问IP',
  create_by DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
  COMMENT '访问时间'
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_article_content
(
  id           BIGINT(40) AUTO_INCREMENT
    PRIMARY KEY,
  content      TEXT                                NOT NULL,
  article_id   BIGINT(40)                          NOT NULL
  COMMENT '对应文章ID',
  create_by    DATETIME DEFAULT CURRENT_TIMESTAMP  NOT NULL
  COMMENT '创建时间',
  modifield_by TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间'
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_article_info
(
  id          BIGINT(40) AUTO_INCREMENT
  COMMENT '主键'
    PRIMARY KEY,
  title       VARCHAR(50) DEFAULT ''              NOT NULL
  COMMENT '文章标题',
  summary     VARCHAR(300) DEFAULT ''             NOT NULL
  COMMENT '文章简介，默认100个汉字以内',
  is_top      TINYINT(1) DEFAULT '0'              NOT NULL
  COMMENT '文章是否置顶，0为否，1为是',
  traffic     INT(10) DEFAULT '0'                 NOT NULL
  COMMENT '文章访问量',
  create_by   DATETIME DEFAULT CURRENT_TIMESTAMP  NOT NULL
  COMMENT '创建时间',
  modified_by TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP
  COMMENT '修改日期'
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_article_message
(
  id           BIGINT(40) AUTO_INCREMENT
    PRIMARY KEY,
  article_id   BIGINT(40)                         NOT NULL
  COMMENT '文章ID',
  message_id   BIGINT(40)                         NOT NULL
  COMMENT '对应的留言ID',
  create_by    DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
  COMMENT '创建时间',
  is_effective TINYINT(1) DEFAULT '1'             NOT NULL
  COMMENT '是否有效，默认为1有效，置0无效'
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_article_picture
(
  id          BIGINT(40) AUTO_INCREMENT
    PRIMARY KEY,
  article_id  BIGINT(40)                          NOT NULL
  COMMENT '对应文章id',
  picture_url VARCHAR(100) DEFAULT ''             NOT NULL
  COMMENT '图片url',
  create_by   DATETIME DEFAULT CURRENT_TIMESTAMP  NOT NULL
  COMMENT '创建时间',
  modified_by TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间'
)
  COMMENT '这张表用来保存题图url，每一篇文章都应该有题图'
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_article_sort
(
  id           BIGINT(40) AUTO_INCREMENT
    PRIMARY KEY,
  sort_id      BIGINT(40)                          NOT NULL
  COMMENT '分类id',
  article_id   BIGINT(40)                          NOT NULL
  COMMENT '文章id',
  create_by    DATETIME DEFAULT CURRENT_TIMESTAMP  NOT NULL
  COMMENT '创建时间',
  modified_by  TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间',
  is_effective TINYINT(1) DEFAULT '1'              NULL
  COMMENT '表示当前数据是否有效，默认为1有效，0则无效'
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_message
(
  id           BIGINT(40) AUTO_INCREMENT
  COMMENT '主键'
    PRIMARY KEY,
  content      VARCHAR(200) DEFAULT ''            NOT NULL
  COMMENT '留言/评论内容',
  create_by    DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
  COMMENT '创建日期',
  email        VARCHAR(20) DEFAULT ''             NOT NULL
  COMMENT '邮箱，用于回复消息',
  name         VARCHAR(20) DEFAULT ''             NOT NULL
  COMMENT '用户自己定义的名称',
  ip           VARCHAR(20) DEFAULT ''             NOT NULL
  COMMENT '留言/评论IP',
  is_effective TINYINT(1) DEFAULT '1'             NOT NULL
  COMMENT '是否有效，默认为1为有效，0为无效'
)
  COMMENT '因为message分为两种，一种是留言，一种是评论，这里搞成一张表是因为它们几乎是拥有相同的字段，我觉得没必要分成两张表来进行维护'
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE tbl_sort_info
(
  id           BIGINT(40) AUTO_INCREMENT
    PRIMARY KEY,
  name         VARCHAR(20)                         NOT NULL
  COMMENT '分类名称',
  number       TINYINT(10) DEFAULT '0'             NOT NULL
  COMMENT '该分类下的文章数量',
  create_by    DATETIME DEFAULT CURRENT_TIMESTAMP  NOT NULL
  COMMENT '分类创建时间',
  modified_by  TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP
  COMMENT '分类修改时间',
  is_effective TINYINT(1) DEFAULT '1'              NOT NULL
  COMMENT '是否有效，默认为1有效，为0无效'
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE user_info
(
  id          INT AUTO_INCREMENT
  COMMENT '用户id'
    PRIMARY KEY,
  name        VARCHAR(64)                         NOT NULL
  COMMENT '用户名',
  password    VARCHAR(64)                         NOT NULL
  COMMENT '登陆密码',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
)
  ENGINE = InnoDB;

