package com.lms.app.beans;
// Generated Dec 18, 2016 1:09:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
 * Assignment generated by hbm2java
 */
@Entity
@Table(name="assignment"
    ,catalog="lms"
)
public class Assignment  implements java.io.Serializable {


     private Integer assignmentId;
     private Batch batch;
     private Lecturer lecturer;
     private Module module;
     private String assignmentName;
     private Date deadLine;
     private String filePath;
     private Set<Assignmentmark> assignmentmarks = new HashSet<Assignmentmark>(0);

    public Assignment() {
    }

    public Assignment(Batch batch, Lecturer lecturer, Module module, String assignmentName, Date deadLine, String filePath, Set<Assignmentmark> assignmentmarks) {
       this.batch = batch;
       this.lecturer = lecturer;
       this.module = module;
       this.assignmentName = assignmentName;
       this.deadLine = deadLine;
       this.filePath = filePath;
       this.assignmentmarks = assignmentmarks;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="AssignmentID", unique=true, nullable=false)
    public Integer getAssignmentId() {
        return this.assignmentId;
    }
    
    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BatchID")
    public Batch getBatch() {
        return this.batch;
    }
    
    public void setBatch(Batch batch) {
        this.batch = batch;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LecturerID")
    public Lecturer getLecturer() {
        return this.lecturer;
    }
    
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ModuleID")
    public Module getModule() {
        return this.module;
    }
    
    public void setModule(Module module) {
        this.module = module;
    }

    
    @Column(name="AssignmentName", length=100)
    public String getAssignmentName() {
        return this.assignmentName;
    }
    
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DeadLine", length=10)
    public Date getDeadLine() {
        return this.deadLine;
    }
    
    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    
    @Column(name="FilePath", length=5000)
    public String getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="assignment")
    public Set<Assignmentmark> getAssignmentmarks() {
        return this.assignmentmarks;
    }
    
    public void setAssignmentmarks(Set<Assignmentmark> assignmentmarks) {
        this.assignmentmarks = assignmentmarks;
    }




}

