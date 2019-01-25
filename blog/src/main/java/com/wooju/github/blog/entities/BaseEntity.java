package com.wooju.github.blog.entities;


import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * See: https://stackoverflow.com/questions/48784923/is-using-id-field-in-allargsconstructor-while-using-spring-jpa-correct
 * @author developer
 */
@Entity
@Getter
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
}