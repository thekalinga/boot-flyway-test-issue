package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_entity")
public class User {
  @Id
  @GeneratedValue(strategy = SEQUENCE, generator = "user_entity_id_sequence")
  @SequenceGenerator(name = "user_entity_id_sequence", sequenceName = "user_entity_id_seq")
  private int id;
  private String name;
}
