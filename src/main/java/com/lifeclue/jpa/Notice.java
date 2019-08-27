package com.lifeclue.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "notice")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long articleId;
    private int pinnedPosition;
    private Timestamp expiredAt;
}
