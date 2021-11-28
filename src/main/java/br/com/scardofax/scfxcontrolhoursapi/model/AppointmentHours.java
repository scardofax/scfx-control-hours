package br.com.scardofax.scfxcontrolhoursapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_appointment_hours")
public class AppointmentHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private Integer appointmentHour;

    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    private Customers customers;

    @ManyToOne
    @JoinColumn(name = "id_project_estimate", referencedColumnName = "id")
    private ProjectEstimate projectEstimate;

    private Date startDate;

    private Date endDate;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAppointmentHour() {
        return appointmentHour;
    }

    public void setAppointmentHour(Integer appointmentHour) {
        this.appointmentHour = appointmentHour;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public ProjectEstimate getProjectEstimate() {
        return projectEstimate;
    }

    public void setProjectEstimate(ProjectEstimate projectEstimate) {
        this.projectEstimate = projectEstimate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
