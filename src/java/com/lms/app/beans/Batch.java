package com.lms.app.beans;
// Generated 19-Dec-2016 22:10:25 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Batch generated by hbm2java
 */
@Entity
@Table(name = "batch", catalog = "lms")
public class Batch implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "BatchID", unique = true, nullable = false)
    private Integer batchId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CourseID")
    private Course course;

    @Column(name = "BatchName", length = 100)
    private String batchName;

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_date", length = 10)
    private Date startDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "batch")
    private Set<Assignment> assignments = new HashSet<Assignment>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "batch")
    private Set<Registration> registrations = new HashSet<Registration>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "batch")
    private Set<Coursecontent> coursecontents = new HashSet<Coursecontent>(0);

    public Batch() {
    }

    public Batch(Course course, String batchName, Date startDate, Set<Assignment> assignments, Set<Registration> registrations, Set<Coursecontent> coursecontents) {
        this.course = course;
        this.batchName = batchName;
        this.startDate = startDate;
        this.assignments = assignments;
        this.registrations = registrations;
        this.coursecontents = coursecontents;
    }

    public Integer getBatchId() {
        return this.batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getBatchName() {
        return this.batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Set<Assignment> getAssignments() {
        return this.assignments;
    }

    public void setAssignments(Set<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Set<Registration> getRegistrations() {
        return this.registrations;
    }

    public void setRegistrations(Set<Registration> registrations) {
        this.registrations = registrations;
    }

    public Set<Coursecontent> getCoursecontents() {
        return this.coursecontents;
    }

    public void setCoursecontents(Set<Coursecontent> coursecontents) {
        this.coursecontents = coursecontents;
    }

}
