/*
 * @fileoverview    {Menu}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code Menu}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Entity
@Table(name = "\"Menu\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Menu implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 200)
    private String strId;
    @Column(length = 100)
    private String strTitle;
    @Column(length = 200)
    private String strSubtitle;
    @Column(length = 100)
    private String strType;
    @Column(length = 100)
    private String strIcon;
    @Column(length = 100)
    private String strLink;
    private Boolean bitExactMatch;
    private Boolean bitActive;
    private Boolean bitDisabled;
    @JoinColumn(name = "strBadge", referencedColumnName = "strTitle")
    private String strBadge;
    @JoinColumn(name = "strFather", referencedColumnName = "strId")
    private String strFather;

}
