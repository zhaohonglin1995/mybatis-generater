# mybatis-generator


运行方式:
    1.config.properties里面配置driver.class.path  ,设置为数据库的驱动包位置的全路径名
    2.在generatorConfig.xml中,找到<table tableName="">标签
    3.将tableName的值设置为DB的T表名,将domainObjectName设置为生成的Domain类名
    4.更多详细配置讲解,请查看generatorConfig.xml.
                                                            --github.com/zhaohonglin1995/mybatis-generator