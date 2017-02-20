package com.ccnode.codegenerator.myconfigurable;

/**
 * @Author bruce.ge
 * @Date 2017/2/20
 * @Description
 */
public class Profile extends DomainObject {
    private String database = DataBaseConstants.MYSQL;

    private Boolean addMapperAnnotation = true;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Boolean getAddMapperAnnotation() {
        return addMapperAnnotation;
    }

    public void setAddMapperAnnotation(Boolean addMapperAnnotation) {
        this.addMapperAnnotation = addMapperAnnotation;
    }
}
