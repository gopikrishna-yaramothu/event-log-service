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

    @Column(name = "filter1")
    private String filter1;

    @Column(name = "filter2")
    private String filter2;

    @Column(name = "filter3")
    private String filter3;

    @Column(name = "filter4")
    private String filter4;

    @Column(name = "filter5")
    private String filter5;

    @Column(name = "filter6")
    private String filter6;

    @Column(name = "filter7")
    private String filter7;

    @Column(name = "filter8")
    private String filter8;

    @Column(name = "filter9")
    private String filter9;

    @Column(name = "filter10")
    private String filter10;

    public EventLog(String uuid, Date timestamp, String object, String category, String filter, String parentUuid) {
        this.uuid = uuid;
        this.timestamp = timestamp;
        this.object = object;
        this.category = category;
        this.filter = filter;
        this.parentUuid = parentUuid;
    }

    public EventLog(String uuid, Date timestamp, String object, String category, String filter, String parentUuid, String province, String district, String facility,
                    String filter1, String filter2, String filter3, String filter4, String filter5, String filter6, String filter7, String filter8, String filter9, String filter10) {
        this.uuid = uuid;
        this.timestamp = timestamp;
        this.object = object;
        this.category = category;
        this.filter = filter;
        this.parentUuid = parentUuid;
        this.filter1 = filter1;
        this.filter2 = filter2;
        this.filter3 = filter3;
        this.filter4 = filter4;
        this.filter5 = filter5;
        this.filter6 = filter6;
        this.filter7 = filter7;
        this.filter8 = filter8;
        this.filter9 = filter9;
        this.filter10 = filter10;
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

    public String getFilter1() {
        return filter1;
    }

    public void setFilter1(String filter1) {
        this.filter1 = filter1;
    }

    public String getFilter2() {
        return filter2;
    }

    public void setFilter2(String filter2) {
        this.filter2 = filter2;
    }

    public String getFilter3() {
        return filter3;
    }

    public void setFilter3(String filter3) {
        this.filter3 = filter3;
    }

    public String getFilter4() {
        return filter4;
    }

    public void setFilter4(String filter4) {
        this.filter4 = filter4;
    }

    public String getFilter5() {
        return filter5;
    }

    public void setFilter5(String filter5) {
        this.filter5 = filter5;
    }

    public String getFilter6() {
        return filter6;
    }

    public void setFilter6(String filter6) {
        this.filter6 = filter6;
    }

    public String getFilter7() {
        return filter7;
    }

    public void setFilter7(String filter7) {
        this.filter7 = filter7;
    }

    public String getFilter8() {
        return filter8;
    }

    public void setFilter8(String filter8) {
        this.filter8 = filter8;
    }

    public String getFilter9() {
        return filter9;
    }

    public void setFilter9(String filter9) {
        this.filter9 = filter9;
    }

    public String getFilter10() {
        return filter10;
    }

    public void setFilter10(String filter10) {
        this.filter10 = filter10;
    }
}
