CREATE TABLE t_customers (
    id int(11) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    hour_value DECIMAL(11, 2)
);

CREATE TABLE t_project_estimate (
    id int(11) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    id_customer int(11),
    estimated_hours int(6),
    CONSTRAINT fk_project_estimate_customers FOREIGN KEY (id_customer) REFERENCES t_customers (id)
);

CREATE TABLE t_appointment_hours (
    id int(11) PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(100),
    appointment_hour int(6),
    id_customer int(11),
    id_project_estimate int(11),
    start_date DATETIME,
    end_date DATETIME,
    status VARCHAR(2),
    CONSTRAINT fk_appointment_hours_customers FOREIGN KEY (id_customer) REFERENCES t_customers (id),
    CONSTRAINT fk_appointment_hours_proj FOREIGN KEY (id_project_estimate) REFERENCES t_project_estimate (id)
);
