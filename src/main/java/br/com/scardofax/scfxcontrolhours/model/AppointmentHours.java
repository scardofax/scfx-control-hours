package br.com.scardofax.scfxcontrolhours.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_appointment_hours")
public class AppointmentHours {

    @Id
    private Integer id;
    private String description;
    private Integer appointmentHour;

    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    private Customers customers;

    @ManyToOne
    @JoinColumn(name = "id_project_estimate", referencedColumnName = "id")
    private ProjectEstimate projectEstimate;

    private Date start_date;

    private Date end_date;

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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
