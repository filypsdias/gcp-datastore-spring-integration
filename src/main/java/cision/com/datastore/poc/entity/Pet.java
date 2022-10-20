package cision.com.datastore.poc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Pet")
@ToString
@Builder(toBuilder = true)
public class Pet {

  @Id
  @JsonProperty("Key")
  private Long id;

  private String name;
  private Timestamp dateOfBirth;

  private String type;
  private String breed;

}
