package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "jobs")
public class Job {
    @Id
    private Integer jobid;
    @Column(name = "job_title")
    private String nombre;
    @Column(name = "min_salary")
    private double salarioMinimo;
    @Column(name = "max_salary")
    private double salarioMaximo;

    public Job() {
    }
    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }
}
