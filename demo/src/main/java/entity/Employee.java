package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employee {
    @Id
    private Integer employeeId;
    @Column(name = "first_name")
    private String nombre;
    @Column(name = "last_name")
    private String apellido;
    @Column(name = "email")
    private String correo;
    @Column(name = "phone_number")
    private String telefono;
    @Column(name = "hire_date")
    private Date fechaDeContratacion;
    @Column(name = "job_id")
    private String codigoDelPuesto;
    @Column(name = "salary")
    private double salario;
    @Column(name = "commission_pct")
    private double comision;
    @Column(nullable = true)
    private int managerID;
    @Column(name = "department_id")
    private int departamento;

    public Employee() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }



}
