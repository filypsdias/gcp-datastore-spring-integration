package cision.com.datastore.poc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.cloud.datastore.Key;
import java.sql.Timestamp;
import java.util.List;
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
@Entity(name = "User")
@ToString
@Builder(toBuilder = true)
public class User {

  @Id
  @JsonProperty("Key")
  private Long id;

  private String name;
  private String email;

  private Timestamp dateOfBirth;

  private List<Key> pets;

}
