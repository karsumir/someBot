package com.kars.mybot.Entity;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class BaseEntity {
    @Column(name="created_by")
    private String createdBy;
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @Column(name="updated_by")
    private String updatedBy;
    @Column(name="updated_at")
    private LocalDateTime updatedAt;
}
