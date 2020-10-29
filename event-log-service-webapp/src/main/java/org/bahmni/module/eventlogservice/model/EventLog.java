package org.bahmni.module.eventlogservice.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event_log")
public class EventLog {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "timestamp", nullable = false)
    private Date timestamp;

    @Column(name = "object")
    private String object;

    @Column(name = "category")
    private String category;

    @Column(name = "filter")
    private String filter;

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    @Column(name = "parent_uuid")
    private String parentUuid;

    @Column(name = "province")
    private String province;

    @Column(name = "district")
    private String district;

    @Column(name = "facility")
    private String facility;

    public EventLog(String uuid, Date timestamp, String object, String category, String filter, String parentUuid) {
        this.uuid = uuid;
        this.timestamp = timestamp;
        this.object = object;
        this.category = category;
        this.filter = filter;
        this.parentUuid = parentUuid;
    }

    public EventLog(String uuid, Date timestamp, String object, String category, String filter, String parentUuid, String province, String district, String facility) {
        this.uuid = uuid;
        this.timestamp = timestamp;
        this.object = object;
        this.category = category;
        this.filter = filter;
        this.parentUuid = parentUuid;
        this.province = province;
        this.district = district;
        this.facility = facility;
    }

    public EventLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getParentUuid() {
        return parentUuid;
    }
}
