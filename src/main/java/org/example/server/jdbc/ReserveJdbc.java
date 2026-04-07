package org.example.server.jdbc;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("reserves")
public class ReserveJdbc {

    @Id
    private Long id;
    private String studentId;
    private String reserveDate;
    private String cabinetIds;

    public ReserveJdbc() {
    }

    public ReserveJdbc(Long id, String studentId, String reserveDate, String cabinetIds) {
        this.id = id;
        this.studentId = studentId;
        this.reserveDate = reserveDate;
        this.cabinetIds = cabinetIds;
    }

    public Long getId() {
        return id;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    public String getCabinetIds() {
        return cabinetIds;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    public void setCabinetIds(String cabinetIds) {
        this.cabinetIds = cabinetIds;
    }
}
